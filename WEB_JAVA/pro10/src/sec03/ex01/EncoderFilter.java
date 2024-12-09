package sec03.ex01;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;


//사용자 정의 EncoderFilter클래스를 만들때... 반드시 제공되는 Filter인터페이스안의 추상메소드들을 강제로 메소드 오버라이딩 해서 만든다.
//웹브라우저를 이용해서 서블릿 요청시  doFilter메소드의 매개변수로 request객체와  response객체가 전달되며,
//doFileter메소드는 FilterChain chain세번째 매개변수를 가집니다.
//첫번째 매개변수 request로 전달 받은 HttpServletRequest객체의 정보를 이용해 문자처리방식(한글 인코딩 방식)을 UTF-8처리작업합니다.
//세번째 매개변수인 FilterChain chain으로 전달받은 FilterChain객체의 doFiter()메소드를 호출하는 위치를 기준으로 위쪾에 위치한 코드는 
//요청 필터 기능을 수행합니다.

@WebFilter("/*")
public class EncoderFilter implements Filter {

	ServletContext context;
	
	//클라이언트가 웹브라우저를 이용해 서블릿 요청시  톰캣서버가 프로젝트하나당 만들어주는 ServletContext저장소 객체 메모리를 얻는 역할을 합니다. 
	public void init(FilterConfig fConfig) throws ServletException {
		
		System.out.println("utf-8방식으로 인코딩.........");
		
		context = fConfig.getServletContext();  
		
		
	}
	//실제 모든 서블릿에서 공통적으로 요청받았을때의 요청한 값의 문자를 한글처리(인코딩) 하는 기능의 메소드 
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
	//요청 필터 기능 수행!!!!!!!!!!!!!!!!!!!!!!!!!!!!!	
//		System.out.println("doFilter메소드 호출됨");
		
		request.setCharacterEncoding("UTF-8"); //한글 인코딩 설정 작업을 합니다.
		
		//웹 애플리케이션의 컨텍스트 이름을 가져옵니다.
		String context = ((HttpServletRequest)request).getContextPath();
		//웹브라우저를 통해 요청한 전체 주소 중에서  URI주소를 얻습니다.
		String pathInfo = ((HttpServletRequest)request).getRequestURI();
		//요청한 URI주소의 실제 경로를 가져옵니다.
		String realPath = request.getRealPath(pathInfo);
		
		String mesg = "ContextPath 이름 : " + context  + "\n URI 정보 : " + pathInfo + "\n 물리적경로 : " + realPath;
//		System.out.println(mesg);
		
		
		//1. 요청 필터에서 요청 처리 전의 시각을 구합니다.
		long begin = System.currentTimeMillis();
		
		
//		for(int i=0; i<1000; i++) {
//			System.out.println("1");
//		}
			
		//다음 필터로 넘기는 작업을 수행합니다.
		chain.doFilter(request, response);
		
		
		//doFilter메소드 호출 아래 쪾의 코드는 응답 필터 기능을 구현해 놓습니다.
		//요청전과 후의 시작을 구하는 응답필터 기능 구현
	
		//2.응답 필터 에서 요청 처리후의 시각을 구합니다.
		long end = System.currentTimeMillis();
		//3.작업 요청전과 후의 시각 차를 구해 작업 수행시간을 구합니다.
	//	System.out.println("작업시간 : " + (end-begin) + "ms" );
		
		
		
	}
	
	public void destroy() {
		System.out.println("destory 호출");
	}
}





