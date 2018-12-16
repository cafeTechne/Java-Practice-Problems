import java.util.*;

/**
 * This service class implements a credit card validation algorithm.
 * @author blanquito
 *
 */

public class CreditCardChecker {
	
	/**
	 * cardNumber is a String representing the credit card number.
	 */
	private String cardNumber;
	
	/**
	 * This is the default constructor.
	 */
	public CreditCardChecker() {
		this.cardNumber = "12345678";
	}
	
	/**
	 * This is the overloaded constructor, which allows the client class 
	 * to enter a number upon instantiation.
	 * @param numString the credit card number, represented as a String
	 */
	
	public CreditCardChecker(String numString) {
		this.cardNumber = numString;
	}
	
	/**
	 * This method implements the first part of the algorithm
	 * by summing every even digit
	 * @return returns an integer with the result of this sub-algorithm
	 */
	
	/**
	 * Accessor method for the cardNumber variable.
	 * @return This method returns the cardNumber variable in the form of a String;
	 */
	public String getCardNumber(){
		return cardNumber;
	}
	
	/**
	 * Mutator method for the cardNumber variable.
	 * @param cardNum
	 * 
	 */
	public void setCardNumber(String cardNum){
		this.cardNumber = cardNum;
	}
	
	
	public int sumEveryOtherEvenDigit() {
		
		int runningSum = 0;
		
		for(int i=1; i<=this.cardNumber.length(); i +=2) {
			
			int tempIndex = this.cardNumber.length() - i;
			char temporaryChar = this.cardNumber.charAt(tempIndex);
			int temporaryInt = Character.getNumericValue(temporaryChar);
			
			runningSum += temporaryInt;
		}
		
		return runningSum;
	}
	

	/**
	 * This method implements the second part of the algorithm
	 * by pushing the double of each number into a stack, and then
	 * using a loop to add all of the resulting digits
	 * 
	 * @return returns an integer with the result of this sub-algorithm
	 */
	
	public int sumEveryOtherOddDigit() {
		
		int runningSum = 0;
		Stack<Integer> stackOfNumbers = new Stack<>();
		
		for(int i=2; i<=this.cardNumber.length(); i +=2) {
			
			int tempIndex = this.cardNumber.length() - i;
			
			
			char temporaryChar = this.cardNumber.charAt(tempIndex);
			int temporaryInt = Character.getNumericValue(temporaryChar);
			int doubledTemporaryInt = 2 * temporaryInt;
			
			stackOfNumbers.push(doubledTemporaryInt);
		}
		
		int stackSize = stackOfNumbers.size();
		
		for(int i = 0; i<stackSize; i++) {
			int tempInt = stackOfNumbers.pop();
			String tempString = Integer.toString(tempInt);
			
			
			
			for(int j = 0; j<tempString.length();j++) {
				char tempChar = tempString.charAt(j);
				int tempInt2 = Character.getNumericValue(tempChar);	
				runningSum += tempInt2;
			}
			
		}
		
		return runningSum;
	}
	

	
	/**
	 * This method calls the sumEveryOtherEvenDigit() and  
	 * sumEveryOtherOddDigit() methods and checks to see if the
	 * final digit in the sequence is equal to 0.
	 * @return A true boolean value is returned if the final digit in the sum of the preceding numbers is equal to 0, otherwise it returns false.
	 */
	public boolean validateNumber() {
		
		int sumOfEvenAndOddSums = this.sumEveryOtherEvenDigit() +
		this.sumEveryOtherOddDigit();
		
		
		String s = Integer.toString(sumOfEvenAndOddSums);
		
		//s.length() -1 position of last char
		char finalDigitChar = s.charAt(s.length()-1);
		int finalDigit = Character.getNumericValue(finalDigitChar);
		if (finalDigit == 0) return true;
		else return false;
	}
	
	/**
	 * This method displays whether the number is valid or not. 
	 * If it is not valid, then it prints out the value of the check
	 * digit that would make the number valid.
	 */
	
	public void display() {
		if (this.validateNumber() == true) {
			System.out.println("This credit card number is valid");
		}
		else {
			int sumOfEvenAndOddSums = this.sumEveryOtherEvenDigit() +
					this.sumEveryOtherOddDigit();
					
					int c = Integer.parseInt(this.cardNumber);;
					
					String s = Integer.toString(sumOfEvenAndOddSums);
					
					//s.length() -1 position of last char
					char finalDigitChar = s.charAt(s.length()-1);
					int finalDigit = Character.getNumericValue(finalDigitChar);
					System.out.println("This number is invalid, but would be valid if the final number was a " + ((c - sumOfEvenAndOddSums + 10) % 10));
					
		}
		
	}
	
}
