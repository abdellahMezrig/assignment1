package com.meritamerica.assignment1;

public class CheckingAccount {

	private int years = 3;
	private double openingBalance;
	private double balance;
	private static double InterestRate= 0.0001;
	
	
	public CheckingAccount (double openingBalance) {
		balance = openingBalance;
	}
	
	public double getOpeningBalance() {
		return openingBalance;
	}

	public double getBalance() {
		return balance ;
	}

	public double getInterestRate() {
		return InterestRate;
	}
	
	public boolean withdraw(double amount) {
		if (amount > balance || amount < 0) {
			return false;
		}else {
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

	public double futureValue(double years) {
		double a = (1+InterestRate) ;
		double b = years;
		double newBalance = (balance* Math.pow(a, b));
		return newBalance;
	}
	public String toString() {
		
		return "Checking Account Balance: " + (String.format("%.3f",balance)) + "\n"+
			   "Checking Account Interest Rate: " + (String.format("%.4f",InterestRate)) + "\n" + 
			   "Checking Account Balance in " + years + " years: " + (String.format("%.2f",futureValue(years)));
	}

	}

	