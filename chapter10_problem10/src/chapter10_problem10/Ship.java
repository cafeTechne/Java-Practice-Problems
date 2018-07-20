package chapter10_problem10;

public class Ship {
	
	/*
	 * Design a Ship class that the following members:
	 * 
	 * a field for the name of the ship 
	 * a field for the year that the ship was built
	 * a constructor and appropriate accessors and mutators
	 * A toString method that displays the ship's name and the year it was buil
	 */
	
	private String shipName;
	private String yearBuilt;
	
	public Ship(){
		this.setShipName("default Ship Name");
		this.setYearBuilt("default year built");
	}
	
	public Ship(String shipName, String yearBuilt){
		this.setShipName(shipName);
		this.setYearBuilt(yearBuilt);
	}

	public String getShipName() {
		return shipName;
	}

	public void setShipName(String shipName) {
		this.shipName = shipName;
	}

	public String getYearBuilt() {
		return yearBuilt;
	}

	public void setYearBuilt(String yearBuilt) {
		this.yearBuilt = yearBuilt;
	}
	
	
	public String toString() {	
		return "The shipName is " + 
				this.shipName + 
				" and the year it was built was " + 
				this.yearBuilt;	
	}
	
	
	

}
