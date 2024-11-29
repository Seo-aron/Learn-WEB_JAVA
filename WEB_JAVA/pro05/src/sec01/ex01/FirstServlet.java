package sec01.ex01;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * Servlet �������̽�
 * - ��� ���� Ŭ������ �����ؾ� �ϴ� ���� ���� �������̽�
 *   �� �������̽��� ������ �����ֱ⸦ �����ϴ� �⺻ �޼������ �����������
 *   init(), service(), destory(), getServletConfig(), getServletInfo()...
 *   
 * GenericServlet Ŭ����
 * - ���� �������̽��� ������ �߻�Ŭ����
 *   �� Ŭ������ ���������� �������� ���� �������� ���� �� ���
 *   �� Ŭ������ service()�޼ҵ常 �߻�޼ҵ�� ���ܵΰ�, ������ �޼���� �⺻ ���� ����
 * - �Ϲ������� ���� Ȯ���ؼ� ���� �����ϴ� ���� �幰��
 * 
 * HttpServlet Ŭ����
 * - GenericServletŬ������ Ȯ���� Ŭ����
 *   HTTP���������� ������� �����ϴ� ���� ����, ���ۿ��� ���� ���� ���
 * - HTTP��û�� ���� doGet(), doPost(), doPut(), doDelete()...
 *   �� �޼��带 �����Ͽ� Ŭ���̾�Ʈ�� http��û��Ŀ� ���� �����ϰ� ó��
 *   
 * ���� ���� ���
 * 	Servlet(�������̽�)
 * 		GenericServlet(�߻�Ŭ����)
 * 			HttpServlet(�Ϲ�Ŭ����)
 * 
 * �����̶�?
 * - Ŭ���̾�Ʈ�� ��û �ּҸ� �޾� ó���ϴ� ���������� ������ �ϴ� �ڹ��� Ŭ����
 * - ����� ���� ���� Ŭ������ ���鶧�� �׻� HttpServletŬ������ ��ӹ޾� ����
 */

public class FirstServlet  extends HttpServlet{
	// �������̵� --> alt + shift + s + v
	
	// init() : FirstServlet ���� ������ ��û �� �� ó�� �� ���� ȣ��Ǵ� �ݹ�޼ҵ�
	// ��Ĺ ������ FirstServlet ���� Ŭ������ �޸𸮿� �ε��ϰ� �ν��Ͻ�ȭ ��Ų �� ������ �ʱ�ȭ �۾��ϴ� �޼ҵ�
	@Override
	public void init() throws ServletException {
		System.out.println("init �޼ҵ� ȣ�� ����");
	}
	
	// doGet() : FirstServlet ���� ������������ GET���۹������ ��û�ϸ� ȣ���ϴ� �ݹ�޼ҵ�
	// ���� Ŭ���̾�Ʈ�� ��û�� �����͸� ������� Ŭ���̾�Ʈ�� �� �������� ������ �����͸� �����ϴ� �޼ҵ�
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doGet �޼ҵ� ȣ�� ����");
	}

	// destroy() : ������ ��Ĺ�������� �Ҹ�� �� ȣ��Ǵ� �żҵ�
	// ������ ���� �� �� �� �ѹ��� ȣ��, ���ҽ� ����
	@Override
	public void destroy() {
		System.out.println("destory �޼ҵ� ȣ�� ����");
	}

}

// doGet(), doPost() �� �ϳ��� ������ �������̵� �ؾ��Ѵ�.
