
//패키지 선언이라고 부르며
//Hello.java 소스파일이 src폴더/ch01폴더/sec08폴더 에 만들어져 있다
//라고 JVM에게 알려주는 코드 한줄 
package ch01.sec09;


/**
 *  Hello.java파일은 
 *  기초를 알기 위한 첫번째 작성된 파일이다.
 *  @author 김길동 
 */



/*
   public class Hello를 클래스선언(설계도선언)부분의 코드이고
   Hello를 클래스(설계도)명이라고 한다.
   1. 클래스명은 숫자로 시작할수 없고,Hello.java소스파일명과
      대소문자가 완전히 일치해야 합니다.
   2. 그다음에 작성된 중괄호{ }를 클래스(설계도) 블록(영역)이라고하며,
      { }내부에는 클래스(설계도)의 변수 + 메소드 멤버들을 기술해서 작성할수 있다. 
 */
public class Hello {
	
	//변수 + 메소드 만들어 놓는 곳 
	
	//main이라는 이름의 메소드를 정의 해 놓았음 
	//main메소드 또한 { }중괄호를 이용해 자신만의 블록(영역)을 나타낸다.
	//main메소드는 자바프로그램 실행 진입점이라고 부른다.
	public static void main(String[] args) {
		
	    //실행코드
		//-> "Hello, Java"데이터를 이클립스의 Console탭에 출력하는 기능
		System.out.println("Hello, Java");
		System.out.println("안녕 오늘 처음 배웠다.");
		
		//정수 하나의값을 저장할 x라는 이름의 변수 선언
		//자료형  만들변수명;
		int    x;
		
		//변수 x에 1값을 저장
		x = 1;
		
//		int  y;//변수 y를 선언하고		
//		y = 2;//변수 y에 2를 대입해서 저장
		
		//변수 y를 선언하는 동시에 값 2를 저장
		int  y = 2;
		
		//변수 result를 선언하고 변수x와 y에 저장된 값의 합을 result변수에 저장
		int result = x + y;
		//		   = 1 + 2;
		
		System.out.print(result);
		System.out.println(result);
		System.out.println(result);
		
		//변수를 한개 이상 선언할때 한줄에 여러개의 변수를 선언할수 있다.
		int z = 1;  int f = 3;
		
		
	}
	
	
}








