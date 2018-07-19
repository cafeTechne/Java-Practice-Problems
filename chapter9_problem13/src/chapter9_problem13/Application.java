package chapter9_problem13;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
/*
 * Many companies use telephone numbers like 555-GET-FOOD so the 
 * number is easier for their customers to remember. On a standard
 * telephone, the alphabetic letters are mapped to numbers
 * in the following fashion:
 * 
 * A,B, and C = 2
 * D,E, and F = 3
 * G,H, and I = 4
 *  J,K, and L = 5
 *  M, N and O = 6
 *  P, Q, R and S = 7 
 *  T U, and V = 8
 *  W, X, Y and Z = 9
 * 
 * 
 * Write an application that asks the user to enter a 10-character
 * telephone number in the format XXX-XXX-XXXX. The application
 * should display the telephone number with any alphabetic characters 
 * that appeared in the original translated to their numeric equivalent.
 * 
 *  
 */
	
		StringBuilder sb = new StringBuilder();
		Telephone telephone = new Telephone();
		
		Scanner keyboard = new Scanner(System.in);

		System.out.println("User, please enter a phone number to be translated into NUMBERS!");
		System.out.println("Example 1-800-GET-FOOD");
		String input = keyboard.nextLine();
		
		char[] charArray = input.toCharArray();
		
		
		for (int i = 0; i<charArray.length;i++) {
			sb.append(telephone.translatePhoneNumber(charArray[i]));
			System.out.println(sb);
		}
		
			keyboard.close();
	}		
}
