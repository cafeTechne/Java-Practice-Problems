
/**
 * A service class that represents the dimensions of a room to be carpeted.
 * @author cafeTechne
 *
 */

public class RoomDimension {
	
	private double length;
	private double width;
	
	/**
	 * A default constructor which initializes the values of the data members to 0.
	 */
	public RoomDimension(){
		this.length = 0;
		this.width = 0;
	}
	
	/**
	 * An overloaded constructor which initializes the length and width to user
	 * defined values
	 * @param length a double representing the length of the room.
	 * @param width a double representing the width of the room.
	 */
	
	public RoomDimension(double length, double width){
		this.length = length;
		this.width = width;
	}
	
	/**
	 * getRoomDimension calculates the area of the room
	 * 
	 * @return a double representing the area of a room
	 */
	
	public double getRoomDimension(){
		
		return length * width;
	}
	
	/**
	 * A method which sets the dimensions of the room to user defined values.
	 * @param length a double representing the length of a room.
	 * @param width a double representing the width of a room.
	 */
	
	public void setRoomDimension(double length, double width) {
		
		this.length = length;
		this.width = width;
	}

	/**
	 * A getter method which returns the length of a given room.
	 * @return a double representing the length of a given room.
	 */
	
	public double getLength() {
		return this.length;
	}
	
	/**
	 *  A setter method which sets the length to a user defined value
	 * @param length a double representing the length of a given room.
	 */
	
	public void setLength(double length) {
		this.length = length;
	}
	
	/**
	 * A getter method which returns the width of a room.
	 * @return a double representing the width of a given room.
	 */
	public double getWidth() {
		return this.width;
	}
	
	/**
	 * A setter method which sets the width to a user defined value.
	 * @param width a double representing the width of a given room.
	 */
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	/**
	 * An overloaded toString method which returns a string detailing the 
	 * values that the data members are set to and the area of a given room.
	 */
	public String toString(){
		return "The value of this room's width is " + this.getWidth() +
		"\nThe value of this room's length is " + this.getLength() +
		"\nThe area of this room is " + this.getRoomDimension();
	}
	
	/**
	 * An equals method which compares the length and width dimensions of two rooms to see if they are identical.
	 * @param size a reference to a second object which the first object self-referentially compares against
	 * @return A boolean value stating if the the two rooms have the same dimensions.
	 */
	public boolean equals(RoomDimension size) {
		if ((this.getLength() == size.getLength()) && this.getWidth() == size.getWidth()) {
			return true;
		}
		else return false;
	}
	
	/**
	 * A greater than method which returns true if the method to which the object belongs is greater than the object referenced as a parameter.
	 * @param size a reference to a second object that the calling object is referenced against.
	 * @return a boolean value stating whether the calling object is greater than the argument passed as a parameter.
	 */
	public boolean greaterThan(RoomDimension size) {
		if(this.getRoomDimension() > size.getRoomDimension()) {
			return true;
		}
		else return false;
	}
	
	/**
	 * A less than method which returns true if the method to which the object belongs is less than the object referenced as a parameter.
	 * @param size a reference to a second object that the calling object is referenced against.
	 * @return a boolean value stating whether the calling object is less than the argument passed as a parameter.
	 */
	public boolean lessThan(RoomDimension size) {
		if(this.getRoomDimension() < size.getRoomDimension()) {
			return true;
		}
		else return false;
	}

}


