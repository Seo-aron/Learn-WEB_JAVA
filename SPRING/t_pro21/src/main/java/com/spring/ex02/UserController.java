package com.spring.ex02;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

//MVC�߿��� C�� ������ �ϴ� Ŭ���� 


//�� MultiActionControllerŬ������ ��ӹ޾�  UserController�� ������ �ϴ���?
//-> action-servlet.xml���������� 
//   userMethodNameResolver��ü�� ����(�Ӽ�,������Ƽ)�� ����ϱ� ���� ~~
public class UserController extends MultiActionController {
/*
��ӹ���  methodNameResolver ������  
        setMethodNameResolver�޼ҵ尡 ���� ������ ������ ���� �մϴ�.
*/	
		
/*
	/test/loginForm.do ��û �ּҸ� ������
	test������ ����� ���� VIEW �� ? loginForm.jsp  
	VIEWȭ���� ���������� ���� �ֱ� ���� ����� �޼ҵ� 
*/	
	public String loginForm(HttpServletRequest request,
							HttpServletResponse response) 
									throws Exception {
		
		//����ó �������� Ȯ���� .jsp�� ������
		//���̸�(loginForm)�� ����ó �������� ��ȯ
		return "loginForm";
		
	}
	
	//loginForm.jsp���� �Է��� ���̵�� ��й�ȣ�� request�� ��Ƽ� ���޹޾�
	//�α��ο�û�� �Է��� ������ result.jsp VIEW�� �����ִ� ��� ó�� �޼ҵ� 
	public ModelAndView login(HttpServletRequest request,
							  HttpServletResponse response) 
									throws Exception {

		//�ѱ�ó��
		request.setCharacterEncoding("UTF-8");
		
		//�α��ο�û�� �Է��� ��û�Ѱ���(���̵�,��й�ȣ)�� request��ü �޸𸮷κ��� ���
		String userID = request.getParameter("userID");
		String passwd = request.getParameter("passwd");
		
		//�α����� ���� �Է��� ���̵�� ��й�ȣ ������ ����� �ԷµǾ����� 
	    //���������� ���(����)�ؼ� �����ֱ� ���� ��û�� ������ ���������� �����Ұ����� ����սô�.!!
		//���������� ������ Model�� ModelAndView��ü �޸� ������ ���ε�!
		ModelAndView mav = new ModelAndView();
					//���������� ������ �� ���ε�
					 mav.addObject("userID", userID);
					 mav.addObject("passwd", passwd);
		
					//Ȯ���� .jsp�� ������ ������VIEW�� ���ε�
					 mav.setViewName("result");
		
		//����ó ����(DispatcherServlet)���� ������ Model�� ������VIEW�� ���ε���
		//ModelAndView��ȯ 
		return mav;
	/*
		����ó ������ action-servlet.xml�������Ͽ� ������
		InternalResourceViewResolver����  ���̸� result�� �����ϸ�
		prefix������ ������ �䰡 ����� ��� -> /test/ �� 
		suffix������ ������ ���� Ȯ���� �� ->  .jsp�� ������ 
		/test/result.jsp �䰡 ����� ��ü �ּҸ� ���� 
		����ó �������� �ٽ� �����Ͽ� �並 ã�� ���������� ����(���)�ؼ� �����ݴϴ�. 
	*/	
	}	
		
	
	//ȸ�� ���� â ��û�� �޾� ����� ����ó�������� ��ȯ �ϴ±��
	public String memberForm(HttpServletRequest request,
						 	 HttpServletResponse response) 
								 throws Exception {
		//Ȯ���� .jsp�� ������ ���̸�(memberForm)�� 
		//����ó �������� ��ȯ�� 
		//InternalResourceViewResolver�� ������ "/test/memberForm.jsp"��ü �� �ּҸ� ����� �ȴ�
		return "memberForm";
	}
	
	
	//�Է��� ȸ�� �������� Ŭ���̾�Ʈ���� Ȯ�� ���� �ֱ� ���� ���
	public ModelAndView memberInfo(HttpServletRequest request,
						 	 		HttpServletResponse response) 
						 	 				throws Exception {
	   //1.�ѱ�ó�� 
		request.setCharacterEncoding("utf-8");
		
	   //2.Ŭ���̾�Ʈ�� ��û�� ���� request���� ���
	   ModelAndView mav = new ModelAndView();
	   
	   String id = request.getParameter("id");
	   String pwd = request.getParameter("pwd");
	   String name = request.getParameter("name");
	   String email = request.getParameter("email");
		
	   //3.��û�� ������ ModelAndView��ü �޸� ������ ���⿡ ���ε�
	   mav.addObject("id", id);
	   mav.addObject("pwd", pwd);
	   mav.addObject("name",name);
	   mav.addObject("email",email);
	   //3.1 ��û�� ������ ���������� ������ VIEW���� ModelAndView�� ����
	   mav.setViewName("memberInfo");
		
		//4. ModelAndView��ü �޸𸮸� DispatcherServlet���� ��ȯ
		return mav;
	}
	
	
	
	
	
	
	
}//UserControllerŬ����   MVC �߿� C























