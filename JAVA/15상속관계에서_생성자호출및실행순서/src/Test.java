

//예제. super  super() 키워드 연습

//직원설계도(클래스)
//클래스명 : Employee
class Employee{ //부모역할을 하는 클래스 	
	String name;//이름
	int salary;//급여
	
	//기본생성자
	public Employee() {}
	
	//name,salary인스턴스변수값 초기화할 생성자
	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}	
}
//Employee부모클래스를 상속받아 Manager자식클래스 만들기
class Manager extends Employee{
	
	String depart;//부서명 
	
	
	//완성되는 Manager객체의 이름,급여,부서명을 초기화할 생성자
	//          		 "이순신",     4000,         "개발"
	public Manager(String name, int salary, String depart) {
		//Manager객체 메모리 영역에는 name,salary인스턴스변수가 업기떄문에
		//Employee클래스 내부의 생성자를 호출해서 
		//각각의 "이순신"은 name인스턴스변수에 저장하고,
		//     4000은   salary인스턴스변수에 직접 초기화 해야합니다.
		this.name = name;
		this.salary = salary;
//		super(name,salary);
		this.depart = depart;
	}
		
	//완성되는 Manager객체의 
	//이름,급여,부서명등의 정보를 하나의 문자열로 반환하는 기능의 인스턴스메소드
	public String getManager() { //getter역할
		return this.name + "," + super.salary + "," + this.depart;
	//	return super.name;       this.salary               depart
	//	return name;             salary
		
	}
	
}

public class Test {
	public static void main(String[] args) {
		
		//Manager자식객체생성
		Manager manager = new Manager("이순신", 4000, "개발");
		System.out.println(	manager.getManager() );
							 //"이순신,4000,개발"
	  /*		    				  
	   *                   자식 Manager객체 생성하면 
	   *                   전체 Manager객체 메모리 하나가 생성되면서
	   *                   부모객체메모리도 만들어져서 포함되니
	   *                   생성된 Manager객체 메모리 주소는 하나다
	   *                         
	   *                              ox11
	   *                         
	   *                         
				[  0x11 ] = -------------------------------
								부모 Employee객체 메모리 영역
								
								    String name;["이순신"]
								    int salary;	[4000]
								 
								    public String getEmployee(){}
				 
				 			-------------------------------
				 				자식 Manager객체 메모리 영역
				 				
				 				    String depart; ["개발"]
				 				    
				 				    public String getManager(){}
				 				    
				 		    -------------------------------
		
		
		
		
	  */	

	}

}













