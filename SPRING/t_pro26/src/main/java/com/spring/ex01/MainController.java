package com.spring.ex01;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/*
<bean id="mainController" class="com.spring.ex01.MainController"></bean>
위와 같이 톰캣서버( 컨테이너) 가 아래의 컨트롤러클래스에 대한 <bean>태그를 자동 생성해서 보관 해 둡니다. 
*/
@Controller("mainController")
//클라이언트가 웹브라우저 주소창에 http://localhost:8090/pro26/test 요청하면
//MainController가 요청을 받을수 있게 @RequetMapping어노테이션을 설정함
@RequestMapping("/test")
public class MainController {

//클라이언트가 웹브라우저 주소창에 http://localhost:8090/pro26/test/main1.do
//해석 : @RequestMapping어노테이션을 이용해 두번째 단계의 URL요청시 /main1.do 이면
//      MainController객체의 main1()메소드가 호출되게 설정
//      그리고 method=RequestMethod.GET로 지정하면 GET방식으로 요청시 해당 main1()메소드가 호출됩니다.	
	@RequestMapping(value="/main1.do", method=RequestMethod.GET)
	public ModelAndView main1(HttpServletRequest request,
							  HttpServletResponse reponse) 
									  throws Exception {
		
		//요청한 클라이언트의 웹브라우저로 응답할 데이터  +  뷰명 저장 용도의 객체 생성
		ModelAndView mav = new ModelAndView();
					 mav.addObject("msg","main1");//응답할 데이터 묶어서 저장(바인딩)
					 mav.setViewName("main");//뷰명 저장 (확장자 .jsp 제외)
					 						 //이유 : InternalResourceViewResolver에게 부탁
		return mav;//ModelAndView를 DispatcherServlet로 반환	
	}
	
	@RequestMapping(value="/main2.do", method=RequestMethod.GET)
	public ModelAndView main2(HttpServletRequest request,
							  HttpServletResponse reponse) 
									  throws Exception {
		
		//요청한 클라이언트의 웹브라우저로 응답할 데이터  +  뷰명 저장 용도의 객체 생성
		ModelAndView mav = new ModelAndView();
					 mav.addObject("msg","main2");//응답할 데이터 묶어서 저장(바인딩)
					 mav.setViewName("main");//뷰명 저장 (확장자 .jsp 제외)
					 						 //이유 : InternalResourceViewResolver에게 부탁
		return mav;//ModelAndView를 DispatcherServlet로 반환	
	}
	
	 
	
	
	
}









