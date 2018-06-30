package chapter8_problem10;

public class Odometer {
	/*
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
	 */
	
	private double mileage;
	
	
	
	public Odometer() {
		this.mileage = 0;
	}
	
	public double getMileage() {
		return this.mileage;
	}
	
	public void incrementOdometer(FuelGauge gauge) {
		checkForOdometerMax();
		double temp = this.mileage + 1;
		this.mileage = temp;
		consumeFuel(gauge);
	}
	
	public void checkForOdometerMax() {
		if( this.mileage == 999999) {
			this.mileage = 0;
			System.out.println("Reset Odometer to 0!"); //test		
		}
	}
	
	public void consumeFuel(FuelGauge gauge){
		if (this.mileage%24==0) {
			FuelGauge.decreaseFuel();
		}
	}
}
