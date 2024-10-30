//연습1. 자바에서 클래스안의 멤버변수 만들기 


class Student {
	
		int num;
 static int staticNum;
 
 public Student() {}
 
 //하나의 정수값을 매개변수로 전달받아 인스턴스변수, 클래스변수에 각각 누적시키는
 //인스턴스 메소드 add 만들기
 public void add(int value) {
	 this.num += value;
	 Student.staticNum += value;
 }
 
}
/*
  Student 클래스 만들기
  
  	정수 하나를 저장할  인스턴스변수 num 만들기
  	
  	정수 하나를 저장할 클래스변수 staticNum 만들기
  	
  	기본 생성자 만들기
  		아무런 일도 하지 않음
  		
  	하나의 정수값을 매개변수로 전달받아 인스턴스변수, 클래스변수에 각각 누적시키는
  	인스턴스 메소드 add 만들기
*/


public class Test1 {
	public static void main(String[] args) {
		
		Student a_student = new Student();
				a_student.add(5);
		System.out.println("--참조변수 a_student객체--");
		System.out.println("인스턴스변수 num = " + a_student.num);
//		System.out.println("클래스변수 staticNum = " + a_student.staticNum);
		System.out.println("클래스변수 staticNum = " + Student.staticNum);
				
		Student b_student = new Student();
		        b_student.add(5);
		System.out.println("--참조변수 b_student객체--");
		System.out.println("인스턴스변수 num = " + b_student.num);
//		System.out.println("클래스변수 staticNum = " + b_student.staticNum);		
		System.out.println("클래스변수 staticNum = " + Student.staticNum);

		
		/* 
		   출력결과
		   --참조변수 a_student객체--
		   인스턴스변수 num = 5
		   클래스변수 staticNum = 5
		   
		   --참조변수 b_student객체--
		   인스턴스변수 num = 5
		   클래스변수 staticNum = 10
		 */
		
//인스턴스변수와 클래스변수의 차이점 적어보기
//-> 인스턴스 변수는 객체 메모리를 생성할떄마다 객체 메모리에 올라가는 개별적 메모리
//-> 클래스   변수는 생성된 각 객체 메모리들이 공용으로 사용하는 공용변수이므로
//   자바프로그램이 시작되면 가장 처음에 class가 JVM의 Method영역에 올라가면서
//   class에 포함되어 올라가는 변수메모리 입니다.
		
	}

}








