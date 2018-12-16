/**
 * This program allows a user to enter the total square feet 
 * of wall space to be painted and the price per gallon, 
 * and then calculates the price of the entire job.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class PaintJob{

	public static void main (String[] args){

		String pattern = "#0.00";
		DecimalFormat df = new DecimalFormat(pattern);

		//object instantiated with default constructor
		PaintEstimator room1 = new PaintEstimator();
		
		
		System.out.println("Room 1: \n");
		System.out.println("User, please enter the total square feet of wall space to be painted");
		
		Scanner keyboard = new Scanner(System.in);
		double squareFootage = keyboard.nextDouble();
		
		System.out.println("User, how much is the paint per Gallon?");
		double paintPrice = keyboard.nextDouble();
		
		
		room1.setSquareFootage(squareFootage);
		room1.setPaintPrice(paintPrice);
		
		
		System.out.println("\nPaint Cost is $"+ df.format(room1.calculatePaintCost()));
		System.out.println("Labor Cost is $"+ df.format(room1.calculateLaborCost()));
		System.out.println("The cost of this room is: $" + df.format(room1.getRoomCost()) + "\n \n");
	
		
		System.out.println("Room 2: \n");
		System.out.println("User, please enter the total square feet of wall space to be painted");
		double squareFootage2 = keyboard.nextDouble();
		
		System.out.println("User, how much is the paint per Gallon?");
		double paintPrice2 = keyboard.nextDouble();
		
		
		//object instantiated with the overloaded Constructor
		PaintEstimator room2 = new PaintEstimator(squareFootage2, paintPrice2);		
				
		
		System.out.println("\nPaint Cost is $"+ df.format(room2.calculatePaintCost()));
		System.out.println("Labor Cost is $"+ df.format(room2.calculateLaborCost()));
		System.out.println("The cost of this room is: $" + df.format(room2.getRoomCost()));
	
		
		System.out.println("\nThe cost of the entire job is $" + df.format((room1.getRoomCost() + room2.getRoomCost())));
		keyboard.close();
		System.exit(0);
	}
}


