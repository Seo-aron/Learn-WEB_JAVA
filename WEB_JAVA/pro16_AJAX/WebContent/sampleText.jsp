<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>

<%
	String userid = request.getParameter("userid");
	String passwd = request.getParameter("passwd");
	
	out.print(userid + "\t" + passwd);
%>