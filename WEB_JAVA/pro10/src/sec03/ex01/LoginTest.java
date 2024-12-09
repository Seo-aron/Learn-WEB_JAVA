package sec03.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//login.html에서 로그인 요청시  <form>태그의 action속성에 적힌 서블릿패밍이름으로 요청 받는 서블릿 
@WebServlet("/login")
public class LoginTest extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//post방식으로 한글 전송 받으면 인코딩 작업 생략!했다. 생략하면 
		//HttpServletRequest객체 메모리에서 요청한 한글을 꺼내올때 깨져서 꺼내와진다.
		//request.setCharacterEncoding("UTF-8");   Filter관련클래스에서 모든서블릿의 공통작업으로 처리하자
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		//입력받은 요청한 값 얻기
		String user_name = request.getParameter("user_name");
		String user_pw = request.getParameter("user_pw");
		 
		//입력받은 이름과 비밀번호를 클라이언트의 웹브라우저로 출력해 확인시켜 주자
		out.print("<html><body>이름은" + user_name + "<br> 비밀번호는" + user_pw + "<br> </body></html>");
		
	}
	
	
}










