package chapter9_problem5;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		/*
		 * Password Verifier
		 * 
		 * PW's must meet following criteria:
		 * 
		 * 1) longer than 6 characters.
		 * 2) should contain at least one uppercase and at least one lowercase letter
		 * 3) should have at least 1 digit.
		 * 
		 * Write a class that verifies that a password meets the stated criteria.
		 * 
		 * Demonstrate the class in a program that allows the user to enter a password and then 
		 * displays a message indicating whether it is valid or not.
		 * 
		 */
		
		
		String input; 
		
		System.out.println("User, please enter a password: ");
		
		Scanner keyboard = new Scanner(System.in);
		input = keyboard.nextLine();
		
		Authenticate authenticate = new Authenticate();
		authenticate.validateSyntax(input);
		
		
		
		
		

	}

}
