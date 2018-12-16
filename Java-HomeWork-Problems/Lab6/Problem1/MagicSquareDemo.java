public class MagicSquareDemo {

	public static void main(String[] args) {
		
		int[][] array1 = {{4, 9, 2},{3, 5, 7},{8, 1, 6}};
		int[][] array2 = {{ 5, 5, 5 },{5, 5, 5 },{5, 5, 5 }};                      
		int[][] array3 = {{1, 2, 3},{4, 5, 6}, {7, 8, 9}};
		
		MagicSquare magicSquare1 = new MagicSquare(array1);
		MagicSquare magicSquare2 = new MagicSquare(array2);
		MagicSquare magicSquare3 = new MagicSquare(array3);
		
		magicSquare1.showArray();
		
		if (magicSquare1.showResult()) {
			System.out.println("This is a Lu Shu Magic Square.");
		}
		else {
			System.out.println("This is NOT a Lu Shu Magic Square.");
		}
		
		magicSquare2.showArray();
		
		if (magicSquare2.showResult()) {
			System.out.println("This is a Lu Shu Magic Square.");
		}
		else {
			System.out.println("This is NOT a Lu Shu Magic Square.");
		}
		
		magicSquare3.showArray();
		
		if (magicSquare3.showResult()) {
			System.out.println("This is a Lu Shu Magic Square.");
		}
		else {
			System.out.println("This is NOT a Lu Shu Magic Square.");
		}
		
		
		
	}

}
