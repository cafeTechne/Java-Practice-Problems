package chapter4_problem5;

import java.util.Scanner;
import java.io.*;


public class Application {

	public static void main(String[] args) throws IOException {
		/*
		 * Chapter 4, Problem 5
		 * 
		 * Write a program that asks the user to enter a string, and then asks the user to enter
		 * a character. The program should count and display the number of times that the 
		 * specified character appears in the file. Use gedit or another text editor to create 
		 * a simple file that can be used to test the program.
		 */
		
		int counter = 0;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("User, enter a filename:");
		String inputString = keyboard.nextLine();
		
		System.out.println("User, enter a character:");
		String inputInitialString = keyboard.next();
		
		if (inputInitialString.length() > 1) {
			System.out.println("The length must be 1... a character... not a word!");
			System.exit(0);
		}
		
		char testChar = inputInitialString.charAt(0);
		
			File inputFile = new File(inputString);
			Scanner file = new Scanner(inputFile);
			
			if (inputFile.exists()) {
				System.out.println("User, your jammy jam," + inputFile + " exists!");
			}
			else {
				System.out.println("Your file does not exist!");
			}
			
			
			//Get data and write it to the file.
			while (file.hasNext()) {
				String testString = file.next();
				
				for (int i = 0; i < testString.length(); i++) {
					if (testString.charAt(i) == testChar) {
						counter++;
					}
				}
			}
		
			System.out.println("There are a total of " + counter + " test characters that match " + testChar);

	}

}
