<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	include1.jsp�� ��ܿ���
	<br>
		<jsp:include page="duke_image.jsp">
			<jsp:param value="duke" name="name"/>
			<jsp:param value="duke2.png" name="imgName"/>
		</jsp:include>
	<br><br>
	include1.jsp�� �ϴܿ���
</body>
</html>