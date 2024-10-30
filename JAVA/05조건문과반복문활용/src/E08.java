

//예제. 다중 for문에서 제어변수의 변화 알아보기

public class E08 {

	public static void main(String[] args) {
//
//		int i;//안쪽 for문 제어변수
//		int a;//바깥 쪽 for문 제어변수
//		
//		System.out.println("시침 ---------------->>분침");
//		System.out.println("a(바깥 쪽 제어변수)----->>i(안쪽 제어변수)");
//		
//		
//		
//		for(a=1; a<5; a++) {//바깥쪽 for
//			
//			//반복실행할 코드를 안쪽for로 작성
//			for(i=1; i<=5; i++) {
//				
//				//반복실행할 코드
//				System.out.println(a + "--------------->>" + i);
//				
//			}//안쪽 for
//			
//		}//바깥 쪽 for
//		
		
		int hour, minute, second;
		
		System.out.println("시침--------->>분침-------->>초침");
		System.out.println("hour(바깥쪽 제어변수)------>>minute(중간 제어변수)---->>second(가장 안쪽 제어변수)");
		
		for(hour=1;  hour<=1; hour++) {
			
			for(minute = 1; minute <=60; minute++) {
				
				for(second = 1; second <= 60; second++) {
					
					System.out.println(hour +"------->>"+ minute + "------->>" + second);
				}
			}
		}
		
			
	}

}





















