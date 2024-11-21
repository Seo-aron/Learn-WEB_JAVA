package sec04.ex02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/* 첫번째 서블릿(서버페이지)  */
// http://localhost:8090/pro08/first  요청 -> 톰캣서버 는 HttpServletRequest객체 메모리 생성함

@WebServlet("/first")
public class FirstServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, 
						 HttpServletResponse response) 
							 throws ServletException, IOException {
//1. 서블릿간의 재요청의 경우! 문자처리방식 UTF-8로 설정해야 
//   재요청 받는 두번째 서블릿에서 요청해온 데이터를 공유받을때 
//   한글이깨지지 않고 공유받아 웹브라우저로 출력할수 있음
		request.setCharacterEncoding("UTF-8");

//2. 웹브라우저 주소창으로 서블릿 요청하면 
//   톰캣서버는 요청하나당 HttpServletRequest객체 메모리 생성후
//   doGet메소드의 매개변수 request로 전달하므로
//   HttpServletRequest객체 메모리에 
//   address이름과 함께 "부산시 부잔진구" 값을 함꼐 저장(바인딩)할수 있다.
	     request.setAttribute("address", "부산시 부산진구");	

//3.  RequestDispatcher객체의 forward메소드를 이용해서 포워딩 하는 방법 사용
	  RequestDispatcher dispatcher=request.getRequestDispatcher("second");
	   
	  dispatcher.forward(request, response);//재요청시 request, response 공유
	     
		
	}
	
	
}













