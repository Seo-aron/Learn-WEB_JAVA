
//원 클래스(설계도) 만들기
class Circle{
	//변수
	//원의 반지름 데이터를 저장할변수
	double radius;
	
	//메소드
	//매개변수 newRadius로 전달받은 반지름의 값을  double radius변수에 저장
	public void setRadius(double newRadius) {
		radius = newRadius;
	}
	//원의 면적을 계산해서 반환(제공)하는 기능의 메소드
	//-> 반지름 X 반지름 X 3.14
	public double calculateArea() {
		return radius * radius * 3.14;
	}
}


//사각형 클래스(설계도) 만들기
class Rectangle{
	//변수
	double width;
	double height;
	
	//메소드
	//Rectangle객체를 생성하여 객체메모리 내부에 만들어진 객체변수 width와 height에값을
	//새로 변경해서 저장시킬 기능의 setDimensions메소드 정의 
	public void setDimensions(double newWidth, double newHeight) {
		width = newWidth;
		height = newHeight;
	}
	//사각형의 면적을 계산해서 반환(제공)하는 calculateArea메소드 정의
	public double calculateArea() {
		return width * height;
	}	
}




public class Ex2_1 {

	public static void main(String[] args) {
		
		//객체 생성 사용
		//1. Circle클래스 설계도를 이용해 Circel객체 메모리 생성
		Circle circle  = new Circle();
		
			   circle.setRadius(5);//반지름 값 double radius객체변수에 설정 
			   
			   
			   						//78.5
			   System.out.println(circle.calculateArea());  //원의 면적 출력
		
/*		
				0x12   = 
							   			0x12
					     --------------------------------
						   //변수
						 	//원의 반지름 데이터를 저장할변수
						 	double radius; [ 0.0 ]  -> [ 5.0 ]
						 	
						 	//메소드
						 	//매개변수 newRadius로 전달받은 반지름의 값을  double radius변수에 저장
						 	public void setRadius(double newRadius) {
						 		radius = newRadius;
						 	}
						 	//원의 면적을 계산해서 반환(제공)하는 기능의 메소드
						 	//-> 반지름 X 반지름 X 3.14
						 	public double calculateArea() {
						 		return radius * radius * 3.14;
						 	}
					     
					     --------------------------------
*/		
	   Circle circle2  = new Circle();
	   
	   		  circle2.radius = 3;
	   		  
	   		  //원면적을 제공받기 위해 객체메소드 calculateArea()호출
	   		  double result = circle2.calculateArea();
	   		  System.out.println(result); //28.26
	   		  
	   /*		
				0x13   = 
							   			0x13
					     --------------------------------
						   //변수
						 	//원의 반지름 데이터를 저장할변수
						 	double radius; [ 0.0 ]
						 	
						 	//메소드
						 	//매개변수 newRadius로 전달받은 반지름의 값을  double radius변수에 저장
						 	public void setRadius(double newRadius) {
						 		radius = newRadius;
						 	}
						 	//원의 면적을 계산해서 반환(제공)하는 기능의 메소드
						 	//-> 반지름 X 반지름 X 3.14
						 	public double calculateArea() {
						 		return radius * radius * 3.14;
						 	}
					     
					     --------------------------------
*/		   	
		   	      
		   
	   	 //2.Rectangle클래스를 이용하여 객체 생성후 사용
	   	 Rectangle rectangle = new Rectangle();
	   	 
	   	 		   rectangle.setDimensions(4, 6);//너비와 높이 설정
	   	 		   
 		  result = rectangle.calculateArea();//사각형 면적을 얻어 변수에 저장
 		  System.out.println(result);	 //24.0 
 		
	   	 
/*	   	 		   								0x40
	   	             0x40    = -------------------------------------------------------------------
							    //변수
								double width; [ 0 ] -> [ 4.0 ]
								double height;[ 0 ] -> [ 6.0 ]
								
								//메소드
								//Rectangle객체를 생성하여 객체메모리 내부에 만들어진 객체변수 width와 height에값을
								//새로 변경해서 저장시킬 기능의 setDimensions메소드 정의 
								public void setDimensions(double newWidth, double newHeight) {
									width = newWidth;
									height = newHeight;
								}
								//사각형의 면적을 계산해서 반환(제공)하는 calculateArea메소드 정의
								public double calculateArea() {
									return width * height;
								}	
							  ----------------------------------------------------------------------
	   		  
	   		  
	
	   		  
	   		  
*/	   		  
	}

}















