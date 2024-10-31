

//주제 : 업캐스팅을 하는 이유  응용1

//부모클래스
//알파벳 
class Alphabet{
	
//	Alphabet클래스자료형의 인스턴스변수 선언
//	Alphabet alphabet;
//		
//	//생성자
//	public Alphabet(Alphabet alphabet) {//업캐스팅
//										 //new A1();
//										 //new B1();
//										 //new C1();
//		this.alphabet = alphabet;	
//	}
	
	
	//Alphabet부모클래스의 모든 자식객체의 주소를 하나의 매개변수로 모두 전달받아
	//처리하는 printAlphabet메소드 하나만 선언
//	public static void printAlphabet(부모클래스자료형  참조변수) {//업캐스팅
	public static void printAlphabet(Alphabet  alphabet) {//업캐스팅
														 //new A1();
														 //new B1();
														 //new C1();
		alphabet.display();//다형성으로 자식클래스의 오버라이딩된 메소드가 최종 실행됨
//		new A1().display();
//		I am class A1
		
//		new B1().display();
//		I am class B1
		
//		new C1().display();
//		I am class C1			
	}
	
	
	
/*	
안좋은 방법

	//A객체 메모리 주소하나를 매개변수 a로 받아서 처리하는 메소드 
	public static void printA(A1  a) { //new A1()
		       a.display();
//		new A1().display(); 
//매개변수로전달받은 new A1()객체의 오버라이딩된 메소드가 실행됨		       
	}
	//B객체 메모리 주소하나를 매개변수 b로 받아서 처리하는 메소드 
	public static void printB(B1  b) {//new B1()
		
		 b.display();
//new B1().display(); 
//매개변수로전달받은 new B1()객체의 오버라이딩된 메소드가 실행됨		       
		 
	}
	//C객체 메모리 주소하나를 매개변수 c로 받아서 처리하는 메소드 
	public static void printC(C1  c) { //C1 c1 = new C1();
		c.display();
//new C1().display();  메소드오버라이딩된 메소드가 최종 실행됨 
		
	}
*/	
	//부모클래스에서 만든 메소드 
	public void display() {
		System.out.println("I am the parent class: Alphabet");
	}

	
	
	
	
}
//자식클래스1
class A1 extends Alphabet{
	//display메소드 오버라이딩
	@Override
	public void display() {
		System.out.println("I am class A1");
	}
}
//자식클래스2
class B1 extends Alphabet{
	//display메소드 오버라이딩
	@Override
	public void display() {
		System.out.println("I am class B1");
	}
}

//자식클래스3
class C1 extends Alphabet{
	//display메소드 오버라이딩
	@Override
	public void display() {
		System.out.println("I am class C1");
	}
}

public class Test {
	public static void main(String[] args) {
		//Alphabet부모클래스의  자식A1,B1,C1 클래스들의 객체 생성 

//가독성있는 코드
		Alphabet alphabet = new A1(); //업캐스팅				 
		Alphabet.printAlphabet(alphabet);
		
				 alphabet = new B1(); //업캐스팅				 
	    Alphabet.printAlphabet(alphabet);
	    
				 alphabet = new C1(); //업캐스팅			 
		Alphabet.printAlphabet(alphabet);
		
		
//좋지 않은 코드 예 -  주석처리함 
				 
		//부모 Alphabet클래스에 작성된 static으로 만들어진 정적메소드 호출
//		Alphabet.printA(new A1());
//		Alphabet.printB(new B1());
		
//		C1 c1 = new C1();
//		Alphabet.printC(c1);
		
		
		
		

	}

}







