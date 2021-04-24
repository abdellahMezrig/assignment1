package com.meritamerica.assignment1;


public class AccountHolder {
	private String FirstName;
	private String MiddleName;
	private String LastName;
	private String ssn;
	private double checkingAccountOpeningBalance;
	private double savingsAccountOpeningBalance;
	private CheckingAccount checking;
	private SavingsAccount Saving;
	

	public AccountHolder (String FirstName, String MiddleName, String LastName, String ssn,double checkingAccountOpeningBalance,
			 double savingsAccountOpeningBalance ) {
		this.FirstName=FirstName;
		this.MiddleName=MiddleName;
		this.LastName= LastName;
		this.ssn = ssn;
		this.checking = new CheckingAccount(checkingAccountOpeningBalance);
		this.Saving = new SavingsAccount (savingsAccountOpeningBalance);
		
	}
	
	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getMiddleName() {
		return MiddleName;
	}

	public void setMiddleName(String middleName) {
		MiddleName = middleName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public CheckingAccount getCheckingAccount() {
		return checking;
	}


	public SavingsAccount getSavingsAccount() {
		return Saving;
	}

    public String toString() {
    	
    	// String.format method changes numbers into smaller form
		
		return "Name:" + FirstName + " "+ MiddleName+" "+ LastName + "\n"+
			   "SSN: "+ getSsn()  + "\n" + 
			   "Checking Account Balance: " + checking.getBalance() +"\n"+
		       "Checking Account Interest Rate: " + (String.format("%.4f",checking.getInterestRate())) + "\n"+
		       "Checking Account Balance in 3 Years:" + (String.format("%.3f",checking.futureValue(3))) + "\n"+
		       "Savings Account Balance: " + Saving.getBalance() + "\n"+
		       "Savings Account Interest Rate: " + (String.format("%.2f",Saving.getInterestRate())) + "\n"+
		       "Savings Account Balance in 3 years: " + (String.format("%.3f",Saving.futureValue(3)));
	}
	
    
	
}