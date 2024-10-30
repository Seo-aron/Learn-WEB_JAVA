
//메소드(메서드,함수)
//- 하나의 기능을 가진 작은 프로그램



//예제1. 기본적인 반환값을 가지는 메소드 정의 및 사용 

public class Example {    

	
	//접근제어자  수정자  반환타입  메소드명(자료형 매개변수명){
	
		//메소드의 몸체 영역 
		//-> 메소드의 기능을 코드로 작성;
	
//  }
	
	//정수 2개를 매개변수로 전달받아 더한 결괏값을 반환하는기능
	public static int add(int a, int b) {		
		//메소드의 몸체 
		//기능 : 매개변수 a와 b로 전달받은 두정수의 합을 계산해서 반환
		return a + b;	
	}
		
	//main메소드 : 자바프로그램을 시작시키고 종료시키는 기능
	public static void main(String[] args) {		
		//메소드 호출 문법
		//메소드명(값1,값2);
		
		//5와 10의 합을 계산해서 제공받기 위해
		//add라는이름의 메소드를 호출!
		int sum = add(5,10);
		
		System.out.println("합:" + sum);
		
	}

}









