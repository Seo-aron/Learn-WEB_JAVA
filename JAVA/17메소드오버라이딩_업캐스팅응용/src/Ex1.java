/*

  메소드 오버라이딩?
  - 상속관계에서 부모클래스 메소드의 선언부(접근제어자,static, 반환자료형, 메소드명, 매개변수 영역)
    을 자식클래스에 모두 동일하게 작성하되,
    부모클래스 메소드의 구현부 {  }중괄호 부분을
    자식클래스의 기능에 맞게 재작성하는 기술
    
    요약 : 부모클래스의 메소드를 그대로 자식클래스 가져와 작성하되,
          메소드의 {  } 내부의 구현코드를 재작성하는것.  

   예)  
           class A{  //부모클래스 
           
             //정수 하나를 매개변수로 받아 출력!
           	  public void print(int num)  <--메소드의 선언부영역    	
           	  {
           	    //{}중괄호 영역<----메소드의 코드 구현부 영역
           	     System.out.println(num);
           	  } 
           }
       //----------------------------------------
           class B extends A{      //A의 자식B클래스
           
           		//메소드 오버라이딩 : 부모클래스의 메소드 구현부 재작성
           		
           		//1.부모클래스의 메소드 선언부를 그대로 작성하되 
           		public void print(int num)
           		{
           			//2. 구현부의 코드 재작성
           			//B클래스의 print메소드 기능
           			//-매개변수 num으로 받은 정수에 +1하여 출력
           			 System.out.println(num + 1);
           		
           		}
           
           
           }
   -------------------------------------------------------
   - 메소드 오버라이딩 하는 목적
      	자식클래스에서 부모클래스와 동일한 이름의 메소드를 새롭게 정의해서
      	부모클래스의 메소드를 더이상 사용하지 않고,
      	자식클래스에서 새롭게 재정의한 메소드를 사용하도록 하기 위함.
    
*/
class A{ //부모

	//메소드의 선언부
	public void print(int num)  //정수하나를 매개변수로 받아 출력
	{
		//메소드의 구현부
		System.out.println(num);
	}
}
class B extends A{//자식
	//메소드오버라이딩
	//부모 A클래스에 만들어져 있는 print메소드의 선언부는 그대로
	//가져다가 작성하되, 메소드의 {}중괄호 영역(구현부)를 재정의

//어노테이션 기호 이름 : @Overrid
//어노테이션 기호의 의미 : 
//	작성 해놓은 메소드는 부모클래스로부터 
//  부모클래스의 메소드를 오버라이딩해놓은
//	메소드이다~ 라고 컴파일러에게 알려주는 기호
//	@Override 
//	//메소드의 선언부
//	public void print(int num)  //정수하나를 매개변수로 받아 출력
//	{
//		//메소드의 구현부
//		System.out.println(num + 1);
//	}	
	
	
//이클립스에서 메소드 오버라이딩할때의 단축키
//alt + shift + s   v
	@Override
	public void print(int num) {
		//B클래스의 print메소드 기능에 맞게 재작성
		System.out.println(num+1);
	}	
	
	

	//B자식클래스의 멤버 메소드 
	public void bInfo() {
		System.out.println("B클래스의 bInfo메소드이다.");
	}
	
}
public class Ex1 {
	public static void main(String[] args) {
		
		//자식클래스역할을 하는 B의 객체 생성
		B b = new B();
		  b.bInfo(); //자식B클래스 내부에 만들어 놓은 메소드이자
		  			 //인스턴스 메소드 이기때문입니다.
		  b.print(10);//부모클래스A로부터 상속받지 않고
		  			  //재정의(메소드오버라이딩)한 
		  		      //print메소드 호출가능함
		  		//11
		  
		//부모클래스역할을 하는 A의 객체 생성
		A a = new A();
		  a.print(10); 
		  		//10
		
	//요약
    //1. 메소드 오버라이딩이란 무엇이며
    //2. 자식클래스에 메소드 오버라이딩을 해놓고
    //   자색객체 메모리 생성후 메소드 오버라이딩된 메소드를 호출하면
    //   오버라이딩된 메소드가 호출되어 실행된다.
    //   즉! 부모클래스로 부터 메소드 오버라이딩된 메소드는 상속 안됨
		  
		

	}

}








