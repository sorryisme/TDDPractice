package test;

import main.Account;

public class AccountTest {
	
	public void testAccount() throws Exception {
		Account account = new Account();
		
		if(account == null) {
			throw new Exception("계좌 생성 불가");
		}
		
	}
	
	public static void main(String[] args) {
		AccountTest test = new AccountTest();
		
		try {
			test.testAccount();
		} catch (Exception e) {
			System.out.println("실패");
			return;
		}
		
		System.out.println("성공");
	}
	
}
