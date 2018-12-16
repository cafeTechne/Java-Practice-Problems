
/**********************************************************************************************************/
/*********************************************************************************************/
//Service Class: PaintEstimator
  
  //*****************************************
  //   Name: Gino LaGuardia-LoBianco
  //   CTP 150 – Section# 003
  //   Lab # 003
  //*****************************************

/**
 * This program allows a user to enter the total square feet 
 * of wall space to be painted and the price per gallon, 
 * and then calculates the price of the entire job. 
 * 
 * This class defines the methods used to calculate the cost of painting a room.
 */

import java.text.DecimalFormat;
import java.util.*;

public class PaintEstimator{

	//constants in CAPS
	final static double LABOR_PER_GALLON = 8;
	final static double GALLONS_PER_SQUARE_FEET = 115;

	//o Private data members – variables for inputs (total square feet and price for paint) and constants for given values

	private double squareFootage;
	private double paintPrice;

	
	/********************************/
	//formatting method
	String pattern = "#0.00";
	DecimalFormat df = new DecimalFormat(pattern);


	//default constructor
	public PaintEstimator(){
		this.squareFootage = 0.0;
		this.paintPrice = 0.0;
	}
	
	//overloaded constructor
	public PaintEstimator(double squareFootage, double paintPrice){
		this.squareFootage = squareFootage;
		this.paintPrice = paintPrice;
	}

	/**
	 * Sets the square the amount of area to be painted.
	 * @param squareFootage a description of the amount of area to be painted.
	 */
	public void setSquareFootage(double squareFootage){
		this.squareFootage = squareFootage;
	}
	
	/** Sets the price of paint per gallon.
	 * 
	 * @param paintPrice The price of paint per gallon.
	 */
	
	public void setPaintPrice(double paintPrice){
		this.paintPrice = paintPrice;
	}
	
	/**
	 * Returns the square footage.
	 * @return Returns the square footage as a double.
	 */
	
	public double getSquareFootage(){
		return this.squareFootage;
	}
	
	/**
	 * Returns the price of paint.
	 * @return Returns the price of paint in dollars.
	 */
	
	public double getPaintPrice(){
		return this.paintPrice;	
	}

	/**
	 * Queries user to enter the amount of area to be painted, in square footage
	 * @return The amount of square footage that the user entered.
	*/
	
	public double queryUserForSquareFootage(){
		System.out.println("User, please enter the total square feet of wall space to be painted");
		Scanner keyboard1 = new Scanner(System.in);
		double squareFootage = keyboard1.nextDouble();
		return squareFootage;
	}

	
	/**
	 * Queries user to input the amount paid for the particular paint they plan on using.
	 * @return The price of the paint.
	 */
	
	public double queryUserForPaintPrice(){
		System.out.println("User, how much is the paint per Gallon?");
		Scanner keyboard = new Scanner(System.in);
		double paintPrice = keyboard.nextDouble();
		return paintPrice;
	}
	

	/**Calculates the number of gallons of paint required and uses Math.ceil() to round-up to the nearest Integer.
	 * 
	 * @param squareFootage The square footage of the job is passed to this function. 
	 * @return The number of gallons of paint required.
	 */
	
	public double calculatePaintNeeded()
	{
		//System.out.println("Paint Needed is "+ Math.ceil(squareFootage/115));
		//I took out the code that makes the gallons discrete so it matches your screenshot. 
		//return Math.ceil(squareFootage / GALLONS_PER_SQUARE_FEET);
		double paintNeeded = Math.ceil(this.squareFootage / GALLONS_PER_SQUARE_FEET);
		return paintNeeded;
	}
	
	
	/** Calculates the amount of labor required to finish a job, based on the amount of paint to apply.
	 * 
	 * @param paintNeeded The amount of paint needed, expressed in Gallons.
	 * @return The amount of labor required to complete a job, expressed in hours.
	 */
	
	
	public double calculateLaborNeeded(double paintNeeded)
	{
		System.out.println("Labor Needed is "+ df.format((paintNeeded * 8)) + " hours");
		double laborNeeded = paintNeeded * LABOR_PER_GALLON;	
		return laborNeeded;
	}
	
	
	/** The labor charges for the entire job, at $18 per hour.
	 *  
	 * @param laborNeeded The number of hours of labor needed to complete the job.
	 * @return The total cost of labor needed to complete the job.
	 */
	public double calculateLaborCost(double laborNeeded){
		System.out.println("Labor Cost is "+ df.format(18.0 * laborNeeded) + " dollars");
		double laborCost = 18.0 * laborNeeded;
		return laborCost;
	}
	
	
	/**	 Calculates he cost of the paint for a room
	 * 
	 * @param paintNeeded The amount of paint needed to complete the room.
	 * @return The cost of the paint for a room as a double.
	 */
	
	
	public double calculatePaintCost(double paintNeeded)
	{
		System.out.println("Paint Cost is "+ df.format(paintPrice * paintNeeded) + " dollars");
		double paintCost = this.paintPrice * paintNeeded;
		return paintCost;
	}
	
	
	/** Calculates the total cost of painting the room.
	 * 
	 * @param laborCost The total cost of labor needed to complete the room.
	 * @param paintCost The cost of the paint for the room.
	 * @return The total cost of the room.
	 */
	
	public double getRoomCost(double paintCost, double laborCost){
		System.out.println("The cost of this room is: " + df.format(paintCost + laborCost));
		return paintCost + laborCost;
	}
	
}

