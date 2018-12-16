import java.util.Scanner;
import java.text.*;

public class Circle {

	public static void main(String[] args) {
		
		/*
		3. Write a program that asks the user to enter the radius of a circle, 
		and calculates circle’s area, 
		diameter, 
		and circumference, 
		and then display these calculation results. 
		*/

		double radius = getRadius();
		double area = getArea(radius);
		double diameter = getDiameter(radius);
		double circumference = getCircumference(radius);
		displayInfo(radius, area, diameter, circumference);
		
		
	}
	
	
	/**
	 *  Asks the user to enter a radius, and then returns the value.
	 * @param
	 * @return The circumference of a circle
	 */
	
	public static double getRadius(){
		System.out.println("User, please enter the radius of a Circle");
		Scanner keyboard = new Scanner(System.in);
		double radius = keyboard.nextDouble();
		return radius;
	}
	
	/**
	 * Returns the area of a circle.
	 * @param radius
	 * @return The area of the circle.
	 */
	
	public static double getArea(double radius) {
		double area = Math.PI * radius * radius;
		return area;
	}
	
	/**
	 * Returns the diameter of a circle.
	 * @param radius
	 * @return The diameter of the circle.
	 */
	
	public static double getDiameter(double radius) {
		double diameter = 2 * radius;
		return diameter;
	}
	
	/**Returns the circumference of a circle.
	 * @param
	 * @return The circumference of a circle.
	 */
	
	public static double getCircumference(double radius) {
		double circumference = 2 * Math.PI * radius;
		return circumference;
	}
	
	/**
	 * Displays the circle's radius, area, diameter and circumference.
	 * @param radius
	 * @param area
	 * @param diameter
	 * @param circumference
	 */
	
	public static void displayInfo(double radius, double area, double diameter, double circumference) {
		
		//Output for the floating points should be in the format of “#0.00”.
		String pattern = "#0.00";
		DecimalFormat decimalFormat = new DecimalFormat(pattern); 
		
		System.out.println("The radius is: " + decimalFormat.format(radius));
		System.out.println("The area is: " + decimalFormat.format(area));
		System.out.println("The diameter is: " + decimalFormat.format(diameter));
		System.out.println("The circumference is: " + decimalFormat.format(circumference));

	}

}
