
/**********************************************************************************************************/
/*********************************************************************************************/
//Service Class: PaintEstimator
  
/**
 * This program allows a user to enter the total square feet 
 * of wall space to be painted and the price per gallon, 
 * and then calculates the price of the entire job. 
 * 
 * This class defines the methods used to calculate the cost of painting a room.
 */

/**
 * This class prices out paint jobs. The labor charge is stored as a constant, as are the number of gallons per square feet and the amount of hours needed to paint a gallon.
 * @author Gino
 *
 */

public class PaintEstimator{

	final static double LABOR_PER_GALLON = 8;
	final static double GALLONS_PER_SQUARE_FEET = 115;
	final static double LABOR_CHARGE_PER_HOUR = 18;
   //need one for labor charge per hour -------------------------------------- -1. DONE +1


	private double squareFootage;
	private double paintPrice;

	
	//use javadoc comments for all methods ---------------------------------------- -1. DONE +1.
	
	/**
	 * This default constructor initializes the private data members to 0.
	 */
	public PaintEstimator(){
		this.squareFootage = 0.0;
		this.paintPrice = 0.0;
	}
	
	/**
	 *  This overloaded constructor sets the private data members for squareFootage and the price of paint.
	 * @param squareFootage a double representing the square area to be painted in square feet.
	 * @param paintPrice a double representing the price of the paint being used
	 */
	
	public PaintEstimator(double squareFootage, double paintPrice){
		this.squareFootage = squareFootage;
		this.paintPrice = paintPrice;
	}

	/**
	 * Sets the square the amount of area to be painted.
	 * @param squareFootage a description of the amount of area to be painted.
	 */
	public void setSquareFootage(double squareFootage){
		this.squareFootage = squareFootage;
	}
	
	/** Sets the price of paint per gallon.
	 * 
	 * @param paintPrice The price of paint per gallon.
	 */
	
	public void setPaintPrice(double paintPrice){
		this.paintPrice = paintPrice;
	}
	
	/**
	 * Returns the square footage.
	 * @return Returns the square footage as a double.
	 */
	
	public double getSquareFootage(){
		return this.squareFootage;
	}
	
	/**
	 * Returns the price of paint.
	 * @return Returns the price of paint in dollars.
	 */
	
	public double getPaintPrice(){
		return this.paintPrice;	
	}

	/**Calculates the number of gallons of paint required and uses Math.ceil() to round-up to the nearest Integer.
	 *  
	 * @return The number of gallons of paint required.
	 */
	
	public double calculatePaintNeeded()
	{
		return (this.squareFootage / GALLONS_PER_SQUARE_FEET);

	}
	
	
	/** Calculates the amount of labor required to finish a job, based on the amount of paint to apply.
	 * 
	 * @return The amount of labor required to complete a job, expressed in hours.
	 */
	
	
	public double calculateLaborNeeded() 
          //no parameter needed - take advanteges of instant variables and methods in an object ------------------ -2 ----DONE. +2.
	{
		double laborNeeded = calculatePaintNeeded() * LABOR_PER_GALLON;	//call calculatePaintNeeded() here ------------------
		return laborNeeded;
	}
	
	
	/** The labor charges for the entire job, at $18 per hour, stored in the CONSTANT.
	 * 
	 * @return The total cost of labor needed to complete the job.
	 */
	public double calculateLaborCost(){ //no parameter needed ------------------ -2. DONE +2.
		double laborCost = LABOR_CHARGE_PER_HOUR * calculateLaborNeeded(); //18 should be in constant---DONE.
		return laborCost;
	}
	
	
	/**	 Calculates he cost of the paint for a room
	 * 
	 * @return The cost of the paint for a room as a double.
	 */
	
	
	public double calculatePaintCost() //no parameter needed ------------------ -2 -----DONE. + 2
	{
		double paintCost = calculatePaintNeeded() *this.paintPrice; //call calculatePaintNeeded() here ------------------ DONE.
		return paintCost;
	}
	
	
	/** Calculates the total cost of painting the room.
	 * 
	 * @return The total cost of the room.
	 */
	
	public double getRoomCost(){//no parameter needed ------------------ -2  DONE. +2
		return this.calculatePaintCost() + this.calculateLaborCost();
	}
	
}

