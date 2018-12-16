

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
			if ((cardNumber.equals("-1"))) {
				System.out.println("Terminating program");
				break;

			}
			
			if (!(cardNumber.length() == 8)) {
				System.out.println("Card number must be 8 digits in length, with no spaces!");
				System.out.println("Terminating program");
				System.exit(0);
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
