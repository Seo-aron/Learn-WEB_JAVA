<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%--
	스크립 틀릿 태그  <%    %>
	- 동적인 데이터를 자바코드로 넣는 영역을 나타내는 태그 
	- 문법
			<%  자바코드 작성;  %>
 --%>
 
<%--선언문 태그 영역에 변수선언 및 메소드를 선언해 놓자 --%>
<%!
	//전역변수 선언
	String name="이순신";

	//메소드 선언
	public String getName(){
		return this.name; //name변수에 저장된 "이순신" 반환
	}
%>

<%-- 스크립 틀릿 태그영역에 클라이언트가 hello2.jsp요청시 전달한 요청한 값을 
	 HttpServletRequest객체 메모리에서 얻기  --%>
<%
	//순서1. 클라이언트의 웹브라우저 주소창에 
	//      http://localhost:8090/pro12/hello2.jsp?age=22 요청주소를 입력하여
	//      hello2.jsp서버페이지를 톰캣서버에게 요청합니다.
 	//그러면 톰캣 서버는 요청 주소 하나당 ~ request객체 메모리를 생성후 
 	//? 뒤에 적은 요청한 값 age=22을 request객체 메모리에 담아 request객체메모리를 공유해 줍니다
 	
 	//순서2. 클라이언트가 요청한 값 !  request객체 메모리로 부터 얻기
 	String age = request.getParameter("age");
	//참고. 스크립틀릿 태그 영역 안에 작성한 age변수는  _jspService메소드 내부에 
	//     지역변수로 만들어지기때문에  String age변수 선언 위치의 아래 줄에서
	//     age변수에 저장된 값을 불러와 사용할수 있다.
	
	/*
	  스크립틀릿 태그영역 안에는 메소드 선언이 불가능하다!
	  메소드 선언은? 선언문 태그 영역 안에 선언해야 합니다.
			 
	public void test(){
		System.out.println("test");
	}
	
	*/	
%>     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- 표현식 태그를 이용해 name전역변수와 age지역변수에 저장된 값을 불러와 응답(출력) --%>
	<h1>안녕하세요. <%=getName()%>님!!</h1>
	<h1>나이는 <%=age%>살 입니다!</h1>
</body>
</html>
















