<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%
	String outerPath1 = "./inc/OuterPage1.jsp";
	String outerPath2 = "./inc/OuterPage2.jsp";

	pageContext.setAttribute("pAttr", "�����");
	request.setAttribute("rAttr", "������");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h2>��Ƽ���±�, �׼��±� ���� ��� ����</h2>
	
	<h3>��Ƽ�� �±�</h3>
	<%@ include file="./inc/OuterPage1.jsp" %>
	<!-- ǥ���� ����ϸ� ���� -->
	<%--<%@ include file="<%=outerPath1%>" %>--%>
	
	<p>�ܺ� ����1�� ������ ����: <%=newVar1 %></p>
	
	
	<h3>�׼� �±�</h3>
	<!-- ǥ���� ����ص� �� -->
	<%-- <jsp:include page="./inc/OuterPage2.jsp"></jsp:include> --%>
	<jsp:include page="<%=outerPath2 %>"></jsp:include>
	
	<!-- �׼��±״� �� �ڵ常 ���û�ޱ⿡, �ش� jsp���Ͼȿ� �ٸ� �ڵ�� ������ �ȵǾ� ���� -->
	<%-- <p>�ܺ� ����2�� ������ ����: <%=newVar2 %></p> --%>
	
	
</body>
</html>