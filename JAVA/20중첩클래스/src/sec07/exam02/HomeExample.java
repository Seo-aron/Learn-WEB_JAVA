package sec07.exam02;

//2. 익명구현객체 - 인터페이스를 구현받아 만든 이름없는 자식객체.

/*
   익명구현객체 생성 문법
   	
   		new 부모인터페이스의생성자(){
   		  
   		   부모인터페이스에 만들어 놓은 추상메소드를 강제로 오버라딩;
   		
   		}
   		
   		해석. 부모인터페이스내부에 만들어 놓은 추상메소드들을 강제로
   		      메소드 오버라이딩해 놓은 자식익명구현클래스이자
   		      자식익명구현객체를 생성합니다. 
*/
interface RemoteControl{ //부모역할을 하는 인터페이스 
	//추상메소드
	void turnOn();
	void turnOff();
}

class Home{
	
	//인스턴변수를 만들어 위 RemoteControl부모인터페이스를 구현한
	//이름이없는 자식익명구현객체의 주소를 대입해서 저장
	private RemoteControl rc = new RemoteControl() {		
		//부모인터페이스의 추상메소드를 강제로 메소드 오버라이딩 
		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다");
		}
		@Override
		public void turnOff() {
			System.out.println("Tv를 끕니다");
		}
	};
	
	//메소드 
	public void use1() {
		this.rc.turnOn();//이름이 없는 자식익명구현객체의 오버라이딩된 메소드 호출가능
		this.rc.turnOff();//이름이 없는 자식익명구현객체의 오버라이딩된 메소드 호출가능
	} 
	//메소드
	public void use2() {
		//로컬(지역)변수를 선언하고 지역변수에 자식익명구현객체를 생성해서 주소번지 저장
		RemoteControl rc = new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("에어컨을 켭니다");
			}
			@Override
			public void turnOff() {
				System.out.println("에어컨을 끕니다");
			}	
		};	
		//위 자식익명구현객체 내부에 만들어 놓은 메소드오버라이딩한 메소드 호출!
		rc.turnOn();   rc.turnOff(); 		
	}//use2메소드 
	
	//메소드 - 부모인터페이스의 매개변수로 자식익명객체의주소를 전달받아 사용함
	public void use3(RemoteControl  rc) {
		rc.turnOn();//rc매개변수로 전달받은 자식익명객체의 오버라이딩한 메소드 호출가능
		rc.turnOff();
	}
	
}//Home클래스 

public class HomeExample {
	public static void main(String[] args) {
		//Home클래스를 이용해 객체 생성
		Home home = new Home();
		//use1메소드 호출
		home.use1();
		//use2메소드 호출
		home.use2();
		
		home.use3( new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("난방을 켭니다.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("난방을 끕니다.");
			}
		});
		
		

	}

}









