package com.meritamerica.assignment1;

public class SavingsAccount {
	private int years = 3;
	private double openingBalance;
	private static double balance;
	private static double InterestRate=0.01;
	
	public SavingsAccount (double openingBalance) {
		this.balance = openingBalance;
	}
	
	public double getOpeningBalance() {
		return openingBalance;
	}

	public double getBalance() {
		return balance;
	}

	public double getInterestRate() {
		return InterestRate;
	}
	
	public boolean withdraw(double amount) {
		if (amount > balance || amount < 0) {
			return false;
		}else {
			balance = balance - amount;
			return true;
		}
	}
	
	public boolean deposit(double amount) {
		if (amount <= 0) {
			return false;
		}else {
			balance = amount + balance;
			return true;
		}
		}

	public double futureValue(int years) {
		double a = (1+InterestRate) ;
		double b = years;
		double newBalance = balance* Math.pow(a, b);
		return newBalance;
	}
	public String toString() {
		
		return "Savings Account Balance: " + (String.format("%.3f",balance)) + "\n"+
			   "Savings Account Interest Rate: " + (String.format("%.2f",InterestRate)) + "\n" + 
			   "Savings Account Balance in " + years + " years: " + (String.format("%.3f",futureValue(years)));
	}


}