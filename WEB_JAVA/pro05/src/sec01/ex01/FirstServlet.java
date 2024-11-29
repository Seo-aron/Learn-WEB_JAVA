package sec01.ex01;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * Servlet 인터페이스
 * - 모든 서블릿 클래스가 구현해야 하는 가장 상위 인터페이스
 *   이 인터페이스는 서블릿의 생명주기를 관리하는 기본 메서드들이 만들어져있음
 *   init(), service(), destory(), getServletConfig(), getServletInfo()...
 *   
 * GenericServlet 클래스
 * - 서블릿 인터페이스를 구현한 추상클래스
 *   이 클래스는 프로토콜의 독립적인 서블릿 페이지를 만들 때 사용
 *   이 클래스는 service()메소드만 추상메소드로 남겨두고, 나머지 메서드는 기본 구현 제공
 * - 일반적으로 직접 확장해서 서블릿 구현하는 경우는 드물다
 * 
 * HttpServlet 클래스
 * - GenericServlet클래스를 확장한 클래스
 *   HTTP프로토콜을 기반으로 동작하는 서블릿 만듬, 웹앱에서 가장 많이 사용
 * - HTTP요청에 따라 doGet(), doPost(), doPut(), doDelete()...
 *   등 메서드를 제공하여 클라이언트가 http요청방식에 따라 적절하게 처리
 *   
 * 계층 구조 요약
 * 	Servlet(인터페이스)
 * 		GenericServlet(추상클래스)
 * 			HttpServlet(일반클래스)
 * 
 * 서블릿이란?
 * - 클라이언트의 요청 주소를 받아 처리하는 서버페이지 역할을 하는 자바의 클래스
 * - 사용자 정의 서블릿 클래스를 만들때는 항상 HttpServlet클래스를 상속받아 만듬
 */

public class FirstServlet  extends HttpServlet{
	// 오버라이딩 --> alt + shift + s + v
	
	// init() : FirstServlet 서블릿 페이지 요청 시 맨 처음 한 번만 호출되는 콜백메소드
	// 톰캣 서버가 FirstServlet 서블릿 클래스를 메모리에 로드하고 인스턴스화 시킨 후 서블릿의 초기화 작업하는 메소드
	@Override
	public void init() throws ServletException {
		System.out.println("init 메소드 호출 당함");
	}
	
	// doGet() : FirstServlet 서블릿 서버페이지를 GET전송방식으로 요청하면 호출하는 콜백메소드
	// 실제 클라이언트가 요청한 데이터를 기반으로 클라이언트의 웹 브라우저로 응답할 데이터를 구현하는 메소드
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doGet 메소드 호출 당함");
	}

	// destroy() : 서블릿이 톰캣서버에서 소멸될 때 호출되는 매소드
	// 서블릿이 종료 될 때 단 한번만 호출, 리소스 해제
	@Override
	public void destroy() {
		System.out.println("destory 메소드 호출 당함");
	}

}

// doGet(), doPost() 중 하나는 무조건 오버라이딩 해야한다.
