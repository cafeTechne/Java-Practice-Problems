
import java.text.*;

/**
 * This abstract class models a BankAccount.
 * @author blanquito
 *
 */

public abstract class BankAccount {
	private double balance = 0;
	private double numberOfDeposits = 0;
	private double numberOfWithdrawals = 0;
	private double annualInterestRate = 0;
	private double monthlyServiceCharge = 0;
	
	
	
	/**
	 * This constructor takes two parameters, the balance and annual interest rate.
	 * @param balance The balance of the bank account as a double.
	 * @param annualInterestRate The annual interest rate as a double.
	 */
	public BankAccount(double balance, double annualInterestRate){
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
		this.numberOfDeposits = 0;
		this.numberOfWithdrawals = 0;
		this.monthlyServiceCharge = 0;
        //need to initialize other values without correspoding parameters to default vlaues --------------------------- -2. DONE +2.
	}
	
	/**
	 * This constructor takes three parameters, the balance, monthly service charges and annual interest rate.
	 * @param balance The balance of the bank account as a double.
	 * @param annualInterestRate The annual interest rate as a double.
	 * @param monthlyServiceCharges The monthly service charges as a double.
	 */
	
	public BankAccount(double balance, double annualInterestRate, double monthlyServiceCharges){
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
		this.monthlyServiceCharge = monthlyServiceCharges;
		this.numberOfDeposits = 0;
		this.numberOfWithdrawals = 0;
      //need to initialize other values without correspoding parameters to default vlaues -------------------- DONE.
	}
	
	/**
	 * The deposit method allows the user to deposit money into a bank account object.
	 * @param depositAmount a double representing the amount being deposited.
	 */
	
	public void deposit(double depositAmount) {
		this.balance += depositAmount;
		this.numberOfDeposits = numberOfDeposits + 1;
		//System.out.println("Your current balance is " + this.getBalance());
	}
	
	/**
	 * The withdraw method allows the user to withdraw money from a bank account object.
	 * @param withdrawalAmount a double representing the amount being withdrawn.
	 */
	
	public void withdraw(double withdrawalAmount) {
		this.balance -= withdrawalAmount;
		this.numberOfWithdrawals +=1;
		//System.out.println("Your current balance is " + this.getBalance());
	}
	
	/**
	 * A method that calculates the interest accrued each month. It does not compound daily.
	 */
	public void calculateInterest() {
		double monthlyInterestRate = (this.annualInterestRate/12);
		double monthlyInterest = (this.balance * monthlyInterestRate);
		//System.out.println("Your monthly interest is " + monthlyInterest);
		this.balance = this.balance + monthlyInterest;
	}
	
	/**
	 * A method to process the monthly service charges, calls the calculateInterest() method and resets the counters on withdrawals and deposits.
	 */
	public void monthlyProcess() {
		this.balance = this.balance - this.monthlyServiceCharge;
		this.calculateInterest();
		this.numberOfWithdrawals = 0;
		this.numberOfDeposits = 0;
		this.monthlyServiceCharge = 0;
		//System.out.println("Your current balance is " + this.getBalance());
	}

	/**
	 * This method returns the number of withdrawals in a given month.
	 * @return
	 */
	public double getNumberOfWithdrawals() {
		return numberOfWithdrawals;
	}

	/**
	 * This method returns the number of deposits in a given month.
	 * @return
	 */
	
	public double getNumberOfDeposits() {
		return numberOfDeposits;
	}

	
	/**
	 * This method returns the balance in a given bank account object.
	 * @return
	 */
	
	public double getBalance() {
		return this.balance;
	}

	
	//"Add mutators and accessors for two of the three data members: interest rate, and monthly service charges. "-------------- -5. DONE +5.
	
	/**
	 * Sets the annual interest rate.
	 * @param interestRate a double representing the annual interest rate.
	 */
	public void setInterestRate(double interestRate) {
		this.annualInterestRate = interestRate;
	}
	
	/**
	 * Sets the monthly service charge
	 * @param monthlyServiceCharge a double representing the monthly service charge
	 */
	
	public void setMonthlyServiceCharges(double monthlyServiceCharge) {
		this.monthlyServiceCharge = monthlyServiceCharge;
	}
	
	/**
	 * Gets the annual interest rate.
	 * @return a double representing the annual interest rate.
	 */
	
	public double getInterestRate() {
		return this.annualInterestRate;
	}
	
	/**
	 * Gets the monthly service charge.
	 * @return a double representing the monthly service charge.
	 */
	public double getMonthlyServiceCharge() {
		return this.monthlyServiceCharge;
	}
	
	
	
	/**
	 * A user defined toString() method.
	 */
	
	public String toString() {
		// Create a Decimalformat object for formatting output.
	    DecimalFormat dollar = new DecimalFormat("#,##0.00");  //should be local variable in toString()---------------------------------------------- DONE.
		
		double total = this.getBalance();
		return "Balance: " + String.valueOf(dollar.format(total)) +"\n" + "Number of deposits: " +this.getNumberOfDeposits() + "\n" + "Number of withdrawals: " + this.getNumberOfWithdrawals();
		
	}
}
