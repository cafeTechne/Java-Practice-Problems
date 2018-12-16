//******************************************
//Programmer: Gino N. LaGuardia-LoBianco
//CTP150 - section # 003
//Lab #2
//******************************************

/**
 * This program allows a user to enter the total square feet 
 * of wall space to be painted and the price per gallon, 
 * and then calculates the price of the entire job.
 */

import java.text.DecimalFormat;
//import PaintEstimator;

public class PaintJob{

	public static void main (String[] args){

		/********************************/
		//formatting method
		String pattern = "#0.00";
		DecimalFormat df = new DecimalFormat(pattern);

		
		/********************************/
		//object instantiated with the default Constructor		
		PaintEstimator room1 = new PaintEstimator();		
		
		System.out.println("Room 1: \n");
		room1.setSquareFootage(room1.queryUserForSquareFootage());
		room1.setPaintPrice(room1.queryUserForPaintPrice());
		
		double paintNeeded = room1.calculatePaintNeeded();	
		double laborCost = room1.calculateLaborCost(room1.calculateLaborNeeded(paintNeeded));
		double paintCost =  room1.calculatePaintCost(paintNeeded);
		double room1Cost = room1.getRoomCost(paintCost, laborCost);
		
		
		/********************************/
		//object instantiated with the overloaded Constructor
		PaintEstimator room2 = new PaintEstimator(800, 25);		
		
		System.out.println("\nRoom 2: \n");
	
		double paintNeeded2 = room2.calculatePaintNeeded();
		double laborCost2 = room2.calculateLaborCost(room2.calculateLaborNeeded(paintNeeded2));
		double paintCost2 = room2.calculatePaintCost(paintNeeded2);
		double room2Cost = room2.getRoomCost(paintCost2, laborCost2);
		
		
		System.out.println("\nThe cost of the entire job is " + df.format((room1Cost + room2Cost)));
		System.exit(0);
	}
	
	
	}


