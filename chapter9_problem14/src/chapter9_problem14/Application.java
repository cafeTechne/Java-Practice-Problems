package chapter9_problem14;

import java.util.Scanner;
public class Application {

	public static void main(String[] args) {
		/**
		 * Word Separator
		 * 
		 * Write a program that accepts as input a sentence
		 * in which all of the words are run together,
		 * but the first character of each word is uppercase. 
		 * Convert the sentence to a string in which the words are
		 * separated by spaces and only the first word starts with
		 * an uppercase.
		 * 
		 * For example, the string "StopAndSmellTheRoses." would be converted to "Stop and smell the roses."
		 */

		Scanner keyboard = new Scanner(System.in);
		System.out.println("User, please enter a String of runOnWords in camelCase and I will translate it into a well-formed sentence...");
		String input = keyboard.nextLine();
		
		char [] charArray = input.toCharArray();
		int wordCounter = 0;
		
		StringBuilder srb = new StringBuilder();
		
		for(int i = 0; i<charArray.length; i++) {
			char tempChar = charArray[i];
			
			if (wordCounter == 0) {
				tempChar = Character.toUpperCase(charArray[i]);
				srb.append(tempChar);
				wordCounter +=1;
			}
			else {
				if (Character.isUpperCase(charArray[i])) {
					srb.append(' ');
					tempChar = Character.toLowerCase(charArray[i]);
					srb.append(tempChar);
				}
				else srb.append(charArray[i]);
			}
		}
		
		System.out.println(srb);
		
		
		
		
		
	}

}
