package chapter9_problem2;

import java.util.Scanner;

public class Application {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Word counter
		 * 
		 * Write a method that accepts a String object as an argument and returns
		 * the number of words it contains.
		 * 
		 * Demonstrate by asking user to input a string, then passing to a method.
		 * Number of words should be displayed on the screen.
		 */
		
		String word;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("User, enter a sentence and I will count the words!");
		word = keyboard.nextLine();
		
		
		WordCounter countedWord = new WordCounter(word);
		System.out.println("There are " + countedWord.getWordCount() + " words in this sentence.");
	}

}
