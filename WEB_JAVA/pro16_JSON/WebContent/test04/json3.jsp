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
			let jsonStr = '{"members": [{"name": "박지성", "age": "25", "gender": "남자", "nickname": "날쌘돌이"},' 
									 + '{"name": "손흥민", "age": "30", "gender": "남자", "nickname": "탱크"}]}';
			let jsonInfo = JSON.parse(jsonStr);
			
			let output = "회원정보<br>============<br>";
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
	<a id="checkJson" style="cursor: pointer;">출력</a><br><br>
	<div id="output">
	</div>
</body>
</html>