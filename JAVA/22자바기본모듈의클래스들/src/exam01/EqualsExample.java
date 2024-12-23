package exam01;

/*
  Object클래스의 equals()메소드는 두 객체메모리의 주소번지가 같은지 비교해서
  같은 주소번지이면 true반환 하고 틀리면 false를 반환

  그림
		class A  extends Object {
		
			//Object클래스로 부터 상속받은 메소드
			public boolean equals(Object obj){
				
				 return (this == obj);
			}
		
		}
		
   예시코드
   			 new A().equals( new A() );
   			 -> 두 A객체메모리의 주소가 같으냐? 라고 물어보는 메소드로
   			    같으면 true리턴, 틀리면 false리턴 
   
   
   			  A   a  = new A();  ->   a.equals(a2);
   			  A   a2 = new A();
*/
/*
 주제: Member객체의 동등비교(Member객체 내부의 변수값이 같은지 비교)를 위해서
      Object부모클래스의 equals메소드를 재정의(메소드 오버라이딩)한다.  
      
      각 Member객체들의 id인스턴스변수값이 같은지 비교하여
      같을 경우 true리턴, 그외의 경우는 모두 false를 리턴 한다.
*/
class Member /* extends Object  코드가 생략된 것임*/ {
	
	public String id;
	
	//회원의 아이디를 매개변수로 전달받아 초기화할 생성자
	public Member(String id) {
		this.id = id;
	}
	
	//메소드오버라이딩 단축키  alt + shift + s v
	//Object부모클래스에 만들어져 있는 equal메소드 오버라이딩
	//재구현 내용 :  각 Member객체들 내부의 인스턴스변수 id값 비교 
	@Override						//Member obj2 = new Member("blue");
	public boolean equals(Object obj) {
		/*
		  instanceof 예약어?
		  - A객체  instanceof A클래스자료형   또는
		    A객체  instanceof Object자료형  식이 적혀있다고 했을때
		    instanceof예약어는 A객체가 A클래스를 이용해서 생성된 객체이거나,
		    Object부모클래스를 상속받아 만든 자식객체라면 true반환
		    그렇지 않으면 false를 반환하는 예약어.
		*/
		//재구현
		//obj매개변수로 전달받은 두번째 Member객체메모리가
		//Member클래스자료형으로 만든 객체메모리인지 비교 검사하고
		//Member자식클래스로 다운캐스팅한후 target변수에 저장하게된다.
		if(obj instanceof Member target) {
			
			//두 Member객체 내부에 만들어져 있는id인스턴스변수값이 같으냐? 비교!
			if( this.id.equals( target.id)  ) {
				
				return true;
			}	
		}
		//그외 다르면 false
		return false;
			
	}//-------------------------equals메소드 오버라이딩

}

public class EqualsExample {
	public static void main(String[] args) {
		
		//객체메모리의 주소번지 0x1 라고 가정 
		//Member객체는 equals메소드는 오버라이딩되어 있다.
		Member obj1 = new Member("blue");
		
		//객체메모리의 주소번지 0x2 라고 가정
		//Member객체는 equals메소드는 오버라이딩되어 있다.
		Member obj2 = new Member("blue");
		
		//객체메모리의 주소번지 0x3 라고 가정
		//Member객체는 equals메소드는 오버라이딩되어 있다.
		Member obj3 = new Member("red");
		
		
		//obj1참조변수에 저장된 new Member("blue"); 객체 내부의
		//String id 인스턴스변수에 저장된 문자열과
		//obj2참조변수에 저장된 new Member("blue"); 객체 내부의
		//String id 인스턴스변수에 저장된 문자열이 같으냐?
		if(	   obj1.equals(obj2)   ) {
		
			System.out.println("두 Member객체의 id변수에 저장된 문자열은 같습니다");
		
		}else {
		 
			System.out.println("두 Member객체의 id변수에 저장된 문자열은 다릅니다");
			
		}
 		
		//-------------
		
		//2번째로 생성한 Member객체의 id인스턴스변수값이~
		//3번째로 생성한 Member객체의 id인스턴스변수값과 같으냐?
		if( obj2.equals(obj3) ) {
			System.out.println("두 객체의 id변수에 저장된 문자열은 같습니다.");
		}else {
			System.out.println("두 객체의 id변수에 저장된 문자열은 다릅니다.");
		}

	}

}












