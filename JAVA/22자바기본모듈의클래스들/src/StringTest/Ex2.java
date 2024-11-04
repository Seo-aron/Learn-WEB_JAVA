package StringTest;

public class Ex2 {

	public static void main(String[] args) {
		
		//String 클래스에서 제공해주는 equals메소드, subString메소드
		
		//public boolean equals(Object o)메소드
		//-> 두 String객체 메모리 내부에 저장된 문자열이 같으냐?라고 물어볼때 사용하는 메소드
		//	 같으면 true반환, 틀리면 false를 반환 하는 메소드 
		
		System.out.println("다른 문자열 비교하기");
		
		String str1 = new String("Coffee");
		String str2 = new String("House");
		
		//str1참조변수에 저장된 String객체 메모리 내부의 "Coffee"문자열이!~~~~
		//str2참조변수에 저장된 String객체 메모리 내부의 "House"문자열과 같으냐?
		if( str1.equals(str2)  ) {
			System.out.println("두 문자열은 같은 문자열이다."); //출력되지않음
		}else {
			System.out.println("두 문자열은 다른 문자열이다."); //출력됨
		}
		
		System.out.println("String객체에 저장된 같은 문자열 비교");
		
		String str3 = new String("House");
		
//str2참조변수가 사용하고 있는 String문자열객체 내부의 "House"가
//str3참조변수가 사용하고 있는 String문자열객체 내부에 저장된 "House"와 같으냐?
		if(str2.equals(str3)) {
			System.out.println("두 문자열은 같다.");  //출력됨
		}else {
			System.out.println("두 문자열은 다르다."); //출력 안됨
		}
		
		String str4 = "저장할문자열1";
		String str5 = "저장할문자열2";
		
		//str4참조변수에 저장된 String객체 메모리 내부의 "저장할문자열1"이
		//str5참조변수에 저장된 String객체 메모리 내부의 "저장할문자열2"와 다르냐?
		if(!(str4.equals(str5))) {
			System.out.println("다르다"); //출력됨
		}else {
			System.out.println("같다"); //출력 안됨 
		}

		//String객체 내부의 "저장할문자열1"문자열이
		//String객체 내부의 "저장할문자열2"문자열과 같으냐?
		if("저장할문자열1".equals("저장할문자열2")) {
			System.out.println("같다"); //출력 안됨
		}else {
			System.out.println("다르다");//출력됨
		}
		
		System.out.println("--------------------------------");
		
		
		/*
			subString메소드
			- String객체 내부에 저장된 전체 문자열 중에서
			  특정 index위치 사이에 있는 문자열을 잘라서 자른 문자열을 반환하는 메소드
			  
			 [메소드 오버로딩되어 만들어져 있는 subString메소드 2가지]
			  
			  String subString(int index,  int index2)
			  -> 첫번째 index매개변수로 전달한 index위치의 문자부터
			     두번째 index2매개변수로 전달한 index위치 이전 index위치의
			     문자열까지를 잘라서 문자열객체에 담아 문자열객체 자체를 반환합니다.
			     
			  String subString(int index)
			  -> 매개변수 index로 전달한 index위치에있는 문자부터~~~
			     끝 문자까지를 모두 잘라서 문자열객체에 담아 문자열객체 자체를 반환합니다	        
		*/
System.out.println("전체 문자열에서 특정 inddex위치에 있는 문자열 잘라서 얻기");
		
		String a = new String("AndroidJSPJAVA");
						  //   0123456789   13    index
		
		//문자열 잘라서 저장할 변수들
		String temp1, temp2;
		
		//"AndroidJSPJAVA" 전체 문자열 중에서
		// 7 index위치의 문자 J부터 시작해서  9 index위치의 P문자까지를 잘라서
		// 문자열 객체에 저장한 뒤 문자열객체 반환
		temp2 = a.substring(7, 10);
//		temp2 = "JSP";
		
		//toString메소드를 호출해서 temp2참조변수에 저장된 문자열객체 내부의
		//"JSP"문자열을 반환받아 출력
		System.out.println(temp2.toString()); //"JSP"
//		
//		String a = new String("AndroidJSPJAVA");
//		  				  //   0123456789   13    index		

		//"AndroidJSPJAVA" 전체 문자열 중에서
		// 7 index위치에 있는 문자 J 부터 끝 index위치에 있는 A문자까지 
		// 전체를 잘라서 새로운 문자열객체에 저장한 후 반환
		temp1 = a.substring(7);
//		temp1 = "JSPJAVA";
		
		//새로운 문자열객체메모리 내부에 저장된 "JSPJAVA"문자열을 꺼내서 출력
		System.out.println(temp1.toString());
						  //"JSPJAVA"
		
		System.out.println("---------------------------------");
		
		/*
		  String 클래스에서 제공해주는 trim(),  concat() 메소드
		  
		  
		  trim()메소드
		  - 전체 문자열 중에서 양쪽 앞뒤 공백이 있으면
		    모두 없앤 후 없앤 새로운 문자열을 새로운 문자열객체에 담아 반환해주는 메소드 
		
			public String trim(){} 만들어져 있음
		*/
		System.out.println("전체 문자열의 양쪽 공백을 제거한 문자열 얻기");
		
		String b = new String("    JA   VA    ");
		
		//"    JA   VA    " 전체 문자열 중에서 양쪽 앞뒤 공백을 제거한후
		//제거된 새로운 문자열객체를 반환합니다.
		String temp3 = b.trim();
			//"JA   VA"
		
		System.out.println("temp3변수 :" + temp3);//"JA   VA"
		
		/*
			String concat(String s)메소드 
			-  기준이 되는 문자열과 매개변수 s로 전달되는 문자열을 하나로 연결해
			   합친 새로운 문자열 객체를 반환
		*/
		System.out.println("concat메소드 호출하여 두 문자열을 하나로 합쳐 얻기");
		
		String c = "JAVA";
		String d = new String("PG");
		
		String temp4,temp5;
		
//"JAVA"문자열 객체의 concat메소드 호출시! 매개변수로 "PG"문자열객체를 전달하면
//두 문자열을 하나로 합친 "JAVAPG"새로운 문자열 객체를 반환		
		temp4 		  = c.concat(d);
//		"JAVAPG"	  = "JAVA".concat("PG"); 
		
	System.out.println("temp4변수 : " + temp4.toString());//"JAVAPG"
		
//c참조변수가 사용하고 있는 String객체메모리 내부에 저장된? "JAVA"문자열을
// + 연산자를 사용해서  d참조변수가 사용하고 있는 String객체 메모리내부에 저장된?
// "PG"문자열과 합친 하나의 새로운 문자열"JAVAPG"을 만들어서
// 새로운 String객체 메모리에 담아 String객체자체를 반환해 temp5변수에 저장
		temp5 = c      +  d;
//		        "JAVA" + "PG"
//      "JAVAPG"	
	
	System.out.println("temp5변수 : " + temp5.toString());//"JAVAPG"
	
	System.out.println("-------------------------------");	
	/*
	  String 클래스에서 제공해주는 contains메소드, replace메소드
	  
	  1.  public boolean contains(CharSequence  s)
	      
	      - 전체 문자열 중에서 매개변수s로 전달 하는 문자열이 있으면?
	        true반환, 없으면 false 반환 하는 메소드 
	*/
	String e = new String("필요없는문자열해당문자열필요없는문자열");
	               //String객체 메모리 내부에 저장된 전체문자열중에서
				   //"해당문자열" 문자열이 포함되어 있는지 검사를 위해
				   //아래의 메소드 호출시 "해당문자열" 문자열을 매개변수로 전달하면
				   //아래의 메소드는 포함되어 있으면 true반환 없으면 false반환
	boolean result= e.contains("해당문자열");
	System.out.println("해당문자열은 포함?" + result);//true
	
		//"필요없는문자열해당문자열필요없는문자열"  전체 문자열 중에서
	    //"문자열" <- 문자열이 포함되어 있는지? 물어보자
	    	result= e.contains("문자열");
	System.out.println("문자열은 포함?" + result);//true  
	
		//"JAVA <- 문자열이 포함되어 있는지? 물어보자
			result= e.contains("JAVA");
	System.out.println("JAVA 포함?" + result);//false	
/*
결론 : 매개변수로 CharSequence클래스인데 사용법은 String처럼 사용하면됨.
	  -> 아무리 긴문자열에도 우리가 원하는 문자열 단어가 있는지 없는지 찾을수 있다.
*/
	//------------------------------------------------------------
	/*
	 2. public String replace메소드 
	    -> 전체문자열에서 원하는 문자열을 찾아 치환한 후 
	       치환된 전체 문자열을 반환해주는 메소드 
	    -> 메소드 오버로딩 되어 있다
	    
	       public String replace(char oldChar, char newChar)
			-> 문자 단위로 치환 후 수정된 전체문자열을 반환
			
		   public String replace(charSequence target, charSequence replacement)
		   ->  문자열 단위로 치환 후 수정된 전체문자열을 반환 	
	*/
		String f = new String("JAVAJSPC");
		
		//"JAVAJSPC" 전체 문자열 중에서 'C'문자를 '!'문자로 치환(변경)한 후
		//변경된 전체 문자열 "JAVAJSP!"을 반환합니다.
		String result2  =  f.replace('C', '!');
														//"JAVAJSP!"
		System.out.println("문자 단위로 변경한 전체문자열=>" + result2);
	
		//"JAVAJSPC" 전체 문자열 중에서 "JSPC"문자열 부분을
		//"PROGRAMMING"문자열로 치환(변경)한 후
		//변경된 전체문자열 "JAVAPROGRAMMING"을 만들어 반환후 result2에 다시저장
		     	result2	= f.replace("JSPC", "PROGRAMMING");
		     										//"JAVAPROGRAMMING"
		System.out.println("문자열 단위로 변경한 전체문자열=>" + result2);
		
		System.out.println("----------------------------------");
		
		/*
			String클래스에서 제공해주는 toLowerCase메소드, toUpperCase메소드,
								   valueOf메소드
								   
			1. public String toLowerCase()
				-> 전체문자열을 각문자들을 모두 소문자로 변경한 후 
				   변경된 전체문자열을 반환 하는 메소드 
		*/
		String lowedStr = "Hello World".toLowerCase();
//					  	  "hello world" 모든 문자를 소문자로 변경후 반환
		System.out.println(lowedStr);
		
		/*
		  2. public String toUpperCase()
		   -> 전체 문자열에서 각문자들을 모두 대문자로 변경한 후 
		      변경된 전체문자열을 반환 하는 메소드 
		*/
										//"HELLO WORLD"
	    System.out.println( "hello world".toUpperCase()  );
	    /*
	     3. public static String valueOf(int num)
	    	-> 매개변수 num으로 숫자 하나를 집어 넣으면
	    	   그 숫자를 문자열로 변경한 후  변경된 문자열 자체를 반환
	    */
	    int num = 10;
	    
	    	//숫자10을 문자열"10"으로 변경해서 반환 받으려면?
	    	//valueOf메소드 호출!
	    String str4_  = String.valueOf(num); //-> "10"
	    System.out.println(str4_);//"10"
	    
	    
	
	}

}
















