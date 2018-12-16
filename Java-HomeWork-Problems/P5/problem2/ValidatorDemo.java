import java.io.File;
import java.io.IOException;
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
   
   
   //   constructor                     
   public Validator(int[] arr)
   {
	   //write code to instantiate the array object
	   this.array = arr;
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
	   for(int i=0; i<array.length;i++) {
		   if(number == array[i]) 
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
   public static void main(String[] args) throws IOException
   {
   //create an array and initialize it
	//You can create the array here, or in a separate method (See the solution)
	   
	  File file = new File("validationList.txt");
	  
	  Scanner input = new Scanner(file);
	  
	  int arr[] = new int[20]; 
	  int i = 0;
	  
	  
	  while(input.hasNext()) {
		String str = input.nextLine();
		int number = Integer.parseInt(str);
		arr[i] = number;
		i++;
	  }
                           
	  Validator validator = new Validator(arr);
	  
  
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