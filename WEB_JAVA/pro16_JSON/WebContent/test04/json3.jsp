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
			let jsonStr = '{"members": [{"name": "������", "age": "25", "gender": "����", "nickname": "���ڵ���"},' 
									 + '{"name": "�����", "age": "30", "gender": "����", "nickname": "��ũ"}]}';
			let jsonInfo = JSON.parse(jsonStr);
			
			let output = "ȸ������<br>============<br>";
			for(let i in jsonInfo.members){
				output += jsonInfo.members[i].name + "<br>";
				output += jsonInfo.members[i].age + "<br>";
				output += jsonInfo.members[i].gender + "<br>";
				output += jsonInfo.members[i].nickname + "<br><br>";
			}
			console.log(output);
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