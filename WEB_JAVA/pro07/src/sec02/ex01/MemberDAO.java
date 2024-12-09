package sec02.ex01;

import java.sql.*;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

/*
  오라클 DBMS의 t_member테이블과 연결하여 
 데이터베이스 작업(SELECT, INSERT, DELETE, UPDATE등)
 하는 클래스 
*/
public class MemberDAO {

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
	
	//DataSource커넥션 풀 객체 주소를 저장할 변수 
	private DataSource dataSource;
	
	
	//MemberDAO클래스의 기본생성자 
	//역할 : new MemberDAO(); 객체 생성시 호출되는 생성자로!
	//     생성자 내부에서 커넥션풀 역할을 하는 DataSource객체를 얻는 작업을 하게 됩니다.
	public MemberDAO() {
	 
		try {
			//1. JNDI 네이밍 서비스를 시작하고, 톰캣 서버에 등록된 Resource자원에 
			//   접근 할수 있는 환경을 설정하는 객체 생성 (DataSource자원을 얻을 환경 준비)
			// InitialContext객체를 생성하면, java애플리케이션은 해당 객체를 통해
			// 톰캣서버내부에 등록된 리소스를 탐색할수 있습니다.
			Context ctx = new InitialContext();
			    
			     
			//2.lookup메소드는 특정 이름에 대응하는 객체를 찾는 역할을 합니다.
			//  즉, ctx.lookup("java:/comp/env")는 
			//   "java:/comp/env"경로는 JNDI에서 표준적으로 사용되는 경로로
			//   주로 애플리케이션 환경 설정(환경변수, 데이터베이스 연결정보 등)에 접근하는 기본경로 입니다
			//   이 기본경로 아래에 커넥션풀(DataSource) 등의 리소스 이름이 설정됩니다. 
			Context envContext  =  (Context)ctx.lookup("java:/comp/env");
			
			//3.그런후 다시 톰캣서버는 context.xml에 설정한
			//  <Resource name="jdbc/oracle" ...../> 태그의 
			//   name속성값 "jdbc/oracle"(JNDI 기법을 사용하기위한 key)를 이용해
			//   톰캣 서버가 DB와 미리 연결을 맺은 Connection객체들의 보관 하고 있는
			//   DataSource커넥션풀 객체를 찾아 반환해 줍니다.
			dataSource = (DataSource)envContext.lookup("jdbc/oracle");
			
		}catch(Exception e) {
			System.out.println("DataSource커넥션풀 객체 얻기 실패 : " + e);
		}	
	}
	
	
	
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
            //DataSource(커넥션풀)에서
			//미리 DB와 연결된 Connection객체 빌려오기 
			//요약 : DB와 DAO의 연결
			con = dataSource.getConnection();
			
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









