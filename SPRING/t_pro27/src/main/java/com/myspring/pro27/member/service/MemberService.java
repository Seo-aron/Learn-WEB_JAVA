package com.myspring.pro27.member.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.myspring.pro27.member.vo.MemberVO;

public interface MemberService {

	//모든 회원을 조회 하는 기능 
	public List listMembers() throws DataAccessException;

	//회원 가입 추가 기능 
	public void addMembers(MemberVO vo) throws DataAccessException;


	//회원정보  수정을 위해 회원 한명의 정보 조회 기능
	public MemberVO detailMembers(String id) throws DataAccessException;

	//회원정보 수정 기능 
	public void UpdateMember(MemberVO vo) throws DataAccessException;
	
	//회원 삭제 기능 
	public void delMembers(String id) throws DataAccessException;

	//로그인 기능
	public MemberVO login(MemberVO member);
	
	
}
