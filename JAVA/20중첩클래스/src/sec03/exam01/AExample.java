package sec03.exam01;

/*
  정적 멤버 중첩 클래스 B는  A바깥외부클래스 내부에서 사용되기도 하지만,
  A바깥 클래스 외부에서 A객체와 함께 사용되는 경우가 많기때문에
  주로 default또는 public접근제어자를 가진다
  B객체는 A클래스 내부 어디든 객체를 생성할수 있다.
*/
class A{ //바깥 클래스
	
	//정적 멤버 중첩클래스 B 선언
	static class B{ }
	
	//인스턴스변수를 선언하여 B객체의 주소를 저장할수 있음
	B field1 = new  B();
	
	//정적(클래스)변수를 선언하여 B객체의 주소를 저장할수 있음
	static B field2 = new B();
	
	//A바깥 클래스의 기본생성자
	A(){
		//정적 멤버 중첩클래스B의 객체 생성 가능
		B b = new B();
	}
	//A바깥 인스턴스 메소드 
	void method1() {
		//정적 멤버 중첩클래스B의 객체 생성 가능
		B b = new B();
	}
	//A바깥 정적(클래스) 메소드
	static void method2() {
		//정적 멤버 중첩클래스B의 객체 생성가능
		B b = new B();
	}
}//외부 바깥 A클래스 중괄호 닫기

public class AExample {
	public static void main(String[] args) {
		
		//정적 멤버 중첩 클래스 B에 대한 객체 생성 문법
		//-> 바깥클래스명.정적멤버중첩클래스명   참조변수 = 
		//   new 바깥클래스명.정적멤버중첩클래스생성자();
   
			 A.B   b = new A.B();
			 
		//결론
		// A클래스는 외부 AExample클래스의 main메소드 내부에서 B객체를 생성하려면
		// A객체 생성 없이  A클래스명. 으로 B클래스에 접근해서 B객체  생성이 가능하다
			 
		
	}

}








