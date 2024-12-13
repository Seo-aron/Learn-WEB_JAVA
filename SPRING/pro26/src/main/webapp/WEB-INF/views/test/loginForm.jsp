<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- /pro26/test/loginForm.do 요청 시 -->
	<%-- <form action="${pageContext.request.contextPath }/test/login.do" method="post"> --%>
	<%-- <form action="${pageContext.request.contextPath }/test/login2.do" method="post"> --%>
	<%-- <form action="${pageContext.request.contextPath }/test/login3.do" method="post"> --%>
	<%-- <form action="${pageContext.request.contextPath }/test/login4.do" method="post"> --%>
	<form action="${pageContext.request.contextPath }/test/login5.do" method="get">
		<input  type="hidden" name="email" value="hong@test.com">
		<table width="400px">
			<tr>
				<td>ID <input size="10" name="userID"></td>
			</tr>
			<tr>
				<td>이름 <input size="10" name="userName"></td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="로그인">
					<input type="reset" value="다시 입력">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>