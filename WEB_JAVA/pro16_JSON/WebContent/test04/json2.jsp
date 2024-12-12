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
			let jsonStr = '{"name": "박지성", "age": 25, "gender": "남자", "nickname": "날쌘돌이"}';
			let jsonObj = JSON.parse(jsonStr);
			
			let output = "회원정보<br>";
				output += "==========<br>";
				output += "이름:" + jsonObj.name + "<br>";
				output += "나이:" + jsonObj.age + "<br>";
				output += "성별:" + jsonObj.gender + "<br>";
				output += "별명:" + jsonObj.nickname + "<br>";
				
			$("#output").html(output);
		});
	});
</script>
<title>Insert title here</title>
</head>
<body>
	<a id="checkJson" style="cursor: pointer;">출력</a><br><br>
	<div id="output">
	</div>
</body>
</html>