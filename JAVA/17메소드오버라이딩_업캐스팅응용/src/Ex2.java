

//예제. 메소드 오버라이딩 예

//도형 설계도(클래스) - 부모클래스
class DObject{
	
	//부모클래스자료형  참조변수(인스턴스변수의역할을함) 선언
	public DObject  dObject;
	
	//생성자 - 위 DObject클래스자료형의 참조변수 dObject초기화
	public DObject() {
		this.dObject = null;
	}
	//그림을 단순히 그리는 기능을 표현하는 메소드
	public void draw() {
		System.out.println("도형을 그린다");
	}
}
//---------------------------

//도형클래스(DObject)부모클래스를 상속받는
//선을 그리기위한 Line자식클래스 선언
class Line extends DObject{

	//부모 DObject클래스의 draw메소드를 오버라이딩(재정의)하자.
		//재정의 내용 -> "선을 그린다" 출력
	@Override
	public void draw() {
		System.out.println("선을 그린다");
	}
	//참고. 메소드오버라이딩된 draw는 
	//     Line클래스로 객체를 생성해서 호출하면
	//     Dobject부모클래스의 메소드가 은닉(보호)되어 상속받지 못하게
	//     되기때문에 메소드 오버라이딩된 draw메소드가 호출되어 실행됨	
}
//----------------------------------------------

//도형클래스(DObject)부모클래스를 상속받는
//원을 그리기 위한 Circle자식 클래스 선언
class Circle  extends DObject {
	//부모 DObject클래스의 draw메소드를 오버라이딩 하자.
			//재구현 내용 -> "원 그리기"  출력
		//alt  + shift + s  v
	@Override
	public void draw() {
		System.out.println("원 그리기");
	}
	
}

public class Ex2 {
	public static void main(String[] args) {
		
		//부모 클래스 -> Dobject
		
		//자식 클래스들 -> Line, Circle
		
		
		//메소드 오버라이딩된 메소드들 호출해보기
		
		//1. Line자식클래스의 객체 생성
		Line line = new Line();
		
					/*
					   ------------------
					   	  부모 DObject의 멤버들
					   	  	public DObject dobject;
					   	  	public draw(){ "그림을 그린다" }
					   	   
					   	  Line자식의 멤버들					   	    
					   	    @Override
					   	    public draw(){"선을 그린다"}
					   
					   -------------------				 
					 */
		
		//  line참조변수를 이용해 draw()메소드 호출
		//   오버라이딩된 메소드가 호출되어 실행!
			 line.draw();  //"선을 그린다"

		//2. 업캐스팅해서  자식 Circle객체를 생성해서 사용하자
		//업캐스팅 : 부모클래스자료형 참조변수에  자식객체 메모리주소를 저장
			 DObject dObject = new Circle(); //업캐스팅
			 		
			 		 dObject.draw();  //"원 그리기"
			 		 
			 		//설명
			 		//부모클래스(DObject)자료형 참조변수 dObject로
			 		//draw()메소드 호출시
			 		//참조변수 dObject는 DObject부모클래스자료형의 변수이므로 
			 		//동작순서1. 먼저 은닉된 부모의 draw()메소드를 호출해서 찾고
			 		//동작순서2. 부모의 draw()와 같은 이름의 메소드가
			 		 //        자식클래스에 있는지 검사후 찾아서
			 		 //        동적으로 바인딩되어 
			 		 //        오버라이딩된 자식의 draw()메소드가 자동으로 호출되어
			 		 //		   최종 실행됩니다.
			 		 
								 
								 /*
								   ------------------
								   	  부모 DObject의 멤버들
								   	  	public DObject dobject;
								   	  	public draw(){ "그림을 그린다" }
								   	   
								   	  Circle자식의 멤버들					   	    
								   	    @Override
								   	    public draw(){"원 그리기"}
								   
								   -------------------				 
								 */
			 
			 
			 
			 
		
		

	}

}











