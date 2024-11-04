package ex2;

public class ThrowsExample1 {

	public static void main(String[] args)  {
		
		//findClass메소드를 호출한 장소 여기서 try블럭으로 감싸 예외처리함
		try {
			findClass();//아래의 메소드를 호출한 장소 
			
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("프로그램을 끝까지 실행 한 후 종료");
	}

	//정적메소드 
	
	//				   findClass메소드를 호출한 장소 줄로 가서 예외처리하라!
	//				   		 	   thorws 발생한처리할종류의예외클래스명  
	public static void findClass() throws ClassNotFoundException{
		
	 
		//매개변수로 전달한 경로에 클래스를 찾을수 없는 
		//ClassNotFoundException 예외가 발생할 예상 코드 작성
		Class.forName("java.lang.String2");
	 	
	}//findClass메소드 닫기 
	
}//ThrowsExample1클래스 닫기 






