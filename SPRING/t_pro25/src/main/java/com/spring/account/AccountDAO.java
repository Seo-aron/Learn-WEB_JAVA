package com.spring.account;

import org.apache.ibatis.session.SqlSession;
import org.springframework.dao.DataAccessException;

//���
//MyBatis����� �̿��Ͽ� DB�۾�  ��� �ϴ� Ŭ���� 
public class AccountDAO {
	
	/*
	   action-mybatis.xml �������Ͽ���
	   
	    1. PooledDataSourceĿ�ؼ�Ǯ �� -> SqlSessionFactoryBean��ü�� ������ ����
	    2. SqlSessionFactoryBean��ü�� �ּҸ� -> SqlSessionTemplate��ü�� ������ ����
	    3. SqlSessionTemplate��ü�� �ּҸ�  -> AccountDAO��ü�� ������ ���� 
	 */
	private SqlSession sqlSession; //SqlSessionTemplate��ü�� �ּҸ� ����(����)
		
	//Setter
	public void setSqlSession(SqlSession sqlSession) {	
		this.sqlSession = sqlSession;	
	}
	
	//ȫ�浿 ���¿��� 500���� ���� UPDATE
	public void updateBalance1() throws DataAccessException {
	
		sqlSession.update("mapper.account.updateBalance1"); //account.xml 
	}
	//������ ���¿��� 500���� ���� UPDATE
	public void updateBalance2() throws DataAccessException {
	
		sqlSession.update("mapper.account.updateBalance2"); //account.xml�� ���� 
	}
	
	

}













