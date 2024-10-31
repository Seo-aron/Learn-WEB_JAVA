


//예제. 자식클래스내부에서 메소드 오버라이딩시 상속되지 않고 은닉(보호)된
//	   부모클래스의 메소드를 강제로 호출하는 방법
//힌트 - super 사용

//부모 클래스
class Parent{
	public void parentPrn() {
		System.out.println("부모Parent클래스의 parentPrn메소드");
	}
}
//자식 클래스 
class Child extends Parent{
	
	//메소드 오버라이딩
	//부모Parent클래스에 정의된 parentPrn메소드를 오버라이딩 하자
	public void parentPrn() {
		//super예약어를 이용해 은닉된 부모의 메소드를 강제로 호출해서 사용할수 있음
		super.parentPrn();
		//구현부 재작성
		System.out.println("자식Child클래스의 오버라이딩된 parentPrn메소드");
	}
	
	public void childPrn() {
		System.out.println("자식Child클래스의 childPrn메소드");
	}
}


public class Ex3 {
	public static void main(String[] args) {
		
		 Child child = new Child(); //자식클래스의 객체 생성
		 	   child.parentPrn(); //오버라이딩된 메소드 강제로 호출
		 	   //출력
		 	   //"자식Child클래스의 오버라이딩된 parentPrn메소드"
		 	   
		 	   //출력
		 	   //"부모Parent클래스의 parentPrn메소드"  <- super.은닉된부모의메소드호출
		 	   //"자식Child클래스의 오버라이딩된 parentPrn메소드"
		 	   
//		 위와 같이 parentPrn메소드를 호출했을때
//		 상속되지 않고 은닉 보호된 부모Parent 멤버(parentPrn메소드)를 강제로 호출하게할때
//		 방법: 오버라이딩된 parentPrn메소드 내부에 구현코드의 첫줄에 super예약어를 이용해
//		      super.부모ParentPrn(); 코드를 작성하면 강제 호출이 될것이다.
		 	   
	}

}













