//*****************************************
  //   Name: Gino N. LaGuardia-LoBianco
  //   CTP 150 – Section#003
  //   Lab Assignment #7 , Problem 1
  //***************************************** 


package chapter8_problem9;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.*;


public class Application {

	public static void main(String[] args) throws IOException {
		
		int inputSelection = 0;
		double radius = 0;
		double length = 0;
		double width = 0;
		double base = 0;
		double height = 0;
		String pattern = "##.##";
		DecimalFormat df = new DecimalFormat(pattern);
		
		
		Scanner keyboard = new Scanner(System.in);
		
		
		while(inputSelection != 4) {
		
			System.out.println("Geometry Calculator ");
			System.out.println("1. Calculate the Area of a Circle ");
			System.out.println("2. Calculate the Area of a Rectangle ");
			System.out.println("3. Calculate the Area of a Triangle ");
			System.out.println("4. Quit ");
			System.out.println("");
			System.out.println("Enter your choice (1-4): ");
			
			try {
				inputSelection = keyboard.nextInt();
				
				if (inputSelection <= 0 || inputSelection > 4) {System.out.println("That is not a valid selection.");}
				
				if (inputSelection == 4) {
					System.out.println("Program terminated");
					System.exit(0);
				}
				
				else if (inputSelection == 1) {
					
					System.out.println("Enter a radius");
					radius = keyboard.nextDouble();
					
					System.out.println("The area of the circle is " + df.format(Geometry.calcCircleArea(radius)));
				}
				
				
				else if (inputSelection == 2) {
					
					System.out.println("Enter a length");
					length = keyboard.nextDouble();
					
					System.out.println("Enter a width");
					width = keyboard.nextDouble();
					
					System.out.println("The area of the rectangle is " + df.format(Geometry.calcRectangleArea(length, width)));
				}
				
				
				else if (inputSelection == 3) {
					System.out.println("Enter a base");
					base = keyboard.nextFloat();
					
					System.out.println("Enter a height");
					height = keyboard.nextFloat();
					
					System.out.println("The area of the triangle is " + df.format(Geometry.calcTriangleArea(base, height)));
				}
				
			}
			catch(InputMismatchException e){
				 keyboard.nextLine();
			}
		}
	}

}
