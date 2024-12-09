package sec01.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



// ServletContext,  HttpSession,  HttpServletRequest 저장소 객체 메모리들에 
// setAttribue메소드를 호출하여   name속성에 대한 value값을 바인딩 하는 서블릿 

@WebServlet("/set")
public class SetAttribute extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		//바인딩 할 문자열 value값들을 변수에 저장
		String ctxMesg = "ServletContext객체 메모리에 바인딩할 문자열";
		String sesMesg = "HttpSession객체 메모리에 바인딩할 문자열";
		String reqMesg = "HttpServletRequest객체 메모리에 바인딩할 문자열";
		
		//ServletContext객체 메모리 얻기
		ServletContext servletContext = getServletContext();
		//HttpSession객체 메모리 얻기
		HttpSession session = request.getSession();
		//HttpServletRequest객체 메모리는  doGet메소드의 매개변수 request로 받기 때문에 얻지 않는다
		
		//각 저장소 객체 메모리에  값을 바인딩(저장)
		servletContext.setAttribute("context", ctxMesg);
		session.setAttribute("session", sesMesg);
		request.setAttribute("request", reqMesg);
		
		out.print("각 객체 메모리에 바인딩 했습니다.");
	
	}


}







