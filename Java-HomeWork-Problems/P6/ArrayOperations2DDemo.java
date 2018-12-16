/**
    Demo program for the ArrayOperations2D class
    Chapter 8, Programming Challenge 12
*/
public class ArrayOperations2DDemo
{
   public static void main(String[] args)
   {
       // Some 2D arrays of various types.
      int[][] iarray = { { 2, 1, 9},{ 7, 3, 4 } };
      
      ArrayOperations2D arr = new ArrayOperations2D(iarray);                        
           
       // Process the int array.
      System.out.println("Processing the int array.");
      System.out.println("Total : " +
                         arr.getTotal());
      System.out.println("Average : " +
                         arr.getAverage());
      System.out.println("Total of row 0 : " +
                         arr.getRowTotal(0));
      System.out.println("Total of row 1 : " +
                         arr.getRowTotal(1));
      System.out.println("Total of col 0 : " +
                         arr.getColumnTotal(0));
      System.out.println("Total of col 2 : " +
                         arr.getColumnTotal(2));
      System.out.println("Highest in row 0 : " +
                         arr.getHighestInRow(0));
      System.out.println("Highest in row 1 : " +
                         arr.getHighestInRow(1));
      System.out.println("Lowest in row 0 : " +
                         arr.getLowestInRow(0));
      System.out.println("Lowest in row 1 : " +
                         arr.getLowestInRow(1));
   
   }
}


/**
    ArrayOperations2D class
    Chapter 8, Programming Challenge 12
*/

class ArrayOperations2D
{
   private int[][] array;
   
   /*Complete the following constructor and methods
   ************************************************************************/
   
   public ArrayOperations2D(int[][] arr)
   {
      //initialization step
	   this.array = new int[arr.length][arr[0].length];
      
        for(int row=0; row<array.length;row++){
            for(int col=0; col<array[row].length; col++){
                array[row][col] = arr[row][col];
            }
        }
   }

   /**
        getTotal method.
        
        @return The total of the values stored in the
                argument array.
    */

   public int getTotal()
   {
        int runningSum = 0;
        for(int row=0; row<array.length;row++){
            for(int col=0; col<array[row].length; col++){
                runningSum += array[row][col];
            }
        }
         return runningSum;
   }

    
    /**
        getAverage method
        
        @return The average of the values stored in the
                argument array.
    */
        
   public int getAverage()
   {
       // Cast the return value of getTotal so we don't
       // do integer division.
        
        int average = getTotal()/getElementCount();
         return average;
   }

    
    /**
        getRowTotal method.
        @param array A 2D array of integers.
        @param row A specified row
        @return The total of the values stored in the
                specified row of the argument array.
    */

   public int getRowTotal(int row)
   {
    int runningSum = 0;
            for(int col=0; col<array[row].length; col++){
                runningSum += array[row][col];
            }
             return runningSum;
   }

        /**
        getColumnTotal method.
                @param col A specified col
        @return The total of the values stored in the
                specified column of the argument array.
    */
    
   public int getColumnTotal(int col)
   {
            int runningSum = 0;
            for(int row=0; row<array.length; row++){
                runningSum += array[row][col];
            }
             return runningSum;
   }

    
    /**
        getHighestInRow method.
        @param row A specified row.
        @return The highest value stored in the
                specified row of the argument array.
    */
    
   public int getHighestInRow(int row)
   {
            int highestNumber = array[0][0];
            for(int col=0; col<array[row].length; col++){
            if(highestNumber < array[row][col])
            {
                highestNumber = array[row][col];
            }
        }
         return highestNumber;
   }

        /**
        getLowestInRow method.
                @param row A specified row.
        @return The lowest value stored in the
                specified row of the argument array.
    */
    
   public int getLowestInRow(int row)
   {
            int lowestNumber = array[0][0];
            for(int col=1; col<array[row].length; col++){
            if(lowestNumber > array[row][col])
            {
                lowestNumber = array[row][col];
            }
        }
         return lowestNumber;
   }


    /**
        getElementCount method.
        
        @return The number of elements in the
                argument array.
    */
    
   public  int getElementCount()
   {
             return array.length*array[0].length;
   }

}

