
//주제 : 부모클래스 A와 자식클래스B가 다른 패키지에 각각 만들어져 있는 경우
//		접근제어자의 접근 허용범위가 어떻게 되는지 알아보자.

package PA;


public class A {//PA패키지 내부에 만들어진 A부모클래스
	
				int i; //default
	protected 	int pro; // 상속관계에 있는 다른 패키지의 자식클래스에서 접근 허용
						 // 다른 패키지의 일반다른클래스에서 접근 불가능 
	private		int pri;
	public 		int pub;
	
	public void print() {
		System.out.print("i=" + this.i + "," );
		System.out.print("pro=" + this.pro + ",");
		System.out.print("pri=" + this.pri + ",");
		System.out.println("pub=" + this.pub + "입니다.");
	}
			        
	//다른 PB패키지에 만들어 놓은 B자식객체에서 부모A객체의 인스턴스변수값 사용해보자 

	
}






