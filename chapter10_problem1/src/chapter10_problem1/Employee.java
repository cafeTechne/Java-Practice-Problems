package chapter10_problem1;

public class Employee {

	
	/*
	 * Employee and ProductionWorker Classes
	 * 
	 * Design a class named Employee. The class should keep the following information in fields:
	 * 
	 * * Employee Name
	 * * Employee number in the format XXX-L, where each X is a digit within a range 0-9
	 * and the L is a letter within the range A-M.
	 * * Hire date
	 * 
	 * Write one or more constructors and the appropriate accessor and mutator methods for the class.
	 */
	
	private String employeeName;
	private String employeeNumber;
	private String hireDate;
	
	
	public Employee(){
		this.setEmployeeName("John Doe");
		this.setEmployeeNumber("123-A");
		this.setHireDate("2015/08/01");
	}

	public Employee(String employeeName, String employeeNumber, String hireDate){
		this.setEmployeeName(employeeName);
		this.setEmployeeNumber(employeeNumber);
		this.setHireDate(hireDate);
	}
	
	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(String employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getHireDate() {
		return hireDate;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}

	
	
	
	
	
}
