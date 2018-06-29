package chapter8_problem3;

public class RoomCarpet {
	
	private RoomDimension size = new RoomDimension();
	
	//cost of carpet per square foot (field)
	private double carpetCost = 0;
	
	
	public RoomCarpet(RoomDimension dim, double cost){
		this.size = dim;
		this.carpetCost = cost;
		
	}	
	
	
	
	
	public void setCostPerSquareFoot(double cost) {
		this.carpetCost = cost;
	}
	
	
	/**
	 * getTotalCost calculates total cost of carpeting a given room
	 * 
	 * @param roomSize
	 * @return the cost of carpeting a room (double)
	 */
	
	public double getTotalCost(RoomDimension roomSize) {
		
		this.size = roomSize;
		return roomSize.getRoomDimension() * carpetCost;	
		
	}
		

}
