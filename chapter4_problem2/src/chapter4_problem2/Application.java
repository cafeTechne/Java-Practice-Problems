package chapter4_problem2;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		/*
		 * Distance Traveled , Chapter 4, Problem 2
		 * 
		 * Write a program that asks for the speed of a vehicle (in 
		 * miles-per-hour) and the number of hours it has traveled.
		 * It should use a loop to display the distance a vehicle
		 * has traveled for each hour of a time period specified by
		 * the user.
		 * 
		 * Input Validation: Do not accept a negative number for speed and
		 * do not accept any value less than 1 for time traveled
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
		
		
		System.out.println("**********************************");
		System.out.println("Hour *********** Distance Traveled");
		for(int i = 1; i<timeTraveled+1; i++)
		{
			summedDistance = i * speed; 
			System.out.println(i + " ************** " + summedDistance);
		}
	}
}
