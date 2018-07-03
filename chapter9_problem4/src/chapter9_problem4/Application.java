package chapter9_problem4;

import java.util.Scanner;


public class Application {
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		String input;
		String storedString;
		int inputINT;
		
		
		System.out.println("User, please enter a string: ");
		input = keyboard.nextLine();
		storedString = input;
		
		
		while (input != "-1") {
			Vowelizer vowelizer = new Vowelizer(storedString);
			 
			
			System.out.println("1. Count the number of vowels in the string: ");
			System.out.println("2. Count the number of consonants in the string: ");
			System.out.println("3. Count both vowels & consonants in the string: ");
			System.out.println("4. Enter another string: ");
			System.out.println("5. Exit the program: ");
			
			System.out.println("User, enter a choice please:");
			inputINT = keyboard.nextInt();
			
	
			if (inputINT == 1) System.out.println(vowelizer.getVowels(storedString) + " vowels.");
			if (inputINT == 2) System.out.println(vowelizer.getConsonants(storedString) + " consonants.");
			if (inputINT == 3) System.out.println(vowelizer.getVowels(storedString) + vowelizer.getConsonants(storedString) + " vowels + consonants.");
			if (inputINT == 4) {
				keyboard.nextLine(); 
				System.out.println("User, please enter a string: ");
				storedString = keyboard.nextLine();
			}
			if (inputINT == 5) break;
		}
		System.out.println("Exiting Program.");
		System.exit(1);
		

	}

}
