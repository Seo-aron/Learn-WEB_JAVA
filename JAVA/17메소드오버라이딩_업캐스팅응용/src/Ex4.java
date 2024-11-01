
/*
 	결론
 	   메소드 오버라이딩시~~~
 	   상속되지 않고 은닉된 부모클래스의 메소드와 같이
 	   부모클래스에 정의된 변수와 같은이름을 가진 변수를 자식클래스에서 선언하는데
 	   이러한 경우에도 부모클래스의 변수는 자식클래스에서 사용할수 없게 된다.
 
 예제. 부모클래스의 변수를 상속받아 사용하는 예
 */

class Point2D{//부모클래스 
	protected int x = 10;
	protected int y = 20;
}

class Point3D extends Point2D{//자식클래스 
	//부모클래스의 변수명과 같은 변수명으로 자식클래스에 변수를 만들어 놓으면
	//부모클래스의 변수들은 자식클래스에 상속되지 않고 은닉 보호되어 사용할수 없게 된다
	protected int x = 40;
	protected int y = 50;
	
	protected int z = 30;
	
	//메소드
	public void print() {
		//x,y,z변수의 값을 불러와 출력
//참고. 부모클래스의 변수명과 자식클래스의 변수명이 같을때 아래와 같이 다르게 출력하자
						    //40,          50,            30
//		System.out.println(this.x + "," + this.y + "," + this.z);
							 	  //10,             20,   30
		System.out.println(super.x + "," + super.y + "," + z);
	}		
}

public class Ex4 {
	public static void main(String[] args) {
		
		Point3D point3d = new Point3D();
				point3d.print(); //40,50,30
								 // x,y,z
				//출력된 이유 : 
				//Point3D자식클래스내부에 x,y변수를 추가로 작성한 후
				//똑같은 이름의 x,y변수가 Point2D부모클래스에도 있으므로
				//상속받지 않았으므로 Point3D자식의 x,y변수값 40,50이 출력된 것임
				
		

	}

}













