package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import main.Account;
/*
 * 클래스 이름은 Account : O
 * 기능은 세가지
 * 잔고조회
 * - 10000원,1000원, 0원으로 계좌생성
 * - 잔고 조회 결과 일치
 * 입금
 * 출금
 * 금액은 원 단위로 (예 천원 =1000)
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
