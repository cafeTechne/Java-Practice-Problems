import java.io.*;
import java.util.Scanner;


public class SerializeDemo {

	public static void main(String[] args) throws IOException {
		
		double scores [] = {5, 10, 85, 95, 99};
		
		Scanner keyboard = new Scanner(System.in);
		
		//TestScores testScores = new TestScores(scores);
		TestScores testScoreArray[] = new TestScores[2];
		
		FileOutputStream outStream = new FileOutputStream("testScores.dat");
		ObjectOutputStream objectOutputFile = new ObjectOutputStream(outStream);
		
		
		for(int j = 0; j<2;j++) {
			System.out.println("User enter 5 test scores");
			for(int i = 0; i<5; i++) {
				scores[i] = keyboard.nextDouble();
			}
			testScoreArray[j] = new TestScores(scores);
			
		}
		
		//write the serialized objects to the file
		for (int k = 0; k < testScoreArray.length; k++) {
			objectOutputFile.writeObject(testScoreArray[k]);
		}
		
		objectOutputFile.close();
		
	}

}
