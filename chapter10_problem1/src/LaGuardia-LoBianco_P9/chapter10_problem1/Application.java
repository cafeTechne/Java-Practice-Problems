package chapter10_problem1;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("test");

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
		 * 
		 * Next, write a class named ProductionWorker that extends the employee class.
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
		 * 
		 * * Demonstrate the classes by writing a program that uses a 
		 * ProductionWorker object.
		 */
		
		ProductionWorker gary = new ProductionWorker(1, 15.0, "Gary Busey", "154-M", "2018/05/15");
		
		//displays set info.
		gary.displayInfo();
		
		
		
	}

}
