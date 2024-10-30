

//예제 : 1부터 ~ 10사이의 짝수들의 총합30을 하나 구해 출력
public class While02 {

	public static void main(String[] args) {

		//2+4+6+8+10 = 30
		
		//1.총 합을 저장할 변수 tot 선언 후 0 초기화
		int tot = 0;
				
		//2.while반복문의 초기식 number변수선언 후 1로 저장
		int number = 1;
		
		//3.number변수의 값이 1부터 10보다 작거나같을때 까지 while반복 
		while(number <= 10) {
			//3.1 number변수 값이 짝수 인지 확인
			//    (number변수 값이 짝수 라면?)
		    if(number % 2 == 0) {
		    	//3.2 tot변수에 누적
		    	tot += number;
		    }			
			//3.3 number변수 값 1증가
			number++;
		}
		
		//4.tot = 30 출력
		System.out.println("tot = " + tot);
		
		//출력결과
		//tot = 30
		
		
	}

}
