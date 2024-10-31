
//주제 : 두 클래스의 상속 관계에서의 
//      private접근제어자를 지정한 변수 또는 메소드 사용실습

/* default */class A{ //기존에 만들어 놓은 부모클래스 역할을함
	
	public int p; //만든 p변수값은 어디서든지 접근 허용해서 사용할수 있음
	
	private int n;//만든 n변수값은 class A 내부에서만 접근 해서 사용할수 있음
	
	//public 접근제어자를 이용해 만든 메소드는
	//어디서든지 접근을 허용하므로 어디서든지 메소드 호출가능
	public void setN(int n) {
		this.n = n;
	}
	public int getN() {
		return this.n;
	}	
}

//A클래스의 변수+메소드를 상속받아 새롭게 만드는 자식B클래스 만들기
class B extends A{
	
	//private 으로 만든 m변수값은 B클래스 내부에서만 접근 가능
	private int m;
	
	//public으로 만든 getM메소드는 외부 패키지의 클래스나 현재 클래에서 접근 가능
	public int getM() {
		return this.m;
	}
	public void setM(int m) {
		this.m = m;
	}
	public String toString() {
		return "n="+  super.getN() + " m=" + this.getM();
	}
	
}

public class Ex3 {
	public static void main(String[] args) {
		
		//자식역할을 하는 B클래스의 객체 생성
		B b = new B();
		  b.p = 5;
//		  b.n = 5;  B객체 메모리는 클래스단위에서 상속받아 접근하는
//				    n변수는 private으로 선언되어 있기떄문에
//                  다른 Ex3외부 클래스에서 접근 불가능 
//				    자바의 특징중 하나의 캡슐화 되어 있다고 할수있음 
		  b.setN(10); //public 메소드 접근 가능하니 호출할수 있음 
		  
//		  b.m = 20; //m변수는 private으로 다른 Ex3외부 클래스에서 접근 불가능
		  
		  b.setM(20);//m변수는 private이어 접근할수 없으므로
		  			 //대신 public으로 만들어 놓은 setM메소드호출해서
		  			 //m변수에 20을 저장 
		  
		  //public으로 만들어진 toString()메소드는 외부 Ex3클래스에서
		  //호출이 가능함.  반환받은 문자열을 이자리에서 출력!
		  //"n=10 m=20"
		  System.out.println( b.toString() );
		  
		/*
		생성된 A객체 메모리 그림		
			----------------------			
			  public int p; [ 5 ]
			  
			  private int n; [ 10 ]
		
			  public void setN(int n){}
			  
			  public int getN(){}		  
		   ---------------------------
		   		   
		생성된 B객체 메모리 그림
			----------------------------
			   private int m;  [ 0  ]
			   
			   public void setM(int m){}
			   
			   public int getM(){}
			   
			   public String toString(){}
			----------------------------
		   
		*/
		
		
		
		
		
		
		//부모역할을 하는 A클래스의 객체 생성
		A a = new A();
		 
		  a.p = 5;
	   // a.n = 5; // A객체 메모리의 n인스턴스 변수는 private으로 선언되어 있으므로
		  		   // 다른 Ex3클래스 내부에서 접근 불가능하므로 사용할수 없다
		  		
		/*
		생성된 A객체 메모리 그림		
			----------------------			
			  public int p; [ 5 ]
			  
			  private int n; [ 0 ]
		
			  public void setN(int n){}
			  
			  public int getN(){}		  
		   ---------------------------
		*/
		

	}

}










