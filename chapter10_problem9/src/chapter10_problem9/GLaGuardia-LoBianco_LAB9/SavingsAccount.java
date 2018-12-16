
import java.text.*;

/*
 * Gino N. LaGuardia-LoBianco
 * CTP150
 * Section 003
 * LAB 9
 */



/**
 * The SavingsAccount class inherits from bank account and provides some additional methods/functionality.
 * @author Gino N. LaGuardia-LoBianco
 *
 */

public class SavingsAccount extends BankAccount {
	
	 final double ACCOUNT_MINIMUM = 25;
	
	private boolean status = false;
	
	/**
	 * This constructor takes two parameters, the balance and annual interest rate.
	 * @param balance The balance of the bank account as a double.
	 * @param annualInterestRate The annual interest rate as a double.
	 */
	
	public SavingsAccount(double balance, double annualInterestRate){
		super(balance, annualInterestRate);
	}
	
	/**
	 * This constructor takes three parameters, the balance, monthly service charges and annual interest rate.
	 * @param balance The balance of the bank account as a double.
	 * @param annualInterestRate The annual interest rate as a double.
	 * @param monthlyServiceCharges The monthly service charges as a double.
	 */
	
	public SavingsAccount(double balance, double annualInterestRate, double monthlyServiceCharges){
		super(balance, annualInterestRate, monthlyServiceCharges);
	}
	
	/**
	 * The deposit method allows the user to money money from a bank account object, checks to ensure it has enough money in it (>$25).
	 * @param depositAmount a double representing the amount being withdrawn.
	 */
	
	public void withdraw(double withdrawalAmount) {
		if(super.getBalance() < ACCOUNT_MINIMUM) {
			this.status = false;
		}
		else {
			this.status = true;
		}
		
		if(this.status == false) {
			System.out.println("Balance is less than $25, the account is currently inactive.");
		}
		else {
			super.withdraw(withdrawalAmount);
		}
	}
	
	/**
	 * A method to process the monthly service charges, calls the calculateInterest() method and resets the counters on withdrawals and deposits in the super class 
	 * imposes fees if there are more than withdrawals in a given month
	 */
	
	public void monthlyProcess() {
		
		if (this.getNumberOfWithdrawals() > 4) {
		super.imposeFees(this.getNumberOfWithdrawals()-4); 
		
		}
		super.monthlyProcess();
	}
	

	/**
	 * This checks the account status of the account in question... i.e. if there is enough money to withdraw money from it.
	 * @return
	 */
	public boolean getStatus() {
		return status;
	}
	
	/**
	 * A user defined toString() method.
	 */
	public String toString() {
		double total = super.getBalance();
		return "Balance: " + String.valueOf(dollar.format(total)) +"\n" + "Number of deposits: " +this.getNumberOfDeposits() + "\n" + "Number of withdrawals: " + this.getNumberOfWithdrawals();
	}
	
}
