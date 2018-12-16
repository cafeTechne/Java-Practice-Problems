//*****************************************
//   Programmer: Gino LaGuardia-LoBianco
//   CTP 150 - section 003
//   Practice Problem 1-2
//*****************************************
 

import java.text.DecimalFormat;
import java.util.Scanner;
          //the following 3 lines show an example of javadoc comments 
			 //for a class (written before the class header)
/**
 This program calculates total weekly payment for employees
*/

class Payroll
{
   //declare constant here 
	//final static double RATE = 12.5
	//this is not a realistic assumption... everybody's pay is not the same.
	
   public static void main(String[] arg)
   {	
	   
	System.out.println("User, please enter the number of Employees you'd like to calculate weekly pay for...");
	Scanner keyboard = new Scanner(System.in);
	int numberOfEmployees = keyboard.nextInt();
	
	
	for(int i=0;i<numberOfEmployees;i++) 
	{
		//declare local variables  && call method to get input
		double payRate = getPayRate();
		double hoursWorked = inputHours();   
		//call method to process data - calculate payment && display data and result	  
		output(payRate, hoursWorked);
	}
	keyboard.close();
	
	
   }
   
   
   /**
    * This method prompts the user to enter the PayRate information 
    * @return PayRate information for Employee inputed
    */
   
   public static double getPayRate() {
	   System.out.println("User, please enter the Employees hourly payrate");
	   Scanner keyboard = new Scanner(System.in);
	   double tempPayRate = keyboard.nextDouble();
	   //keyboard.close();
	   return tempPayRate;
   }

	/**
	This method gets input for hours worked
	@return The value of hours inputed 
	*/
   public static double inputHours()
   {
	   System.out.println("User, please enter the Number of Hours that this Employee worked");
	   Scanner keyboard = new Scanner(System.in);
	   double hours = keyboard.nextDouble();
	   return hours;
   }
	
	/**
	This method calculates the total weekly pay
	@param payRate for the payRate & hoursWorked for hours worked  
	@return The value of total weekly pay 
	*/

   public static double calcTotal(double payRate, double hoursWorked)
   {
      return payRate * hoursWorked;
   }
	
	/**
	This method displays data and result
	@param h hours worked
	@param tot the value of the total pay 
	*/

   public static void output(double payRate, double hoursWorked)
   {
	   String pattern = "0.00";
	   DecimalFormat myFormatter = new DecimalFormat(pattern);
	   double value = calcTotal(payRate, hoursWorked);
	   String output = myFormatter.format(value);
	   System.out.println("The Employee's pay for this week is " + output);
   }
}