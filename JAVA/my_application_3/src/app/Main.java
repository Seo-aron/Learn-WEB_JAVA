package app;

//my_module_a 모듈 프로젝트에서 가져옴
import pack1.A;
import pack2.B;

//my_module_b 모듈 프로젝트에서 가져옴
import pack3.C;
import pack4.D;

public class Main {
	public static void main(String[] args) {
		//my_module_a  모듈의 패키지에 포함된 A,B클래스 이용 객체 생성
		A a = new A();
		  a.method();
		
		  new B().method();
		//---------------------------------------
		//my_module_b  모듈의 패키지에 포함된 C,D클래스 이용 객체 생성  
		C c = new C();
		  c.method();
		
		  new D().method();
		  

	}

}








