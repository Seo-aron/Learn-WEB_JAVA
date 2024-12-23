package sec04.ex02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//두번째 서블릿 (서버페이지)
//-> FirstServlet 첫번째 서블릿으로 부터 재요청(포워딩)되서 요청을 받는 SecondServlet 두번쨰 서블릿 클래스
//재요청 받는 주소 :  http://localhost:8081/pro08/second


//이전 FirstServlet첫번쨰 서블릿에서 전달된 값을
//request에 getAttribute메소드를 이용해 가져와
//클라이언트의 웹브라우저로 응답하는 SecondServlet두번쨰 서블릿 클래스 

@WebServlet("/second")
public class SecondServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, 
						 HttpServletResponse response) 
						 throws ServletException, IOException {
		
	    //1. 한글처리  UTF-8로 설정
		request.setCharacterEncoding("UTF-8");
		
		//2. 첫번째 서블릿 FirstServlet 클래스 내부에서 작성한
		//   request.setAttribute("address","부산시 부산진구"); 
		//  에 의해 바인딩된 정보를 한번 꺼내와서 사용해 보자~~~~~~~
		String address = (String)request.getAttribute("address");
		
		//3.클라이언트의 웹브라우저로 응답할 데이터종류(MIME-TYPE)을 
		//HttpServletResponse객체에 설정  및  응답할 데이터 한글처리
		response.setContentType("text/html;charset=utf-8");
		
		//클라이언트의 웹브라우저로 응답할 출력스트림 통로  PrintWriter객체 얻기
		PrintWriter out = response.getWriter();
		
		out.print("<html><body>");
											 // "부산시 부산진구"     
		out.print("재요청받아 공유해서 출력하는 값 : " + address );
		
		out.print("</body></html>");
		
		
		
		
	}
}


















