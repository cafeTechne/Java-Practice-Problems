import java.util.*;

/**
	Validator class
   Chapter 8, Programming Challenges 3 and 4
	
	The service class is used for both problems --------------------------
*/

class Validator
{
	// Array of valid numbers
   private int[] array;
   private ArrayList<Integer> arrayList = new ArrayList<Integer>();
   
   
   //   constructor                     
   public Validator(int[] arr)
   {
	   //write code to instantiate the array object
	   for(int i=0; i<arr.length; i++) {
		   arrayList.add(arr[i]);
	   }
	   
   }
	
   /**
   	The isValid method uses a sequential search
   	to determine whether a number appears in
   	the array of valid numbers.
		@param number The number to search for.
		@return true if the number is found, false
		        otherwise.
   */
		
   public boolean isValid(int number)
   {
   	//type your code to define the method
	   for(int i=0; i<arrayList.size();i++) {
		   if(number == arrayList.get(i)) 
		   {
			   return true;
		   }   
	   }
	   return false;
	   
      
   }
}   //end of the service class

/**
The class demostrates the use of the Validator class
*/

public class ValidatorDemo
{
   public static void main(String[] args)
   {
   //create an array and initialize it
	//You can create the array here, or in a separate method (See the solution)
	   
      int[] acctNum = {5658845, 4520125, 7895122, 8777541, 
                           8451277, 1302850, 8080152, 4562555,
         						5552012, 5050552, 7825877, 1250255,
                           1005231, 6545231, 3852085, 7576651,
         						7881200, 4581002};
                           
     //write code to create an object of Validator 
      
      Validator validator = new Validator(acctNum);
  
     //Ask your enter a number
  
      System.out.println("User, please enter a number to validate.");
      
     //call the method isValid()to validate the number
      Scanner keyboard = new Scanner(System.in);
      
      int number = keyboard.nextInt();
      
      validator.isValid(number);
     
     //Display the result here, or in a separate method
      if(validator.isValid(number)) {
    	  System.out.println("This result is valid!");
      }
      else {
    	  System.out.println("This result is NOT valid!");
      }
   
   }
}   //end of the tester class