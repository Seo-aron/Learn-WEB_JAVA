import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Ex3 {

	public static void main(String[] args) {

		//1. 중간연산 
		//   filter(Prdeicate<T> predicate) 추상 메소드
		//   - 스트림의 각 요소에 대해 주어진 조건을 평가하며,
		//     Prdeicate함수형 인터페이스를 사용합니다
		//     Prdeicate는 boolean값을 반환하는 함수로써,
		//     이조건에 맞는 요소들만 다음 연산으로 넘김니다.
		
		//   - filter메소드는 여러번 체이닝기법으로 호출할수 있어,
		//     복잡한 조건을 단계적으로 나눠서 적용할수도 있습니다
		
//		List<Integer> numbers   =  Arrays.asList(1, 2, 3, 4, 5, 6);
		
//	    List<Integer> newNubmers = numbers.stream()
								  	      //스트림의 모든 요소에 대해 2보다 큰지 확인하고
								  		  //조건을 만족하지 않는 요소들은 제외한 스트림통로 반환
//								         .filter(n -> n > 2) //3, 4, 5, 6 
								         
//								         //2의 배수만 스트림통로에 남기고 스트림 통로 반환
//								         .filter(n -> n % 2 == 0) // 4, 6
					/*
						collect(Collerctor<T,A,R> collector)
						- 메소드는 스트림의 결과를 리스트(list), 셋(Set) 또는 다른 컬렉션배열에
						  수집해서 반환해줍니다.		         
					*/
//								         .collect(Collectors.toList());
		
//	    System.out.println(newNubmers); //[4, 6]   
		  
	/*							         
		2. 중간연산 
		    
		    map(Function<T,R> mapper)  메소드
		    
		    - 이 메소드는 스트림의 각 객체(요소)를 변환할때 사용됩니다.
		      주어진 함수에따라 각 요소를 변환하며, 다른형식으로 변환할수도 있습니다
		      Function<T,R>은 입력 타입과 출력타입이 다른 함수형 인터페이스 입니다
								        					         
	*/							        
	//	  List<String> names = Arrays.asList("Alice","Bob","Chrlie");						         
							// {  "Alice","Bob","Chrlie" }
						
		 //각 문자열의 길이를 계산하여 새로운 리스트로 반환						         
	//    List<Integer> nameLengths	= names.stream()
	//							      .map(String::length)//각 문자열의 길이 얻음 
	//							      .collect(Collectors.toList());//결과를 리스트에 담아 반환
					        
		 //결과 출력
	//   System.out.println(nameLengths); //[5, 3, 6]
	     
		
	/*	
		collect메소드
		- 스트림의 요소들을 특정 형식으로 수집하여, 결과를 새로운 컬렉션으로 반환함
		  즉, 스트림을 처리한 후 최종결과를 얻기 위해서 사용합니다.
		- collect메소드는 스트림의 종료연산을 수행하기 위한 종류중 하나의 메소드이다
		  
		Collectors클래스의 toList()
		  
		  1. Collectors클래스는 여러가지 형태로 데이터를 수집하기위한 유틸리티 클래스로
		     다양한 컬렉션으로 데이터를 수집할수 있는 메소드를 제공합니다
		  
		  2. toList()메소드는 스트림의 모든 요소를 ArrayList같은 리스트형태로 수집합니다
		     모든 데이터들을 List부모인터페이스 타입으로 변환해 ArrayList배열을 반환 해 줍니다.
		        	
	*/	
		
		            
					        
	}

}












