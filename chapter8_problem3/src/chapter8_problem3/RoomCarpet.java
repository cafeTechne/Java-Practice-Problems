
//*****************************************
//   Name: Gino N. LaGuardia-LoBianco
//   CTP 150 – Section#003
//   Lab Assignment #7 , Problem 2
//***************************************** 

package chapter8_problem3;
/**
 * This Service class uses aggregation to take a RoomDimension object and
 * has a set of utility methods to determine the cost of carpeting a room.
 * @author Gino
 *
 */
public class RoomCarpet {
	
	/**
	 * The size of the room, as represented by an object of the RoomDimension class 
	 */
	private RoomDimension size = new RoomDimension();
	

	/**
	 *The cost of carpet per square foot (field) 
	 */
	private double carpetCost = 0;
	
	/**
	 * This constructor initializes a RoomCarpet object.
	 * @param dim A reference to an object of the RoomDimension class
	 * @param cost A double representing the cost of the carpet per square foot.
	 */
	public RoomCarpet(RoomDimension dim, double cost){
		this.size = dim;
		this.carpetCost = cost;
		
	}	
	
	/**
	 * A setter method to change the cost of carpet
	 * @param cost A double representing the cost of carpet per square foot.
	 */
	public void setCostPerSquareFoot(double cost) {
		this.carpetCost = cost;
	}
	
	
	/**
	 * getTotalCost calculates total cost of carpeting a given room
	 * 
	 * @param roomSize a RoomDimension object representing the dimensions of a given room.
	 * @return A double representing the cost of carpeting a room 
	 */
	
	public double getTotalCost(RoomDimension roomSize) {
		
		this.size = roomSize;
		return roomSize.getRoomDimension() * carpetCost;	
		
	}
	
	/**
	 * A method that gets the cost of carpet
	 * @return a double representing the cost of carpet per square foot. 
	 */
	public double getCarpetCost() {
		return this.carpetCost;
	}

	/**
	 * A method that returns a reference to the RoomDimension object.
	 * @return a RoomDimension object representing the dimensions of a given room.
	 */
	
	public RoomDimension getRoomDimension() {
		return size;
	}
	
	/**
	 * A setter method that sets a shallow reference to an externally defined RoomDimension object
	 * @param dim a reference to a RoomDimension object.
	 */
	
	public void setRoomDimension(RoomDimension dim) {
		this.size = dim;
	}
	
	/**
	 * An overloaded toString method that returns a string representing
	 * the carpet cost of a given job.
	 */
	public String toString() {
	 return "The carpet cost is " + this.getCarpetCost();
	}

}
