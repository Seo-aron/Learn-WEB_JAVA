

//주제 : 바이트 출력 스트림 통로 역할을 하는 PrintStream을 사용한 예제

import java.io.IOException;
import java.io.OutputStream;

public class IOTest0A {
	public static void main(String[] args) {
		//키보드로 부터 입력받은 전체 데이터 중에서
		//한 바이트만 입력스트림 통로로부터 얻어와 저장할 변수
		int data = 0;
		
		System.out.print("문자를 입력하세요 : ");
		
		try {
			//System.out : PrintStream출력 스트림 통로 역할의 객체 얻기
			OutputStream myOut = System.out;
			
			//키보드로 부터 입력된 데이터를 입력스트림 통로를 통해 한바이트씩 읽어들이는데
			//한바이트씩 읽어들일 데이터가 존재하면 계속 반복해서 읽어들인 만큼
			//모니터화면에 내보낸다(출력)
			while( (data = System.in.read()) != -1 ) {
				//입력받은 데이터는 입려스트림 통로에 저장되어 있기떄문에
				//입력스트림 통로에 저장된 데이터를 한 바이트 단위로
				//모니터에 내보내어 출력할 출력스트림 통로 역할을 하는 PrintStream의
				//write메소드를 호출해 한번 읽어들인 한바이트 단위로 내보낸다.
				myOut.write(data);
/*
참고.  write메소드는 오버로딩 되어 있다

void write(int b)  <-  1byte를 출력
void write(byte[] b) <- 매개변수 b로 전달한 byte배열 크기 만큼 한번 출력
void write(byte[] b, int off, int len)
<- 매개변수 b로 전달한 전체 byte배열에 저장된 byte데이터 중에서
   b[off] 부터  len개의 바이트를 한번에 출력 
*/								
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
		

	}

}


