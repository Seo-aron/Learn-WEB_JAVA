<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	request.setCharacterEncoding("utf-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		String msg = request.getParameter("msg");
	
		if(msg != null){
			out.print("<h1>" + msg + "</h1>");
		}
	%>
	<h1>아이디를 입력하세요</h1>
	<form action="result2.jsp" method="post">
		ID: <input type="text" name="user_id"><br>
		PW: <input type="password" name="user_pw"><br>
		<input type="submit" value="Login">
	</form>
</body>
</html>