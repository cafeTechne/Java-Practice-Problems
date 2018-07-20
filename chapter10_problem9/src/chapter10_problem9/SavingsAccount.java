package chapter10_problem9;

public class SavingsAccount extends BankAccount {
	
	/*
	 * Design a SavingsAccount class that extends the BankAccount class. 
	 * 
	 * The class should have a status field to represent an active or inactive account.
	 * 
	 * 
	 * If the balance of a savings account falls below $25, it becomes inactive.
	 * 
	 * (The status field could be a boolean variable.) 
	 * No more withdrawals may be made until the balance is raised above $25, at which time the account becomes active again.
	 * 
	 * withdraw : a method that determines whether the account is inactive before a withdrawal is made. (No withdrawal will be 
	 * allowed if the account is not active.) A withdrawal is then made by calling the superclass version of the method.
	 * 
	 * deposit: a method that determines whether the account is inactive before a deposit is made.
	 * If the account is inactive and the deposit brings the balance above $25, the account becomes active again.
	 * A deposit is then made by calling the superclass version of the method.
	 * 
	 * monthlyProcess: before the superclass method is called, this method checks the number of withdrawals.
	 * 
	 * If the number of withdrawals for the month is more than 4, a service charge of $1 for each withdrawal above 4 is 
	 * added to the superclass field that hold the monthly service charges. (Don't forget to check the account balance
	 * after the service charge is taken. If the balance falls below $25, the account becomes inactive.)
	 * 
	 */
	
	
	
	private boolean accountActivity = true;
	
	
	public SavingsAccount(double balance, double annualInterestRate){
		
		super(balance, annualInterestRate);
		//are the other members of the inherited class initialized?
	}
	
	public void withdraw(double withdrawalAmount) {
		if(super.getBalance() < 25) {
			this.accountActivity = false;
		}
		else {
			this.accountActivity = true;
		}
		
		if(this.accountActivity == false) {
			System.out.println("Sorry, the account is currently inactive.");
		}
		else super.withdraw(withdrawalAmount);
	}
	
	public void deposit(double depositAmount) {
		super.deposit(depositAmount);
		System.out.println("Your current balance is " + this.getBalance());
	}
	
	public void monthlyProcess() {
		
		if (this.getNumberOfWithdrawals() > 4) {
		super.imposeFees(this.getNumberOfWithdrawals()-4); //need to fix this, can't withdraw under 25, but... that's not how fees work 
		
		}
		super.monthlyProcess();
	}
	

}
