package chapter10_problem10;

public class Application {

	public static void main(String[] args) {
		/*
		 * Chapter 10, Problem 10
		 * Design a Ship class that the following members:
		 * 
		 * a field for the name of the ship 
		 * a field for the year that the ship was built
		 * a constructor and appropriate accessors and mutators
		 * A toString method that displays the ship's name and the year it was buil
		 * 
		 * Design a CruiseShip class that extends the Ship class.
		 * The CruiseShip class should have the following members:
		 * 
		 * a field for the max number of passengers 
		 * a constructor and appropriate accessors and mutators...
		 * a toString method that overrides the toString method in the base class.
		 * The CruiseShip class's toString method should display only the ship's name
		 * and the max num of passengers
		 * 
		 * Design a CargoShip class that extends the Ship class. 
		 * The CargoShip class should have the follwing members:
		 * 
		 * a field for the cargo capacity in tonnage
		 * a toString method that overrides the toString method
		 * in the base class. The CargoShip class's toString method 
		 * should display only the ship's name and the ship's cargo capacity
		 * 
		 * 
		 * Demonstrate the classes in a program that has a Ship array. Assign various 
		 * Ship, CruiseShip, and CargoShip objects to the array elements. 
		 * The program should then step through the array, calling each object's toString method...
		 */

		//shipArray
		
		final int MAX_SHIPS = 3;
		
		Ship arr[] = new Ship[MAX_SHIPS];
		
		//String shipName, String yearBuilt, int maxNumOfPassengers
		CruiseShip cruiser = new CruiseShip("Generic Cruise Ship 1", "1994", 500);
		CargoShip frigate = new CargoShip("frigate 9", "2001", 9503);
		Ship shippy = new Ship("Shippy the Ship", "2015");
		
		arr[0] = cruiser;
		arr[1] = frigate;
		arr[2] = shippy;
		
		for(int i=0; i<arr.length; i++) {
			
			System.out.println(arr[i].toString());
		}
		
	}

}
