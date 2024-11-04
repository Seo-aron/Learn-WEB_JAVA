
//예제. CMD창에 두개의 파일이름을 입력받아  
//     FileReader문자스트림 통로를 통해 문자단위로 파일의 내용을 읽어서
//     문자 단위로 다른 파일에 내용을 쓰기위한 FileWriter문자스트림 통로역할을 하는 
//     클래스들을 사용해 보자.

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

public class FileCopy02 { //<- 파일 복사 프로그램 

//	CMD창에서 입력할것
//  java FileCopy02 원본파일명        복사할파일명 	
//  java FileCopy02 FileTest04.java FileTest05.java	
	
	public static void main(String[] args) {
		//파일에 저장된 데이터를 2바이트 크기를 읽어 저장할 변수 
		int data = 0;
		
		//재료
		FileReader readr = null;   FileWriter writer = null;
		
		//복사할파일명을 입력하지 않으면?
		if(args.length < 2 ) {
			System.out.println("java FileCopy02 원본파일명 복제될파일명");
			System.exit(0);
		}
		try {
			//원본파일에 저장된 데이터를 영문한문자(2바이트)단위로 읽어올
			//FileReader입력문자스트림 통로 객체 생성
			readr = new FileReader( args[0] ); //원본파일명
			
			//복사할파일에 원본파일에서 읽어들인 데이터를 영문한문자(2바이트)단위로
			//기록할 FileWriter출력문자스트림 통로 객체 생성
			writer = new FileWriter( args[1] ); //복사한파일명
			
			//원본파일에서 2바이트단위로 읽어들인 데이터가 존재하면 반복
			while( (data = readr.read()) != -1    ) {
				//한번 읽어들인 data변수의 값을 복사될파일에 기록
				writer.write(data);
			}	
		}catch (Exception e) {
			e.printStackTrace();
		}finally {//try와 catch와 상관없이 무조건 한번 실행할코드 작성
			//위 만들어서 사용한 문자입출력스트림 통로를 사용하지 않으면
			//메모리 낭비이니 JVM메모리에서 제거 하자			
			try {
				if(readr != null) {readr.close();}
				if(writer != null) {writer.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}//finally
	}//main메소드 
}//클래스 











