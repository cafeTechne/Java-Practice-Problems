/**
   Chapter 12
   Programming Challenge 10
   Exception Project
*/

public class WorkerDemo
{
   public static void main(String[] args)
   {
      // Create a ProductionWorker object with valid data.
      System.out.println("\nCreating a ProductionWorker object with valid data.");
      createWorker("John Smith", "123-A", "11-15-2009",
                   ProductionWorker.DAY_SHIFT, 16.50);
      
      // Try to use an invalid employee number.
      System.out.println("\nAttempting an invalid employee number...");
      createWorker("Bill Dowman", "10001", "11-15-2010",
                   ProductionWorker.DAY_SHIFT, 16.50);
   
      // Try to use an invalid shift number.
      System.out.println("\nAttempting an invalid shift number...");
      createWorker("Mary Johnson", "456-B", "11-15-2011",
                   66, 16.50);
   
      // Try to use a negative pay rate.
      System.out.println("\nAttempting a negative pay rate...");
      createWorker("James Sears", "789-C", "11-15-2012",
                   ProductionWorker.DAY_SHIFT, -99.00);
                   
         
   }
   
   /**
      createWorker method
      @param n The employee's name.
      @param num The employee number.
      @param date The employee's hire date.
      @param sh The employee's shift number.
      @param rate The employee's pay rate.
   */
   public static void createWorker(String n, String num, String date,
                                   int sh, double rate)
   {
      //write code here to handle exceptions   
  }