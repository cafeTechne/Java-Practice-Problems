package chapter10_problem8;

public class Application {

	public static void main(String[] args) {
		
		/*
		 *
		 * A retail store has a preferred customer plan where customers can earn discounts on all their
		 * purchases. The amount of a customer's discount is determined by the amount of all the 
		 * customer's cumulative purchases in the store as follows:
		 * 
		 * * When a preferred customer spends $500, he or she gets a 5 percent discount on all future purchases
		 * 
		 * * When a preferred customer spends $1000, he or she gets a 6 percent discount on all future purchases
		 * 
		 * * When a preferred customer spends $1500, he or she gets a 7 percent discount on all future purchases
		 * 
		 * * When a preferred customer spends $2000, he or she gets a 10 percent discount on all future purchases
		 * 
		 * Design a class named PreferredCustomer, which extends the Customer class you created in #7
		 * 
		 * Needs fields for the amount of the customer's purchases and the customer's discount level.
		 * 
		 * Demonstrate the class in a simple program.
		 * 
		 */
		
		Customer chuck = new Customer("Chuck Barkley", "666 Central Avenue", "631-995-9875", "15367", true);
		
		chuck.displayInfo();
		//test passed!
		
		System.out.println("*********************");
		System.out.println("*********************");
		
		PreferredCustomer shaq = new PreferredCustomer("Shaquille Oneal", "123 1st Street", "516-333-9335", "15368", false, 1565 );
		
		shaq.displayInfo();
		
		
		
		
	}

}
