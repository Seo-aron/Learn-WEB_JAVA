public class Exercise6_2 {
	public static void main(String[] args) {
	 
		 Student s = new Student("홍길동",1,1,100,60,76);
		 
		 String str = s.info();
		 System.out.println(str);
		 
		 System.out.println();
		 
		 System.out.println("이름 : " + s.name);
		 System.out.println("총점 : " + s.getTotal() );
		 System.out.println("평균 : " + s.getAverage() );
		 
	}

}

class Student {
	String name;//학생이름
	int ban;//반
	int no;//번호
	int kor;//국어점수
	int eng;//영어점수
	int math;//수학점수
	
	//생성자
	public Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	//메소드 추가 
	public String info() {
		
		return this.name + "," + this.ban + "," + this.no + "," 
		       + this.kor + "," + this.eng + "," + this.math + "," 
			   + (this.kor+this.eng+this.math) + "," + ((int)((kor+eng+math)/3f * 10 + 0.5f)/10f);
	}
	
	//getTotal메소드 추가
	int getTotal() {//총합
		return this.kor  + this.eng + this.math;
//		return kor  + eng + math;
	}
	
	//getAverage메소드 추가
	float getAverage() { //평균
		return (int)( this.getTotal() / 3f * 10 + 0.5f ) / 10f;
		//                  236       / 3 ->  78
		//					int       / int -> int
		//설명 : 총점의 타입이 int이기때문에 3으로 나누면 int와 int간의 연산이므로
		//		결과를 int로 얻는다. 즉! 소수점 이하는 버려지게 된다.
		//      그래서 아래와 같이 float타입의 리터럴인 3f로 나누어야 소수점 이하의 값들을
		//      얻을수 있다.
		
		//					
		//                  236       / 3f -> 78.666664
		//소수점 둘떄 자리에서 반올림하려면 10을 곱하고, 0.5를 더한 다음 다시 10f로 나누면된다
		//                  236  / 3f * 10 -> 786.66664
		//					236  / 3f * 10 + 0.5 -> 787.16664
		//				    787.16664 를 정수로 형변환 (int)하면 787 정수로 만듬
		//                  787을 10f로 나누면 78.7 
		
		
	}
	
	
}










