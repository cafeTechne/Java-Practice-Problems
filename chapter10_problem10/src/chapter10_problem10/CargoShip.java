package chapter10_problem10;

public class CargoShip extends Ship{
	/*
	 * 
	 *  * Design a CargoShip class that extends the Ship class. 
		 * The CargoShip class should have the follwing members:
		 * 
		 * a field for the cargo capacity in tonnage
		 * a toString method that overrides the toString method
		 * in the base class. The CargoShip class's toString method 
		 * should display only the ship's name and the ship's cargo capacity
		 * 
	 * 
	 */

	private int cargoCapacity;
	
	public CargoShip(String shipName, String yearBuilt, int cargoCapacity){
		super.setShipName(shipName);
		super.setYearBuilt(yearBuilt);
		this.setCargoCapacity(cargoCapacity);
	}

	public int getCargoCapacity() {
		return cargoCapacity;
	}

	public void setCargoCapacity(int cargoCapacity) {
		this.cargoCapacity = cargoCapacity;
	}
	
	public String toString() {	
		return "The shipName is " + 
				super.getShipName() + 
				" and the year it was built was " + 
				super.getYearBuilt() +
				" and the cargo capacity is " +
				this.getCargoCapacity();
	}
	
	
}
