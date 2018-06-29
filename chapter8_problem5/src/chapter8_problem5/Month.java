package chapter8_problem5;

public class Month {

	
	
	
	private int monthNumber;
	private String monthName;
	
	public Month(){
		this.monthNumber = 1;
	}
	
	public Month(int month){
	
		if (month > 12 || month <1 ) {this.monthNumber = 1;}
		else this.monthNumber = month;
		
	}
	
	public Month (String mon)
	{
		if (mon == "January") {this.monthNumber = 1;}
		if (mon == "February") {this.monthNumber = 2;}
		if (mon == "March") {this.monthNumber = 3;}
		if (mon == "April") {this.monthNumber = 4;}
		if (mon == "May") {this.monthNumber = 5;}
		if (mon == "June") {this.monthNumber = 6;}
		if (mon == "July") {this.monthNumber = 7;}
		if (mon == "August") {this.monthNumber = 8;}
		if (mon == "September") {this.monthNumber = 9;}
		if (mon == "October") {this.monthNumber = 0;}
		if (mon == "November") {this.monthNumber = 11;}
		if (mon == "December") {this.monthNumber = 12;}
		
	}
	
	
	public void setMonthNumber (int month){
		
		if (month > 12 || month <1 ) {this.monthNumber = 1;}
		else this.monthNumber = month;
		
	}
	
	public int getMonthNumber() {
		return this.monthNumber;
	}
	
	public String getMonthName(int monthNum) {
		
		
		if (monthNum == 1) {
			this.monthName = "January";
			return this.monthName;
			}
		if (monthNum == 2) {
			this.monthName = "February";
			return this.monthName;
			}
		if (monthNum == 3) {
			this.monthName = "March";
			return this.monthName;
			}
		if (monthNum == 4) {
			this.monthName = "April";
			return this.monthName;
			}
		if (monthNum == 5) {
			this.monthName = "May";
			return this.monthName;
			}
		if (monthNum == 6) {
			this.monthName = "June";
			return this.monthName;
			}
		if (monthNum == 7) {
			this.monthName = "July";
			return this.monthName;
			}
		if (monthNum == 8) {
			this.monthName = "August";
			return this.monthName;
			}
		if (monthNum == 9) {
			this.monthName = "September";
			return this.monthName;
			}
		if (monthNum == 10) {
			this.monthName = "October";
			return this.monthName;
			}
		if (monthNum == 11) {
			this.monthName = "November";
			return this.monthName;
			}
		if (monthNum == 12) {
			this.monthName = "December";
			return this.monthName;
			}
		else return this.monthName = "Invalid month input given in getMonthName.";
		
		
	}
	
	public String toString() {return this.getMonthName(this.monthNumber);}
	
	/**
	 * An equals method that accepts a Month object as an argument. If the argument
	 * object holds the same data as the calling object, this method should return true.
	 * Otherwise, it should return false.
	 * @param mon
	 * @return Boolean describing whether or not the two objects have matching data fields
	 */
	public boolean equals(Month mon) {
		if (mon.getMonthName(mon.getMonthNumber()) == this.getMonthName(this.getMonthNumber())
				&& (mon.getMonthNumber() == this.getMonthNumber())
				) { return true;}
		else return false;
		
	} 
	
	/**
	 * A greatherThan method that accepts a Month object as an argument. If the calling object's monthNumber
	 * field is greater than the argument's monthNumber field, this method should return true. Otherwise,
	 * it should return false.
	 * @param mon
	 * @return boolean
	 */
	
	public boolean greaterThan(Month mon) {
		if (mon.getMonthNumber() > this.monthNumber) {return true;}
		else return false;
	}
	
	public boolean lessThan(Month mon) {
		if (mon.getMonthNumber() < this.monthNumber) {return true;}
		else return false;
	}
	
}
