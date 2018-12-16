
public class InvalidDepositAmount extends Exception{
	
	/**
	 * This constructor uses a non-specific error message.
	 */
	public InvalidDepositAmount() {
		super("Error: Invalid Deposit Amount: deposit amount is less than or equal to 0, or greater than $10,000.");
	}
		
}
	