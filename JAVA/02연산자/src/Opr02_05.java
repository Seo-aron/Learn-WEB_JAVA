
public class Opr02_05 {

	public static void main(String[] args) {
/* 문제. 조건식을 작성 해보자
		1. int형 변수 x가  10보다 크고 20보다 작을 때 연산 결과 값이 true인 조건식
			 
		2. char형 변수 ch가 공백이나 탭이 아닐 때 연산 결과 값이 true인 조건식
				
		3. char형 변수 ch가 'x' 또는 'X'일때 연산 결과 값이 true인 조건식
		
		4. char형 변수 ch가 숫자형태의문자('0' ~ '9')일때 연산 결과 값이 true인 조건식


		5. char형 변수 ch가 영문자(대문자 또는 소문자)일때 연산 결과 값이 true인 조건식
		
		
		6. int형 변수 year가 400으로 나눠떨어지거나 또는 4로 나눠떨어지고 
		   100으로 나눠떨어지지 않을 때 연산 결과 값이 true인 조건식
		   
		7. boolean형 변수 powerOn이 false일때 연산 결과 값이 true인 조건식
		
 */
		//1. int형 변수 x가  10보다 크고 20보다 작을 때 연산 결과 값이 true인 조건식
		//	 10 < x  &&  20 > x
		
		//2. char형 변수 ch가 공백이나 탭이 아닐 때 연산 결과 값이 true인 조건식
		//	 !(ch == '' || ch == '\t')
			 
		//	 또는
			 
		//	 ch != ''  &&  ch != '\t'
		
		
		//3. char형 변수 ch가 'x' 또는 'X'일때 연산 결과 값이 true인 조건식
		
		//	ch == 'x' || ch == 'X'
		
		
		//4. char형 변수 ch가 숫자형태의문자('0' ~ '9')일때 연산 결과 값이 true인 조건식
		
		//   '0' <= ch &&  ch <= '9'
		
		//5. char형 변수 ch가 영문자(대문자 또는 소문자)일때 연산 결과 값이 true인 조건식
		
		// ('a' <= ch &&  ch <= 'z') || ('A' <= ch &&  ch <= 'Z' )
		
		
		//6. int형 변수 year가 400으로 나눠떨어지거나 또는 4로 나눠떨어지고 
		//   100으로 나눠떨어지지 않을 때 연산 결과 값이 true인 조건식
		
		//year % 400 == 0 || year % 4 == 0 && year % 100 !=  0
		
		
		//7. boolean형 변수 powerOn이 false일때 연산 결과 값이 true인 조건식
		
		//!powerOn   또는   powerOn  == false
		
		
		
		
	}

}


















