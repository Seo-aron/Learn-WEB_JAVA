<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<script type="text/javascript">
	$(function() {
		$("#checkJson").on("click", function() {
			let jsonStr = '{"name": "������", "age": 25, "gender": "����", "nickname": "���ڵ���"}';
			let jsonObj = JSON.parse(jsonStr);
			
			let output = "ȸ������<br>";
				output += "==========<br>";
				output += "�̸�:" + jsonObj.name + "<br>";
				output += "����:" + jsonObj.age + "<br>";
				output += "����:" + jsonObj.gender + "<br>";
				output += "����:" + jsonObj.nickname + "<br>";
				
			$("#output").html(output);
		});
	});
</script>
<title>Insert title here</title>
</head>
<body>
	<a id="checkJson" style="cursor: pointer;">���</a><br><br>
	<div id="output">
	</div>
</body>
</html>