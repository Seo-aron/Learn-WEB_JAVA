package com.spring.account;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;
/*
-- �������� ���������� �����ϴ� ���̺�
CREATE TABLE cust_account(
    accountNo varchar2(20) PRIMARY KEY,-- ���¹�ȣ
    custName varchar2(50), -- ������ 
    balance number(20,4) -- �ݾ�(�ܾ�)
);

-- ȫ�浿�� �������� ���� ������ �����մϴ�.
insert into cust_account(accountNO, custName, balance)
values('70-490-930','ȫ�浿',10000000);

insert into cust_account(accountNO, custName, balance)
values('70-490-911','������',10000000);

commit;	

����1. Ʈ����� ����� ������
http://localhost:8090/pro25/account/sendMoney.do �ּҸ� �Է��Ͽ� 
���������� ���� ��ü ����� �ϰ� ���� ���� �ܾ��� ���� �Ǿ����� DB�� ���̺��� Ȯ��!

����2. Ʈ����� ����� ���� �Ǿ� ���� ����
*/


//����
public class AccountController extends MultiActionController{
	
	//����(AccountService��ü�� �ּ�)�� ���� �޾� ������ ���� ����
	private AccountService accService;
	
	/*
	 action-servlet.xml���Ͽ� �ۼ� �� ����
	 <property name="accService" ref="accService"> �±׷� 
	 �Ʒ��� setAccService�޼ҵ带 ȣ���մϴ�.
	 ref�ڸ��� <bean>�� id�Ӽ����� �����ϸ� 
	 action-service.xml���Ͽ� �ۼ� �س���  AccountService��ü�� �ּҰ� �Ű������� ���޵˴ϴ�.
	 ���� ���� AccountService��ü�� �ּҸ� �� ������ ����(����) �մϴ�.
	 */
	public void setAccService(AccountService accService) {
		this.accService = accService;	
	}
	
	//�ݾ��� ��ü�ϴ� ����� �޼ҵ�
	public ModelAndView sendMoney(HttpServletRequest request,
							      HttpServletResponse repResponse) throws Exception {
		
		//����(AccountService)���� �ݾ� ��ü ���!
		accService.sendMoney();
		
		//��ü�� �����ϸ�
		//���������� ������ ����� ModelAndView��ü�� ���� �� ����ó�������� ��ȯ
		return new ModelAndView("result");
		
	}
	
	

}












