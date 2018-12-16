import java.util.*;
import java.text.*;


public class PizzaOrder
{
   public static void main (String[] args)
   {
      // Create a Scanner object to read input.
      Scanner keyboard = new Scanner (System.in);

      String firstName;             // User's first name
      boolean discount = false;     // Flag for discount
      int inches;                   // Size of the pizza
      char crustType;               // For type of crust
      String crust = "Hand-tossed"; // Name of crust
      double cost = 12.99;          // Cost of the pizza
      final double TAX_RATE = .08;  // Sales tax rate
      double tax;                   // Amount of tax
      char choice;                  // User's choice
      String input;                 // User input
      String toppings = "Cheese ";  // List of toppings
      int numberOfToppings = 0;     // Number of toppings

      // Prompt user and get first name.
      System.out.println("Welcome to Mike and " +
                         "Diane's Pizza");
      System.out.print("Enter your first name: ");
      firstName = keyboard.nextLine();

      // Determine if user is eligible for discount by
      // having the same first name as one of the owners.
      
      // ADD LINES HERE FOR TASK #1
      if(firstName.equalsIgnoreCase("Mike") ||
		   firstName.equalsIgnoreCase("Diane")) {
			discount = true;
		}
	
      

      // Prompt user and get pizza size choice.
      System.out.println("Pizza Size (inches)   Cost");
      System.out.println("        10            $10.99");
      System.out.println("        12            $12.99");
      System.out.println("        14            $14.99");
      System.out.println("        16            $16.99");
      System.out.println("What size pizza " +
                         "would you like?");
      System.out.print("10, 12, 14, or 16 " +
                       "(enter the number only): ");
      inches = keyboard.nextInt();

      // Set price and size of pizza ordered.
      
      // ADD LINES HERE FOR TASK #2
      
      
      if(inches == 10){
			cost = 10.99;		
		}
      else if(inches == 12){
			cost = 12.99;
		}
      else if(inches == 14){
			cost = 14.99;		
		}
      else if(inches == 16){
			cost = 16.99;		
		}
      else{
			System.out.println("User, that is an invalid selection.");
		}
      			System.out.println("User, you selected: " + inches);

		switch (inches){
			case 10:
				cost = 10.99;
				break;
			case 12:
				cost = 12.99;
				break;
			case 14:
				cost = 14.99;
				break;
			case 16:
				cost = 16.99;
				break;
			default:
				System.out.println("User, that is an invalid selection.");								
		}
		
		System.out.println("User, you selected: " + inches);


      // Consume the remaining newline character.
      keyboard.nextLine();


      // Prompt user and get crust choice.
      System.out.println("What type of crust " +
                         "do you want? ");
      System.out.print("(H)Hand-tossed, " +
                       "(T) Thin-crust, or " +
                       "(D) Deep-dish " +
                       "(enter H, T, or D): ");
      input = keyboard.nextLine();
      crustType = input.charAt(0);

      // Set user's crust choice on pizza ordered.
      
      // ADD LINES FOR TASK #3      
      switch(crustType){
			case 'H':
			case 'h': 
				crust="Hand-Tossed";
				break;
			case 'T':
			case 't': 
				crust="Hand-Tossed";
				break;
			case 'D':
			case 'd': 
				crust="Hand-Tossed";
				break;
		default: 
				System.out.println("I did not understand that input User.");			
				System.exit(1);
		}
      
      

      // Prompt user and get topping choices one at a time.
      System.out.println("All pizzas come with cheese.");
      System.out.println("Additional toppings are " +
                         "$1.25 each, choose from:");
      System.out.println("Pepperoni, Sausage, " +
                         "Onion, Mushroom");

      // If topping is desired,
      // add to topping list and number of toppings
      System.out.print("Do you want Pepperoni? (Y/N): ");
      input = keyboard.nextLine();
      choice = input.charAt(0);
      if (choice == 'Y' || choice == 'y')
      {
         numberOfToppings += 1;
         toppings = toppings + "Pepperoni ";
      }
      System.out.print("Do you want Sausage? (Y/N): ");
      input = keyboard.nextLine();
      choice = input.charAt(0);
      if (choice == 'Y' || choice == 'y')
      {
         numberOfToppings += 1;
         toppings = toppings + "Sausage ";
      }
      System.out.print("Do you want Onion? (Y/N): ");
      input = keyboard.nextLine();
      choice = input.charAt(0);
      if (choice == 'Y' || choice == 'y')
      {
         numberOfToppings += 1;
         toppings = toppings + "Onion ";
      }
      System.out.print("Do you want Mushroom? (Y/N): ");
      input = keyboard.nextLine();
      choice = input.charAt(0);
      if (choice == 'Y' || choice == 'y')
      {
         numberOfToppings += 1;
         toppings = toppings + "Mushroom ";
      }

      // Add additional toppings cost to cost of pizza.
      cost = cost + (1.25 * numberOfToppings);

      // Display order confirmation.
      System.out.println();
      System.out.println("Your order is as follows: ");
      System.out.println(inches + " inch pizza");
      System.out.println(crust + " crust");
      System.out.println(toppings);

      // Apply discount if user is eligible.
      
      // ADD LINES FOR TASK #4 HERE
      
      
      if(discount==true){
			System.out.println("User, the discount is being applied because your name is the same as an owners.");
			cost -= 2;
		}
      
      
      
      // EDIT PROGRAM FOR TASK #5
      
      String pattern = "##.##";
      DecimalFormat df = new DecimalFormat(pattern);
		
		
      
      // SO ALL MONEY OUTPUT APPEARS WITH 2 DECIMAL PLACES
      System.out.printf("The cost of your order " +
                        "is: $" + (df.format(cost)) + "\n");

      // Calculate and display tax and total cost.
      tax = cost * TAX_RATE;
      System.out.printf("The tax is: $", (df.format(tax)) + "\n");
      System.out.printf("The total due is: $"+
                        (df.format(tax + cost)) + "\n");

      System.out.println("Your order will be ready " +
                         "for pickup in 30 minutes.");
   }
}



