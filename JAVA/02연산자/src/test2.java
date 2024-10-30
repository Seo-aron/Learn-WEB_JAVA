
public class test2 {

	public static void main(String[] args) {
		int score = 85;
		String result = (!(score>90))? "가":"나";
		//                             true:false;
		//순서1. score > 90의 결과를 먼저 평가합니다. 
			 //score는 85이므로, 85 > 90은 false입니다.
		//순서2.그 다음 ! 연산자(논리 NOT)를 사용하여 
	     	//false를 반전시키면 true가 됩니다.
		
		System.out.println(result);//"가"

	}

}
