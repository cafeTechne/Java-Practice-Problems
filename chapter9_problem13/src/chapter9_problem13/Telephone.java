package chapter9_problem13;

public class Telephone {

	public char translatePhoneNumber(char tempChar){
		
		char returnNumber = ' ';
		//String tempString = String. (tempChar);
		System.out.println(tempChar);
		
		if (tempChar == 'A' ) {
			returnNumber = '2';
		}
		else if (tempChar == 'B' ) {
			returnNumber = '2';
		}
		else if (tempChar == 'C' ) {
			returnNumber = '2';
		}
		else if (tempChar == 'D' || tempChar == 'E'||tempChar == 'F') {
			returnNumber = '3';
		}
		else if (tempChar == 'G' || tempChar == 'H'||tempChar == 'I') {
			returnNumber = '4';
		}
		else if (tempChar == 'J' || tempChar == 'K'||tempChar == 'L') {
			returnNumber = '5';
		}
		else if (tempChar == 'M' || tempChar == 'N'||tempChar == 'O') {
			returnNumber = '6';
		}
		else if (tempChar == 'P' || tempChar == 'Q'||tempChar == 'R' || tempChar =='S') {
			returnNumber = '7';
		}
		else if (tempChar == 'T' || tempChar == 'U'||tempChar == 'V') {
			returnNumber = '8';
		}
		else if (tempChar == 'W' || tempChar == 'X'||tempChar == 'Y' || tempChar =='Z') {
			returnNumber = '9';
		}
		else return tempChar;
		
		return returnNumber;
					
	}
	
	
}
