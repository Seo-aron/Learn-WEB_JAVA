<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	request.setCharacterEncoding("utf-8");
	// <jsp:param value="duke" name="name"/>
	String name = request.getParameter("name");
	// <jsp:param value="duke.png" name="imgName"/>
	String imgName = request.getParameter("imgName");
%>

<br>
<h1><%=name %></h1>
<br>
<img src="./image/<%=imgName %>">