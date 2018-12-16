/**
   InvalidPayRate class
   This is an exception that is thrown by the ProductionWorker
   class when it receives a negative pay rate.
*/

public class InvalidPayRate extends Exception
{
   /**
      Constructor
   */
   public InvalidPayRate()
   {
      super("ERROR: Negative pay rate.");
   }
}