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
	<h1>아이디를 입력하세요</h1>
	<form action="result.jsp" method="post">
		ID: <input type="text" name="user_id"><br>
		PW: <input type="password" name="user_pw"><br>
		<input type="submit" value="Login">
		<!--
		form태그에서는 아래의 2개도 같은 전송 요청 버튼 기능 
		<button>Login</button>
		<input type="image" src="s.png"> 
		-->
	</form>
</body>
</html>