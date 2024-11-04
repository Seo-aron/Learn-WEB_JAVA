package ex2;

/*
이 예제는 은행계좌(Account)클래스의 출금(withdraw)메소드에서 
잔고(balance)변수와 출금액(매개변수로전달하는값)을 비교해
잔고가 부족하면 InsufficientException을 발생시키고 throws한다.
그리고 AccountExample은  withdraw()메소드를 호출할때 
예외처리를 한다.
*/
class Account{ //은행계좌 클래스(설계도)
	
	private long balance;//잔고가 저장될 변수 
	
	public Account() {} //기본생성자
	
	public long getBalance() {//잔고 반환(리턴)
		return this.balance;
	}
	//예금을 하여 잔고금액을 변경하기 위한 메소드 
	public void deposit(int money) {
		this.balance += money;
	}
	//출금을 위한 메소드 
	//throws키워드를 이용해 사용자정의 발생 예외가 메소드 내부에서
	//발생하면 withdraw메소드를 호출한 코드 줄로 가서 예외 처리하라! 말하는것	
	public void withdraw(int money) throws InsufficientException {
		if(balance < money) {	
			
//개발자가 강제로 예외를 발생시키는 코드를  작성 해 놓을수 있습니다
//throw 예약어를 사용해야 한다.
			//문법
			//throw new 강제로발생시킬사용자정의예외클래스의객체생성();						
			throw new InsufficientException("잔고부족:" + (money-balance) + "모자람");
			 
//			throw new NullPointerException();
//			throw new ArrayIndexOutOfBoundsException();
		
		
		}
		//잔고에서 차감
		balance -= money;
	}		
}

//사용자정의 예외 클래스 만들기 
class InsufficientException  extends Exception{
	
	//기본생성자
	public InsufficientException() {}

	//예외메세지 하나를 매개변수로 전달 받는 생성자
	public InsufficientException(String message) {
		super(message);//부모 생성자 호출
	}
}

public class AccountExample {
	public static void main(String[] args) {
			
			Account account = new Account();//Account클래스의 객체 생성
			
			account.deposit(10000);//10000 예금하기
			
			//10000원 예금 후 잔고 확인
			System.out.println("예금액 : " +  account.getBalance() );
			
			//30000원 출금 하기 - withdraw(30000)메소드 호출!
			//참고. 예금한 금액은 10000인데 30000을 출금하려고 해서 
			//     개발자가 직접 만든 사용자정의예외처리종류클래스의 객체를 생성해
			//	   강제로 예외발생시킴
			try {
			
				account.withdraw(30000); //<----메소드 호출한 곳!
			
			}catch(InsufficientException  e) {
				//발생한 예외의 이유 출력
				String message = e.getMessage();
				System.out.println(message);
				
			}
			
			System.out.println("프로그램 종료");
	}//main메소드 
}//AccountExample클래스 












