package chapter4_problem8;

import java.util.Scanner;


public class Application {

	public static void main(String[] args) {
		/*
		 *Average Rainfall, Chapter 4, Problem 8
		 *
		 *Write a program that uses nested loops to collect data and calculate the average rainfall
		 *over a period of years. First the program should ask for the number of years.
		 *
		 *The outer loop iwll iterate once for each year. The inner loop will iterate 12 times,
		 *once for each month. 
		 *
		 *Each iteration of the inner loop will ask the user for the inches of rainfall for that month. 
		 *
		 *After all iterations, the program should display the number of months, the total inches of 
		 *rainfall, and the average rainfall per month for the entire period.
		 *
		 *Input Validation: Do not accept anumber less than 1 for th enumber of years.
		 *
		 *Do not accept negative numbers for the monthly rainfall.
		 *
		 */
		
		double totalRainfall = 0;
		double totalMonths = 0;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("User, this program calculates the rainfall for a give number of years. ");
		System.out.println("How many years of data would you care to enter?");
		int inputNumber = keyboard.nextInt();
		
		double inputMonthNumber = 0;
		
		for (int j = 1 ; j < inputNumber+1 ; j++) {
			System.out.println("This is year " + j);
			for (int i = 0; i < 12; i++) {
				System.out.println("User please enter the amount of rainfall for month " + i);
				inputMonthNumber = keyboard.nextDouble();
				++totalMonths;
				totalRainfall += inputMonthNumber; 
			}
		}
		
		
		
		
		
		
	}

}
