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
			let jsonStr = '{"name": ["ȫ�浿", "�̼���", "�Ӳ���"]}';
			let jsonInfo = JSON.parse(jsonStr);
			//alert(jsonInfo);
			//console.log(jsonInfo);
			let s = JSON.stringify(jsonInfo);
			//alert(s);
			let output = "ȸ�� �̸�<br>";
				output += "============<br>";
			for(let i in jsonInfo.name){
				output += jsonInfo.name[i] + "<br>";
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