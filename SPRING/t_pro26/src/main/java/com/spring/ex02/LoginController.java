package com.spring.ex02;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;



//<bean id="loginController"  class="com.spring.ex02.LoginController" /> ���� �ڵ������ؼ�
// ��Ĺ �����̳� �޸𸮿� ���� �� �д�.
@Controller("loginController")
public class LoginController {

	//  http://localhost:8090/pro26/test/loginForm.do�ּҸ� �Է��Ͽ� ��û�ϸ�
	//	���̵� ��й�ȣ �Է��ϴ� VIEWȭ�� ��û�ϸ� ȣ��Ǵ� loginForm�޼ҵ� �Դϴ�.
	//  �̶� method = {RequestMethod.GET} �� �����ϸ� GET������� ��û�� �ϸ� �޼ҵ尡 ȣ��˴ϴ�.
	@RequestMapping(value = {"/test/loginForm.do","/test/loginForm2.do"},
			        method = {RequestMethod.GET}       )
	public ModelAndView loginForm(HttpServletRequest request, 
								  HttpServletResponse response) throws Exception {
		
		request.setCharacterEncoding("UTF-8");
		
		//��û�� Ŭ���̾�Ʈ�� ���������� ������ VIEW���� ModelAndView��ü�� �����ؼ� ��������
		//�׸��� ModelAndView��ü�� DispatcherServet���� ��ȯ �ؼ� 
		//InternalResourceViewResource���� loginForm�� �����ؼ� ���� ��ü ��θ� ���� ã�ư�
		return new ModelAndView("loginForm");
	}
	
	
	//loginForm.jspȭ�鿡�� ���̵�� �̸��� �Է¹ް� �α��� ��ư�� ��������
	//<form>�� action�Ӽ��� ���� ��û�ּ� /test/login.do�� POST������� ��û������ ȣ��Ǵ� login�޼ҵ�
	@RequestMapping(value = {"/test/login.do"},
			        method = {RequestMethod.POST}       )
		public ModelAndView login(HttpServletRequest request, 
								  HttpServletResponse response) throws Exception {
		
		request.setCharacterEncoding("UTF-8");
		
		//Ŭ���̾�Ʈ�� �Է��Ͽ� ��û�� �� 2���� request�޸𸮿��� ���
		String userID = request.getParameter("userID"); //�Է��� ���̵� ��� 
		String userName = request.getParameter("userName"); //�Է��� �̸� ��� 
		
		//Ŭ���̾�Ʈ�� ��û�� ���������� Model������ �׸��� ������ VIEW(JSP)���� ������ �뵵�� ��ü ����
		ModelAndView mav = new ModelAndView();
		//������ Model������ ���ε�(Ű-�� ��� ����)
					 mav.addObject("userID", userID);//�Է��� ���̵� ���� 
					 mav.addObject("userName", userName);//�Է��� �̸� ����
		//���������� ������ VIEW�� (Ȯ���� .jsp�� ������ jsp��)��  ����
					 mav.setViewName("result");
				
		return  mav;
		
	}
	
	
	
	
	/*
	���� ������ ��û�� ����(�Ű�������)�� getParameter�޼ҵ带 �̿��� ���� ������ϴ�.
	�׷��� ���۵Ǿ�� �Ű������� ���� �������� 
	������  getParameter()�޼ҵ带 �̿��ϴ� ����� �����մϴ�.
	@RequestParam������̼� ��ȣ�� �Ű������� �ۼ��ؼ� ����ϸ� ���� ��û�� ������ �Ű������� ������ �ִ�.
	
	loginForm.jsp���� ���̵� �Է� �� <input>�� name�Ӽ��� ���� 
	@RequestParam(name�Ӽ���) String userID �̷��� ���� �ָ� �Ű������� �ٷ� ���� �޽��ϴ�.  
	
	@RequestParam�� required�Ӽ� ����ϱ� 
			�α����ϴ� ��� ID�� ��й�ȣ ���� ������ �ݵ�� ��Ʈ�ѷ��� ���޵Ǿ�� �մϴ�.
			�� required�Ӽ��� ����ϸ� �ݵ�� �����ؾ��ϴ� �ʼ� ��û���� ���� �׷��� ���� ��츦 �����Ҽ� �ִ�.
			1. @RequestParam����� required�Ӽ��� �����ϸ� �⺻���� true�� ���� �ȴ�.
			2. required�Ӽ��� true�� �����ϸ� �޼ҵ� ȣ��� �ݵ�� ������ �̸��� �Ű������� ���� �ؾ� �մϴ�.
			   (loginForm.jsp�� <input type="hidden" name="email"...>�±׸� �ݵ�� �ۼ��ؼ� ���� �ؾ���)
			3. required�Ӽ��� false�� �����ϸ� �޼ҵ� ȣ��� ��û�� �Ű������� ���� �Ǹ�
			   ���� �����ϰ� ������ null�� �Ҵ� �մϴ�.    
	
	
	
	*/
		
		//loginForm.jspȭ�鿡�� ���̵�� �̸��� �Է¹ް� �α��� ��ư�� ��������
		//<form>�� action�Ӽ��� ���� ��û�ּ� /test/login2.do�� POST������� ��û������ ȣ��Ǵ� login2�޼ҵ�
		@RequestMapping(value = {"/test/login2.do"},
				        method = {RequestMethod.POST}       )
			public ModelAndView login2(@RequestParam(value="email", required = false) String email,  
									   @RequestParam(value="userID", required = true) String userID,
									   @RequestParam(value="userName", required = true) String userName,
					
									   HttpServletRequest request, 
									   HttpServletResponse response) throws Exception {
			
			request.setCharacterEncoding("UTF-8");
		
			System.out.println("userID : " + userID);
			System.out.println("userName : " + userName);
			System.out.println("email : " + email);
			
			
			
			//Ŭ���̾�Ʈ�� ��û�� ���������� Model������ �׸��� ������ VIEW(JSP)���� ������ �뵵�� ��ü ����
			ModelAndView mav = new ModelAndView();
			//������ Model������ ���ε�(Ű-�� ��� ����)
						 mav.addObject("userID", userID);//�Է��� ���̵� ���� 
						 mav.addObject("userName", userName);//�Է��� �̸� ����
			//���������� ������ VIEW�� (Ȯ���� .jsp�� ������ jsp��)��  ����
						 mav.setViewName("result");
					
			return  mav;
			
		}
		
	/*
		@RequestParam �̿��� Map�� ��û�� �� ��� ���� �ϱ� 
		- ��û�Ͽ� ���۵Ǵ� ������ ���� ��� ������  @RequestParam���� �Ű������� ����� ���� ����ϸ�
		    �����մϴ�. ��û�Ѱ����� �ڵ����� Map�� ���� �� �Ű������� ���� �ްڽ��ϴ�.
	
	*/	
		@RequestMapping(value = {"/test/login3.do"},
		        		method = {RequestMethod.POST}       )
		public ModelAndView login3(
								   //�Ű������̸� �� info�� Map�� 
								   //<input>�±��� name���� key��  �Է��Ѱ���  value�� �ؼ�
								   //�ڵ� ������ �Ű������� Map�� ���� �޽��ϴ�.
								   @RequestParam Map<String, String> info,
				
								   HttpServletRequest request, 
								   HttpServletResponse response) throws Exception {
		
		request.setCharacterEncoding("UTF-8");
	
		//�Է��� ���̵�, �̸� Ȯ��
		String userID = info.get("userID");//<input>�±��� name���� key�� ������ �־� �ش�
		String userName = info.get("userName");//<input>�±��� name�Ӽ��� ���� ���� key�⶧���� �־��ش�
		
		System.out.println("userID : " + userID);
		System.out.println("userName : " + userName);
		
		
		
		//Ŭ���̾�Ʈ�� ��û�� ���������� Model������ �׸��� ������ VIEW(JSP)���� ������ �뵵�� ��ü ����
		ModelAndView mav = new ModelAndView();
		//������ Model������ ���ε�(Ű-�� ��� ����)
					 mav.addObject("info", info);//�Ű����� info�� ���� Map��ü�� ���ε�	
		//���������� ������ VIEW�� (Ȯ���� .jsp�� ������ jsp��)��  ����
					 mav.setViewName("result");
				
		return  mav;
		
	}

/*	
	@ModelAttribute ������̼� ��ȣ�� ����� VO�� ��û�� �� �ڵ����� �����ϱ� 
								   
	@ModelAttribute("info") LoginVO loginVO �Ű������� ����...
	LoginVOŬ������ ���� ��ü�� �����մϴ�. �̾ <input>�±��� name�Ӽ����� 
	���� LoginVO�� ������ ���� ������ �ڵ����� ���� ������ �� �Ű������� 
	LoginVO��ü ��ü�� ���� �޽��ϴ�. 
	
	���� ��� loginForm.jsp(�α���â)����  �Է��� <input>�±��� name�Ӽ����� userID�̰�
	�Է��� ���� hong�ϰ��  @ModelAttribute ��  LoginVO loginVO�Ű������� �����ϸ�
	LoginVO��ü�� �ڵ����� �����ǰ� userID������ �Է��� ��hong�� �ڵ� ����Ǿ� �����˴ϴ�.  
	
	
	@ModelAttribute("info") LoginVO loginVO ��� �����ָ�
	
	�츮�� ModelAndView��ü�� �����Ͽ� LoginVO��ü �����!! �ۼ� �ߴ�
	 mav.addObject("info", loginVO); ������ �ڵ����� ���ݴϴ�. 
	
*/			
		
		
			@RequestMapping(value = {"/test/login4.do"},
	        				method = {RequestMethod.POST}       )
	public ModelAndView login4(@ModelAttribute("info") LoginVO loginVO) 
							  throws Exception {
	
	//Ŭ���̾�Ʈ�� ��û�� ���������� Model������ �׸��� ������ VIEW(JSP)���� ������ �뵵�� ��ü ����
	ModelAndView mav = new ModelAndView("result");
	//������ Model������ ���ε�(Ű-�� ��� ����)
			   //mav.addObject("info", loginVO); <- �ڵ����� �ۼ��� �ش�.
			
	return  mav;
	
	}	

/*
	ModelŬ���� �̿��� ���������� ������ �� �����ϱ�
	- ModelŬ������ �̿��ϸ� login5�޼ҵ� ȣ��� JSP�� ���� �ٷ� ���ε��Ͽ� �����Ҽ� �ֽ��ϴ�.
	- ModelŬ������ addAttribute("�Ӽ���","�����Ұ�")�޼ҵ��
	  ModelAndViewŬ������ addObject("�Ӽ���","�����Ұ�")�޼ҵ�� ���� ����� �մϴ�.
	  ModelŬ������ ���� �������� ������ �ʿ䰡 ������ ����ϸ� �� �մϴ�. 
	
	http://localhost:8090/pro26/test/login5.do�� �Է��ؼ� GET������� ��û�ϸ� ȣ��Ǵ� login5�޼ҵ�
*/
	@RequestMapping(value = {"/test/login5.do"},
			        method = {RequestMethod.GET})
	public String  login5(Model model) throws Exception {
						  										
		//�Ű������� ���� �޴� Model��ü�� Ŭ���̾�Ʈ�� ���������� ������ ���� �ӽ÷� ����(���ε�)
		model.addAttribute("userID", "hong");
		model.addAttribute("userName", "ȫ�浿");
		
		return "result";//����� ����ó�������� ��ȯ
	
	}		
			
			
	
}//LoginControllerŬ���� 














