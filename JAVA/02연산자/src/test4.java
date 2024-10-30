/*
 문제. 다음은 십의 자리 이하를 버리는 코드입니다.
 	  변수 value의 값이 356이라면 300이 나올 수 있도록 
 	  ()에 알맞은 코드를 작성하세요.(산술 연산자만 사용).
 */
public class test4 {
	public static void main(String[] args) {
		
		int value = 356;
		System.out.println(value / 100 * 100);
		
		/*
		 value / 100
		 356 / 100을 계산하면, 정수 나눗셈이기 때문에 3이 됩니다. 
		 (356를 100으로 나누면 몫은 3이고 나머지는 56입니다.)
		
		 3 * 100:
		  그 다음에 3에 100을 곱하면 300이 됩니다.
		 */
	}

}




