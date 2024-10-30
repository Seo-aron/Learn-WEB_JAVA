
//예제. 반환 값이 없는 메소드 정의 및 사용

public class Example2 {

	//사용자 정의 메소드 정의
	//기능: 매개변수 message로 전달받은 문자열을 화면에 출력하는 기능 
	public static void printMessage(String message) {
				//void 메소드를 호출한 줄로 반환할 값이 없다 라는 의미의 자료형 
				//void를 작성하면 메소드 내부에는 return구문을 작성하지 말아야 한다.		
		//출력기능
		System.out.println(message);
	}

	public static void main(String[] args) {

		//위 만들어진 pringMessage라는이름의 메소드 호출해서
		//"안녕하세요!" 출력 하고 싶다
		printMessage("안녕하세요!");
		
	}

}











