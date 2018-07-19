package chapter9_problem9;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
	/*
	 * 
	 * Sum of Digits in a String
	 * 
	 * This program asks the user to enter a series of single digit numbers with nothing
	 * separating them. The program should display the sum of all the single digit 
	 * numbers in the string. For example, if the user enters 2514, the method should return 12, 
	 * which is the sum of 2,5,1, and 4. 
	 * 
	 * The program should also display the highest and lowest digits in the string;
	 */

		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("User, enter a series of single digit numbers with no spaces:");
		String input = keyboard.nextLine();
		char[] charArray = input.toCharArray();
		int sum = 0;
		int low = 9999;
		int high = -1;
		
		for ( int i = 0; i<input.length(); i++) {
			sum = sum + Character.getNumericValue(charArray[i]);
			if(Character.getNumericValue(charArray[i])< 0 || Character.getNumericValue(charArray[i])< low) {low = Character.getNumericValue(charArray[i]);}
			if(Character.getNumericValue(charArray[i])< 0 || Character.getNumericValue(charArray[i])> high) {high = Character.getNumericValue(charArray[i]);}	
		}
		
		System.out.println("The sum is equal to " + sum);
		System.out.println("The high is equal to " + high);
		System.out.println("The low is equal to " + low);
		
	}

}
