package chapter8_problem3;

public class RoomDimension {
	
	private double length;
	private double width;
	
	
	public RoomDimension(){
		this.length = 0;
		this.width = 0;
	}
	
	public RoomDimension(double length, double width){
		this.length = length;
		this.width = width;
	}
	
	/**
	 * getRoomDimension calculates the area of the room
	 * 
	 * @return double 
	 */
	
	public double getRoomDimension(){
		
		return length * width;
	}
	
	public void setRoomDimension(double length, double width) {
		
		this.length = length;
		this.width = width;
	}

	
	
	
}
