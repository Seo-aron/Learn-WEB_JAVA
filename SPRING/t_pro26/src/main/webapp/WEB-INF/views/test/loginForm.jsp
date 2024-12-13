<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%--
		http://localhost:8090/pro26/test/loginForm.do주소를 입력하여 요청하면
		아래의 디자인 화면이 웹브라우저 화면에 나타납니다.
	
		아래의 디자인화면에서 아이디와 이름을 입력받고 로그인 버튼을 누르면 /test/login.do주소로
		디스패처 서블리에서 요청후 LoginController컨트롤어의 메소드가 호출되어 실행 됩니다.
	 --%>

<%-- <form action="${pageContext.request.contextPath}/test/login.do" method="post"> --%>
<%-- <form action="${pageContext.request.contextPath}/test/login2.do" method="post"> --%>
<%-- <form action="${pageContext.request.contextPath}/test/login3.do" method="post"> --%>	
	 <form action="${pageContext.request.contextPath}/test/login4.do" method="post">	
	 	
	 	<table width="400">
	 		<tr>
	 			<td>아이디 <input size="10" name="userID"></td>
	 		</tr>
	 		<tr>
	 			<td>이름 <input size="10" name="userName"></td>
	 		</tr>	 	
	 		<tr>
	 			<td colspan="2">
	 				<input type="submit" value="로그인">
	 				<input type="reset" value="다시입력">
	 			</td>
	 		</tr>
	 	</table>
	 </form>





</body>
</html>












