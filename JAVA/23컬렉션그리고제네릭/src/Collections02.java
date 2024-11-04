


//주제 : 부모List인터페이스를 구현한 자식 ArrayList가변길이 배열클래스

import java.util.List;
import java.util.ArrayList;

public class Collections02 {
	public static void main(String[] args) {
		//업캐스팅
		   List  list = new ArrayList();
//     ArrayList list = new ArrayList();		
		
		   		 list.add("하나");
		   		 list.add(2);
		   		 list.add(3.42);
		   		 list.add("넷");
		   		 list.add("five");
		   		 list.add(6);
		   	
		   //ArrayList가변길이 배열에 저장된 객체들 확인
		   System.out.println( list.toString()  );		 
//		   [하나, 2, 3.42, 넷, five, 6]
		   //결론 : 출력결과 HashSet배열과 달리 ArrayList배열에는
		   //      add메소드를 호출하여 추가한 순서대로 객체(요소)들이
		   //      저장된 것을 확인 할수 있다.
/*
			
			List부모인터페이스로 구현한 자식클래스배열의 객체(요소)는 위치(index)를 이용해서 접근합니다.
			List부모인터페이스는 List의 부모인 Collection인터페이스로 부터 상속되었으므로
			Collection인터페이스에서 제공하는 메소드들을 모두 사용할수 있으며 
			다음과 같은 메소드가 더 추가되었습니다.
			
				메소드 						설명
				int indexOf(Object o)      전달인자로 준 객체를 앞에서부터 찾아 해당 위치(index)를 반환함
										   찾지 못하면 -1을 반환함.
										   
				int lastIndexOf(Object o)  저장된 객체를 배열의 마지막 index위치부터 거꾸로 찾음
										    찾으면 해당 위치(index)를 반환하고 찾지 못하면 -1을 반환함
				
				E   get(int index)		   매개변수 index로전달한 index위치에 저장된 객체를 반환
				 						    
				E	set(int index,  E  element)   
										   매개변수 index로 전달한 index위치에 저장된 객체를
										   매개변수 E element로 전달한 객체로 대체 하는 메소드 
				void add(int index, E  element)
										   매개변수 index로 전달한 index위치에 
										   매개변수 E element로 전달한 객체를 저장합니다.
										   매개변수 index로 전달한 index위치에 저장된 기존의 객체는
										   뒤로 밀려나 그다음 index위치에 저장되게 됩니다.
				
				E   remove(int index)      매개변수 index로 전달한 index위치에 저장된 객체를 삭제후
										   삭제에  성공하면 true반환 삭제에 실패하면 false반환
										    
				boolean remove(Object o)   매개변수로 전달하는 객체를 삭제 하는메소드
										   삭제에 성공하면 true반환 삭제에 실패하면 false반환
			
		*/			   
		   
		   		 
		   
		   

	}

}









