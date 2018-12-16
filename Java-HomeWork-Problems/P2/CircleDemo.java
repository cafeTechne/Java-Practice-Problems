import java.util.*;

/**
 * This program demonstrates the Circle class by asking the user for the circle's 
 * radius, creating a Circle object, and then reporting the circle's area, diameter, and circumference.
 * @author cafeTechne, CTP150, FALL2018
 *
 */

public class CircleDemo {

	public static void main(String[] args) {
		
		//initialize the Scanner object to take input
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("User, please enter the radius of a circle");
		double radius = keyboard.nextDouble();
		
		//instantiate a circle object with the user-defined radius
		Circle circle = new Circle(radius);
		
		//calls a method to display the area, diameter, and circumference of this circle.
		circle.displayInfo();
	}

}
