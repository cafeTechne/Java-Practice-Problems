package chapter8_problem10;

public class FuelGauge {
	
	
	/*
	*1) The FuelGauge Class: 
	*    Responsibilities: 
	*     a) To know the car's current amount of fuel, in gallons
	*     b) to report the car's current amount of fuel, in gallons.
	*     c) to be able to increment the amount of fuel by 1 gallon.
    *        This simulates putting fuel in the car. (max = 15 gallons)
    */
	
	static private double fuel;
	static public boolean full = false;
	
	
	public FuelGauge() {
		FuelGauge.fuel = 1;
	}
	
	static public void addFuel() {
		if (FuelGauge.fuel == 15) {
			FuelGauge.full = true;
			System.out.println("The tank is full");
		}
		else {
			FuelGauge.fuel = FuelGauge.fuel +1;
			System.out.println("Added 1 gallon to the tank");
		}
	}
	
	static public void fillUpWithFuel(){
		while (FuelGauge.full == false) {
			addFuel();
		}
	}
	
	static public void decreaseFuel() {
		FuelGauge.fuel = FuelGauge.fuel-1;
	}
	
	static public double getFuel() {
		
		return FuelGauge.fuel;
		
	}
	
	public void reportFuel() {
		
		System.out.println("There is currently " + getFuel() + "gallons of fuel in this vehicle.");
	}
	
}
