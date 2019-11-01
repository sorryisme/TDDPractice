package main;

public class Account {

	private int balance;
	
	public Account(int money) {
		this.balance = money;
	}

	public Account() {
	}

	public int getBalance() {
		return balance;
	}

    public void deposit(int money) {
        this.balance += money;
    }

    public void withdraw(int money) {
        this.balance -= money;
    }

}
