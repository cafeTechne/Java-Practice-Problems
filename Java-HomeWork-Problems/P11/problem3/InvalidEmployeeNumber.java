/**
   InvalidEmployeeNumber class
   This is an exception that is thrown by the Employee class
   when it receives an employee number that is less than 0 
   or greater than 9999.
*/

public class InvalidEmployeeNumber extends Exception
{
   /**
      Constructor
   */
   public InvalidEmployeeNumber()
   {
      super("ERROR: Invalid employee number.");
   }
}