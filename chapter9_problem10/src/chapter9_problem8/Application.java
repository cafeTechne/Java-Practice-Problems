package chapter9_problem8;

import java.util.Scanner;
import java.io.*;

public class Application {

	/**
	 * Word Counter
	 * 
	 * User is queried to enter a file they would like to count the words in.
	 * Program opens up stated file, throws an error if it does not exist (DNE),
	 * and counts the number of words... assuming that they are all separated by
	 * a space and there are no new line characters for simplicity of design.
	 * 
	 * @param args
	 * @throws IOException
	 */
	
	
	public static void main(String[] args) throws IOException {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the filename to count the words of:");
		String fileName = keyboard.nextLine();
		
		
		File file = new File(fileName);
		
		if (file.exists()) {
			System.out.println("Loading " + file);
		}
		else {
			System.out.println("Empty file will have 0 words... Exiting.");
			System.exit(1);
		}
		
		int spaces = 0;
		char tempChar;
		
		Scanner inputFile = new Scanner(file);
		
			while (inputFile.hasNext())
		{
				String word = inputFile.nextLine();
				for (int i=0; i < word.length(); i++) {
					tempChar = word.charAt(i);
					System.out.println(word.charAt(i));
					if ( tempChar == ' ') {
						spaces = spaces + 1;
					}
				}	
		}
			
		System.out.println(spaces + 1 + "is the number of words");
		
	}

}
