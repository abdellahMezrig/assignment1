package com.meritamerica.assignment1;

public class MeritAmericaBankApp {
	
	public static void main(String[] args) {
		AccountHolder accounholder = new AccountHolder("Sadiq", "","Manji", "123456789", 100.0, 1000.0);
		System.out.println(accounholder.toString());
		accounholder.getCheckingAccount().deposit(500);
		accounholder.getSavingsAccount().withdraw(800);
		System.out.println("--------------------------------");
		System.out.println(accounholder.getCheckingAccount().toString());
		System.out.println("--------------------------------");
		System.out.println(accounholder.getSavingsAccount().toString());
		System.out.println("--------------------------------");
		AccountHolder User001 = new AccountHolder("bob", "","ross", "987654321",200,500);
		User001.getCheckingAccount().deposit(-500);
		User001.getSavingsAccount().withdraw(600);
		System.out.println(User001.toString());
}
}