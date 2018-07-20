package chapter10_problem10;

public class CruiseShip extends Ship {

	/*
	 * Design a CruiseShip class that extends the Ship class.
		 * The CruiseShip class should have the following members:
		 * 
		 * a field for the max number of passengers 
		 * a constructor and appropriate accessors and mutators...
		 * a toString method that overrides the toString method in the base class.
		 * The CruiseShip class's toString method should display only the ship's name
		 * and the max num of passengers
		 * 
	 */
	
	private int maxNumOfPassengers;
	
	public CruiseShip(String shipName, String yearBuilt, int maxNumOfPassengers) {
		super.setShipName(shipName);
		super.setYearBuilt(yearBuilt);
		this.setMaxNumOfPassengers(maxNumOfPassengers);
	}

	public int getMaxNumOfPassengers() {
		return maxNumOfPassengers;
	}

	public void setMaxNumOfPassengers(int maxNumOfPassengers) {
		this.maxNumOfPassengers = maxNumOfPassengers;
	}
	
	public String toString() {	
		return "The shipName is " + 
				super.getShipName() + 
				" and the year it was built was " + 
				super.getYearBuilt() +
				" and the max number of passengers is " +
				this.getMaxNumOfPassengers();
	}
	
	
	
}
