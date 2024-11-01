package ch08.sec07;

/*
  인터페이스 내부에 작성할수 있는 private 메소드
  - 인터페이스의 상수, 추상메소드, default메소드, static정적메소드는
    모두 public 접근제어자를 갖습니다
    이 멤버들을 선언할때에는 public을 생략하더라도
    컴파일 과정에서 public 접근제어자가 붙어 항상 외부 클래스에서 접근이 가능합니다
    또한 인터페이스 {}중괄호 외부에서 접근할수 없도록 private메소드 선언도 가능하다
    
    구분 		       설명
    private메소드       구현객체가 필요로하는 메소드
    private 정적메소드	   구현객체가 필요없는 메소드 
    
    추가설명
    	private메소드는 default메소드안에서만 호출이 가능한 반면,
    	private 정적메소드는 default메소드 뿐만아니라
    	정적메소드 안에서도 호출이 가능하다.
    	private메소드의 용도는 default와 정적메소드들의 중복코드를 줄이기 위함이다.

예제. Service인터페이스에서 2개의 default메소드와 2개의 정적메소드 중
     중복코드 부분을 각각 private메소드와  private정적메소드로 선언하고 호출하는 방법
*/
interface Service{
	//default메소드
	default void defaultMethod1() {
		System.out.println("defaultMethod1 종속코드");
		//아래쪽에 만들어 놓을 private 메소드 호출
		defaultCommon();
	}
	default void defaultMethod2() {
		System.out.println("defaultMethod2 종속코드");
		//아래쪽에 만들어 놓을 private 메소드 호출
		defaultCommon();
	}	
		
	//private 메소드
	private void defaultCommon() {
		System.out.println("defaultMethod 중복코드A");
		System.out.println("defaultMethod 중복코드B");
	}
	//정적(public)메소드
	static void staticMethod1() {
		System.out.println("staticMethod1 종속코드");
		//defaultCommon(); //private 메소드 호출 불가능
		staticCommon(); //아래쪽에 만들어 놓을 private static정적메소드 호출가능
	}
	
	//정적(public)메소드
	static void staticMethod2() {
		System.out.println("staticMethod2 종속코드");
		//아래쪽에 만들어 놓을 private static 정적메소드
		Service.staticCommon();
	}
	
	//private 정적메소드
	private static void staticCommon() {
		System.out.println("staticMethod 중복코드C");
		System.out.println("staticMethod 중복코드D");
	}	
}

//Service인터페이스를 구현받아 새로운 자식 ServiceImpl클래스 만들기
class ServiceImpl  implements Service{
	
}

public class ServiceExample {
	public static void main(String[] args) {
			
		//부모인터페이스자료형 참조변수선언후 자식객체 생성해서 주소번지를 저장
		//업캐스팅
		Service service = new ServiceImpl();
		
				//디폴트메소드호출
				service.defaultMethod1();
				System.out.println();
				
				service.defaultMethod2();
				System.out.println();
				
				//정적메소드 호출
				//인터페이스명.정적메소드명();
				Service.staticMethod1();
				System.out.println();
				
				Service.staticMethod2();
				System.out.println();
				

	}

}












