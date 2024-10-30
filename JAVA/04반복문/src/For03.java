

//예제. for문의 다양한 활용
public class For03 {

	public static void main(String[] args) {
		
		//제어 변수 i선언
		int i;
		
		//i의 초기값을 1로 설정하여 1씩 증가시키면서 10일때 까지 반복해서 i변수값 출력
		
//		1 2 3 4 5 6 7 8 9 10
		for(i=1;  i<=10;  i++) {
			System.out.print(" " + i);
		}
		
		//위쪽 for문 밖에 출력 한 것임 
		System.out.println("\n------------------------->>");
		
		
		//i의 초기값을 1로 설정하여  2씩 증가시키면서 10일떄 까지 반복해서 i변수값 출력
		
//      1 3 5 7 9
		for(i=1;  i<=10;  i+=2) {
			System.out.print(" " + i);
		}				
		//위쪽 for문 밖에 출력 한 것임 
		System.out.println("\n------------------------->>");		

		
//     i의 초기값을 2로 설정하여  2씩 증가시키면서 i가 10이 될떄까지만 반복
//      2 4 6 8 10
		for(i=2;  i<=10;  i+=2) {
			System.out.print(" " + i);
		}
		//위쪽 for문 밖에 출력 한 것임 
		System.out.println("\n------------------------->>");				
		

//     i의 초기값을 10으로 설정하여 1씩 감소 시키면서 i가 1보다 크거나같을때까지 반복		
//      10 9 8 7 6 5 4 3 2 1 		
		for(i=10;  i>=1;   i--) {
			System.out.print(" " + i);
		}
		
		//위쪽 for문 밖에 출력 한 것임 
		System.out.println("\n------------------------->>");			
	}

}









