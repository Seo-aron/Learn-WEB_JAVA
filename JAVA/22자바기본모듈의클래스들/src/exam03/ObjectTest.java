package exam03;

//주제 : 최고 부모클래스 Object의 toString()메소드를 오버라이딩시킨
//		새로운 자식 Point클래스 만들어 사용

//Point클래스는 좌표값을 저장하는 용도록 사용합니다.
//좌표값을 저장하기 위한 인스턴스변수x, y가 만들어져 있습니다.
class Point extends Object {
	
	int x,y;
	
	public Point() {}//기본생성자

	//new Point(10,20);객체를 생성하는 동시에 x,y변수값 초기화할 생성자
	public Point(int x, int y) {
//		super();
		this.x = x;
		this.y = y;
	}
/*
  우리 눈에는 안보이지만 Object클래스의 toString()메소드가 상속되어 
  아래의 코드처럼 있어 Object클래스의 toString()메소드의 기능을 그대로 사용하게된다.
  그러나 ~~ 목적은 Point자식클래스의 기능에 맞게 toString()메소드를 오버라이딩해서
  사용해야 합니다. 
  	
	 public String toString() {
	        return getClass().getName() + "@" + Integer.toHexString(hashCode());
	 }
*/	
	//Point클래스의 객체를 생성하면 인스턴스변수x와y에 저장된 데이터를 
	//하나의 문자열로 만들어 반환하게  toString메소드 오버라이딩
	@Override
	public String toString() {
		//기능 재정의(재구현)
		return "(" + this.x + "," + this.y + ")";
	}
	
}

public class ObjectTest {
	public static void main(String[] args) {
		
		Point pt = new Point();
							//메소드오버라이딩 했을 경우 toString메소드 호출하면
							//아래와 같이 반환 받아 출력함
		System.out.println( pt.toString() ); //"(0,0)"
		
							// x, y
		Point pt2 = new Point(10, 20);
		
		//메소드오버라이딩 했을 경우 toString메소드 호출하면
		//아래와 같이 반환 받아 출력함
		System.out.println( pt2.toString() ); //"(10,20)"
		
		//참조변수 p2만 기술하면 toString메소드호출구문을 자동으로 호출한 것이기때문에
		//toString()호출 구문은 생략 가능하다.
		System.out.println( pt2 ); //"(10,20)"

		/*
		 결론
		 	Point와 같이 프로그래머가 새롭게 설계한 자식클래스에서 
		 	toString메소드가 호출되었을때
		 	그 클래스에 맞는 정보를 출력되기 바란다면? 
		 	Point클래스에서 toString메소드를 오버라이딩하여
		 	필요한 내용을 기술 해야 합니다.
		 */
		

	}

}










