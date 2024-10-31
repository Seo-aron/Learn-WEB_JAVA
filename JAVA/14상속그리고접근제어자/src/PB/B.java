


package PB; //현재 PB패키지에 class B가 만들어져 있다라고
			//자바컴파일러 프로그램에게 알려주는 패키지 선언문 


//다른 PA외부패키지에 만들어져 있는 Aclass를 현재 PB패키지의 B클래스에서 사용하기위해
//import구문을 작성해서 자바컴파일러 에게 알려줘야 한다

//import 외부패키지명.사용할클래스명;
  import PA.A;

//PA다른패키지에 만들어져 있는 부모역할을 하는 A부모클래스를 상속받아
//새롭게 만드는 자식 B클래스 만들기 
public class B  extends A   {

	//default접근제어자 이용해 B클래스의 메소드 선언
	void set() {
	//다른 PA패키지의 부모A객체메모리에 만들어 놓은
	//i인스턴스변수는 default접근제어자를 이용해 만들어 놓았기 떄문에
	//자식객체 메모리 내부에서 접근 불가능
		//super.i = 1;
		
	//다른 PA패키지의 부모A객체메모리에 
    //protected int pro변수에 접근가능
		super.pro = 2;
		
	//다른 PA패키지의 부모A객체 메모리에
	//private int pri변수에 접근 불가능
		//super.pri = 3;
		
	//다른 PA패키지의 부모A객체 메모리에 
	//public int pub변수에 접근 가능
		super.pub = 4;
	}
	

	public static void main(String[] args) {
		//자식B클래스를 이용해 B객체 메모리 생성 코드 작성
		B b = new B();
		//B자식 객체 메모리 생성 구문 new B()를 작성하면
		//자식 B클래스의 생성자 B가 먼저 호출되고 
		//B의 부모인 A클래스의 생성자가 바인딩되어 호출됩니다.
		//그런후 부모A클래스의 생성자가 실행되어 부모 A객체메모리가 먼저 생성되고
		//나중에 자식B클래스의 생성자B()가 실행되어 자식 B객체 메모리가 생성됩니다.
		/*
			A부모객체 메모리 내부 모습
			
						int i; //default
			protected 	int pro;
			private		int pri;
			public 		int pub;
			
			public A(){}  <---기본생성자 
			
			
			public void print() {
				System.out.print("i=" + this.i + "," );
				System.out.print("pro=" + this.pro + ",");
				System.out.print("pri=" + this.pri + ",");
				System.out.println("pub=" + this.pub + "입니다.");
			}
		   ---------------------------------------------------------	   
		        B자식객체 메모리 내부 모습
		   
		   		public B(){}   <---기본생성자 
		   
		        void set(){
		        	super.pro = 2;
		        	super.pub = 4;
		        }
		
		   ----------------------------------------------------------	
		*/
		b.set();
		b.print(); //i=0,pro=2,pri=0,pub=4입니다.
		
		

	}

}









