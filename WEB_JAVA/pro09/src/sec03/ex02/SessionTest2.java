package sec03.ex02;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//서블릿

@WebServlet("/sess2")
public class SessionTest2 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

			response.setContentType("text/html;charset=utf-8");//응답 데이터 유형 설정
			
			PrintWriter out = response.getWriter();//출력 스트림
			
			//1. HttpServletRequest객체의 getSession메소드의 반환 값으로 HttpSession을 얻자 
			// 요약 : HttpSession객체 메모리 생성(얻기)
			HttpSession session = request.getSession();
			//참고. 기존에 만들었던 HttpSession객체 메모리가 없으면 새로운 HttpSession객체를 만들어 반환해 준다 
			
			
			//2. 생성된 HttpSession객체 메모리를 식별할 ID얻기
			//방법 : getId()메소드를 호출하면 ID를 얻을수 있다.
			out.print("HttpSession메모리의 아이디 : " + session.getId() + "<br>");
			
			//3. 최초 HttpSession객체 메모리 생성한 시각 얻기 
			//방법 :   getCreationTime()메소드를 호출하면 세선 생성 시각을 얻을 수 있다
			out.print("최초 HttpSession메모리 생성 시각 : " + new Date(session.getCreationTime()) + "<br>");
			
			//4. 생성된 HttpSession객체 메모리에 가장 최근에 접근한 시간을 가져옵니다.
			//방법 :  getLastAccessedTime()메소드를 호출하면 얻을수 있다.
			out.print("최근 세션 메모리에 접근한 시각 : " + new Date(session.getLastAccessedTime()) +  "<br>" );
			
			//4.1 톰캣 서버 메모리에 HttpSession객체메모리가 올라가 있는 기본 유효시간 
			//     1800초 (30분)  
			out.print("기본 세션 유효 시간 : " + session.getMaxInactiveInterval() + "<br>" );
			
			//4.2 HttpSession객체 메모리가 올라가 있는 시간 5초로 바꾸기 
			session.setMaxInactiveInterval(5);
			
			//4.3 톰캣 서버 메모리에 HttpSession객체메모리가 올라가 있는 기본 유효시간 
			//     1800초 (30분)  
			out.print("기본 세션 유효 시간 : " + session.getMaxInactiveInterval() + "<br>" );
			
			//5. 생성된 HttpSession객체 메모리가 톰캣서버 메모리에 올라가 있는 유효시간 얻기
			out.print("세션 메모리 유지 시간 : " +  session.getMaxInactiveInterval() + "<br>" );
			
			
			
			
			
			//6. 최초로 생성된 HttpSession객체 메모리 이면? true반환 하는 isNew()메소드를 활용하여
			//   최초로 생성된 HttpSession객체 메모리 인지 판별
			if( session.isNew() ) {
				out.print("새로 생성된 HttpSession객체 메모리 입니다.");
			}
			
		
		
	}

	
	
	
	
}










