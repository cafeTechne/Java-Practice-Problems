import java.util.ArrayList;

//*****************************************
  //   Name: Gino N. LaGuardia-LoBianco
  //   CTP 150 – Section# 003
  //   Lab Assignment # 6, Problem 2
  //***************************************** 

/**
 * This service class provides methods for calculating the average monthly rainfall for a given year, 
 * determining the month with the most amount of rain, methods to return the total rainfall for the year,
 * determining the month with the least amount of rain, a method for returning all those months higher than average,
 * 
 * @author Gino
 *
 */

public class RainFall {

	/**
	 * Private arrayList of doubles holding the total rainfall for each month.
	 */
	
	
	ArrayList <Double>totalRainFallList = new ArrayList<Double>();
	
	
	/**
	 * A constructor which accepts an arrayList from the client class.
	 * @param arr An array of doubles representing the rainfall for each month of a given year.
	 */
	public RainFall(ArrayList <Double> arrayList) {
		this.settotalRainFallList(arrayList);
	}
		
	/**
	 * A methods to return the total rainfall for the year 
	 * @return a double which represents the total rainfall for the year
	 */
		
	public double getYearlyTotalRainFall() {
		double runningSum=0;
		
		for(int i = 0; i<this.totalRainFallList.size();i++) {
			runningSum += this.totalRainFallList.get(i);
		}
		return runningSum;
	}
	
	/**
	 * A method to calculate the the average monthly rainfall  
	 * @return a double which represents the average monthly rainfall over the course of a year.
	 */
	
	public double getAverageMonthlyRainFall() {
		return getYearlyTotalRainFall() /12;
	}
	
	
	/** A method that calculates the month with the most rain.
	 * 
	 * @return An int representing the month with the most rain.
	 */ 
	
	public int getMonthWithMostRain() {
		double mostRain = this.totalRainFallList.get(0);
		int monthIndex = 0;
		for(int i = 0; i<this.totalRainFallList.size();i++) {
			
			if (this.totalRainFallList.get(i) > mostRain) {
				mostRain = this.totalRainFallList.get(i);
				monthIndex = i;
			}
		}
		return monthIndex+1;
	}
	
	/** A method that calculates the month with the least amount of rain.
	 *  
	 * @return An in representing the month with the least rain.
	 */
	public int getMonthWithLeastRain() {
		double leastRain = this.totalRainFallList.get(0);
		int monthIndex = 0;
		for(int i = 0; i<this.totalRainFallList.size();i++) {
			
			if (this.totalRainFallList.get(i) < leastRain) {
				leastRain = this.totalRainFallList.get(i);
				monthIndex = i;
			}
		}
		return monthIndex+1;
	}
	
	/**
	 * A method which accepts an integer reference to a month and returns the amount of rain that month. 
	 * @param monthIndex An integer representing the numerical value ascribed to a given month.
	 * @return A double representing the amount of rain in a given month.
	 */
	public double getRainfallOfSpecificMonth(int monthIndex) {
		return this.totalRainFallList.get(monthIndex - 1);
	}
	
	/**
	 * A method which accepts an integer reference to a month and returns a name in English. 
	 * @param monthNumber An integer representing the numerical value ascribed to a given month.
	 * @return A String representing a name of a month in English.
	 */
	
	public String getMonthName(int monthNumber) {
		if(monthNumber == 1) {
			return "January";
		}
		if(monthNumber == 2) {
			return "February";
		}
		if(monthNumber == 3) {
			return "March";
		}
		if(monthNumber == 4) {
			return "April";
		}
		if(monthNumber == 5) {
			return "May";
		}
		if(monthNumber == 6) {
			return "June";
		}
		if(monthNumber == 7) {
			return "July";
		}
		if(monthNumber == 8) {
			return "August";
		}
		if(monthNumber == 9) {
			return "September";
		}
		if(monthNumber == 10) {
			return "October";
		}
		if(monthNumber == 11) {
			return "November";
		}
		if(monthNumber == 12) {
			return "December";
		}
		else return "Error.";
	}


	/**
	 * An accessor method to get the total rain fall arrayList. (optional)
	 * @return A reference to an array of doubles representing the total rain fall for the year.
	 */

	public ArrayList <Double> gettotalRainFallArray() {
		return totalRainFallList;
	}

	
	/**
	 * A mutator method to assign an arrayList of doubles representing the total rain fall for the year.
	 * @param totalRainFallArray An arrayList of doubles representing the total rain fall for the year.
	 */

	public void settotalRainFallList(ArrayList <Double> arrayList) {
		this.totalRainFallList = arrayList;
	}

	/**
	 * A method to display the months with above average rainfall for the year.
	 */
	
	public void getAboveAverageMonths() {
		int numOfMonths = 0;
		for(int i=0; i< this.totalRainFallList.size(); i++) {
			if(this.totalRainFallList.get(i) > this.getAverageMonthlyRainFall()) {
				numOfMonths++;
			}	
		}
		System.out.println("\nThere are " + numOfMonths + " months whose rainfall are higher than average:");
		for(int i=0; i< this.totalRainFallList.size(); i++) {
			if(this.totalRainFallList.get(i) > this.getAverageMonthlyRainFall()) {
				System.out.println(this.getMonthName(i+1) + "    " + this.totalRainFallList.get(i));
			}	
		}
	}
	

	}
	
