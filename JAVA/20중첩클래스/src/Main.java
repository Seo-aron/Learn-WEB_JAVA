
/* 
  문제: 중첩클래스 사용하여 자동차 모델링
*/
//class Car만들기
class Car{
	//인스턴스변수 2개 만들기
	//1. 차량모델명을 문자열로 저장할 model변수 선언
    //2. new Engine(); 생성하여 저장할 engine변수 선언
	private String model;
	private Engine engine;
	
	
	//생성자 - 위 두 인스턴스변수값 초기화할 생성자 선언
	// 차량 모델명, 엔진출력(마력)정수값을 매개변수로 전달받아 
	// 1.차량 모델명은 model변수에 초기화
	// 2.엔진출력(마력)정수값 하나는 
	//   new Engine(enginePower);생성하여초기화 
	public Car(String model, int enginePower) {
		this.model = model;
		this.engine = new Engine(enginePower);
		
	}
	

	//자동차 정보를 출력하는 showCarInfo메소드 선언
	public void showCarInfo() {
	//출력형식
		//"모델 : Hyundai Sonata"
		System.out.println("모델 : " + this.model);
	//메소드 호출 하여 출력
		//엔진정보를 출력하는 showEngineInfo()메소드 호출
		this.engine.showEngineInfo();
	}


	//정적 중첩 클래스 Engine클래스 만들기
	static class Engine{
		
		//엔진 출력(마력) 정수값 하나 저장할 power변수 선언
		private int power;

		//생성자-엔진 출력(마력)정수값 하나를 매개변수로 받아 초기화
		public Engine(int enginePower) {
			this.power = enginePower;
		}
		//엔진 정보 출력하는  showEngineInfo메소드 선언
		//출력형식
		//"엔진 출력: 정수값 마력"
		public void showEngineInfo() {
			System.out.println("엔진 출력:"+ this.power + "마력");
		}
	}	
		
}
public class Main {
	public static void main(String[] args) {
		//Car클래스의 객체 생성시 
		//생성자를 호출해서 차량모델명을 "Hyundai Sonata" 전달
		//			     엔진 출력(마력)값을  180 전달
		//해서  초기화 
		Car car = new Car("Hyundai Sonata",180);
		
		//자동차 정보출력하기위해 showCarInfo()메소드 호출!
		car.showCarInfo();
	}

}













