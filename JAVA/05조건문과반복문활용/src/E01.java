


//예제.  1부터 10사이의 짝수의 합과 홀수의 합을 
//      각각 for문을 이용해 구해서 출력!

public class E01 {
	public static void main(String[] args) {

		//두개의 for문을 제어할 제어변수 n선언
		int n;
		
		//홀수들의 합과 짝수들의 합을 각각 누적해서 저장할 변수 2개 선언
		int odd_tot, even_tot;

		
		//제어변수 값이 짝수가 구해 지도록하여  그제어 변수값을 누적해서 짝수의 합을 구함
		for(even_tot=0, n=2;  n<=10;  n+=2) {
			//초깃값 2개 설정     조건식;  증감식
			even_tot += n; //2 + 4 + 6 + 8 + 10
		}
		
		System.out.println(" even_tot변수값(2+4+6+8+10) = " + even_tot);
		
		//제어 변수 값이 홀수가 구해지도록 하여 그 제어 변수값을 누적해서 홀수의 합을 구함
		for(odd_tot=0, n=1;   n<=10;   n+=2) {
			//  초깃값을 설정;    조건식;   증감식
			
			//홀수들을 odd_tot변수에 누적
			odd_tot += n;// 1 + 3 + 5 + 7 + 9
		}
		//참고 : 만일 2개이상의 변수에 초기값을 지정하려고 할경우  , 로 연결하여 작성하면 됨
		
		// odd_tot변수값(1+3+5+7+9) = 25
		System.out.println(" odd_tot변수값(1+3+5+7+9) = " + odd_tot);
		
		
		//결론
		//위 예제의 코드처럼 for반복문을 두 번 사용하여 홀수의 합과 짝수의 합을 구해도 되지만
		//for문을 한번만 사용해서 홀수의 합과 짝수의 합을 구할수도 있다. 
		//다음예제 E02.java에서 해보자.
	}

}










