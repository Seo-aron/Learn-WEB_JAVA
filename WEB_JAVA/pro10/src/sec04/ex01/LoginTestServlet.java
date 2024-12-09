package sec04.ex01;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


// LoginSessionBindingListener인터페이스의 추상메소드들을 오버라이딩해 놓은
// LoginImpl클래스에 대한 객체  LoginImpl loginUser = new LoginImpl("입력안아이디","입력한비밀번호");를 생성하여 
// 저장 시킵니다.  또한 HttpSession객체의 setAttribute("loginUser" loginUser); 메소드를 호출하여 바인딩시~~~
// HttpSessionBindingListener인터페이스를 구현한 LoginImpl객체의  valueBound메소드를 호출합니다. 


@WebServlet("/loginTest")
public class LoginTestServlet extends HttpServlet{
	ServletContext context = null;
	List user_list = new ArrayList();
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//post방식으로 한글 전송 받으면 인코딩 작업 생략!했다. 생략하면 
		//HttpServletRequest객체 메모리에서 요청한 한글을 꺼내올때 깨져서 꺼내와진다.
		//request.setCharacterEncoding("UTF-8");   Filter관련클래스에서 모든서블릿의 공통작업으로 처리하자
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		//입력받은 요청한 값 얻기
		String user_id = request.getParameter("user_id");
		String user_pw = request.getParameter("user_pw");
		 
		//1.이벤트 핸들러 역할을하는 LoginImpl클래스의 객체 생성시  입력받은 요청한값을 생성자로 전달해 저장시킵니다.
		LoginImpl loginUser = new LoginImpl(user_id, user_pw);
		
		HttpSession session = request.getSession(); // HttpSession생성
		
		if(session.isNew()) {//사용자 로그인 접속시 요청한 새로 만든 HttpSession이면?
			//HttpSession영역에  이벤트 핸들러 역할을하는 LoginImpl클래스의 객체주소를 바인딩
			session.setAttribute("loginUser", loginUser);
		}
		
		out.println("<html>");
		out.println("<head>");
		out.println("<script type='text/javascript'>");
		// 자바스크립트의 setTimeout()함수를 이용해 5초 마다 서블릿에 재요청하여 현재 접속자수를 표시하여 웹브라우저에 출력!
		out.println("setTimeout('history.go(0);', 5000)");	
		out.println("</script>");
		out.println("</head>");
		out.println("<body>");
		
				//접속자수를  웹브라우저에 출력!
				out.println("아이디는 : " + loginUser.user_id + "<br>");
				out.println("총 접속자 수 : " + LoginImpl.total_user + "<br>");
				out.println("접속 아이디:<br>");
				
				List list = (ArrayList) context.getAttribute("user_list");
				for (int i = 0; i < list.size(); i++) {
					out.println(list.get(i) + "<br>");
				}
				out.println("<a href='logout?user_id=" + user_id + "'>로그아웃 </a>");
				
		out.println("</body>");
		
		out.println("</html>");
		
		
		
		
	}
	
	
}










