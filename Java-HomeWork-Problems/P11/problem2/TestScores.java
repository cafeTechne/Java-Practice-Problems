import java.io.*;
/**
   The TestScores class */

public class TestScores implements Serializable
{
   // Variable to reference an array of test scores
   private double[] scores;
   
   /**
      The constructor initializes an object with
      an array of scores. If the array contains
      an invalid value (less than 0 or greater than
      100) an exception is thrown.
      @param s The array of test scores.
		
      @exception IllegalArgumentException When the
                 argument array contains an invalid
                 value.
   */
      
   public TestScores(double[] s) throws IllegalArgumentException
   
   //throw exception in this method -----------------
   {
      // Create an array to hold the scores passed
      // as an argument.
      scores = new double[s.length];
      
      /* Copy the scores passed as an argument into
       the new array. Check for illegal values as
       they are copied. -------------------------------*/
      for (int i = 0; i < s.length; i++)
      {
    	  if(s[i] < 0 || s[i]> 100) {
    		  throw new IllegalArgumentException();
    	  }
    	  else 
    		  {
    		  scores[i] = s[i];
    		  }
      }
   }
   
   /**
      The getAverage method returns the average
      of the object's test scores.
      @return The average of the object's test scores.
   */
   
   public double getAverage()
   {
      double total = 0.0;  // Accumulator
      
      // Accumulate the sum of the scores.
      for (int i = 0; i < scores.length; i++)
         total += scores[i];
      
      // return the average.
      return (total / scores.length);
   }

   
   
   
   /**
      toString method
      (Added for this assignment.)
      @return A string representation of an object.
   */
   
   public String toString()
   {
      String str = "Scores: ";
      
      for (int i = 0; i < scores.length; i++)
         str += scores[i] + " ";
      
      str += "  Average = " + getAverage();
      return str;
   }
   
}