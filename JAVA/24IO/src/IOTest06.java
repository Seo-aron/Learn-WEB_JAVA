

//주제 : 키보드에서 입력받은 내용을 입력스트립통로(FileInputStream)를 통해 읽어들여
//      특정파일에 저장(쓰기, 기록, 내보냄, 출력)하기 위해
//      출력 스트림 통로(FileOutStream)를 사용한 예제 

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class IOTest06 {
	public static void main(String[] args) {
//키보드에서 입력한 데이터를  파일에 기록
		
		//키보드에서 입력받은 데이터를 1바이트단위씩 읽어들여 저장할 변수
		int data = 0;
		
		System.out.println("파일에 기록할 내용을 입력하세요.");
		System.out.println("지금 입력한 내용은 파일에 기록됩니다.");
		
		//재료 
		File f = null;
		FileOutputStream fos = null;
		InputStream is = null;
		
		try {
			//Test.txt파일에 접근할수 있도록 File클래스의 객체 생성
			f = new File("Test.txt");
			
			//Test.txt파일에 키보드로 입력한 정보를 한바이트 단위의 데이터씩
			//출력하기 위해 FileOutStream출력스트림 통로 역할의 객체 생성
			fos = new FileOutputStream(f, true);
			
			//키보드로 부터 입력한 데이터를 한 바이트씩 읽어들일
			//InputStream추상부모클래스의 하위 BufferedInputStream입력스트림 통로 객체 생성
			is = System.in;
			
		//키보드로 부터 입력받은 전체 데이터 중에서 한바이트 크기의 데이터를 읽어들여
	    //data변수에 저장시켰는데...
	    //data변수에 한바이트 읽어들인 데이터가 저장되어 있으면?
	    //(계속 입력스트림통로에서 읽어들일 데이터가 있으면?)
		//반복해서 키보드로 부터 입력받은 데이터를 입력스트림 통로에서 한바이트씩 읽어들임
			while( (data = is.read()) != -1  ) {
				//한 바이트씩 읽어들인 data변수의 데이터를
				//FileOutputStream출력 스트림을 통해
				//Test.txt파일에 한바이트씩 한바이트씩 기록(출력, 내보낸다) 합니다.
				fos.write(data);
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			//입력 스트림 통로 역할의 객체 그리고 출력스트림 통로 역할의 객체를
			//모두 사용하고 난 후  메모리 해제
			if(fos != null) {//FileOutputStream출력스트림이 생성되어 
							 //사용이 끝나면? 자원해제			
				try {
					fos.close();//FileOutputStream객체 메모리
								//JVM메모리에서 제거 
				} catch (IOException e) {
					e.printStackTrace();
				}		
			}
			if(is != null) {		
				try {
					is.close(); //BufferedInputStrem 객체 메모리
							    //JVM메모리에서 제거 
				} catch (IOException e) {
					e.printStackTrace();
				} 
			}	
		}//finally  
	}//main
}//class







