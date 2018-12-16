/***************************************************************
Service class: MonthDays
***************************************************************/


/**
 * This service class creates an object that calculates the number of days in the month,
 * based on input queried by the client class.
 * @author Gino
 *
 */

public class MonthDays {

	
	private int month;
	private int year;
	
	/**
	 * Default Constructor, initializes values for month and year to generic values.
	 */
	public MonthDays() {
		this.setMonth(1);
		this.setYear(1995);
	}
	
	/**
	 * Overloaded Constructor, initializes values for month and year
	 * @param month the month
	 * @param year the year
	 */
	public MonthDays(int month, int year) {		
		this.setMonth(month);
		this.setYear(year);
	}

	/**
	 * @return the month
	 */
	public int getMonth() {
		return month;
	}

	/**
	 * @param month the month to set
	 */
	public void setMonth(int month) {
		if(month > 12 || month <1) {
			System.out.println("Invalid Month!");
			System.exit(0);
		}
		this.month = month;
	}

	/**
	 * @return the year
	 */
	public int getYear() {
		return this.year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		if(year < 1582) {
			System.out.println("Invalid Year!");
			System.exit(0);
		}
		this.year = year;
	}

	/**
	 * calculates the number of days, accounting for leap years. 
	 * @return the number of days in the month/year specified by the client.
	 */
	
	public int getNumberOfDays() {
		
		if (this.month == 1) {
			return 31;
		}
		if (this.month == 2) {
			/* Leap year calculation */
			if((this.year % 100 == 0) && (this.year % 400 == 0)){
				return 29;
			}
			else if( (this.year % 100 != 0) && this.year % 4 == 0){
				return 29;
			}
			else return 28;
		}
		if (this.month == 3) {
			return 31;
		}
		if (this.month == 4) {
			return 30;
		}
		if (this.month == 5) {
			return 31;
		}
		if (this.month == 6) {
			return 30;
		}
		if (this.month == 7) {
			return 31;
		}
		if (this.month == 8) {
			return 31;
		}
		if (this.month == 9) {
			return 30;
		}
		if (this.month == 10) {
			return 31;
		}
		if (this.month == 11) {
			return 30;
		}
		if (this.month == 12) {
			return 31;
		}
		else return 0;
	}
	
	
	/**
	 * converts an integer month name into a String of the corresponding name in English. 
	 * @return
	 */
	public String getMonthName() {
		
		if(this.month == 1) {
			return "January";
		}
		
		if(this.month == 2) {
			return "February";
		}
		
		if(this.month == 3) {
			return "March";
		}
		
		if(this.month == 4) {
			return "April";
		}
		
		if(this.month == 5) {
			return "May";
		}
		
		if(this.month == 6) {
			return "June";
		}
		
		if(this.month == 7) {
			return "July";
		}
		
		if(this.month == 8) {
			return "August";
		}
		
		if(this.month == 9) {
			return "September";
		}
		
		if(this.month == 10) {
			return "October";
		}
		
		if(this.month == 11) {
			return "November";
		}
		
		if(this.month == 12) {
			return "December";
		}
		else return "Invalid Month!";
		
	}
	
	/**
	 * output method prints a user-friendly message relating the details of the calculation to the user.
	 */
	
	public void output() {
		System.out.println(this.getMonthName() + " in year " + this.getYear() + " has " + this.getNumberOfDays() + " days");
		
	}
	
	
	

	
}
