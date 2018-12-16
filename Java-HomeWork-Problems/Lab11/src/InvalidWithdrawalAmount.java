
/**
 * The InvalidWithdrawalAmount class is an exception class for just what it sounds like it does.
 *
 */

public class InvalidWithdrawalAmount extends Exception {
	/**
	 * This constructor uses a non-specific error message.
	 */
	public InvalidWithdrawalAmount() {
		super("\nError: Invalid Withdrawal Amount: withdrawal amount is less than or equal to 0, or greater than $10,000.");
	}

	public InvalidWithdrawalAmount(double balance) {
		super("There is only $" + balance + " in the account.");
	}

	public InvalidWithdrawalAmount(boolean b) {
		super("Balance is less than $25, the account is currently inactive.");
	}
	
	
}
