package chapter10_problem9;

public abstract class BankAccount {
	private double balance = 0;
	private double numberOfDeposits = 0;
	private double numberOfWithdrawals = 0;
	private double annualInterestRate = 0;
	private double monthlyServiceCharge = 0;
	
	public BankAccount(double balance, double annualInterestRate){
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
		
	}
	
	public void deposit(double depositAmount) {
		this.balance += depositAmount;
		this.setNumberOfDeposits(this.getNumberOfDeposits() + 1);
		System.out.println("Your current balance is " + this.getBalance());
	}
	
	public void withdraw(double withdrawalAmount) {
		this.balance -= withdrawalAmount;
		this.setNumberOfWithdrawals(this.getNumberOfWithdrawals() + 1);
		System.out.println("Your current balance is " + this.getBalance());
	}
	
	public void calculateInterest() {
		double monthlyInterestRate = (this.annualInterestRate/12);
		double monthlyInterest = (this.balance * monthlyInterestRate);
		System.out.println("Your monthly interest is " + monthlyInterest);
		this.balance = this.balance + monthlyInterest;
	}
	
	public void monthlyProcess() {
		this.balance = this.balance - this.monthlyServiceCharge;
		this.calculateInterest();
		this.setNumberOfWithdrawals(0);
		this.setNumberOfDeposits(0);
		this.monthlyServiceCharge = 0;
		System.out.println("Your current balance is " + this.getBalance());
	}

	public double getNumberOfWithdrawals() {
		return numberOfWithdrawals;
	}

	public void setNumberOfWithdrawals(double numberOfWithdrawals) {
		this.numberOfWithdrawals = numberOfWithdrawals;
	}

	public double getNumberOfDeposits() {
		return numberOfDeposits;
	}

	public void setNumberOfDeposits(double numberOfDeposits) {
		this.numberOfDeposits = numberOfDeposits;
	}
	
	public double getBalance() {
		return this.balance;
	}

	public void imposeFees(double fees) {
		this.balance = balance - fees;
	}
}
