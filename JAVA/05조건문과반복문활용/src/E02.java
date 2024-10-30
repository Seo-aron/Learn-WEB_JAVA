

//예제. for문을 한번만 사용해서 짝수의 합, 홀수의 합을 각각 구하기 위해
//     for문 내부에 if문 사용하기
public class E02 {
	public static void main(String[] args) {

		//for문의 시작초깃값을 설정할 제어변수 n을 선언
		int n;
		//홀수들의 합을 저장할 변수
		int odd_tot;
		//짝수들의 합을 저장할 변수
		int even_tot;
		
		for(odd_tot=0, even_tot=0, n=1;  n<=10;  n++) {//제어변수 n은 1부터 10사이의 자연수 
			//n변수 값이 홀수이면?
			if(n%2 == 1) {
				//odd_tot변수에 n변수값 누적
				odd_tot += n; //홀수들의 합이 누적 	
			
			}else {	//n변수 값이 짝수이면?
				//even_tot변수에 n변수값 누적
				even_tot += n;
			}
		}
		/*
		  even_tot변수값(2+4+6+8+10) = 30
 		  odd_tot변수값(1+3+5+7+9) = 25

		 */
		System.out.println(" even_tot변수값(2+4+6+8+10) = " + even_tot);
		System.out.println(" odd_tot변수값(1+3+5+7+9) = " + odd_tot);	
	}

}






