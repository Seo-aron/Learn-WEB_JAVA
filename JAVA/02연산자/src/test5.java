/*
문제. 다음 코드는 사다리꼴의 넓이를 구하는 코드입니다.
정확히 소수 자릿수가 나올 수 있도록()에 들어갈 수 있는 코드를 모두 선택하세요.
정답 : 1. 2. 3.

 1. (lengthTop+lengthBottom) * height / 2.0
 2. (lengthTop+lengthBottom) * height * 1.0 / 2
 3. (double)(lengthTop+lengthBottom) * height / 2
 4. (double)((lengthTop+lengthBottom)* height / 2)

 */
public class test5 {
	public static void main(String[] args) {

		int lengthTop = 5;
		int lengthBootom = 10;
		int height = 7;
		double area = (lengthTop + lengthBootom) * height / 2;
		System.out.println(area);
	}

}
/*
문제는 사다리꼴의 넓이를 구하는 코드에서 소수 자릿수가 정확하게 나올 수 있도록 하는 코드 선택에 대한 것입니다. 

### 사다리꼴 넓이 공식
사다리꼴의 넓이를 구하는 공식은 다음과 같습니다:
넓이 = (윗변 + 아랫변) × 높이 ÷ 2

### 분석
1. 1번: (lengthTop + lengthBottom) * height / 2.0
   - lengthTop + lengthBottom`의 결과는 정수(5 + 10 = 15)입니다.
   - height도 정수(7)입니다.
   - 곱셈 결과인 15 * 7은 정수(105)입니다.
   - 마지막으로 105 / 2.0은 실수(52.5)로 계산됩니다. 
     따라서 소수 자릿수가 정확하게 나옵니다.

2. 2번: (lengthTop + lengthBottom) * height * 1.0 / 2
   - lengthTop + lengthBottom의 결과는 정수(15)입니다.
   - height도 정수(7)입니다.
   - 곱셈 결과는 15 * 7으로 정수(105)입니다.
   - 105 * 1.0은 실수(105.0)가 됩니다.
   - 마지막으로 105.0 / 2는 52.5로 소수 자릿수로 계산됩니다. 
     따라서 소수 자릿수가 정확하게 나옵니다.

3. 3번: (double)(lengthTop + lengthBottom) * height / 2
   - lengthTop + lengthBottom의 결과는 정수(15)입니다.
   - 이를 (double)로 형변환하면 15.0이 됩니다.
   - height는 정수(7)입니다.
   - 15.0 * 7은 실수(105.0)가 됩니다.
   - 마지막으로 105.0 / 2는 52.5로 소수 자릿수로 계산됩니다.
     따라서 소수 자릿수가 정확하게 나옵니다.

4. 4번: (double)((lengthTop + lengthBottom) * height / 2)
   - lengthTop + lengthBottom의 결과는 정수(15)입니다.
   - height는 정수(7)입니다.
   - 곱셈 결과는 15 * 7으로 정수(105)입니다.
   - 이후 105 / 2는 정수 나눗셈으로 52가 됩니다. (소수 자릿수가 사라짐)
   - 마지막으로 (double)`로 형변환하면 52.0이 됩니다. 
     따라서 소수 자릿수가 정확히 나오지 않습니다.

### 결론
- 정답 : 1, 2, 3번은 모두 소수 자릿수가 정확하게 나오므로 정답입니다.
- 4번은 정수 나눗셈이기 때문에 소수 자릿수가 사라져서 정답이 아닙니다.





*/



