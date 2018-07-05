package chapter9_problem8;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		
		/*
		 * Sum of Numbers in a String
		 * 
		 * Write a program that asks the user to enter a series of numbers
		 * separated by commas:
		 * 
		 * 7, 9, 10, 2, 18, 6
		 * 
		 * The program should calculate and display the sum of all numbers;
		 */
		
		Double sum = 0.0;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("User, enter a series of numbers, separated by commas, to be added: ");
		String input = keyboard.nextLine();
	
		
		input.trim();
		String[] stringArr = input.split(",");
		
		
		for (int i=0;i<stringArr.length;i++) {
			
			sum = sum + Double.parseDouble(stringArr[i]);		
		}
		
		System.out.println("The sum of those numbers is " + sum);
		
	}

}
