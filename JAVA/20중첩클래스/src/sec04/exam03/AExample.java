package sec04.exam03;

/*
   로컬 중첩 클래스 B  { }중괄호 내부에는
   일반 클래스 처럼 변수, 생성자, 메소드 선언이 올수 있다.
   단! 정적변수와 정적메소드는 JAVA 17버전 부터 선언할수 있다.
*/
class A{//외부 클래스
	
	//A의 인스턴스 메소드
	void useB() {
		//로컬 중첩클래스 B 선언
		class B{
			//인스턴스변수 선언가능
			int field1 = 1;
			//정적변수 선언가능(JAVA 17버전부터 선언가능)
			static int field2 = 2;
			//생성자 선언가능
			B(){ System.out.println("B-생성자 실행");}
			//B의 인스턴스메소드 선언가능
			void method1() {
				System.out.println("B-method1 실행");
			}
			//B의 정적메소드 선언가능(JAVA 17버전부터 선언가능)
			static void method2() {
				System.out.println("B-method2 실행");
			}
			
		}//B
		
		//로컬 중첩클래스 B에 대한 객체 생성? A바깥 클래스 내부에서는 모두 가능
		B b = new B();
		
		//로컬 B객체의 인스턴스변수와 인스턴스메소드 호출해서 사용가능?
		//A바깥 클래스 내부에서는 모두 가능
		System.out.println( b.field1 );
		b.method1();
		
		//로컬 B객체의 정적변수와 정적메소드 호출해서 사용가능?
		//A바깥 클래스 내부에서는 모두 가능! (단! 자바 17버전 이상부터)
		System.out.println(b.field2 );
		b.method2();
			
	}//A의 useB()메소드 중괄호 닫기
}//A 외부 클래스 닫기 


public class AExample {
	public static void main(String[] args) {
		//A 외부클래스의 객체 생성
		A a = new A();
		//A의 메소드 호출
		  a.useB();

	}

}







