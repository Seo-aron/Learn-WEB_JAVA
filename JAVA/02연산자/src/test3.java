/*
 문제. 534자루의 연필을 30명의 학생들에게 똑같은 개수로 나누어 줄 때
      1인당 몇 개를 가질 수 있고,
      마지막에 몇 개가 남는지를 구하는 코드입니다.
       (          )에 들어갈 알맞은 코드를 차례대로 작성해보세요.
 */
public class test3 {

	public static void main(String[] args) {
		int pencils = 534;
		int students = 30;
		
		//학생 한 명이 가지는 연필 수
		//전체 연필 수를 학생 수로 나누면 됩니다. 
		//이때 정수 나눗셈을 사용하므로 pencils / students를 사용합니다.
		//534를 30으로 나눈 결과로 각 학생이 가지는 연필 수를 나타냅니다. 
		int pencilsPerStudent = (pencils / students);
		System.out.println(pencilsPerStudent);//17
		
		// 남은 연필 수
		//전체 연필 수에서 학생 수로 나눈 나머지를 계산하여 남은 연필 수를 구함
		/*
		 계산 과정:
				534 % 30을 계산하면, 534를 30으로 나누었을 때의 나머지를 구합니다.
				534를 30으로 나누면, 몫은 17이고 나머지는 24입니다. 
				즉, 534를 30으로 나누면 30을 17번 곱한 510이 되고, 
				534에서 510을 빼면 24가 남습니다.
		 */
		int pencilsLeft = (pencils % students);
		System.out.println(pencilsLeft); //24

	}

}









