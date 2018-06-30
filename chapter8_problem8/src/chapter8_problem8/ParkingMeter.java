package chapter8_problem8;

public class ParkingMeter {

	/**
	 * This class should simulate a parking meter.
	 * 
	 * Responsibilities: To know the number of minutes of parking time that has been purchased.
	 * 
	 */
	
	private int parkingTimePurchased;
	
	
	//default constructor
	ParkingMeter(){
		setParkingTimePurchased(30);
		
	}
	//sets the minimum amount of purchased time at 30 minutes when instantiated

	
	
	public int getParkingTimePurchased() {
		return parkingTimePurchased;
	}


	public void setParkingTimePurchased(int parkingTimePurchased) {
		this.parkingTimePurchased = parkingTimePurchased;
		
	}
	
	public void addTimeToMeter(int quartersInserted) {
		int placeHolderTimeInMeter = this.parkingTimePurchased;
		
		this.parkingTimePurchased = (30 * quartersInserted) + placeHolderTimeInMeter;
	}
	
	
	
}
