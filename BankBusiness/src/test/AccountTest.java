package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.Account;

public class AccountTest {
	
	private Account account;

    @Test
	public void testAccount() throws Exception {
        setup();
	}
	
	@Test
	public void testGetBalanace() throws Exception{

	    setup();
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
	
	@Test
	public void testDeposit() throws Exception {
	    setup();
	    account.deposit(1000);
	    assertEquals(11000, account.getBalance());
	}
	
	@Test
	public void testWithdraw() throws Exception {
	    setup();
	    account.withdraw(1000);
	    assertEquals(9000, account.getBalance());
	}
	
	
	private void setup() {
	    account = new Account(10000);
	}
}
