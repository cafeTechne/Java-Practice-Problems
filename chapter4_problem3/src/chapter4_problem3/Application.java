
package chapter4_problem3;

import java.util.Scanner;
import java.io.*;

public class Application {

	public static void main(String[] args) throws IOException{
		/*
	 * Distance Traveled , Chapter 4, Problem 3
	 * 
	 * Extends Problem 2, by writing the results to a user-
	 * defined text file! 
	 */
		
		double speed = 0;
		double timeTraveled = 0;
		double summedDistance = 0;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("User enter the speed of a vehicle in mph: ");
		speed = keyboard.nextDouble();
		if (speed < 0) {
			System.out.println("User, please enter a positive number!");
			System.out.println("closing...");
			System.exit(0);
		}
		
		System.out.println("User enter the distance traveled in miles: ");
		timeTraveled = keyboard.nextDouble();
		if (timeTraveled < 1) {
			System.out.println("User, please enter a number greater than 0");
			System.out.println("closing...");
			System.exit(0);
		}
		
		//consume the next line...
		keyboard.nextLine();
		
		//get the filename
		System.out.println("Enter the filename: ");
		String filename = keyboard.nextLine();
		
		//Make sure the file does not exist.
		File file = new File(filename);
		if(file.exists()) {
			System.out.println("The file " + filename + "already exists.");
			System.exit(0);
		}
		
		//Open the file
		PrintWriter outputFile = new PrintWriter(file);
		
		
		outputFile.println("**********************************");
		outputFile.println("Hour *********** Distance Traveled");
		for(int i = 1; i<timeTraveled+1; i++)
		{
			summedDistance = i * speed; 
			outputFile.println(i + " ************** " + summedDistance);
		}

		//close the file
		outputFile.close();
		System.out.println("Data has been written to the file!");
	}
}