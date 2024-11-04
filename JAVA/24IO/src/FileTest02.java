

//주제 : 현재 디렉터리 내부에 저장되어 있는 파일 및 폴더 목록 출력하기

import java.io.File;

public class FileTest02 {
	public static void main(String[] args) {		
		//현재 디렉터리에 접근하기 위해  File클래스의 객체 생성
		//참고. 현재 디렉터리  .  
		File fileDir = new File(".");		
		//C:\work_java2\28IO\
		
		//현재 디렉터리에 만들어져 있는 파일명들을 String[]배열에 담아 얻어오기
		String[] strs = fileDir.list();
		
		for(int i=0;  i<strs.length; i++) {
			 System.out.println(  strs[i] );
			 /*			 
				.classpath
				.project
				.settings
				bin
				src
				자바 입출력 IO.pdf
			 */
			 
		}
		
		//d.java파일에 접근하기 위해 File클래스의 객체 생성
		File file = new File("C:\\a\\d.java");
		
		//File객체 생성시 전달한 경로를 이용해 File객체로 d.java파일 삭제
		//d.java파일을 삭제 하기 위해 File클래스의 delete()메소드를 호출하자
//		if( file.delete() ) { //d.java파일 삭제에 성공했다면?
//			System.out.println("파일 삭제 완료!");
//		}else {
//			System.out.println("파일 삭제 실패!");
//		}
//		
		
		//만들어져 있지 않은 b디렉터리를 a디렉터리 내부에 새로 만들기 위해
		//File객체 메모리 생성
		File file2 = new File("C:\\a\\b");//b디렉터리를 생성 해 놓을 경로를 포함해 작성
		
		//File클래스의 mkdir()메소드를 호출하면
		//경로로 지정된 부모 디렉터리가 존재 해야 지정한경로에 디렉터리를 생성합니다
		//file2.mkdir();  // "C:\\a\\b"
		
		//File클래스의 mkdirs()메소드를 호출하면
		//지정한 경로에 디렉터리가 존재하지 않으면 생성합니다.
		file2.mkdirs();  //  "C:\\c"
		
		//File클래스의 isDirectory()메소드는
		//File객체 생성자로 전달한 전체경로의 주소가 실제 디렉터리이냐? 라고 물어보는메소드
		//디렉터리 이면 true반환, 아니면 false반환
		if(file2.isDirectory()) {	
			System.out.println("디렉터리이다.");
		}else {
			System.out.println("파일이다.");
		}
		
		System.out.println("------------------------------------");
		
		//File클래스의 isFile()메소드는 
		//File객체 생성시 생성자로 전달한 전체경로의 주소에 실제 파일이 저장되어 있으면
		//true반환, 실제 파일이 아니고 폴더면 ~  false를 반환
		if(file2.isFile()) {
			System.out.println("파일이다");
		}else {
			System.out.println("파일이 아닌 디렉터리입니다.");
		}
		
		
		
		
		
		

	}

}






