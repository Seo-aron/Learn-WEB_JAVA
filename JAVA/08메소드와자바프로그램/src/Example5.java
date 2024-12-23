

//예제. 가변길이 매개변수를 이용하여 사용자정의 메소드를 만들고 사용해보자

public class Example5 {

	//가변길이 매개변수?
	//- 메소드에서 인자의 갯수를 유동적으로 받을수 있도록 해주는 변수 
	
	//기능 : 여러개의 정수를 가변길이 매개변수로 전달받아 그합을 계산하는기능
//	public static 반환타입  메소드명(자료형... 가변길이매개변수) {}
	
	public static int sum(int... numbers) {
						  //만약 1, 2, 3 -> { 1, 2, 3} 배열로 받는다.
				          //만약 10, 20, 30, 40, 50 -> {10, 20, 30, 40, 50} 배열로 받는다.
						  //만약 전달받은 인자가 없으면 -> {      } 배열로 받는다
		
		//합계를 저장할 변수 초기화
		int total = 0;
		
		//가변길이 매개변수 이자 배열인 numbers를 이용해서 
		//sum메소드 호출시 전달받은 데이터를 배열numbers에서 반복해서 추출할수 있다
		for(int number : numbers) {
			
			//total에 현재 숫자를 누적
			total += number;
		}
		
	
		//업그레이드된 for 문법
		//해석 -  :콜론 뒤에 작성한 배열에 저장된 요소들의 갯수만큼 반복해서 코드 실행!
		//       배열의 0index위치의 요소부터 꺼내어서  :콜론 앞에 작성한 변수에 저장한후
		//       반복실행 할 코드 자리에서 사용
		//       배열의 1index위치의 요소를 꺼내어서 :콜론 앞에 작성한 변수에 저장한후
		//       반복실행 할 코드 자리에서 사용
		//       .....
		//       배열에 저장된 요소의 갯수만큼 반복하고 더이상 꺼내올 요소가 없으면 for문을 빠져나감
//		for(배열에서 얻은 요소를 저장할 변수 : 배열) {
//			
//			반복실행 할 코드;
//		}
						
		return total;//최종 합계를 반환 	
	}

	public static void main(String[] args) {
			
		//메소드를 호출하여 다양한 개수의 인자를 전달할수 있다
		//1. 3개의 인자 전달 
		int result1 = sum(1,2,3);// 1+2+3 결과 6을 반환 받아 result1변수에 저장
		System.out.println("Sum of 1,2,3: " + result1);
		
		//2. 5개의 인자 전달
		int result2 = sum(10, 20, 30, 40, 50); // 10+20+30+40+50 결과 150을 반환받아
		System.out.println("Sum of 10,20,30,40,50: " + result2);
		
		//3. 인자가 없는 경우 호출 가능
		int result3 = sum();
		System.out.println("Sum with no arguments: " + result3);

	}

}











