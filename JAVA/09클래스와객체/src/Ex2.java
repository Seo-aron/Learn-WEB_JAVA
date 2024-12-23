/*
  객체지향 프로그래밍 3단계 기법
  
  1단계. 현실에 존재하는 객체를 모델링(데이터와 동작을 추출하는 작업)
  
  		LGTV객체, 삼성TV객체, 대우TV객체 ..........
  		
  		LGTV객체 모델링
	  		데이터 : 높이, 크기, 길이, 볼륨, 채널
	  		기능 : 켜기, 끄기, 볼륨높이기, 볼륨낮추기, 채널 높이기, 채널 낮추기 
	  		
  		참고. 2단계에서 데이터 -> 변수에 저장해야함
  					 기능 -> 메소드로 만들어 놔야 함
  		

  2단계. 객체들의 공통점을 찾아 자바코드로 class를 설계 (class 만드는 일)
*/ 
  class Tv {
	  
	  //변수(데이터를 저장하기위한) + 메소드(기능)
	  
//		LGTV객체 모델링
//  		데이터 : 높이, 크기, 길이, 볼륨, 채널, 색상, 전원상태값
//  		기능 : 켜기, 끄기, 볼륨높이기, 볼륨낮추기
	  
  //변수들 만들기
	  String color; //색상 데이터를 저장할 변수 
	  boolean power;//전원상태값 on -> true , off-> false 을 저장할 변수 
	  int channel; //현재 채널값을 저장할 변수 
	  
  //메소드들 만들기	  
	  //기능 : Tv를 켜거나 끄는 기능을 하는 메소드 
	   void power() {	  
		  power = !power;
	  }
	   
	  //기능 : 채널 1높이기 기능을 하는 메소드
	   void channelUp() {
		   channel++;
	   }
	  
	  //기능 : 채널 1감소  기능을 하는 메소드
	   void channelDown() {
		   channel--;
	   }
	   
  } //Tv class 닫기 기호 
 



/*
  3단계. 만들어진 class설계도를 이용해 현실에 있는 객체들처럼 
        자바코드로 객체 메모리를 생성하여 사용하는 단계
      
*/
public class Ex2 {
	public static void main(String[] args) {
		//2단계 에서 만들어진 설계도(Tv class) 하나를 이용해 객체 메모리 만든다
		
		//순서1. Tv객체 메모리를 참조하기 위한 참조변수 t선언
		//클래스자료형  참조변수;
		Tv t;
		
		//순서2. new 연산자를 이용해 Tv객체 메모리 생성 후 주소값을 t참조변수에 저장
	// 참조변수 = new 클래스명();
		    t = new Tv();
/*		    
		                        0x16 주소값
		[0x16]= -----------------------------------------
		    	|   String color; [null] 
		    	|   boolean power; [false]
		    	|   int channel; [0]
		    	|   
		    	|   power(){}, channelUp(){}, channelDown(){}
		    	|
		    	----------------------------------------
		    	
*/      //순서3. 생성된 객체 메모리 내부의 객체변수들의 값을 설정해서 저장 
		//문법
		//참조변수명.객체변수명 = 저장할값;
		    t.color = "빨간색";
		    t.channel = 7;
		    t.power = true;
		//참조변수명.메소드명();
		    t.channelDown(); //현재 채널이 7에서 --에 의해 6으로 변경된다.
		   
		System.out.println("현재 채널값은 : " + t.channel + "입니다.");    
						  //현재 채널값은 : 6입니다.
/*		    
            0x16 주소값
-----------------------------------------
|   String color; ["빨간색"] 
|   boolean power; [true]
|   int channel; [7->6]
|   
|   power(){}, channelUp(){}, channelDown(){}
|
----------------------------------------

*/ 		    
		    		  
		    		  
		    
		    
		
		
		

	}

}











