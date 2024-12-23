/*
 문제7. 다음 중 변수 초기화에 대한 설명으로 옳지 않은 것은?(모두 고르시오)  3, 5
 
 1. 멤버(인스턴스)변수는 자동으로 초기화되므로 초기화하지 않고도 값을 참조할수 있다.
 2. 지역변수는 사용하기 전에 반드시 초기화해야한다
 3. 초기화 블럭보다 생성자가 먼저 수행된다.
    -> 초기화 블럭이 먼저 수행된다.
     
 4. 명시적 초기화를 제일 우선적으로 고려해야 한다
 5. 클래스변수보다 인스턴스변수가 먼저 초기화된다.
   -> 클래스(static)변수가 먼저 초기화 된다.

 풀이 :  클래스 변수는 클래스가 처음 JVM메모리에 로딩될때, 자동으로 초기화되므로
        인터스턴스변수 보다 먼저 초기화 된다. 그리고 생성자는 초기화블럭이 수행된 다음 수행된다.


*/
public class 변수초기화 {

}
