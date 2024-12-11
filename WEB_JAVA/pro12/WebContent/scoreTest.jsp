<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		//순서1. 요청한 값 문자처리방식 UTF-8로 설정
		//요약 : 한글처리
		request.setCharacterEncoding("UTF-8");
	
		//순서2. 입력하여 요청한 시험점수를 request객체 메모리에서 얻기
		//요약 : 요청한 값 얻기 
		int score =  Integer.parseInt( request.getParameter("score") );
	%>
<%-- 순서3. 요청한 점수를 이용해 조건문에 따라 응답할 값 마련후 클라이언트의 웹브라우저로 응답! --%>
		<h1>입력한 시험 점수 : <%=score%>점 </h1>

    <%  if(score >= 90){//입력한 시험점수가 90점이상이라면? %>
    	
    		<h1>A학점입니다.</h1>
    
    <%	}else if(score >= 80 && score < 90){//입력한 시험점수가 80 ~ 90 사이라면? %>
    	
    	    <h1>B학점입니다.</h1>
    	
    <%  }else if(score >= 70 && score <80){// 70 ~ 80 사이라면?%>	
    	
    		<h1>C학점입니다.</h1>
    	
    <%  }else if(score >= 60 && score < 70){//입력한 시험점수가 60 ~ 70 사이라면? %>
    	
    		<h1>D학점입니다.</h1>
    	
    <%  }else { //그외 시험점수를 입력 받았다면?  %>
    	
    		<h1>F학점입니다.</h1>
    	
    <%  }  %>
    	
    <br>  <a href="./scoreTest.html">시험점수 다시 입력하로 가기</a>
   






</body>
</html>









