<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		String msg = "아이디를 입력하지 않았습니다.";		
	%>
	<%
		// 한글 처리
		request.setCharacterEncoding("UTF-8");

		String user_id = request.getParameter("user_id");

		if (user_id.length() == 0) {
		%>
			<jsp:forward page="login2.jsp">
				<jsp:param name="msg" value="<%=msg %>"/>
			</jsp:forward>
		<%
		}
	%>
	<h1>환영합니다.<%=user_id%>님</h1>
</body>
</html>