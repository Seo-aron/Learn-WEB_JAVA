/*
 문제6. 다음 중아래의 add메서드를 올바르게 오버로딩 한것은?(모두 고르시오)
 												2, 3, 4
   long add(int a, int b) { return a+b;  }

1. long add(int x, int y)  { return x+y; }
2. long add(long a, long b) { return a+b; }
3. int add(byte a, byte b) { return a+b; }
4. int add(long a, int  b) { return (int)(a+b); }

풀이 ->  2, 3, 4는 모두 메서드의 이름이 add이고 매개변수의 타입이 다르므로
        오버로딩이 성립합니다. 
        
    <<오버로딩의 조건>>
    1. 메서드 이름이 같아야한다.
    2. 매개변수의 개수 또는 타입이 달라야한다.
    3. 매개변수는 같고 리턴타입이 다른 경우는 오버로딩이 성립되지 않는다
       (리턴타입은 오버로딩을 구현하는데 아무런 영향을 주지 못한다)
        
        

*/
public class 오버로딩2 {

}
