import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		
		/*
		 * A hotel's occupancy rate is calculated as follows:
		 * occupancy rate = number of rooms occ'd / total number of rooms
		 * 
		 * Write a program that calculate the occupancy rate for each floor of a hotel. The program
		 * should start by asking for the number of floors in the hotel.
		 * 
		 * A loop should then iterate once for each floor.
		 * 
		 * During each iteration, the loop should ask the user for the number of rooms
		 * on the floor and the number of them that are occupied. 
		 * 
		 * After all the iterations, 
		 * the program should display the number of rooms that the hotel has,
		 * the number of them that are occupied,
		 * the number that are vacant,
		 * and the occupancy rate for the hotel
		 * 
		 * Input Validation: Do not accept a value less than 1 for the number of floors.
		 * 
		 * Do not accept a number less than 10 for the number of rooms on a floor.
		 */
		
		double numberOfRooms = 0;
		double occupiedRooms = 0;
		double occupancyRate = 0;
		int numberOfFloors = 0;
		double inputNumber = 0;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("User, how many floors are in this hotel?");
		numberOfFloors = keyboard.nextInt();
		if (numberOfFloors < 1) {
			System.out.println("Number must be 1 or greater!");
			System.exit(0);
		}
		
		for(int i=0;i<numberOfFloors;i++) {
			System.out.println("User, how many rooms are on this floor?");
			inputNumber = keyboard.nextDouble();
			if (inputNumber < 10) {
				System.out.println("Number must be 10 or greater!");
				System.exit(0);
			}
			
			numberOfRooms += inputNumber;
			
			System.out.println("User, how many rooms on this floor are occupied?");
			inputNumber = keyboard.nextDouble();
			if (inputNumber < 0) {
				System.out.println("Number must be 0 or greater!");
				System.exit(0);
			}
			
			occupiedRooms += inputNumber;
		}
		
		System.out.println("User, the hotel has " + numberOfRooms + " rooms in total.");
		System.out.println("User, the hotel has " + occupiedRooms + " occupied rooms.");
		
		occupancyRate = occupiedRooms/numberOfRooms;
		System.out.println("The occupancy rate is " + occupancyRate);
		
		
		
	}

}
