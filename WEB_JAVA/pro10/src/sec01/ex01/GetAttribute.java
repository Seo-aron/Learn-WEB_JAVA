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



//두번쨰 서블릿은 각 저장소 객체메모리들에 접근하여 getAttribute()사용후  name속성에 관한 바인딩된 value값을 얻어 브라우저로 출력

@WebServlet("/get")
public class GetAttribute extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		
		//ServletContext객체 메모리 얻기
		ServletContext servletContext = getServletContext();
		//HttpSession객체 메모리 얻기
		HttpSession session = request.getSession();
		//HttpServletRequest객체 메모리는  doGet메소드의 매개변수 request로 받기 때문에 얻지 않는다
		

		//각 저장소 객체 메모리에 저장된(바인딩된) name속성에 관한  value값을 얻어 출력
		String ctxMesg = (String)servletContext.getAttribute("context");
		String sesMesg =  (String)session.getAttribute("session");
		String reqMesg =  (String)request.getAttribute("request");
		
		out.print("ServletContext객체 메모리에 저장된 값:" + ctxMesg + "<br>");
		out.print("HttpSession객체 메모리에 저장된 값:" + sesMesg + "<br>");
		out.print("HttpServletRequest객체 메모리에 저장된 값 : " + reqMesg + "<br>");
	
	}


}







