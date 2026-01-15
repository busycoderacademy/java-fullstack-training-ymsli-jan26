package com.day4.session2_exhandling;
//how to create user define ex

//Account application, withdraw, deposit, create account
/*
    min bal for creating acc : 1000
    max dep at any time : 1L
    when u withdaraw agin: 1000
 */

//Exception vs

class BlaException extends Throwable{

}

class AccountCreationException extends Exception{
	private static final long serialVersionUID = 106948999795253370L;
	public AccountCreationException(String message) {
		super(message);
	}
}
class OverFundExceptionException extends RuntimeException{
	private static final long serialVersionUID = 106948999795253370L;
	public OverFundExceptionException(String message) {
		super(message);
	}
}
class Account {
	private int id;
	private String name;
	private double balance;

	public Account(int id, String name, double balance)
						throws AccountCreationException {
		this.id = id;
		this.name = name;
		this.balance = balance;
		
		if(balance<100_00) {
			throw new AccountCreationException("u need min 10k");
		}

	}
	public void printAccountDetails() {
		System.out.println("id: "+ id+" name: "+ name+": "+ "balance: "+ balance);
	}

	// 3000
	public void withdraw(int amount) {
		double temp = balance - amount;

	}

	/// 3000+1000000
	public void deposit(int amount)throws OverFundExceptionException {
		double temp = balance + amount;
		if(temp>=1000000) {
			throw new OverFundExceptionException("u need to open current account");
		}
	}
}

public class D_UserDefineEx {
	public static void main(String[] args) {
		
		Account account;
		try {
			account = new Account(1, "nitin", 30000.0);
			account.printAccountDetails();
			account.deposit(10000000);
		} catch (AccountCreationException e) {
			System.out.println(e.getMessage());
		}catch(OverFundExceptionException e) {
			System.out.println(e.getMessage());
		}
	

	}
}
