package com.spring.account;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

//����

//AccountServiceŬ������ ��� �޼ҵ忡 Ʈ����� ����� ���� ��ŵ�ϴ�.

@Transactional(propagation = Propagation.REQUIRED)
public class AccountService {	
	
	private AccountDAO accDAO;	
	
	//����. action-service.xml������ �ڵ忡�� ȣ����
	public void setAccDAO(AccountDAO accDAO) {
		this.accDAO = accDAO;
	}	
	//���� ��ü �� �ܾ��� ���� �ϴ� ���� ����� �ϴ� AccountDAO�� ��� �ϴ� �޼ҵ� 
	public void sendMoney() {
		//ȫ�浿�� �����ſ��� 500������ ��ü �ϹǷ�
		//ȫ�浿�� ���¿� 500������ ������Ű�� UPDATE���� �����ϱ� ���� 
		//ù��° AccountDAO��ü�� �޼ҵ� ȣ��!
		accDAO.updateBalance1();
		
		//�������� ���¿� 500������ �����ǰ� UPDATE���� �����ϱ� ����
		//�ι��� AccountDAO��ü�� �޼ҵ� ȣ��!
		accDAO.updateBalance2();
		
	}
	
	

}











