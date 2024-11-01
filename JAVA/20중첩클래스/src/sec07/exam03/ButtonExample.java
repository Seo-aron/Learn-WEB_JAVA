package sec07.exam03;



//버튼 설계도(클래스) 만들기
class Button{
	
	//정적 중첩 인터페이스 만들기
	//- 외부클래스에서 접근이 불가능하도록
	//  public 이면서 Button객체 생성없이 사용할수 있는 
	//  static 중첩 인터페이스로 만듬
	public static interface ClickListener{
		
		//클릭하는 기능의 의미를 지니고 있는 추상메소드
		void onClick();
	}
	
	//바깥 Button클래스의 멤버(인스턴스변수)만들기
		//  인터페이스자료형  참조변수선언;
	private ClickListener clickListener;	
						  //new OkListener(); 자식객체의 주소를 대입할수 있을것이다
						  //new CancelListener();    
			
	//바깥 Button클래스의 멤버(인스턴스메소드)만들기
	//기능 : 위 만들어 놓은 clickListener인스턴스변수값 변경
	public void setClickListener(ClickListener clickListener) {
											//new OkListener();
		 									//new CancelListener();
		this.clickListener = clickListener;
	}
	
	//Button이 클릭되었을때 실행할 메소드로 click()인스턴스메소드 만들기
	//실행내용
	// 위 private ClickListener인터페이스자료형   clickListener인스턴스변수에
	// 저장된 자식객체의 메소드오버라이딩한 onClick()메소드가 최종 실행!
	public void click() {
		this.clickListener.onClick();
	}
	
}


public class ButtonExample {
	
	//메소드 ~~~~~~~
	public static void main(String[] args) {
		
		//버튼 역할을 하는 클래스(설계도)의 객체 생성
		//-> Button클래스를 이용해 객체 생성
		Button btnOk = new Button();
		
		//클릭이벤트를 처리할 클래스 OkListener만들기
		//만드는 방법 : 
		//Button클래스 내부에 중첩 ClickListener인터페이스 내부의
		//추상메소드를 강제로 오버라이딩해서 로컬 중첩클래스 형태로 만듭니다
		class OkListener implements Button.ClickListener{
			
			//버튼을 클릭했을때 호출되는 메소드로
			//클릭 이벤트를 했을때 이벤트 처리코드를 작성하는곳
			@Override
			public void onClick() {
				//재구현
				System.out.println("Ok버튼을 클릭했으니 선물을 줄게요!");
			}
		}//---------- OkListener 로컬 중첩클래스  닫기 
		
		//버튼을 클릭할때마다 이벤트처리 메소드onClick을 오버라이딩 해놓은
		//OkListener중첩로컬클래스의 객체 생성 후 
		//Button객체의 private ClickListener clickListener;변수에
		//저장해 놓아야 클릭이벤트가 발생했을때 이벤트 처리할수 있다.
		btnOk.setClickListener(new OkListener());
		
		//Ok버튼을 클릭하는 행위(이벤트) 하기
		btnOk.click();
		
		//------------------------------------------------------
		

		//Cancel 역할을 하는 버튼 객체 생성
		Button btnCancel = new Button();
		
		//Cancel 버튼 클릭했을때 이벤트처리 코드가 작성된 오버라이딩된 Onclick메소드를 가지고 있는
		//CancelListener클래스 만들기
		//단! Button클래스 내부에 중첩인터페이스 ClickListenr의 추상메소드 Onclick을 강제로 오버라이딩 해야함
		class CancelListener  implements Button.ClickListener{

			@Override
			public void onClick() {
				//이벤트 처리 코드 작성
				System.out.println("Cancel 버튼을 클릭했으니 집으로 가겠다");
			}
			
		}//CancelListener 로컬 중첩 클래스 닫기 
	
		//Cancel역할을 하는 버튼객체의 setClickListener메소드 호출시 매개변수로 new CancelListener()객체를 전달해서
		//Button클래스 내부에 만들어놓은  private ClickListener clickListener; 변수에 저장 해야함
		btnCancel.setClickListener(new CancelListener());
		
		//Cancel역할을 하는 Button객체 클릭 이벤트 발생시키기
		btnCancel.click();
		
		
		
	}

}








