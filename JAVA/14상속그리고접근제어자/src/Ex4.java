

//주제 : 부모 클래스와 자식클래스가 같은 패키지에 만들어져 있는경우
//      접근제어자들을 사용한 멤버의 접근 범위

class AA{ //기존에 만들어져 있는 부모 클래스 역할
	//default(디폴트)접근제어자
	//- 부모클래스의 변수가 default접근제어자로 작성한 변수이면
	//	자식클래스 내부든 다른일반클래스 내부든 같은패키지 내부에서는 모두 접근가능
	             int i;
	//Protected(프로텍티드)접근제어자 
	//1. 같은 패키지에 만들어져 있는 다른 클래스에서 
	//   Protected로 만든 변수에 접근가능
	//2. 다른 패키지의 일반클래스에서는 접근 불가능
	//   단! 다른 패키지에 만들어 놓은 AA의 자식클래스 내부에서는? 접근가능
	protected   int pro;
	
	//public(퍼블릭)접근제어자
	//다른 패키지 또는 같은 패키지에 만들어 놓은 모든 클래스에서 접근을 허용
	public int pub;
	
//private(프라이빗)접근제어자
//1. 같은 클래스 내부에 private으로 변수를 만들어 놓으면
//   같은 클래스 내부에서만 변수에 접근을 허용
//2. 인스턴스변수를 선언할때 대부분의 개발자들은 private접근제어자를 많이 사용함
//3. public 메소드 또는 생성자를 통해 private으로 선언한 변수값을 사용하거나 변경함
	private int pri;
	
	//public getter메소드 (변수에 저장된 값 반환(얻기))
	public int getPri() {
		return this.pri;
	}
	//public setter메소드 (변수값 변경)
	public void setPri(int pri) {
		this.pri = pri;
	}	
}//------------------------------------------------------



//부모 AA를 상속받아 새롭게 설계하는 자식역할의 BB클래스 만들기
class BB extends AA{
	
	//default접근제어자를 이용하여 set이름의 인스턴스 메소드 만들기
	  void set() {
		  //부모객체 메모리 주소를 기억하고 있는 예약어 super
		  super.i = 1;//i변수는 default접근제어자로 만든 변수이기떄문에
		  			  //같은 패키지 내부의 다른 클래스에서 객체의 변수에 접근가능
		  
		  //같은 패키지에 다른 클래스내부에 protected접근제어자로 만들어놓은
		  //부모객체메모리의 pro인스턴스변수에 접근 가능
		  super.pro = 2;
		  
		  //같은 패키지에 private접근제어자로 만들어 놓은 부모객체의 pri변수에 접근 불가능
		  //같은 패키지 일지라도 같은 부모객체 메모리에서만 접근 가능 
		  //super.pri = 3;//컴파일 에러 발생 
		  
		  //public접근제어자로 만들어 놓은 부모객체에 있는 setPri메소드를 호출해서
		  //3을 매개변수로 전달하면 private int pri인스턴스변수의 값을 3으로 변경가능
		  super.setPri(3);
		
		  //public접근제어자로 만들어 놓은 부모객체 메모리에 있는
		  //pub인스턴스변수에 접근 가능
		  super.pub = 4;		
		  
	  }//BB객체의 set인스턴스메소드 
	  
	  //BB클래스의 get인스턴스메소드 
	  //BB객체의 get인스턴스메소드 
	  public String get() {
		  return super.i + ", "+
				 super.pro + ", " +
				 super.pub + ", " +
				 super.getPri();  //"1, 2, 4, 3"
	  }	
}

public class Ex4 {
	public static void main(String[] args) {
		
		//BB자식클래스의 객체 생성
		BB bb = new BB();
		   bb.set();
		System.out.println(bb.get());   //1, 2, 4, 3
			   
		/*
						  0x12  AA부모 객체
				---------------------
				   int i; [ 1 ]
				   protected int pro; [ 2 ]
				   public int pub;  [4 ]
				   private int pri; [3 ]
				   //getter
				   public int getPri(){}
				   //setter
				   public void setPri(int pri){}
				   
				----------0x13  BB자식 객체---------
				      void set(){ }
					  String get(){ }			
				-------------------------------
		*/
	}

}










