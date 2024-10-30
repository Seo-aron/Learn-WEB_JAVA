/*
  생성자 오버로딩?
  - 클래스 내부에 같은 이름의 생성자를 여러개 작성하는 방법
    이 의미를 생성자 오버로딩 한다라고 말합니다.
    
  생성자 오버로딩 조건
  1. 매개변수의 갯수를 달리해서 여러개의 생성자를 만들수 있다.  
     - 각각의 생성자는 매개변수의 갯수가 달리해서 만들어야함
  
  2. 매개변수의 자료형을 달리해서 여러개의 생성자를 만들수 있다.
     - 생성자들이 같은 개수의 매개변수를 가질경우, 매개변수의 자료형이 달라야함
  
  3. 매개변수의 순서를 달리해서 여러개의 생성자를 만들수 있다.
     - 생성자들의 매개변수 개수와 자료형이 같더라도, 매개변수를 선언해 놓는 순서가 다르면
       생성자 오버로딩이 가능함 
     
*/
class Example{
	//기본생성자 - 매개변수가 하나도 없는 생성자
	public Example() {}
	
	//매개변수가 1개인 생성자
	public Example(int a) {}
	
	//매개변수가 2개인 생성자
	public Example(int a, int b) {}
	
	//매개변수가 2개인 생성자
	public Example(double a, int b) {}
	
	//매개변수가 2개인 생성자
	public Example(int b, double a) {}
	
}


//예제. Person 사람클래스를 이용해, 다양한 생성자를 오버로딩하는 예제
class Person {
	
	String name;//이름
	int age; //나이
	String address;//주소
	
	//기본생성자
	public Person() {
		name = "이름없음";
		age = 0;
		address = "주소없음";
	}
	
	//이름만 설정하는 생성자
	public Person(String name_) {
		name = name_;
		age = 0; //기본값 설정
		address = "주소없음";//기본값 설정
	}
	
	//이름과 나이만 설정하는 생성자
	public Person(String name_, int age_) {
		name = name_;
		age = age_;
		address = "주소없음";//기본값 설정
	}
	//이름, 나이, 주소를 모두 설정하는 생성자
	public Person(String name_, int age_, String addres_) {
		name = name_;
		age = age_;
		address = addres_;
	}
	
	//Person 정보 출력 메소드
	public void printInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("주소 : " + address);
	}	
}

//참고
//객체 - 클래스료형  참조변수 = new 생성자호출();
//인스턴스 -  new 생성자호출();
public class Ex3 {
	public static void main(String[] args) {
		//기본생성자를 사용하여 Person객체 생성
		Person person1 = new Person();
			   person1.printInfo();
			   /*
					이름 : 이름없음
					나이 : 0
					주소 : 주소없음
			  */
		System.out.println(); //한줄 바꿈
		
		//이름만 설정하는 생성자를 사용하여 Person인스턴스 메모리 생성 후 
		//printInfo()메소드 호출!
		new Person("홍길동").printInfo();
		/*
		이름 : 홍길동
		나이 : 0
		주소 : 주소없음		
		*/
		
		System.out.println();//한줄 줄바꿈
		
		//이름과 나이를 설정하는 생성자를 사용하여 Person객체 메모리 생성
		Person person3 = new Person("홍길동", 25);
			   person3.printInfo();
		/*	   
		이름 : 홍길동
		나이 : 25
		주소 : 주소없음		
		*/
			   
		System.out.println();//한줄 줄바꿈 
		
		//이름,나이, 주소를 모두 설정하는 생성자를 사용하여 Person객체 메모리 생성
		Person person4 = new Person("홍길동", 25, "서울");
		       person4.printInfo();
		       /*
		       이름 : 홍길동
		       나이 : 25
		       주소 : 서울
		       */
		/*       
	       연습 해야 할 부분
	       
	        1. 생성자 오버로딩의 필요성 이해
	           - 다양한 상황에서 객체를 생성할 때, 필요한 매개변수에 따라
	             생성자를 선택해서 호출하는 방법을 연습 해야 합니다
	        
	        2. 기본값 설정  
			    - 매개변수가 주어지지 않은 경우, 생성자에서 기본값을 어떻게 설정하는지
			      연습해야 합니다.
			
			3. 오버로딩된 생성자를 호출해서 사용
			    - 다양한 생성자를 사용해 객체를 생성해보고,
			      각각의 객체가 어떻게 객체변수값들이 초기화되는지 확인하는 연습필요
		
		
		
		*/
		
		

	}

}








