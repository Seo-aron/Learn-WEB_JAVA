<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<!-- JQuery -->
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<script type="text/javascript">
	$(function() {
		// <a>요소 클릭이벤트
		$("#checkJson").click(function() {
			let jsonStr = '{"age":[22, 33, 44]}';
			let jsonInfo = JSON.parse(jsonStr);
			
			let output = "회원의 나이<br>";
				output += "======<br>";
			
			for(let i in jsonInfo.age){
				output += jsonInfo.age[i] + "<br>";
			}
			
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
	<!-- 
		JSON.parse("JSON문자열")
		- JS에서 제공하는 내장함수, js문자열을 JSON객체로 변환시켜줌
		- '{"키":값}' -> {"키":값} 
		
		JSON.stringify("JSON객체")
		- parse의 반대기능, JSON객체를 js문자열로 바꿔줌
		- {"키":값} -> '{"키":값}'
	 -->
</body>
</html>