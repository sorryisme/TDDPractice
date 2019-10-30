package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import main.Account;
/*
 * Ŭ���� �̸��� Account : O
 * ����� ������
 * �ܰ���ȸ
 * - 10000��,1000��, 0������ ���»���
 * - �ܰ� ��ȸ ��� ��ġ
 * �Ա�
 * ���
 * �ݾ��� �� ������ (�� õ�� =1000)
 * */

public class AccountTest {
	
	@Test
	public void testAccount() throws Exception {
		Account account = new Account(10000);
	}
	
	@Test
	public void testGetBalanace() throws Exception{

		Account account = new Account(10000);
		assertEquals(10000,account.getBalance());
		
//		if(account.getBalance() != 10000) {
//			fail();
//		}
		
		
		account = new Account(1000);
		assertEquals(1000,account.getBalance());
//		if(account.getBalance() != 1000) {
//			fail();
//		}
		
		account = new Account(0);
		assertEquals(0,account.getBalance());
//		if(account.getBalance() != 0) {
//			fail();
//		}
		
	}
}
