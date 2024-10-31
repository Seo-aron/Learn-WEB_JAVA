

//예제: 상속관계에서 자식객체메모리를 생성했을떄
//	   자식클래스의 생성자와 부모클래스의 생성자 호출 및 실행순서

//부모클래스(할아버지)
class A /*extends Object*/{
	public A() {
//		super();
		System.out.println("A부모클래스의 생성자A");
	}

}
//자식클래스1(아버지)
class B extends A {
	public B() {
		//super();
		System.out.println("B자식클래스의 생성자B");
	}
}
//자식클래스2(아들)
class C extends B{
	public C() {
//		super();
		System.out.println("C자식클래스의 생성자C");
	}
}
public class Ex1 {
	public static void main(String[] args) {
		//C자식 클래스의 객체를 생성
		//C의 기본생성자 호출
		C c = new C();
		
/*
	   1. new에 의해 서브(자식,C)클래스의 객체가 생성될때
	      슈퍼(부모)클래스의 생성자와 서브(자식,C)클래스의 생성자가 모두 호출되어 실행됨
	
	   2. 생성자 호출순서
	      서브(자식) 클래스의 생성자가 먼저 호출되고
	      서브(자식) 클래스의 생성자는 실행 전! 슈퍼(부모)클래스의 생성자를 호출한다.
	   	  
	   	  C() 호출 -> B() 호출 ->  A()호출 순서대로 호출함
	   
	   3. 생성자 실행순서
	   	  슈퍼(부모)클래스의 생성자가 먼저 실행된 후 
	   	  자신을 호출했던 바로직전자식클래스의 생성자가 나중에 실행 됨
	   	  
	   	  A() 실행 -> B() 실행 -> C() 실행   순서대로 실행함 
	        


출력
 A부모클래스의 생성자A
 B자식클래스의 생성자B
 C자식클래스의 생성자C
 		
 */
		
	}

}










