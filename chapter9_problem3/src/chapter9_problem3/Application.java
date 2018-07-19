package chapter9_problem3;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		/**
		 * Sentence Capitalizer
		 * 
		 * -Method accepts a String object as an argument and returns a copy of the string
		 * with the first character of each sentence capitalized. 
		 * 
		 * Demonstrate by asking user to input a string and then passes it to the method. 
		 * the modified string should be displayed on screen.
		 * 
		 */

		String inputString;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("User, please enter a sentence you would like Capitalized: ");
		inputString = keyboard.nextLine();
		
		Capitalizer capitalizer = new Capitalizer(inputString);
	}

}
