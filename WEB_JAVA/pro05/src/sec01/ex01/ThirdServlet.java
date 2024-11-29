package sec01.ex01;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * ������̼� ��ȣ��?
 * web.xml���Ͽ��� ������ ��û�� �����ּҸ� ������ ��� ��û�� �ּҵ��� ������ �ڵ尡 ������ٴ� ������ �ֽ��ϴ�.
 * ���� �� ���� Ŭ������ ���� @��ȣ�� �ٿ��� ������ ��û�� �����ּҸ� �����ϸ� �ڵ��� ������ �������ϴ�.
 * => @WebServlet
 */

@WebServlet("/Third")
public class ThirdServlet extends HttpServlet{
	@Override
	public void init() throws ServletException {
		System.out.println("Ŭ���̾�Ʈ�� ó�� ��û�� ���� �����޸𸮿� �ε�Ǵ� ������ ȣ��");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("�ּ�â�� ��û�Ҷ� GET������� ��û �� ȣ��Ǵ� �ݹ�żҵ�, ������ �����͸� �籸��");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("form-input�±׿� �����Է��� �� POST������� ��û �� ȣ��Ǵ� �ݹ�żҵ�, ������ �����͸� �籸��");
	}
	
	@Override
	public void destroy() {
		System.out.println("��Ĺ������ �����Ǵ� ������ ȣ��");
	}
}
