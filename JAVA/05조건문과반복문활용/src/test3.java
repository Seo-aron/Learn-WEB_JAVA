
/*
 문제. 두 개의 주사위를 던졌을 때, 
      눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 
      main메소드 내부에 다중for 소스를 작성하시오.
 
 출력결과
 1+5=6
 2+4=6
 3+3=6
 4+2=6
 5+1=6
 
 */
public class test3 {
	public static void main(String[] args) {

//반복문을 중첩해서 1부터 6까지를 반복하면서 두값의 합이 6인 경우를 화면에 출력
		
		//첫번쨰 주사위 굴렸을때 나오는 상황
		for(int i=1; i<=6;  i++) {
			//두번째 주사위 굴렸을때 나오는 상황
			for(int j=1;  j<=6; j++) {
				
				if(i + j == 6) {
					System.out.println( i + "+" + j + "=" + (i+j));
//					 출력결과
//					 1+5=6
//					 2+4=6
//					 3+3=6
//					 4+2=6
//					 5+1=6
				}
				
			}
		}
		
	}

}















