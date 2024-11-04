
/*
   스트림(Stream)이란?
   - 키보드 또는 기기를 통해서 입력된 데이터가 바이트 단위로 흘러 가는 통로
   
	주제 : 키보드로 부터 한글자를 입력받아 모니터 화면에 출력.



System.in -> 
	System클래스 내부에 in상수에 저장된 
	InputStream입력스트림 통로역할을 하는 객체

InputStream클래스의 read() 메소드 ->
	참고.  1.입력스트림 통로에서 1바이트를 읽습니다.
	      2.읽은 바이트값을 int타입으로 반환합니다.
	        반환값은 읽은 바이트의 정수표현이며 0부터 255사이의 값입니다.
	        만약 입력스트림 통로 끝에 도달하면 -1을 반환합니다.
	        (더이상 읽어들일 byte단위의 데이터가 없으면 -1을 반환합니다.)
	        
System.out -> System클래스 내부에 만들어져 있는 out상수에 저장된
	          PrintStream객체(출력스트림 통로 역할을 하는 객체)
	          을 반환해 올수 있다.
	       -> PrintStream객체는 출력장치인 모니터장치와 연결되어 있는 
	          1바이트 단위로 모니터에 내보내어 출력할 출력스트림 통로역할의 객체    
		
*/
import java.io.IOException;
import java.io.InputStream;

public class IOTest00 {
	public static void main(String[] args) {
		
		//키보드 장치에서 입력받은 전체 데이터 중에서 1바이트씩 읽어 저장할 변수
		int data = 0;
		
		System.out.print("하나의 문자를 입력하세요. 끝내려면 ctrl+z를 누르세요");
	
		try {	
			//키보드 장치로 부터 입력한 데이터를 1바이트씩 읽어올
			//입력스트림통로 역할을 하는 InputStream객체 얻어오기
			InputStream input = System.in;
	
			//입력한 전체 데이터 중에서 1바이트크기의 데이터만 읽어 읽어들인
			//바이트 수를 정수로 반환해서 저장
				data =  input.read();
			
			//키보드로 부터 입력된 전체 데이터 중에서
		    //읽어 들일 데이터가 InputStream통로에 존재하면 
			//계속 반복해서 1바이트씩, 1바이트씩 읽어서 data변수에 저장
			//그리고 1바이트씩 읽어들인 후 바로 모니터(출력기기)에 출력하자
			while( data !=  -1) {
			
				//1바이트 씪 읽어 들인 데이터 모니터화면에 내보내어 출력
				System.out.print( (char)data  );
				
				//반복문을 통하여 1바이트씩 반복해서 계속 읽어들임
				data = input.read();				
			}
							
		}catch(IOException e) {
			e.printStackTrace();//입출력시 발생한 예외메세지 출력			
		}
			
	}

}












