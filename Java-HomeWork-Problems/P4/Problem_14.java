import java.io.*;
import java.util.*;

public class Problem_14{

	public static void main(String[] args) throws IOException{
	
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("User, enter the name of a file: ");
		String filename = keyboard.nextLine();
		
		File myFile = new File(filename);
		Scanner inputFile = new Scanner(myFile);
		
		int i = 1;
		
		while(inputFile.hasNext()){
			System.out.print(i + " ");
			String str = inputFile.nextLine();
			System.out.println(str);
			i++;
		}
	
	}	
}
