package StringTest;
/*
	String 클래스
	- java.lang패키지에 만들어져 있는 클래스
	- 특정문자열을 저장할 용도로 사용되는 클래스
	- 특정문자열을 한번 저장해 놓으면 문자열이 변경되지 않음을 보장하는 클래스
	
	String클래스의 객체 생성 방법 3가지
	
	 방법1. 문자열 리터럴 상수를 직접 변수에 저장해서 객체를 생성하는 방법
	       예)  String 변수선언 = "리터럴 상수 문자열";
	 
	 방법2. new 연산자와 함께 생성자를 호출해서 객체를 생성하는 방법
	 	   예)  String 변수선언 = new String("특정문자열");
	 	   
	 방법3. new 연산자와 함께 문자들이 저장된 문자배열을 
	 	   생성자 호출시 매개변수로 전달받아 하나로 합친 문자열을 저장해서 객체를 생성하는 방법
	 	   예) String 변수선언 = new String( {'1','2',3'}  );
	 
*/

public class Ex1 {
	public static void main(String[] args) {
		//String 클래스의 객체 생성 방법 3가지 중에서 방법1
		String s1 = "JAVA";
		
		//String 클래스의 객체 생성 방법 3가지 중에서 방법2
		String s2 = new String("programming");
		
		//String 클래스의 객체 생성 방법 3가지 중에서 방법3
		
		//1.문자들이 저장된 문자배열 생성
		char[] charArr = {'S','t','r','i','n','g'};
					    // 0   1   2   3   4   5
		//2.String클래스의 객체 생성 시 charArr배열을 생성자로 전달해 저장
		String s3 = new String(charArr);
							 // "String"
		
		//String객체 메모리내부에 저장된 각각의 문자열을 반환해서 출력할때
		//String클래스에서 제공해주는 toString()메소드 호출
		System.out.println("s1참조변수가 사용하는 String객체 메모리 내부의 "
				            + "문자열 : " + s1.toString());
		
		System.out.println("s2참조변수가 사용하는 String객체 메모리 내부의 "
	            			+ "문자열 : " + s2.toString());

		System.out.println("s3참조변수가 사용하는 String객체 메모리 내부의 "
    						+ "문자열 : " + s3);
		
		//결론 : 개발자 취향에 따라 char배열로 String객체를 생성해서 문자열로 저장시키거나
		//      리터럴상수 또는 문자열을 생성자로 넣어서 저장시켜 사용하면 됨 
		
		//-------------------------------------------------------------
		
		//String 클래스로 객체 생성 방법1, 방법2의 차이점
		//-> 객체 메모리 할당의 차이점
		
		//방법1. 리터럴 상수 문자열을 String 클래스의 변수에 대입하는 방법으로
		//      String객체 메모리 생성 
		
		//같은 문자열 리터럴 상수를 각 참조변수에 저장하여 String객체 메모리를 만들면
		//"JSP"문자열을 저장할 String객체 메모리는 단한번만 만들어지고
		//두 참조변수 str3과 str4는 한번생성된 String객체 메모리 하나를 참조하여 사용하게됩니다
		String str3 = "JSP";
		String str4 = "JSP";
		
		/*
		  그림 
		  	   str3			 String객체 메모리 주소번지 0x1
		  	   [ 0x1  ]  =  [    "JSP"     ]
			
			   str4
			   [  0x1 ]   
			
		*/
		//위 str3참조변수,str4참조변수에 저장된 String객체 메모리 주소가 같은지 비교
		//== 비교연산자 사용
		if(str3 ==  str4) {
			System.out.println("서로 같은 문자열JSP가 저장된 단하나의 String객체 메모리임");
		}else {
			System.out.println("서로 다른 String객체 메모리에 각각 JSP문자열이 저장됨");
		}
		
		System.out.println("--------------------------------");
		
		//방법2. new연산자와 함께 String클래스의 생성자를 호출해서 
		//      문자열을 저장시키는 객체 생성방법
		
		//각각의 개별적 String객체 메모리가 생성되어 각각 "Java"문자열이 저장됨
		
		String str1 = new String("Java");
		String str2 = new String("Java");
		
		/*
			  str1참조변수 = String객체 메모리 주소번지 0x2
			  [  ox2   ] =  [   "Java"   ]
		
				
 			  str2참조변수 = String객체 메모리 주소번지 0x3
			  [  ox3   ] =  [   "Java"   ]
			
		*/
		if(str1 == str2) {//주소번지가 같으냐?
			System.out.println("서로 같은 문자열을 저장할 String객체 메모리임");
		}else {
			System.out.println("서로 같은 문자열이 저장되었지만 "
					          + "각각 String객체 메모리이므로 "
					          + "서로 다른 String객체 메모리임");
			
		}
		
		System.out.println("-----------------------------------");
		
		//String 클래스에 만들어져 있는 메소드들
		//(String 객체 메모리 내부에 존재하는 문자열을 조작할수 있는 메소드들)
		
		String str5 = "JAVA_Study";
			  //index  0123456789   
		
		//length메소드 : String객체 메모리에 저장된 전체문자열의 문자 총갯수 반환
		System.out.println(  str5.length()    ); //10
		
		//charAt(index)메소드 : 
		//String객체 메모리에 저장된 전체 문자열의 특정 문자의 index를 이용해
		//그문자를 얻어올수 있게(반환하는) 메소드 
		System.out.println(   str5.charAt(9)  );//  y
		
		
	}

}








