package chapter4_problem1;

import java.util.Scanner;
import java.io.*;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * Sum of Numbers, Chapter 4, Problem 1
		 * 
		 * Write a program that asks the user for a positive nonzero
		 * integer value. The program should use a loop to get a the sum
		 * of all the integers from 1 up to the number entered. For example,
		 * if the user enters 50, the loop will find the sum of 1,2,3,4,...50.
		 * 
		 */
		
		int sum = 0;
		int input = 0;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("User, please enter a positive nonzero integer value: ");
		input = keyboard.nextInt();
		
		for(int i = 1; i<input+1; i++) {
			sum += i;
		}
		
		System.out.println("The value of sum is: "+ sum);
		
		keyboard.close();
	}

	
	
	
}
