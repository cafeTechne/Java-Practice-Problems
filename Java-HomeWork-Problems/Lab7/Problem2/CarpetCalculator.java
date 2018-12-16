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
		double costPerSquareFoot = 8;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("This program will display the cost of carpeting a room.");
		System.out.println("You must input the room's dimensions in feet.");
		System.out.println("\n");
		
		System.out.println("\nRoom 1: ");
		System.out.println("Enter the length first: ");
		length = keyboard.nextDouble();
		
		System.out.println("Now enter the width: ");
		width = keyboard.nextDouble();
		
		
		RoomDimension roomSize = new RoomDimension();
		roomSize.setRoomDimension(length, width);
		
		
		
		System.out.println("\nRoom 2: ");
		System.out.println("Enter the length first: ");
		length = keyboard.nextDouble();
		
		System.out.println("Now enter the width: ");
		width = keyboard.nextDouble();
		
		RoomDimension roomSize2 = new RoomDimension();
		roomSize2.setRoomDimension(length, width);
		
		if(roomSize.equals(roomSize2)) {
			System.out.println("They are equal");
		}
		else {
			System.out.println("They are not equal");
		}
		
		if(roomSize.greaterThan(roomSize2)) {
			System.out.println("Room 1 is greater than Room 2.");
		}
		else {
			System.out.println("Room 2 is greater than Room 1");
		}
		
		if(roomSize.lessThan(roomSize2)) {
			System.out.println("Room 1 is less than Room 2.");
		}
		else {
			System.out.println("Room 2 is less than Room 1");
		}
		
		
		RoomCarpet room = new RoomCarpet(roomSize, costPerSquareFoot);
		RoomCarpet room2 = new RoomCarpet(roomSize2, costPerSquareFoot);
		
		
		System.out.println("\nRoom 1: ");
		System.out.println("Room Dimensions: ");
		System.out.println(roomSize);
		System.out.println("\nThe total cost of your carpeting will be $" + room.getTotalCost(roomSize)+ " dollars!");
		
		System.out.println("\nRoom 2: ");
		System.out.println("Room Dimensions: ");
		System.out.println(roomSize2);
		System.out.println("\nThe total cost of your carpeting will be $" + room2.getTotalCost(roomSize2)+ " dollars!");
		
		
	}

	

}

