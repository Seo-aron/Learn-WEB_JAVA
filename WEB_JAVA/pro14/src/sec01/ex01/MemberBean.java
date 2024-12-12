package sec01.ex01;
/*
  VO(Value Object)역할을 하는 클래스
  
  VO역할이란?
  - DB의 테이블에서 조회한 행(레코드)의 열값을
       조회해서 가져와 변수에 저장하거나 
       변수에 저장된 값들을 클래스의 객체를 생성해서 
       한번에 DB의 테이블에 추가할 역할.
  
  VO역할을 하는 클래스 생성 방법
   1. 테이블에서 조회한 레코드의 열(컬럼)값을 변수에 저장해야하므로
           테이블의 열명과 동일한 이름과 자료형으로 변수를 만든다.
   2. getter/setter역할을 하는 메소드를 각각 만든다.   
*/

import java.sql.Date;

public class MemberBean {
	//변수
	private String   id;
	private String   pwd;  
	private String  name;   
	private String email;
	private Date  joinDate;
	
	//생성자
	public MemberBean() {
		System.out.println("MemberBean 생성자 호출됨");
	}
	//생성자2
	public MemberBean(String _id, String _pwd, String _name, String _email) {
		this.id = _id;
		this.pwd = _pwd;
		this.name = _name;
		this.email = _email;
	}

	/*
	  getter역할을 하는 메소드란?
	  	private으로 선언된 위 변수값을 외부클래스에 반환할 목적으로 사용됨
	
	  setter역할을 하는 메소드란?
	  	private으로 선언된 위 변수값을 새롭게 변경할 목적으로 사용됨
	*/
	//getter, setter메소드 (alt + shift + s  r)
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	
	
	
	
}











