package sec05.ex03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//주제 : 
//getServletContext()메소드를 호출하여 ServletContext객체 메모리를 얻어 접근합니다.
//getResourceAsStream()메소드를 이용해 읽어들일 데이터가 저장된 파일 위치 경로를 지정한후 
//InputStream입력스트림 통로를 반환받아 파일에서 데이터를 바이트 단위로 읽어들여 
//웹브라우저로 응답 합니다.

//http://localhost:8090/pro08/cfile 입력하여 요청!
@WebServlet("/cfile")
public class ContextFileServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//요청한 웹브라우저에 응답할 데이터 종류를 text/html;로 설정하고
		//문자처리 방식 UTF-8로 설정
		response.setContentType("text/html;charset=utf-8");
		
		//요청한 클라이언트의 웹브라우저와 연결된 출력스트림 통로 PrintWriter객체 얻기
		PrintWriter out = response.getWriter();
		
		//웹프로젝트의 모든 서버페이지가 공유할 자원이 저장되는 ServletContext객체 메모리 얻기
		ServletContext context  = this.getServletContext();
		
		//웹프로젝트 내부에 만들어 놓은 "WEB-INF/bin/init.txt"파일의 데이터를 
		//바이트 단위로 읽어들이기 위한 init.txt파일과연결된 InputStream 입력스트림 통로 얻기 
		InputStream is = context.getResourceAsStream("/WEB-INF/bin/init.txt");
		
		
		///파일의 내용을 버퍼 메모리에 저장해 두었다가 2바이트 단위로 읽어들이기 위해
		//InputStream통로를 InputStreamReaer로 업그레이드 시키고
		//BufferedReader통로로 또한 업그레이드 시키자
		BufferedReader bufferedReader
		 					= new BufferedReader( new InputStreamReader(is) );
		
		//init.txt파일에서 읽어온 메뉴 데이터 정보들을 저장할 변수들 선언
		String menu = null;
		String menu_member = null;
		String menu_order = null;
		String menu_goods = null;
		
		//파일의 전체 데이터를 끝까지 읽어들이면서 각 메뉴 정보를 반복해서 분리 합니다.
		//init.txt파일은 줄에 "회원메뉴, 주문메뉴, 상품메뉴" 와 같은 형식으로 구성되어 있습니다.
		while( (menu = bufferedReader.readLine()) != null  ) {
			
			// 콤마 , 를 구분자 기호로 정하여 메뉴 항목전체를 문자열로 분리 시킬수 있도록 객체 생성
			StringTokenizer tokenizer = new StringTokenizer(menu, ",");
			
			menu_member = tokenizer.nextToken(); //"회원등록 회원조회 회원수정"   
			menu_order	=  tokenizer.nextToken(); //"주문조회 주문수정 주문취소"
			menu_goods =  tokenizer.nextToken(); //"상품조회 상품등록 상품수정 상품삭제"			  
		
		}
		
		//출력 스트림 통로인? PrintWriter의 print메소드를 이용해
		//클라이언트의 웹브라우저로 init.txt파일에서 읽어들인 메뉴 데이터들을 응답(출력)
		out.print(menu_member + "<br>"); //회원메뉴들
		out.print(menu_order + "<br>");  //주문 메뉴들
		out.print(menu_goods + "<br>");  //상품 메뉴들    
		
	
		
	}

}














