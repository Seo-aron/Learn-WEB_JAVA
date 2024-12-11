<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%

  //순서1. 요청한 데이터들을 request메모리에서 꺼내오기전에
  //      문자 처리 방식을 UTF-8로 설정.
  request.setCharacterEncoding("UTF-8");

  //순서2. 요청한 데이터들 request객체 메모리에서 꺼내오기 (입력한 아이디, 비밀번호)
  String user_id = request.getParameter("user_id"); 
        //"admin"
  String user_pw = request.getParameter("user_pw");
        //"1212"
        
  //순서3. 요청한 값을 이용해 요청한 클라이언트의 웹브라우저로 응답할 값을 웹브라우저로 출력
  //      (표현식 태그 이용)
%>
 <h1>입력한 아이디는 : <%=user_id%></h1>
 <h1>입력한 비밀번호는 : <%=user_pw%></h1> 

























