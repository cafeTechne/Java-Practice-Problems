/**
   InvalidShift class
   This is an exception that is thrown by the ProductionWorker
   class when it receives an invalid shift number.
*/

public class InvalidShift extends Exception
{
   /**
      Constructor
   */
   public InvalidShift()
   {
      super("ERROR: Invalid shift number.");
   }
}