package finance.spring.bean.life.cycle.account;

import org.springframework.stereotype.Component;


public class Account {
	
	String accountNumber;
	String accountholderName;
	double balance;
	
	public Account(String accountNumber, String accountholderName, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.accountholderName = accountholderName;
		this.balance = balance;
	}

	/*
	  first we have create a pojo class which beans should be managed their definition is in the where they initialized in the config file
	    */
	public void openAccount() {
		
		System.out.println("Account.openAccount().............");
	}
}
