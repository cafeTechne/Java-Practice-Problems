package chapter10_problem2;

public class ProductionWorker extends Employee {
/*
 *  * Next, write a class named ProductionWorker that extends the employee class.
		 * The ProductionWorker class should have fields to hold the following info:
		 * 
		 * * Shift (an integer)
		 * * Hourly pay rate (a double)
		 * 
		 * The workday is divided into two shifts: day and night. The shift fields
		 * will be an integer value representing the shift that the employee works.
		 * The day shift is shift 1 and the night shift is shift 2. Write on or 
		 * more constructors and the appropriate accessor and mutator methods 
		 * for the class. 
 */
	
	private Integer shift;
	private Double hourlyPay;
	
	public ProductionWorker(){
		super();
		this.setShift(1);
		this.setHourlyPay(10.0);
	}
	
	public ProductionWorker(Integer shift, double hourlyPay, String employeeName, String employeeNumber, String hireDate ) {
	super(employeeName, employeeNumber, hireDate);
	setShift(shift);
	setHourlyPay(hourlyPay);
	}

	public Integer getShift() {
		return shift;
	}

	public void setShift(Integer shift) {
		this.shift = shift;
	}

	public Double getHourlyPay() {
		return hourlyPay;
	}

	public void setHourlyPay(Double hourlyPay) {
		this.hourlyPay = hourlyPay;
	}
	
	public void displayInfo() {
		System.out.println("Employee Name: " + this.getEmployeeName());
		System.out.println("Employee Number: " + this.getEmployeeNumber());
		System.out.println("Employee Shift: " + this.getShift());
		System.out.println("Employee Hourly Pay " + this.getHourlyPay());
		System.out.println("Employee Hire Date " + this.getHireDate());
	}
}
