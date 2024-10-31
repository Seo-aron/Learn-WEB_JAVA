

//예제. super,  super() 사용예
//부모클래스
class Person {
	int age = 20; //0 -> 20
	String name;  //null
	
	//사람의 이름(name)변수값을 초기화할 생성자
	public Person(String name) {
		this.name = name;
	}
}
//Person클래스의 멤버를 상속받아 새로운 Man자식클래스 만들기
class Man extends Person{
	//Person부모클래스 내부에 만들어져 있는 age변수명과
	//Man자식클래스 내부에 만들어져 있는 age변수명이 같습니다!
	int age = 40;
	
	//매개변수가 1개인 생성자 
	public Man(String name) {
		//Man객체 생성하면
		//name인스턴스변수는 부모 Person객체메모리 내부에 만들어져 있으므로
		//부모 Person객체의 name인스턴스변수 위치에 저장해야하므로
		//부모 person클래스의 매개변수가 1개인 생성자를 호출할떄 이름을 전달해서
		//저장해야 합니다.  그러므로 아래의 코드작성이 필요하다.
		super(name);		
	}
	
	//메소드 : age인스턴스변수의 값을 얻어 출력
	public void getInfo() {
		System.out.println("자식Man객체의 나이 출력:" + this.age );
		
		//Person부모클래스의 변수 age와 
		//Man자식클래스 변수 age의 이름이 같을때
		//이때 부모 Person객체의 age변수값을 얻어 사용하고 싶으면
		System.out.println("부모Person객체의 인스턴스변수 age값:" + super.age ); 		
	}	
	//메소드
	//name인스턴스 변수에 초기화된 값을 얻어와 출력
	public  void getInfo2() {
		System.out.println("부모Person객체의 인스턴스변수 name값:");
		System.out.println(super.name);//"홍길동"
		//부모 클래스(부모 객체)와 자식클래스(자식객체)내부에
		//인스턴스변수명이 같지 않을때는 
		//생성된 자식객체 메모리 내부에서 부모객체의 인스턴스변수 name값을
		//불러와서 사용시 super.은 생략 가능 하다.
		//System.out.println(name);
		
	}
			
}
public class Ex6 {
	public static void main(String[] args) {
		//자식 Man클래스의 객체 생성하는 동시에 매개변수가 1개인 생성자 호출
		//이때 String name매개변수로 "홍길동"문자열을 전달해서 
		//부모 Person객체 내부의 name인스턴스변수값으로 초기화 !
		Man man = new Man("홍길동");
		    
			man.getInfo();
			
			man.getInfo2();
			
	}

}






