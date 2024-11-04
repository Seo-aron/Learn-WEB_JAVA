package exam02;

/*
	Object클래스에 만들어져 있는  
	public int hashCode(){   } 메소드 
	
	- 객체를 생성했을때 객체를 식별할 유일한 고유 정수값 반환
	
	
	참고. 해쉬코드란? 객체를 식별할 유일한 고유 정수값 

*/
//예제. Student클래스의 객체를 동등 비교하기위해 hasCOde()와 equals()메소드를 오버라이딩 했다
//	   학생번호와 이름으로 해쉬코드를 생성하고,
//	   학생번호와 이름이 동일한 경우에만 equals()메소드의 호출결과가 true로 리턴되도록 한 예제

class Student { //<- extends Object를 상속받습니다.
	private int no;
	private String name;
									//new Student(1, "홍길동")
	public Student(int no, String name) {
		this.no = no;
		this.name = name;
	}
	public int getNo() { //getter역할을 하는 메소드 
		return this.no;
	}
	public String getName() {
		return this.name;
	}
	//Object클래스 내부에 만들어진 hasCode메소드의 기능은
	//객체를 생성했을때 그 객체의 hasCode메소드를 호출하면
	//객체의 주소번지를 정수값(해쉬코드값)으로 반환합니다.
	//그러나 여기세어는 Student클래스에 기능에 맞게 hashCode메소드를 오버라이딩 하고 있다
	@Override
	public int hashCode() {
		//구현를 재정의
		//학생번호와 이름해시코드를 조합한 새로운 해시코드를 만들어 리턴
		int hashCode = this.no + this.name.hashCode();
		                         //  "김길동".hashCode()
		return hashCode;		
	}
	
	//Object클래스 내부에 만들어진 equals메소드는
	//각 객체를 생성했을때 각 객체의 주소번지가 같은지 비교할때 사용하는 메소드로
	//같으면 true반환하고 틀리면 false를 반환하는 원본 메소드입니다.
	//그러나~~~ 여기에서는 Student클래스의 기능에 맞게 equals메소드를 오버라이딩(재정의)하고 있다
	@Override
	public boolean equals(Object obj) {
		
		//매개변수 obj로 전달받는 객체가 Student클래스로 만들어졌는지 검사하고
		//만들었으면 target변수에 저장
		//요약 : 객체의 클래스타입을 검사
		if(obj instanceof Student target) {
			//각 Student객체 내부에 만들어진 인스턴스변수의값들이 같은지 비교
			//해서  같으면 true리턴(반환)
			if(this.no == target.getNo() &&
			   this.name.equals(target.getName())  ) {
				
				return true;
			}//안쪽 if
		}//바깥 if
		return false; //매개변수 obj전달 받은 두번쨰 Student객체가
					  //String클래스자료형으로 만든 객체가 아니며
					  //기준이되는 String객체의 인스턴스변수 no,name과
					  //매개변수 obj전달 받은 두번쨰 Student객체의 
					  //인스턴스변수 no, name에 값이 다르면?
					  //false를 리턴 하도록 equals메소드 오버라이딩 함	
	}//equals메소드 닫기

}//Student클래스 닫기

public class HashCodeExample {

	public static void main(String[] args) {
		
		//Object클래스의 객체를 2개 생성해서 
		//각 객체메모리를 식별할 유일한 고유정수를 얻어 출력!
		
		Object obj1 = new Object();
		System.out.println("첫번째 Object객체메모리를 식별할 해시코드값:" 
		                     +    obj1.hashCode()       );
							//664740647
		
		Object obj2 = new Object();
		System.out.println("두번째 Object객체메모리를 식별할 해시코드값:" 
		                     +    obj2.hashCode()       );
							//321001045
		//---------------------------------------------------
		
		Student s1 = new Student(1, "홍길동");
		
		System.out.println( s1.hashCode() ); //54150063
		
		Student s2 = new Student(1, "홍길동");
		
		System.out.println( s2.hashCode() ); //54150063
		
		//두 객체의 해시코드가 동일한지 검사
		if( s1.hashCode() == s2.hashCode()  ) {
			//두 객체의 인스턴스변수값이 동일한지 검사
			if(s1.equals(s2)) {
				System.out.println("동등 객체 입니다.");
			}else {
				System.out.println("인스턴스변수 데이터가 다르므로 "
						            + "동등객체가 아닙니다.");	
			}
			
		}else {
			System.out.println("해시코드가 다르므로 동등객체 아닙니다.");
		}
		
		
		
		
	}

}






