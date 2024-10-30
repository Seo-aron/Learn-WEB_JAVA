
/*
 문제. 아래는 변수 x, y, z의 값을 서로 바꾸는 예이다.
      출력결과와 같이 출력되도록  (1) 위치에 코드를 완성하시오
출력결과
x=2
y=3
z=1

*/
public class Opr02_01 {
	public static void main(String[] args) {
		 int x = 1;
		 int y = 2;
		 int z = 3;		 
		 
		 //(1)
		 //현재 x의 값을 tmp라는 임시변수에 저장합니다.
		 int tmp = x; 
		 //[  1 ]
		 
		 //여기서는 y값을 x변수에 저장합니다.
		 //x변수는 이제 2가 됩니다.
		 x = y;
	  //[2]
		 
		 //여기서는 z값3을 y변수에 저장합니다.
		 //y변수의 값은 이제 3이 됩니다.
		 y = z;
	  //[3]	 
		 
		 //마지막으로 z변수에 temp변수값 1을 저장합니다.
		 //temp변수에는 x변수의 값 1저장되어 있었으므로 temp변수는 1이라는 의미입니다
		 //z변수의 값은 이제 1이 됩니다.
		 z = tmp;
	  //[1]	 
		 
		 System.out.println("x=" + x);
		 System.out.println("y=" + y);
		 System.out.println("z=" + z);
	}

}





