<%@page import="java.util.List"%>
<%@page import="sec01.ex01.MemberDAO"%>
<%@page import="sec01.ex01.MemberBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// 한글처리
	request.setCharacterEncoding("UTF-8");

	// 회원가입창에서 요청한 데이터 받아오기
	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
	String name = request.getParameter("name");
	String email = request.getParameter("email");
	
	// 객체를 생성해서 변수에 요청한 데이터들을 각각 처리
	MemberBean mb = new MemberBean(id, pwd, name, email);
	
	// DB로 insert할 DAO객체를 생성
	MemberDAO dao = new MemberDAO();
	dao.addMember(mb);
	
	// 회원가입 성공 후 데이터들 조회
	List memberList = dao.listMembers();
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<table align="center" width="100%">
		<tr align="center" bgcolor="#99ccff">
			<td width="7%">아이디</td>
			<td width="7%">비밀번호</td>
			<td width="5%">이름</td>
			<td width="11%">이메일</td>
			<td width="5%">가입일</td>
		</tr>
		<%
			if(memberList.size() == 0){
			%>
				<tr>
					<td colspan="5">등록된 회원이 없습니다.</td>
				</tr>
			<%
			} else{
				for(int i=0; i<memberList.size(); i++){
					MemberBean bean = (MemberBean)memberList.get(i);
					%>
					<tr align="center" bgcolor="#99ccff">
						<td width="7%"><%=bean.getId() %></td>
						<td width="7%"><%=bean.getPw() %></td>
						<td width="5%"><%=bean.getName() %></td>
						<td width="11%"><%=bean.getEmail() %></td>
						<td width="5%"><%=bean.getJoinDate() %></td>
					</tr>
					<%
				}
			}
		%>
	</table>
</body>
</html>