package chapter8_problem3;
import java.util.Scanner;



public class CarpetCalculator {

	public static void main(String[] args) {

		/*
		 * The Westfield Carpet Company has asked you to write an application that calculates the
		 * price of carpeting for rectangular rooms. To calculate the price, you multiply the area of the floor
		 * (width times length) by the price per square foot of carpet.
		 */
		double length = 0;
		double width = 0;
		double costPerSquareFoot = 0;
		Scanner keyboard = new Scanner(System.in);
		
		
		System.out.println("User what is the length of your room?");
		length = keyboard.nextDouble();
		
		System.out.println("User what is the width of your room?");
		width = keyboard.nextDouble();
		
		System.out.println("User how much does your selected carpeting cost?");
		costPerSquareFoot = keyboard.nextDouble();
		
		
		RoomDimension roomSize = new RoomDimension();
		roomSize.setRoomDimension(length, width);
		
		RoomCarpet room = new RoomCarpet(roomSize, costPerSquareFoot);
		
		System.out.println("The total cost of your carpeting will be $" + room.getTotalCost(roomSize)+ " dollars!");
		
		
		
	}

	

}
