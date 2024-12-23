/*
문제. 아래의 코드는 사과를 담는데 필요한 바구니(버켓)의 수를 구하는 코드 이다.
만일 사과의 수가 123개이고 하나의 바구니에는 10개의 사과를 담을 수 있다면,
13개의 바구니가 필요할 것이다. (1)에 알맞은 코드를 넣으시오.

출력결과
13
*/

public class Opr08_01 {
	public static void main(String[] args) {

		int numOfApples = 123; //사과의 개수
		int sizeOfBucket = 10; //바구니의 크기(바구니에 담을 수 있는 사과의 개수)
		
		
		int numOfBucket = 
			numOfApples/sizeOfBucket + (numOfApples%sizeOfBucket > 0 ? 1 : 0);
	    /*			
			사과의 개수(numOfApples)를 바구니의 크기(sizeOfBucket)으로 
			나눗셈 연산  / 을 하면 사과를 담는데 필요한 바구니의 수(numOfBucket)를
			구할수 있다. 정수간의 나눗셈연산의 특징은 반올림을 하지 않고 버림을 합니다
			예를 들어 125/10 의 결과는 13이 아니라 12가 된다
			int 와 int간의 이항연산결과는 int이기때문에 12.5실수값과 같은 결과가
			나오지 않는다.
			그리고 사과의 개수를 바구니의 크기로 나눴을때 나머지가 있으면
			123/10 -> 12.3333   = 12 가 나오기 때문에 
			하나의 바구니가 더 필요하다
			그래서 나머지 구하는 연산자 %를 이용해서 나눗셈연산에서 나머지가 발생하는지
			확인해서 , 나머지가 발생하면 바구니개수 12에  + 1을 더해줘서 13으로 만듬
		*/		
				
		
		System.out.println("필요한 바구니의 수 : " + numOfBucket);
		
	}

}




