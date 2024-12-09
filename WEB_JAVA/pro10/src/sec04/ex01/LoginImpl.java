package sec04.ex01;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;


//이벤트 처리하는 이벤트 핸들러 역할의 클래스로
//추상메소드를 강제로 오버라이딩 해서  HttpSession객체 메모리에 바인딩 시~~ 이벤트를 처리하는 클래스입니다

//HttpSessionBindingListener를 제외한 Listener를 구현하는 모든 이벤트 핸들러는 반드시 
//아래의 애노테이션 기호를 이용해서 Listener로 등록해야 합니다. 
@WebListener
public class LoginImpl implements HttpSessionBindingListener {

	//로그인 요청시 입력한 아이디 비번 저장 할 변수
	String user_id;
	String user_pw;
	
	//HttpSession객체 메모리에 바인딩시 ~ 1씩 증가시킵니다.
	static int total_user = 0;
	
	//기본생성자 
	public LoginImpl() {}
	
	
	//new를 이용해 객체 생성시  입력받은 아이디,비밀번호를 매개변수로 받아서 위 인스턴스변수에 초기화 하는 생성자 
	public LoginImpl(String user_id, String user_pw) {
		this.user_id = user_id;
		this.user_pw = user_pw;
	}


	//HttpSession객체 메모리에  저장시  접속자수를 증가시키는 기능을 메소드 오버라이딩
	@Override
	public void valueBound(HttpSessionBindingEvent event) {
		System.out.println("사용자 접속");
		++LoginImpl.total_user;
	}

	//HttpSession객체 메모리에 세션사용자 소멸시  접속자수를 감소시키는 기능을 메소드 오버라이딩 
	@Override
	public void valueUnbound(HttpSessionBindingEvent event) {
		System.out.println("사용자 접속 해제");
		total_user--;
	}
	

}






