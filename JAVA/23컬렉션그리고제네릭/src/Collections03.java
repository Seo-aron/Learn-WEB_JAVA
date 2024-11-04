

//주제 : 부모List인터페이스를 구현한 자식 ArrayList배열클래스
//      그리고 Iterator인터페이스를 구현한 자식 Iterator배열객체의
//      메소드( next()메소드)를 이용해 쉽게 
//      ArrayList배열에 저장된 객체들 얻는 예

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Collections03 {
	public static void main(String[] args) {

//업캐스팅을 이용해서 ArrayList배열메모리 생성
	//부모인터페이스List자료형의 참조변수 = 자식ArrayList배열생성;
	List  list = new ArrayList();
		
	//ArrayList배열에 "하나", 2, 3.42, "넷", "다섯", 6 추가 
	      list.add("하나");
	      list.add(2);
	      list.add(3.42);
	      list.add("넷");
	      list.add("다섯");
	      list.add(6);
	 //ArrayList 배열 모습
	 //["하나",   2,   3.42,  "넷",  "다섯",  6]
	 //   0      1       2     3      4    5    index
	      
  

/*	      
	 ArrayList배열에 저장된 모든 객체들을 꺼내어서
	 Iterator부모인터페이스를 구현한 
	 자식 ArrayList$Itr라는이름의 배열메모리에 저장한후
	 자식 ArrayList$Itr배열 메모리 자체를 반환해 줍니다. 
*/	      
//	  ArrayList배열메모리.iterator();    
	  Iterator  iterator  =    list.iterator();
	      
	 	 //ArrayList$Itr 배열 모습
	 	 //["하나",   2,   3.42,  "넷",  "다섯",  6]
	 	 //   0      1       2     3      4    5    index  		
//Iterator부모인터페이스를 구현한 자식 ArrayList$Itr(이터레이터배열)메모리는
//boolean hasNext()메소드와, E next()메소드를 제공하여
//이터레이터 배열에 객체가 저장되어 있는지 물어볼수도있고,
//이터레이터 배열에 저장된 객체를 차례대로 꺼내올수도 있다.
	  while( iterator.hasNext() ) {
		 System.out.println( iterator.next() );
	  }
	  	  
	  //Iterator인터페이스에서 제공되는 메소드 2개 
//	  boolean  hasNext() : 
//    -> ArrayList$Itr배열에 객체가 저장되어 있냐?물어보는메소드
//	  	 저장되어 있으면 true반환, 저장안되어 있으면 false반환 하는메소드	
//	  E next()
//    -> ArrayList$Itr배열에 저장된 객체들을 순서대로 꺼내와
//       반환받을떄 사용하는 메소드 
	  
	  
	  
	  
		
	}

}










