package chapter10_problem7;

public class Application {

	public static void main(String[] args) {
		
		/*
		 * Person and Customer Classes, Chapter 10, Problem 7
		 * 
		 * Design a class named Person with fields for holding a person's name, address
		 * and telephone number. 
		 * 
		 * Next, design a class named Customer, which extends toe Person class. The customer 
		 * class should have a field for a customer number and a boolean field indicating 
		 * whether the customer wishes to be on a mailing list. 
		 * 
		 * Demonstrate an object of the Customer class in a simple program.
		 * 
		 */
		
		Customer chuck = new Customer("Chuck Barkley", "666 Central Avenue", "631-995-9875", "15367", true);
		
		chuck.displayInfo();

		//test passed!
	}

}
