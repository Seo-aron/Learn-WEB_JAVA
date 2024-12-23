package com.myspring.pro27.member.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.myspring.pro27.member.dao.MemberDAO;
import com.myspring.pro27.member.vo.MemberVO;

//부장 

//id속성값이 memberService인 
//<bean id="memberService" 
//    class="com.spring.member.service.MemberServiceImpl">을 자동 생성 해 줍니다. 
@Service("memberService")
public class MemberServiceImpl implements MemberService {

	//id속성값이 memberDAO인
	//<bean id="memberDAO"
	//     class="com.spring.member.dao.MemberDAOImpl">을 자동 주입합니다. 
	@Autowired
	private MemberDAO memberDAO;// = new MemberDAOImpl();
	

	//모든 회원 정보 조회 기능 
	@Override
	public List listMembers() throws DataAccessException {
		
		System.out.println("listMembers - service 출력");
		//사원 MemberDAOImpl객체의 selectAllMembers()메소드를 호출해 
		//모든 회원 정보 조회 요청을 명령함!
		//조회된 회원정보들(MemberVO객체들)이 저장된  List배열을 반환 받음 
		List membersList = memberDAO.selectAllMembers();
	
		return membersList;//사장님 MemberControllerImpl객체에 반환 
	}

	//회원 가입 기능
	@Override
	public void addMembers(MemberVO vo) throws DataAccessException{
		
		memberDAO.InsertMember(vo);
		
	}

	//회원 삭제 기능 
	@Override
	public void delMembers(String id) throws DataAccessException {
		
		memberDAO.DeleteMember(id);
	}

	//회원정보  수정을 위해 회원 한명의 정보 조회 기능
	@Override
	public MemberVO detailMembers(String id) throws DataAccessException {
		
		return memberDAO.oneMember(id);
	}

	//회원정보 수정 기능 
	@Override
	public void UpdateMember(MemberVO vo) throws DataAccessException {
		
		
		memberDAO.UpdateMember(vo);
	}

	@Override
	public MemberVO login(MemberVO vo) {
		return memberDAO.loginById(vo);
	}
	
	
	
}





