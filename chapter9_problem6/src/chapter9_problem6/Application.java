package chapter9_problem6;

import java.util.Scanner;

public class Application {

	private static Scanner keyboard;

	public static void main(String[] args) {

		/*
		 * Telemarketing Phone Number List
		 * 
		 * Write a program that has two parallel arrays of STring objects. One of the
		 * arrays should hold people's names and the other should hold their phone
		 * numbers.
		 * 
		 *  The program should ask the user to enter a name or the first few 
		 *  characters of a name to search for in the array. The program should
		 *  display all of the names that match the user's input and their
		 *  corresponding phone numbers. For example, if the user enters "Smith", 
		 *  the program should display the following names and phone numbers
		 *  from the list: 
		 *  
		 *     Smith, William: 555=1785
		 *     Smith, Brad: 555-9224
		 * 
		 * 
		 */
		
		String[] nameArray = {"Harrison, Rose", "James, Jean", "Smith, William", "Smith, Brad"};
		String[] numberArray = { "555-2234", "555-9098", "555-1785", "555-9224"};
		String input;
		keyboard = new Scanner(System.in);
		
		
		System.out.println("User, enter a name or the first few characters of ");
		System.out.println("a name to search for in the array. ");
		
		input = keyboard.nextLine();
		
		WordSearcher searcher = new WordSearcher();
		
		searcher.search(input, nameArray, numberArray);
		
	}

}
