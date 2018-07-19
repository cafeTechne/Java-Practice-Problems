package chapter10_problem2;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("test");

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
		
		ProductionWorker gary = new ProductionWorker(1, 15.0, "Gary Busey", "154-M", "2018/05/15");
		
		
		System.out.println("************************");
		//displays set info.
		gary.displayInfo();
		
		System.out.println("************************");
		System.out.println("************************");
		System.out.println("************************");
		
		ShiftSupervisor lenny = new ShiftSupervisor(95150, 15000, "Lenny Musey", "199-S", "2013/06/11");
		
		lenny.displayInfo();
		
		
		
	}

}
