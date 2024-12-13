package com.spring.ex01;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/*
<bean id="mainController" class="com.spring.ex01.MainController"></bean>
���� ���� ��Ĺ����( �����̳�) �� �Ʒ��� ��Ʈ�ѷ�Ŭ������ ���� <bean>�±׸� �ڵ� �����ؼ� ���� �� �Ӵϴ�. 
*/
@Controller("mainController")
//Ŭ���̾�Ʈ�� �������� �ּ�â�� http://localhost:8090/pro26/test ��û�ϸ�
//MainController�� ��û�� ������ �ְ� @RequetMapping������̼��� ������
@RequestMapping("/test")
public class MainController {

//Ŭ���̾�Ʈ�� �������� �ּ�â�� http://localhost:8090/pro26/test/main1.do
//�ؼ� : @RequestMapping������̼��� �̿��� �ι�° �ܰ��� URL��û�� /main1.do �̸�
//      MainController��ü�� main1()�޼ҵ尡 ȣ��ǰ� ����
//      �׸��� method=RequestMethod.GET�� �����ϸ� GET������� ��û�� �ش� main1()�޼ҵ尡 ȣ��˴ϴ�.	
	@RequestMapping(value="/main1.do", method=RequestMethod.GET)
	public ModelAndView main1(HttpServletRequest request,
							  HttpServletResponse reponse) 
									  throws Exception {
		
		//��û�� Ŭ���̾�Ʈ�� ���������� ������ ������  +  ��� ���� �뵵�� ��ü ����
		ModelAndView mav = new ModelAndView();
					 mav.addObject("msg","main1");//������ ������ ��� ����(���ε�)
					 mav.setViewName("main");//��� ���� (Ȯ���� .jsp ����)
					 						 //���� : InternalResourceViewResolver���� ��Ź
		return mav;//ModelAndView�� DispatcherServlet�� ��ȯ	
	}
	
	@RequestMapping(value="/main2.do", method=RequestMethod.GET)
	public ModelAndView main2(HttpServletRequest request,
							  HttpServletResponse reponse) 
									  throws Exception {
		
		//��û�� Ŭ���̾�Ʈ�� ���������� ������ ������  +  ��� ���� �뵵�� ��ü ����
		ModelAndView mav = new ModelAndView();
					 mav.addObject("msg","main2");//������ ������ ��� ����(���ε�)
					 mav.setViewName("main");//��� ���� (Ȯ���� .jsp ����)
					 						 //���� : InternalResourceViewResolver���� ��Ź
		return mav;//ModelAndView�� DispatcherServlet�� ��ȯ	
	}
	
	 
	
	
	
}









