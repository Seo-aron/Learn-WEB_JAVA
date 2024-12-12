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
		// <a>��� Ŭ���̺�Ʈ
		$("#checkJson").click(function() {
			let jsonStr = '{"age":[22, 33, 44]}';
			let jsonInfo = JSON.parse(jsonStr);
			
			let output = "ȸ���� ����<br>";
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
	<a id="checkJson" style="cursor: pointer;">���</a><br><br>
	<div id="output">
	</div>
	<!-- 
		JSON.parse("JSON���ڿ�")
		- JS���� �����ϴ� �����Լ�, js���ڿ��� JSON��ü�� ��ȯ������
		- '{"Ű":��}' -> {"Ű":��} 
		
		JSON.stringify("JSON��ü")
		- parse�� �ݴ���, JSON��ü�� js���ڿ��� �ٲ���
		- {"Ű":��} -> '{"Ű":��}'
	 -->
</body>
</html>