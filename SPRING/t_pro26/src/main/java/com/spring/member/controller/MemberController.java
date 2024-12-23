package com.spring.member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

import com.spring.member.vo.MemberVO;

public interface MemberController {

	//모든 회원 정보 조회 기능
	public ModelAndView listMembers(HttpServletRequest reuqest, 
									HttpServletResponse response) throws Exception;
	
	//회원가입 화면 이동 기능
	//public String memberForm(HttpServletRequest reuqest, 
	//						   HttpServletResponse response) throws Exception;
	
	//회원가입 기능
	//public String addMember(HttpServletRequest request, 
	//					      HttpServletResponse response) throws Exception;
	
	 ModelAndView addMember(MemberVO member,
						  HttpServletRequest request, 
				          HttpServletResponse response) throws Exception;

	
	
	//회원정보  수정을 위해 회원 한명의 정보 조회 기능
	public ModelAndView memberDetail(HttpServletRequest request, 
									 HttpServletResponse response) throws Exception;
	
	//회원 한명 정보 수정 기능
	//public String   UpdateMember(HttpServletRequest request, 
	//		 	    			 HttpServletResponse response) throws Exception;
	
	//회원 한명 정보 수정 기능
		ModelAndView UpdateMember(MemberVO member, 
								  HttpServletRequest request, 
								  HttpServletResponse response) throws Exception;
		
	
	
	
	//회원정보 삭제 기능
		    ModelAndView memberDel(String id,
								  HttpServletRequest request, 
		    					  HttpServletResponse response) throws Exception;

	
	//여러 요청주소에 대해 한개의 메소드를 호출할 경우 정규식을 이용해 매핑하는 역할을 합니다. 
	//요청한 주소가 Form.do로 끝나는 주소로 요청하면 Form메소드가 호출되게 작성 
	ModelAndView Form(HttpServletRequest request, HttpServletResponse response) 
																		throws Exception;


	
	//회원로그인 처리 기능
	
	//회원로그아웃 처리 기능
	
	
	
}








