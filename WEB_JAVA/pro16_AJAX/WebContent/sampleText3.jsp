<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>

<%
	request.setCharacterEncoding("UTF-8");

	String userid = request.getParameter("userid");
	String passwd = request.getParameter("passwd");
	
	out.println(userid + "\t" + passwd);
%>