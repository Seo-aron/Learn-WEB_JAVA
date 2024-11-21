package com.spring.ex01;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
/*
  MVC �߿��� C������ �ϴ� Ŭ����
  
  action-servlet.xml����������  ��û�� ó�� �ϱ� ����
  Controller�������̽��� �����ؼ� ������ �ϸ�
  SimpleUrlContrllerŬ������ ��û�� ������
  ModelAndView��ü �޸𸮸� �����Ͽ� ���������� ������ VIEW�̸��� index.jsp �߿��� index��
  �����ڷ� �����Ͽ� ModelAndView��ü �޸𸮿� ���ε�(����)�� 
  ����ó �������� ��ȯ�մϴ�.
*/
public class SimpleUrlController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, 
								      HttpServletResponse response) 
								    		  throws Exception {
		

		//�۾��� ��ģ�� ���������� ������ ���̸�(index.jsp �߿��� index)�� 
		//ModelAndView��ü �޸𸮿� ������ 
		//����ó �������� ModelAndView��ü�� ��ȯ
		
		return  new ModelAndView("index");
	}

	
	
	
}

















