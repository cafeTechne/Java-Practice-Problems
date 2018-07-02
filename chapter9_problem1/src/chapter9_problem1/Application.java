package chapter9_problem1;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		/**
		 * Backward String
		 * 
		 * Write a method that accepts a String object as an argument and displays its 
		 * contents backward. For instance, if the string argument is "gravity" the method 
		 * should display - "ytivarg". Demonstrate the method in a program that 
		 * asks the user to input a string and then passes it to the method.
		 */

	Scanner keyboard = new Scanner(System.in);
	String stringInput;
	
	
	System.out.println("User, this program reverses a string--please enter one!");
	stringInput = keyboard.nextLine();
	
	//StringBuilder builder = new StringBuilder(stringInput);
	
	WordReverser reverser = new WordReverser(stringInput);
	//all tests passed! ::high five::
	}
	
	
}
