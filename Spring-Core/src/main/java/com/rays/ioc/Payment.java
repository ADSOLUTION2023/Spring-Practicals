package com.rays.ioc;

public class Payment {
	double balance = 0;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double makePaymemt (double amt) {
		balance -= amt; // balance =  balance - amt
		return balance;
	}

}
