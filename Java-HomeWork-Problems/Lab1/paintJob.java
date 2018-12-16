/**
 * This program allows a user to enter the total square feet of wall space to be painted and the price per gallon, and then calculates the price of the entire job.
 */

import java.util.Scanner;

public class paintJob{

	final static double laborPerGallon = 8;
	final static double gallonsPerSquareFeet = 8;

	
	public static void main (String[] args){
		double squareFootage = queryUserForSquareFootage();
		double paintPrice = queryUserForPaintPrice();
		double paintNeeded = calculatePaintNeeded(squareFootage);
		double laborNeeded  =  calculateLabor(paintNeeded);
		double paintCost = calculatePaintCost(paintPrice, paintNeeded);
		double laborCost = calculateLaborCost(laborNeeded);
		System.out.println("The cost of the entire job is " + (getTotalCost(laborCost, paintCost)));
		System.exit(0);
	}
	
	
	/**
	 * Queries user to enter the amount of area to be painted, in square footage
	 * @return The amount of square footage that the user entered.
	 */
	
	public static double queryUserForSquareFootage(){
		System.out.println("User, please enter the total square feet of wall space to be painted");
		Scanner keyboard = new Scanner(System.in);
		double squareFootage = keyboard.nextDouble();
		return squareFootage;
	}

	
	/**
	 * Queries user to input the amount paid for the particular paint they plan on using.
	 * @return The price of the paint.
	 */
	
	public static double queryUserForPaintPrice(){
		System.out.println("User, how much is the paint per Gallon?");
		Scanner keyboard = new Scanner(System.in);
		double paintPrice = keyboard.nextDouble();
		keyboard.close();
		return paintPrice;
	}
	

	/** •	Calculates the number of gallons of paint required and uses Math.ceil() to round-up to the nearest Integer.
	 * 
	 * @param squareFootage The square footage of the job is passed to this function. 
	 * @return The number of gallons of paint required.
	 */
	public static double calculatePaintNeeded(double squareFootage)
	{
		System.out.println("Paint Needed is "+ Math.ceil(squareFootage/115));
		return Math.ceil(squareFootage / gallonsPerSquareFeet);
	}
	
	
	/** Calculates the amount of labor required to finish a job, based on the amount of paint to apply.
	 * 
	 * @param paintNeeded The amount of paint needed, expressed in Gallons.
	 * @return The amount of labor required to complete a job, expressed in hours.
	 */
	
	
	public static double calculateLabor(double paintNeeded)
	{
		System.out.println("Labor Needed is "+ (paintNeeded * 8) + " hours");
		return paintNeeded * laborPerGallon;	
	}
	
	
	/**	 The cost of the paint
	 * 
	 * @param paintPrice The price of the paint used, per gallon.
	 * @param paintNeeded The amount of paint needed to complete the job.
	 * @return The cost of the paint for the entire job.
	 */
	
	public static double calculatePaintCost(double paintPrice, double paintNeeded )
	{
		System.out.println("Paint Cost is "+ (paintPrice * paintNeeded) + " dollars");
			return paintPrice * paintNeeded;
	}
	
	
	/** The labor charges for the entire job, at $18 per hour.
	 *  
	 * @param laborNeeded The number of hours of labor needed to complete the job.
	 * @return The total cost of labor needed to complete the job.
	 */
	public static double calculateLaborCost(double laborNeeded){
		System.out.println("Labor Cost is "+ (18.0 * laborNeeded) + " dollars");
			return 18.0 * laborNeeded;
	}
	
	
	/** The total cost of the paint job
	 * 
	 * @param laborCost The total cost of labor needed to complete the job.
	 * @param paintCost The cost of the paint for the entire job.
	 * @return The total cost of the job.
	 */
	
	public static double getTotalCost(double laborCost, double paintCost){
		return laborCost + paintCost;
	}
}
