package chapter8_problem9;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		
		/*
		 * 
		 * Geometry Calculator: 
		 * 
		 * Design a Geometry class with the following methods:
		 * 
		 * 1) A static method that accepts the radius of a circle and returns the area of the circle.
		 * 
		 *    Use the following formulae: 
		 *    
		 *    Area = PI * r^2
		 *    
		 * 2) A static method that accepts the length and width of a rectangle and returns the area
		 *    of the rectangle. Use the following formulae: 
		 *    
		 *    Area = Length * Width
		 *    
		 * 3) A static method that accepts the length of a triangle's base and the triangle's height.
		 *    the method should return the area of the triangle. Use the following formula: 
		 *        Area = Base * Height * 0.5
		 *        
		 *        
		 *  The methods should display an error message if negative values are used for the circle's radius,
		 *  the rectangle's length or width, or the triangle's base or height
		 *  
		 *  4) Next, write a program to test the class, which displays the following menu...blah.blah.blah (see below)
		 * 		  Display an error message if the user enters a number outside of the range of 1 through 4...
		 * 
		 */
		
		int inputSelection = 0;
		double radius = 0;
		double length = 0;
		double width = 0;
		float base = 0;
		float height = 0;
		
		Scanner keyboard = new Scanner(System.in);
		
		
		
		System.out.println("Geometry Calculator ");
		System.out.println("1. Calculate the Area of a Circle ");
		System.out.println("2. Calculate the Area of a Rectangle ");
		System.out.println("3. Calculate the Area of a Triangle ");
		System.out.println("4. Quit ");
		System.out.println("");
		System.out.println("Enter your choice (1-4): ");
		
		inputSelection = keyboard.nextInt();
		
		if (inputSelection <= 0 || inputSelection >4) {System.out.println("That is not a valid selection.");}
		
		if (inputSelection == 4) {
			System.out.println("Program terminated");
			System.exit(0);
		}
		
		
		else if (inputSelection == 1) {
		
			System.out.println("Enter a radius");
			radius = keyboard.nextDouble();
			
			System.out.println("The area of the circle is " + Geometry.calcArea(radius));
		}
		
		
		else if (inputSelection == 2) {
			
			System.out.println("Enter a length");
			length = keyboard.nextDouble();
			
			System.out.println("Enter a width");
			width = keyboard.nextDouble();
			
			System.out.println("The area of the rectangle is " + Geometry.calcArea(length, width));
		}
		
		
		else if (inputSelection == 3) {
			System.out.println("Enter a base");
			base = keyboard.nextFloat();
			
			System.out.println("Enter a height");
			height = keyboard.nextFloat();
			
			System.out.println("The area of the rectangle is " + Geometry.calcArea(base, height));
		}
		
		
	}

}
