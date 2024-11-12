
/*
  DTO역할을 하는 클래스란?
  - 데이터베이스의 테이블에서 조회한 한 행(한사람 정보)정보를 
    하나의 객체 단위로 변수에 저장할 목적의 클래스 
  - 회원가입(데이터베이스에 회원한명 추가)가입하거나
    게시판이 있다면 게시판에 새글 정보 하나를 작성해서
    하나의 객체(레코드)단위로 데이터베이스에 추가할 목적의 클래스 
  - DTO역할을 하는 클래스 내부에 작성할수 있는 멤버들은
    인스턴스변수, 생성자, getter, setter메소드들, toString()등을 작성하면됩니다.   
*/

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


//아래의 Member클래스를 컴파일하는 과정에서
//기본생성자와 함께 Getter, Setter, 
//              hashCode(), equals(), toString() 메소드들이 자동으로 생성된다. 
//즉! @Data 어노테이션은
//@RequiredArgsConstructor,
//@Getter, @Setter, @EqualsAndHashCode, @ToString 어노테이션을 합친 어노테이션 기호다
@Data

//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//@ToString
public class Member {//회원 한사람의 정보 저장할 설계도

	//인스턴스 변수 
	private String id; //회원 아이디저장
	private String name;//회원 이름 저장
	private int age; //회원 나이 저장

	//롬복라이브러리에서 제공하는 @ToString 어노테이션 사용	
//	@Override
//	public String toString() {
//		
//		return name + "," + id + "," + age + "," + getName() + "," + getId() + "," + getAge();
//	}
	
	
	//롬복에서 제공하는 @NoArgsConstructor어노테이션 사용 
		//생성자
		//public MemberDTO() {}   
	
	//롬복에서 제공하는 @AllArgsConstructor어노테이션 사용 	
		//객체 생성하는 동시에 모든 인스턴스변수의 값을 초기화 시킬 생성자
		/*
		public MemberDTO(String name, String id, int age) {
			super();
			this.name = name;
			this.id = id;
			this.age = age;
		}
		*/
	
//롬복에서 제공하는 @Getter 는 get으로 시작하는 메소드들을 변수하나당 하나씩 모두 자동으로 만들어줌
//롬복에서 제공하는 @Setter 는 set으로 시작하는 메소드들을 변수하나당 하나씩 모두 자동으로 만들어줌
	//	
//		public String getName() {
//			return name;
//		}
	//
//		public void setName(String name) {
//			this.name = name;
//		}
	//
//		public String getId() {
//			return id;
//		}
	//
//		public void setId(String id) {
//			this.id = id;
//		}
	//
//		public int getAge() {
//			return age;
//		}
	//
//		public void setAge(int age) {
//			this.age = age;
//		}
	//	
	
	public static void main(String[] args) {
		
		Member member = new Member();
			   member.setAge(10);
			   member.setId("admin");
			   member.setName("김길동");
			   
	    System.out.println(member.toString());
			 
	}
	
}

















