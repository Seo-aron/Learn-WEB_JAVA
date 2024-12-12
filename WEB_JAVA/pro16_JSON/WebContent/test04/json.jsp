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
			let jsonStr = '{"name": ["홍길동", "이순신", "임꺽정"]}';
			let jsonInfo = JSON.parse(jsonStr);
			//alert(jsonInfo);
			//console.log(jsonInfo);
			let s = JSON.stringify(jsonInfo);
			//alert(s);
			let output = "회원 이름<br>";
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
	<a id="checkJson" style="cursor: pointer;">출력</a><br><br>
	<div id="output">
	</div>
</body>
</html>