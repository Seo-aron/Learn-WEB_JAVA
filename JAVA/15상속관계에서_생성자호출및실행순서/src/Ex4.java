

//예제. 조합3. 상속관계에서 자식객체생성시 매개변수가있는 자식의 생성자 호출하면
//			 부모클래스의 기본생성자가 super()에 의해 자동으로 호출됨

//            자식클래스의 매개변수_생성자(10); ->  부모클래스의 기본생성자(); 호출됨

class F {//부모클래스 역할	
	public F() {
		System.out.println("기본생성자 F");
	}
	public F(int x) {
		System.out.println("F부모의 매개변수가 하나인 생성자 F");
	}
}

class G extends F{//자식클래스 역할
	public G() {
		System.out.println("기본생성자 G");
	}
	public G(int x) {
		//super(); //생략되어 호출되는 것임 
		System.out.println("G자식의 매개변수가 하나인 생성자 G");
	}
}
public class Ex4 {
	public static void main(String[] args) {		    
		  G g = new G(5);//매개변수가 1개 존재하는 생성자 호출시 5 전달 

	}

}





