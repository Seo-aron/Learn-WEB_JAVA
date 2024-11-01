
//예제. 확장 대입 연산자   +=

public class Opr06_02 {

	public static void main(String[] args) {
		
		int a = 10;
		
		System.out.println( a  + 10 ); //20    - 1번
		System.out.println(a); //10  - 2번
		//1번은 실행결과는 20입니다. 
		//하지만 1번에서 변수a는 + 연산에 참여만 했으므로
		//변수a에 저장된 10값은 바뀌지 않았으므로
		//2번에서는 10이 출력됩니다.
		//만일 변수a의 값이 변경되도록 하려면 
		//a + 10으로 연산한 결과 20을 a변수에 다시 대입(저장) 해야합니다.
		//식을 작성 해보면  a = a + 10;이 될것입니다.
		
		a = a + 10;
//		    10+ 10;
		System.out.println(a);//20
				
//		int a = 20;
		
		//a = a + 10; 과 동일한 식!
		a += 10;
		//순서1.  a + 10
		//       20 + 10
		//         30
		//순서2.  a = 30;    //a변수에는 20이 저장되어 있다가 제거되고
							//대신 +10한 30이 대입 = 연산자를 이용해 대입된다
		
		System.out.println(a); //30
		
		
		// 여기서  += 플러스이퀄이라고 읽으며 확장대입연산자라고 부른다
		
		
		
		
		
		

	}

}
