/*
주제 : 제네릭 기법이 나오게 된 배경
	  Vector배열에 저장된 객체들을 get메소드를 이용하여 
	  얻는데  부모 Object클래스타입으로 자식객체를 반환하기 떄문에
	  다운캐스팅을 해서 사용하면 불편합니다.
*/

import java.util.List;
import java.util.Vector;

public class Collections05 {
	public static void main(String[] args) {

		//업캐스팅을 하여 Vector배열 생성
		List vector = new Vector();
		
		//Vector배열에 문자열 객체 추가
		vector.add("Apple");
		vector.add("banana");
		vector.add("oRANGE");
		
		//다운캐스팅을 하여 얻은 문자열객체들을 저장할 String 변수
		String temp;
		//["Apple","banana","oRANGE"] <- Vector배열
		//   0        1        2
		
		for(int i=0; i<vector.size(); i++) {
			
			//업캐스팅을 하여 부모 Object타입의 참조변수에
			//Vector배열에서 꺼내온 문자열객체의 주소를 저장
			Object obj = vector.get(i);
			//     "Apple"
			//     "banana"
			//     "oRANGE"
			//다운캐스팅을하여 String객체->
			//"Apple"의 toUpperCase()메소드를 호출 가능하게 해야함
			temp = (String)obj;
			//"Apple".toUpperCase() -> "APPLE"
			//"banana".toUpperCase() -> "BANANA"
			//"oRANGE".toUpperCase() -> "ORANGE"
			System.out.println(temp.toUpperCase()); 
			
			
			
			
			//컴파일 에러 이유 
			//: get메소드는 무조건! 
			//  Object부모자료형의 참조변수에 저장할 자식객체를 반환함
			//temp = vector.get(i);//컴파일 에러 
			
/*	
Vector에 모든 종류의 객체를 저장할수 있습니다.
이는 Vector에 저장되는 객체는 자바의 모든 최상위 클래스 Object클래스로 관리되기 떄문입니다.
저장된 객체를 가져다가 사용하기 위한 get메소드 역시 Vector배열에 저장된 특정 index위치의 객체를
자바의 모든 최상위 클래스인 Object 클래스자료형으로 반환합니다.
그러므로 이렇게 반환된 Object클래스 자료형을  String클래스 자료형 참조변수에 저장하려 하면
위와 같이 컴파일 에러가 발생합니다.
자식 클래스자료형의 참조변수에 부모클래스자료형의 자식객체의 주소를 저장하려면
반드시 강제로 다운캐스팅 해야합니다. 
이런 불편함을 해결하고자 나오는 기법이 제네릭 기법입니다.
			
*/		
			
			
			
		}
		
		

		
	}

}









