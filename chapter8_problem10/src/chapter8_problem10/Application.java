package chapter8_problem10;

public class Application {

	public static void main(String[] args) {
	
		/*
		 * Car Instrument Simulator
		 * 
		 * Design a set of classes that work together to simulate a car's fuel gauge
		 * and odometer.
		 * 
		 * 1) The FuelGauge Class: 
		 *   Responsibilities: 
		 *     a) To know the car's current amount of fuel, in gallons
		 *     b) to report the car's current amount of fuel, in gallons.
		 *     c) to be able to increment the amount of fuel by 1 gallon.
		 *        This simulates putting fuel in the car. (max = 15 gallons)
		 * 
		 * 2) The Odometer Class:
		 *      Responsibilities: 
		 *        a) to know the car's current mileage.
		 *        b) to report the car's current mileage
		 *        c) to be able to increment the current mileage by 1 mile.
		 *           The maximum mileage the odometer can store is 999,999 miles.
		 *           When this amount is exceeded, the odometer resets the 
		 *           current mileage to 0.
		 *        d) To be able to work with a FuelGauge object. It should
		 *           decrease the FuelGauage object's current amount of fuel by 
		 *           1 gallon for every 24 miles traveled. 
		 *           (The car's fuel economy is 24 miles per gallon)
		 *           
		 *    Demonstrate the classes by creating instances of each. 
		 *    Simulate filling the car up with fuel, and then run a loop that increments
		 *    the odometer until the car runs out of fuel. During each loop
		 *    iteration, print the car's current mileage and amount of fuel.
		 * 
		 * 
		 */
		
		
		//instantiate each class: 
		FuelGauge gauge = new FuelGauge(); //do this to access the static method
		Odometer odometer = new Odometer();
		
		//Simulate filling a car up:
		FuelGauge.fillUpWithFuel();
		//Car filled up! Tests passed.
		
		
		while (FuelGauge.getFuel() > 0)
		{
			odometer.incrementOdometer(gauge);
			
			System.out.println("There are " + odometer.getMileage() + " miles on the dash."); 
			System.out.println("There are " + FuelGauge.getFuel() + " gallons of fuel left."); 
			
		}
		//tests passed! ::360%24 = 15, so odometer & fuel gauage are working correctly!
	    
	
	}

}
