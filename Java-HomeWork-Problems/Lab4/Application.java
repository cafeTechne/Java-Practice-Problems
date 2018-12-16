

import java.util.*;

/**
 * This application validates a credit card based on an arbitrary algorithm.
 * @author blanquito
 *
 */

public class Application {

	public static void main(String[] args) {
		
		
		Scanner keyboard = new Scanner(System.in);
		String cardNumber = "";
		
		
		while(!(cardNumber.equals("-1"))) {
			System.out.println("User, enter in a credit card number (8 digits long)");
			System.out.println("User, enter -1 to terminate program.");
			
			
			cardNumber = keyboard.nextLine();
			//use loop here to re-enter. do not exit the program ------ -5. DONE +5.
			//removed IF CONSTRUCT 
			
			
			//what if input is: "asdfghjk"? need to check if all are digits ---- -5 DONE +5.
			//ADDED REGEX .matches method to check for spaces or letters.
			if (!(cardNumber.length() == 8)) {   
				System.out.println("Card number must be 8 digits in length!");
				System.out.println("Terminating program");
				System.exit(0);
			} else if(cardNumber.matches("[A-Za-z ]*")) {
				System.out.println("Must not be a letter or space!");
			}
			else {
				CreditCardChecker cc1 = new CreditCardChecker(cardNumber);
				cc1.validateNumber();
				cc1.display();
			}
				
		}
			
		keyboard.close();
		System.exit(0);
	}

}
