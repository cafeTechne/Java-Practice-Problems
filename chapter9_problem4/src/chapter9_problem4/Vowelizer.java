package chapter9_problem4;

public class Vowelizer {

	String words;
	
	public Vowelizer(String word) {
		this.words = word;	
	}
	
	public int getVowels(String word) {
		
		char[] charArrayTemp = word.toCharArray();
		int counter = 0;
		
		for (int i = 0; i< charArrayTemp.length; i++) {
			if (charArrayTemp[i] == 'a' ) counter +=1;
			if (charArrayTemp[i] == 'e' ) counter +=1;
			if (charArrayTemp[i] == 'i' ) counter +=1;
			if (charArrayTemp[i] == 'o' ) counter +=1;
			if (charArrayTemp[i] == 'u' ) counter +=1;
			
			if (charArrayTemp[i] == 'A' ) counter +=1;
			if (charArrayTemp[i] == 'E' ) counter +=1;
			if (charArrayTemp[i] == 'I' ) counter +=1;
			if (charArrayTemp[i] == 'O' ) counter +=1;
			if (charArrayTemp[i] == 'U' ) counter +=1;
		}
		return counter;
	}
	
	public int getConsonants(String word) {
		
		char[] charArrayTemp = word.toCharArray();
		int counter = 0;
		
		for (int i = 0; i< charArrayTemp.length; i++) {
			if (charArrayTemp[i] == 'b' ) counter +=1;
			if (charArrayTemp[i] == 'c' ) counter +=1;
			if (charArrayTemp[i] == 'd' ) counter +=1;
			if (charArrayTemp[i] == 'f' ) counter +=1;
			if (charArrayTemp[i] == 'g' ) counter +=1;
			if (charArrayTemp[i] == 'h' ) counter +=1;
			if (charArrayTemp[i] == 'j' ) counter +=1;
			if (charArrayTemp[i] == 'k' ) counter +=1;
			if (charArrayTemp[i] == 'l' ) counter +=1;
			if (charArrayTemp[i] == 'm' ) counter +=1;
			if (charArrayTemp[i] == 'n' ) counter +=1;
			if (charArrayTemp[i] == 'p' ) counter +=1;
			if (charArrayTemp[i] == 'q' ) counter +=1;
			if (charArrayTemp[i] == 'r' ) counter +=1;
			if (charArrayTemp[i] == 's' ) counter +=1;
			if (charArrayTemp[i] == 't' ) counter +=1;
			if (charArrayTemp[i] == 'v' ) counter +=1;
			if (charArrayTemp[i] == 'w' ) counter +=1;
			if (charArrayTemp[i] == 'x' ) counter +=1;
			if (charArrayTemp[i] == 'y' ) counter +=1;
			if (charArrayTemp[i] == 'z' ) counter +=1;
			
			if (charArrayTemp[i] == 'B' ) counter +=1;
			if (charArrayTemp[i] == 'C' ) counter +=1;
			if (charArrayTemp[i] == 'D' ) counter +=1;
			if (charArrayTemp[i] == 'F' ) counter +=1;
			if (charArrayTemp[i] == 'G' ) counter +=1;
			if (charArrayTemp[i] == 'H' ) counter +=1;
			if (charArrayTemp[i] == 'J' ) counter +=1;
			if (charArrayTemp[i] == 'K' ) counter +=1;
			if (charArrayTemp[i] == 'L' ) counter +=1;
			if (charArrayTemp[i] == 'M' ) counter +=1;
			if (charArrayTemp[i] == 'N' ) counter +=1;
			if (charArrayTemp[i] == 'P' ) counter +=1;
			if (charArrayTemp[i] == 'Q' ) counter +=1;
			if (charArrayTemp[i] == 'R' ) counter +=1;
			if (charArrayTemp[i] == 'S' ) counter +=1;
			if (charArrayTemp[i] == 'T' ) counter +=1;
			if (charArrayTemp[i] == 'V' ) counter +=1;
			if (charArrayTemp[i] == 'W' ) counter +=1;
			if (charArrayTemp[i] == 'X' ) counter +=1;
			if (charArrayTemp[i] == 'Y' ) counter +=1;
			if (charArrayTemp[i] == 'Z' ) counter +=1;
		}
		return counter;
	}
	
	
}
