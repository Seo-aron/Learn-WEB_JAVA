
//주제 : 입력된 전체문자열의 문자 총 갯수 출력 

import java.io.InputStream;
import java.io.OutputStream;

public class IOTest02 {
	public static void main(String[] args) {
		//키보드를 이용해 입력한 전체 데이터 중에서 
		//한번 읽어 들인 한 바이트의 크기의 데이터를 저장할 data변수 선언
		int data = 0;
			
		//읽어들인 전체문자열의 문자 총 갯수를 계산해서 저장할 cnt변수 선언
		int cnt = 0;
		
		//한 바이씩 읽어올 ~ BufferedInputStream입력스트림통로 얻어 
		//InputStream부모추상클래스 자료형의 참조변수 myIn에 저장
		InputStream myIn = System.in;
				
		//한 바이트씩 모니터장치(출력장치)에 내보낼 PrintStream출력스트림 통로 얻어
		//OutputStream부모추상클래스 자료형의 참조변수 myOut에 저장
		OutputStream myOut = System.out;
		
		System.out.print("문자를 입력하세요 : ");
		
		try {
			//키보드로 부터 입력받은 전체데이터 중에서
			//한바이트씩 읽어올 입력한 데이터가 존재하면 계속 반복해서
			//읽어들인 데이터를 data변수에 저장시키고 모니터 화면에 출력하자.
			//또한 입력받은 문자의 갯수를 1증가 해서 cnt변수에 저장.
			//읽어들일 존재하지 않으면 while반복문을 빠져나갑니다
			while( (data = myIn.read()) != -1   ) {
				//소문자 x나 대문자 X를 입력후 엔터를 누르면
				//더이상 읽어 들이지 말고 while반복문 빠져나가기
				if(data == 'x' || data == 'X') {
					break;
				}
				//입력받은 문자의 갯수 증가
				cnt++;
				//입력받아 읽어들인 한바이트 크기의 데이터를 모니터화면에 출력
				myOut.write(data);
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("입력받은 총 문자 갯수->" + cnt);

	}

}




