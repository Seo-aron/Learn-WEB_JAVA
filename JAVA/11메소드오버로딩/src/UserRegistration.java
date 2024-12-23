
//예제. 사용자 정보를 입력받는 메소드를 오버라이딩하여 다양한 정보를 
//     처리할수 있도록 한 예제 

//요구사항
//1. 사용자 이름과 이메일을 입력받아 사용자 정보를 등록하는 메소드
//2. 사용자 이름, 이메일, 나이를 입력받아 사용자정보를 등록하는 메소드
//3. 사용자 이름, 이메일, 나이, 전화번호를 입력받아 사용정보를 등록하는 메소드
//4. 각 메서드는 등록된 사용자 정보를 출력하는 기능을 포함합니다.


public class UserRegistration {//사용자 한사람 정보를 제공하는 설계도(클래스)
	
	//사용자 정보를 저장하는 변수 선언 
	//(변수들은 외부 클래스에서 볼수업도록 private접근제어자로 은닉화함)
	private String name;
	private String email;
	private int age;
	private String phone;
	
	//기본생성자가 자동으로 만들어져 있음
	//public UserRegisteration(){  }
	
	
	//사용자 등록 메서드(이름, 이메일)
	public void registerUser(String name, String email) {
		this.name = name;
		this.email = email;
		this.age = 0;
		this.phone = null;
		//사용자 정보 메소드 호출 해서 각 정보 출력 가능하게 하기
		printInfo();
	}
	//사용자 등록 메서드(이름, 이메일, 나이)
	public void registerUser(String name, String email, int age) {
		this.name = name;
		this.email = email;
		this.age = age;
		this.phone = null;
		//등록된 사용자 정보 출력
		printInfo();
	}
	//사용자 등록 메서드(이름, 이메일, 나이, 전화번호)
	public void registerUser(String name, String email, int age, String phone) {
		this.name = name;
		this.email = email;
		this.age = age;
		this.phone = phone;
		//등록된 사용자 정보 출력
		printInfo();
	}
	
	//사용자 정보 출력 메서드
	public void printInfo() {
		System.out.println("사용자 정보:");
		System.out.println("이름: " + this.name);
		System.out.println("이메일: " + this.email);
		
		if(this.age != 0) {//사용자가 나이를 입력했다면
			System.out.println("나이: " + this.age);
		}
		if(this.phone != null) { //사용자가 전화번호 입력했다면
			System.out.println("전화번호: " + this.phone);
		}
		System.out.println();//줄 바꿈
	}
	

	//메인 메서드 : 프로그램의 시작점 - 주 스레드 
	public static void main(String[] args) {
		
		UserRegistration registration = new UserRegistration();
						
		//사용자 등록을 위한 오버로딩 해 놓은 메소드들을 호출해보자
		
		//이름과 이메일
		registration.registerUser("홍길동", "hong@example.com");
		//이름, 이메일, 나이
		registration.registerUser("김철수", "kim@example.com", 25);
		//이름, 이메일, 나이, 전화번호
		registration.registerUser("이영희", "lee@example.com", 30, "010-1234-5678");
		
		

	}

}











