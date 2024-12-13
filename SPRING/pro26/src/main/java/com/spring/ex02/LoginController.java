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

@Controller("LoginController")
public class LoginController {
	
	@RequestMapping(value = {"/test/loginForm.do", "/test/loginForm2.do"}, method = {RequestMethod.GET})
	public ModelAndView loginForm(HttpServletRequest request, HttpServletResponse response) 
			throws Exception {
		
		request.setCharacterEncoding("UTF-8");
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("loginForm");
		
		return mav;
	}
	
	// 기존 알던 방식
	@RequestMapping(value = {"/test/login.do"}, method = {RequestMethod.POST})
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response) 
			throws Exception{
		
		request.setCharacterEncoding("UTF-8");
		
		String userID = request.getParameter("userID");
		String userName = request.getParameter("userName");
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("userID", userID);
		mav.addObject("userName", userName);
		mav.setViewName("result");
		
		return mav;
	}
	
	@RequestMapping(value = {"/test/login2.do"}, method = {RequestMethod.POST})
	public ModelAndView login2(
			@RequestParam(value = "userID", required = true) String userID,
			@RequestParam(value = "userName", required = true) String userName,
			@RequestParam(value = "email", required = true) String email,
		
			HttpServletRequest request, HttpServletResponse response) 
			throws Exception{
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("userID", userID);
		mav.addObject("userName", userName);
		mav.addObject("email", email);
		mav.setViewName("result");
		
		return mav;
	}
	
	@RequestMapping(value = {"/test/login3.do"}, method = {RequestMethod.POST})
	public ModelAndView login3(
			@RequestParam Map<String, String> info,
			
			HttpServletRequest request, HttpServletResponse response) 
			throws Exception{
		
		request.setCharacterEncoding("UTF-8");
		
		String userID = info.get("userID");
		String userName = info.get("userName");
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("info", info);
		mav.setViewName("result");
		
		return mav;
	}
	
	@RequestMapping(value = {"/test/login4.do"}, method = {RequestMethod.POST})
	public ModelAndView login4(
			@ModelAttribute("info") LoginVO loginVO) throws Exception{
		
		ModelAndView mav = new ModelAndView("result");
		
		return mav;
	}
	
	// ModelAndView가 아닌 Model을 사용시 
	@RequestMapping(value = {"/test/login5.do"}, method = {RequestMethod.GET})
	public String login5(
			Model model,
			
			HttpServletRequest request, HttpServletResponse response) 
			throws Exception{
		
		model.addAttribute("userID", "hong");
		model.addAttribute("userName", "홍길동");
		
		return "result";
	}
}
