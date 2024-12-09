package sec01.ex02;

import java.sql.*;
import java.util.ArrayList;

/*
  오라클 DBMS의 t_member테이블과 연결하여 
 데이터베이스 작업(SELECT, INSERT, DELETE, UPDATE등)
 하는 클래스 
*/
public class MemberDAO {

//순서1. import	java.sql.*; 
//   그리고 오라클 DBMS의 t_member테이블과 연결할 4가지 연결정보를 변수 또는 상수에 저장
	
	//ojdbc6.jar드라이버 파일 내부에 만들어져 있는  
	//드라이버 역할을 하는 OracleDriver.class파일의 경로를 상수에 저장
	private static final String DRIVER = 
			"oracle.jdbc.driver.OracleDriver";
	
	//오라클 DBMS 서버의  IP , 데이터베이스명, 포트번호를 상수에 저장
	private static final String URL = 
			"jdbc:oracle:thin:@localhost:1521:XE";
	
	//오라클 DBMS의 XE데이터베이스에 접속할 아이디를 상수에 저장
	private static final String USER = "scott";
	
	//접속할 비밀번호를 상수에 저장
	private static final String PWD = "tiger";
	
	//위 4가지 연결 값을 이용해서 오라클 DB와 접속한 정보를 지니고 있는
	//T4CConnection객체를 저장할 참조변수 선언
	private Connection con;
	
	//DB와 연결 후 우리 개발자가 만든 SQL문장을
	//오라클 DB의 테이블에 전송하여 실행할 역할을 하는 
	//OraclePreparedStatementWrapper실행객체의 주소를 저장할 참조변수 선언

	//	private Statement stmt;
	private PreparedStatement pstmt;
	
	
	
	//SELECT 조회문을 실행한 조회 결과 레코드들을 테이블형식으로
	//그대로 가져와 임시로 저장해 놓은 OracleResultSetImpl객체 메모리의 주소를 저장할 참조변수 선언
	private ResultSet rs;
	
	
  //---------------------------------------------------------------
	
//순서2. 순서3. 순서4.

	private void connDB() {
	  try {	
		//순서2. OracleDriver.class드라이버 프로그램을 
		//      톰캣서버에서 제공하는 JVM메모리에 로딩 한다
		//Class.forName("OracleDriver.class파일이 저장되어 있는 
		//               패키지명을 포함한 경로를 문자열로 전달")을 이용하여
		//OracleDriver.class 클래스 자체를 JVM이 차지 하고 있는 메모리 중에서
		//DriverManager클래스의 정적변수에 저장 시킨다.
		//요약 : 드라이버 로딩 
		Class.forName(DRIVER);
		//순서3. JVM에 로딩된 (DriverManager에 저장된) OracleDriver를 통하여
		// DB와 접속하여 DB와 접속을 맺은 정보를 가지고 있는 T4CConnection 객체 얻기
		//요약 : DAO와 DB와의 연결 
		con = DriverManager.getConnection(URL, USER, PWD);
	    //순서4. 개발자가 만든 SQL문을 미리 로딩한 
		//      SQL문을 오라클 DB의 테이블에 전송해서 실행할 역할을 하는 
		//      OraclePreparedStatementWrapper객체 얻기
		//요약 : OraclePreparedStatementWrapper실행 객체 얻기
	//	stmt = con.createStatement();
		
			  	
	  }catch(ClassNotFoundException e) {
		  e.printStackTrace();
	  }catch(SQLException e) {
		  e.printStackTrace();
	  }
			
	}//connDB메소드 닫기 
	
	//DB작업 관련 객체 메모리들 사용이 끝난 후  자원 해제하는 기능의 메소드
	public void ResourceClose() {
		try {
			if(pstmt != null) pstmt.close();
			if(rs != null) rs.close();
			if(con != null) con.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	// 오라클 DBMS서버 내부의 XE데이터베이스 내부에 만들어 놓은
	// t_member테이블의 모든 회원정보들을 한번에 조회 해서 제공하는 메소드 
	public ArrayList listMembers() {
		
		//t_member테이블에 저장된 모든 회원 레코드정보들을 조회해서 가져와서
		//가변길이 배열의 각 index위치에 임시로 저장할 배열공간인? ArrayList배열 생성
		ArrayList list = new ArrayList();
		
		try {
			//순서2. 오라클 OracleDriver.class 를 DriverManager에 등록
				//요약 : 드라이버 로드
			//순서3. T4CConnection객체 얻기
				//요약 : DAO와 DB와의 연결
			
			connDB();
			
			//순서5. Query(SQL문) 작성하기
			//t_member테이블에 저장된 모든 회원 레코드를 조회하는 SELECT문 작성
			String query = "SELECT * FROM T_MEMBER";
			
			//커넥션 객체의 메소드 호출시 미리 준비된 SELECT 전체 문장을 인자로 전달하면
			//전달한  전체 SELECT문장을 로딩한 PreparedStatement실행 객체 반환
			pstmt = con.prepareStatement(query);
					
			//순서6. Query(SQL문)을 DB의 t_member테이블에 전송하여 실행!(조회)
			//select * from t_member SQL문을 이용하여 
			//조회 후  조회한 결과 데이터들을 OracleResultSetImpl객체 메모리에 저장후 반환받습니다
			//단! 조회된 화면의 커서(화살표)위치는 
			//가장 처음에는 조회된 테이블의 제목열 행을 가리키고 있다.
			rs = pstmt.executeQuery();//<- OracleResultSetImpl객체 반환
			
			//순서7. 조회된 회원 레코드들이 ResultSet임시 객체 메모리에 표형태로
			//저장되어 있으면 계속 반복해서 
			//회원 레코드(행)단위의 조회된 열 값들을 차례로 얻어 
			//MemberVO객체를 생성하여 각 인스턴스변수에 저장시킵니다.
			//마지막으로 MemberVO객체들을 ArrayList가변길이배열에 반복해서 추가해서 저장시킴
			while( rs.next() ) {
				//회원 레코드(행)단위의 조회된 열 값들을 차례로 얻어 변수에 저장
				String id = rs.getString("ID");//"hong"
				String pwd = rs.getString("PWD");//"1212"
				String name = rs.getString("NAME");//"홍길동"
				String email = rs.getString("EMAIL");//"hong@gmail.com"
				Date joinDate = rs.getDate("JOINDATE");//24/10/10
				
				//MemberVO객체를 생성 하여 각 인스턴스변수에 저장시킵니다.
				MemberVO vo = new MemberVO();
						 vo.setId(id);
						 vo.setPwd(pwd);
						 vo.setName(name);
						 vo.setEmail(email);
						 vo.setJoinDate(joinDate);
				
				//MemberVO객체들을 ArrayList배열에 반복해서 추가 시킴
				list.add(vo);		 	
			}//while반복문 끝
			
		//ArrayList가변길이 배열 모습
		//[ MemberVO,  MemberVO,  MemberVO ]
		//    0          1            2       index
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//순서 9. DB작업 관련 객체 메모리를 자원해제
			ResourceClose();
		}
		
		return list; //ArrayList배열 자체를 MemberServlet으로 반환(리턴)
		
	}//listMembers메소드 닫기 
	
	
	
	
	
		
}//MemberDAO









