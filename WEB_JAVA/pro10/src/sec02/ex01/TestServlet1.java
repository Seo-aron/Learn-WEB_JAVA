package sec02.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



//http://localhost:8090/pro10/first/test로 요청할때 서블릿을 요청 받습니다.

@WebServlet("/first/test")//  /first/test    /첫번째주소/두번째주소 가 정확히 일치하는 주소를 입력해야만? 해당 서블릿을 요청할수 있다.
public class TestServlet1 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		//HttpServletRequest객체의 메소드들!
		//1. 위요청한 URL주소중에서  컨텍스트주소만 반환하는메소드
		String context = request.getContextPath();
		System.out.println("getContextPath()메소드 호출후 반환받은 컨텍스트주소 : " +  context   );
		
		//2.위 요청한 전체 URL주소를 반환하는 메소드
		String url = request.getRequestURL().toString();
		System.out.println("getRequestURL()메소드 호출후 반환 받은 클라이언트가 요청한 전체 주소 : " + url);
		
		//3.위 요청한 전체 URL 주소중에서 서블릿 매핑이름(주소)만 반환하는 메소드
		String mapping = request.getServletPath();
		System.out.println("getServletPaht()메소드 호출후 반환 받은 클라이언트가 요청한 서블릿 매핑이름 : " + mapping);
		
	    //4.위 요청한 전체 URL 주소중에서 URI주소만 반환하는 메소드
		String uri = request.getRequestURI();
		System.out.println("getRequestURI()메소드 호출후 반환 받은 클라이언트가 요청한 주소중 URI주소 : " + uri);
	}


}







