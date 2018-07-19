package chapter10_problem3;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("test");

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
		
		ProductionWorker gary = new ProductionWorker(1, 15.0, "Gary Busey", "154-M", "2018/05/15");
		
		
		System.out.println("************************");
		//displays set info.
		gary.displayInfo();
		
		System.out.println("************************");
		System.out.println("************************");
		System.out.println("************************");
		
		ShiftSupervisor lenny = new ShiftSupervisor(95150, 15000, "Lenny Musey", "199-G", "2013/06/11");
		
		lenny.displayInfo();
		
		System.out.println("************************");
		System.out.println("************************");
		System.out.println("************************");
		
		
		TeamLeader joe = new TeamLeader(1, 25, "Joe Girardi", "201-E", "2007/03/11", 500, 5);
		
		joe.displayInfo();
		
		
		
	}

}
