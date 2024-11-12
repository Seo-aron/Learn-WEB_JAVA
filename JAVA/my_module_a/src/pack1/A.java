package pack1;

import pack2.B;

import pack3.C; //my_module_b모듈

public class A {
	//메소드  선언
	public void method() {
		System.out.println("A-method 실행");
		
		//B클래스 사용해서 객체 생성
		B b = new B();
		  b.method();
		
	}
	//메소드 선언
	public C getC() {
		
		return new C();
	}
	
}







