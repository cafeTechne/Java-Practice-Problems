/**
 * This class templates out the LuShu Magic Square, and contains a constructor to initialize
 * a deep copy of the array being passed to it, showArray(), showResult(), checkRange(),
 * checkUniqueness(), and checkSums() methods.
 * @author Gino N. LaGuardia-LoBianco
 *
 */
public class MagicSquare {
	
	private int array[][] = new int [3][3];
	
	/**
	 * This default constructor initializes a deep copy of the array being passed to it,
	 * so that class methods may be used to test whether or not it is a Lu Shu Magic Square
	 * @param arr an array of a 3 by 3 matrix of integers
	 */
	public MagicSquare(int arr[][]){
		for(int row=0; row<arr.length; row++) {
			for(int col=0; col<arr[row].length;col++) {
				array[row][col] = arr[row][col];
			}
		}
	}
	
	
	/**
	 * This method prints the matrix to the console. 
	 */
	public void showArray() {
		for(int row=0; row<this.array.length; row++) {
			for(int col=0; col<this.array[row].length;col++) {
				System.out.print(array[row][col] + " | ");
			}
			System.out.print("\n");
		}
	}
	
	
	/**
	 * This method calls the checkRange(), checkUniqueness, and checkSums methods
	 * in order to determine whether or not the corresponding matrix is a lu shu magic square
	 * @return a boolean value gets returned to the client indicating whether the
	 * corresponding matrix is a lu shu magic square or not
	 */
	
	public boolean showResult() {
		
		if (this.checkRange() && this.checkUniqueness() && this.checkSums()) {
			return true;
		}
		else return false;
	}

	
	/**
	 * This method determines whether or not the values are within the range of 1-9,
	 * as specified in the problem
	 * @return a boolean value indicating whether or not the object passes the test
	 */
	private boolean checkRange() {
		for(int row=0; row<this.array.length; row++) {
			for(int col=0; col<this.array[row].length;col++) {
				if (array[row][col] > 9) {
					return false;
				}
				if (array[row][col] < 1) {
					return false;
				}
			}
		}
		return true;
	}
	

	/**
	 * This method determines whether or not the values are all unique.
	 * @return a boolean value indicating whether or not the object passes the test
	 */
	private boolean checkUniqueness() {
		for(int row=0; row<this.array.length; row++) {
			for(int col=0; col<this.array[row].length;col++) {
				int identity = this.array[row][col];
				int indexIdentityRow = row;
				int indexIdentityCol = col;
				
				for(int rowPrime=0; rowPrime<this.array.length; rowPrime++) {
					for(int colPrime=0; colPrime<this.array[row].length;colPrime++) {
						//checks to make sure if we're at the same index
						//because it will obviously be equal if we are, 
						//thus it just increments counter here
						if(((indexIdentityCol == colPrime) && (indexIdentityRow == rowPrime))) {
							if(colPrime<this.array[row].length-1) {
								++colPrime;	
							}
							else break;
						}
						if(this.array[rowPrime][colPrime] == identity) {
							return false;
						}
					}
				}
				
			}
		}
		return true;
	}
	
	
	/**
	 * This method determines whether or not the sums of the corresponding rows, columns,
	 * and diagonal entries of the matrix are all equal to each other.
	 * @return a boolean value indicating whether or not the object passes the test
	 */
	
	private boolean checkSums() {
	
		int rowSum1=0, rowSum2=0, rowSum3=0;
		int colSum1=0, colSum2=0, colSum3=0;
		int diagSum1=0;
		int diagSum2=0;

		//tests for equality of rows
		for(int col=0; col<this.array.length; col++) {
			rowSum1 +=this.array[0][col];
		}
		for(int col=0; col<this.array.length; col++) {
			rowSum2 +=this.array[1][col];
		}
		for(int col=0; col<this.array.length; col++) {
			rowSum3 +=this.array[2][col];
		}
		
		//tests for equality of columns
		for(int row=0; row<this.array.length; row++) {
			colSum1 +=this.array[row][0];
		}
		for(int row=0; row<this.array.length; row++) {
			colSum2 +=this.array[row][1];
		}
		for(int row=0; row<this.array.length; row++) {
			colSum3 +=this.array[row][2];
		}
		//tests first diagonal from top left to bottom right
		for(int row=0; row<this.array.length; row++) {
			diagSum1 += this.array[row][row];
		}
		//tests second diagonal from top right to bottom left
		for(int row=0; row<this.array.length; row++) {
			diagSum2 += this.array[row][2-row];
		}
		
		if((rowSum1 == rowSum2) && 
		   (rowSum2 == rowSum3)&&
		   (rowSum3 == colSum1)&&
		   (colSum1 == colSum2)&&
		   (colSum3 == diagSum1)&&
		   (diagSum1 == diagSum2)
		  ) {
			return true;
		}
		else return false;
	}
	

}
