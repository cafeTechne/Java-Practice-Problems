package chapter10_problem3;

public class TeamLeader extends ProductionWorker {
	
	/*
	 * 
	 * TeamLeader Class, Chapter 10, Problem 3
	 * 
	 * In a particular factory, a team leader is an hourly paid production worker that leads
	 * a small team. In addition to hourly pay, team leaders earn a fixed monthly bonus. Team
	 * leaders are required to attend a minimum number of hours of training per year. 
	 * 
	 * Design a TeamLeader class that extends the ProductionWorker class you designed in #1
	 * 
	 * The TeamLeader class should have fields for the monthly bonus amount, the required
	 * number of training hours, and the number of training hours that the team leader has 
	 * attended.
	 * 
	 * Write one or more constructors and the appropriate accessor and mutator methods for the
	 * class. 
	 * 
	 * Demonstrate the class by writing a program that uses a TeamLeader object.
	 * 
	 */
	
	private double monthlyBonusAmount = 0;
	private Integer numberOfTrainingHours = 0;
	
	public TeamLeader(){
		super();
		
	}
	
	public TeamLeader(Integer shift, double hourlyPay, String employeeName, String employeeNumber, String hireDate, double monthlyBonusAmount, Integer numberOfTrainingHours ){
		super(shift, hourlyPay, employeeName, employeeNumber, hireDate );
		this.setMonthlyBonusAmount(monthlyBonusAmount);
		this.setNumberOfTrainingHours(numberOfTrainingHours);
	}

	public double getMonthlyBonusAmount() {
		return monthlyBonusAmount;
	}

	public void setMonthlyBonusAmount(double monthlyBonusAmount) {
		this.monthlyBonusAmount = monthlyBonusAmount;
	}

	public Integer getNumberOfTrainingHours() {
		return numberOfTrainingHours;
	}

	public void setNumberOfTrainingHours(Integer numberOfTrainingHours) {
		this.numberOfTrainingHours = numberOfTrainingHours;
	}
	
	public void displayInfo() {
		System.out.println("Team Leader Name: " + this.getEmployeeName());
		System.out.println("Team Leader Number: " + this.getEmployeeNumber());
		System.out.println("Team Leader Shift: " + this.getShift());
		System.out.println("Team Leader Hourly Pay " + this.getHourlyPay());
		System.out.println("Team Leader Hire Date " + this.getHireDate());
		System.out.println("Team Leader Monthly Bonus Amount " + this.getMonthlyBonusAmount());
		System.out.println("Team Leader Number of Training Hours " + this.getNumberOfTrainingHours());
		
		
	}

}
