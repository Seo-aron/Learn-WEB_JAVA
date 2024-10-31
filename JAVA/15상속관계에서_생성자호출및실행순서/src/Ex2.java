
/*
   주제 : 상속관계에서 서브(자식)클래스의 객체가 생성될때
         생성자가 호출되는데 자동으로 어떤 부모생성자가 호출되고 실행되는가
              
 조합1.  서브(자식)클래스의 객체가 생성될때
 	    서브(자식)클래스의 기본생성자를 호출하면
 	    슈퍼(부모)클래스에 기본생성자가 있으면 자동으로 호출한다.         	  
*/
class AA{//슈퍼(부모)클래스 
	public AA() {//기본생성자
		//super(); 생략된것임 <- 부모 Object클래스의 Object()기본생성자 호출
		System.out.println("AA의 기본생성자");
	}
	public AA(int x) {//매개변수가 1개인 생성자
		System.out.println("AA의 매개변수가 1개인 생성자");
	}
}
//--------------------------------------------------
class BB extends AA {//서브(자식)클래스
	public BB() {//기본생성자
		//super(); //부모AA클래스의 기본생성자 AA()를 호출 구문 생략
		System.out.println("BB자식의 기본생성자");
	}
	public BB(int x) {//매개변수가 1개인 생성자 
		System.out.println("BB자식의 매개변수가 1개인 생성자");
	}
}
public class Ex2 {
	public static void main(String[] args) {
		  BB bb = new BB();//자식BB클래스의 객체 생성시 기본생성자호출

	}

}








