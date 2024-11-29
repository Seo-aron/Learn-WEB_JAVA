package sec01.ex01;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * 어노테이션 기호란?
 * web.xml파일에서 서블릿을 요청할 매핑주소를 성정할 경우 요청할 주소들이 복잡해 코드가 길어진다는 단점이 있습니다.
 * 따라서 각 서블릿 클래스명 위에 @기호를 붙여서 서블릿을 요청할 매핑주소를 설정하면 코드의 가독성 좋아집니다.
 * => @WebServlet
 */

@WebServlet("/Third")
public class ThirdServlet extends HttpServlet{
	@Override
	public void init() throws ServletException {
		System.out.println("클라이언트가 처음 요청시 톰켓 서버메모리에 로드되는 시점에 호출");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("주소창에 요청할때 GET방식으로 요청 시 호출되는 콜백매소드, 응답할 데이터를 재구현");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("form-input태그에 내용입력할 때 POST방식으로 요청 시 호출되는 콜백매소드, 응답할 데이터를 재구현");
	}
	
	@Override
	public void destroy() {
		System.out.println("톰캣서버가 중지되는 시점에 호출");
	}
}
