package chapter10_problem2;

public class ShiftSupervisor extends Employee {

	/*
	 *ShiftSuperviisor Class, Chapter 10, Problem 2
	 *
	 *In a particular factory, a shift supervisor is a salaried employee who supervises a shift. 
	 *In addition to a salary, the shift supervisor earns a yearly bonus when his or her shift
	 *meets production goals. 
	 *
	 *Design a ShiftSupervisor class that extends the Employee class you 
	 *created in Programming Challenge 1. 
	 *
	 *The ShiftSupervisor class should have a field that holds
	 *the annual salary and a field that holds the annual production bonus that a shift supervisor
	 *has earned. 
	 *
	 *Write one or more constructors and the appropriate accessor and mutator methods for the class.
	 *
	 *Demonstrate the class by writing a program that uses a ShiftSupervisor object.
	 *
	 */

	private double annualSalary = 30000.0;
	private double annualProductionBonus = 0;
	
	public ShiftSupervisor() {
		
		this.setAnnualSalary(30000.0);
		this.setAnnualProductionBonus(0);
	}
	
	public ShiftSupervisor(double annualSalary, double annualProductionBonus, String employeeName, String employeeNumber, String hireDate) {
		super(employeeName, employeeNumber, hireDate);
		this.setAnnualSalary(30000.0);
		this.setAnnualProductionBonus(0);
	}

	public double getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}

	public double getAnnualProductionBonus() {
		return annualProductionBonus;
	}

	public void setAnnualProductionBonus(double annualProductionBonus) {
		this.annualProductionBonus = annualProductionBonus;
	}
	
	public void displayInfo() {
		System.out.println("Shift Supervisor Name: " + this.getEmployeeName());
		System.out.println("Shift Supervisor Number: " + this.getEmployeeNumber());
		System.out.println("Shift Supervisor Annual Production Bonus: " + this.getAnnualProductionBonus());
		System.out.println("Shift Supervisor Annual Salary" + this.getAnnualSalary());
		System.out.println("Shift Supervisor Hire Date " + this.getHireDate());
	}
	
	
	
}
