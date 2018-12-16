
import java.io.*;

public class DeserializeDemo {

	public static void main(String[] args) throws Exception {
		
		double scores[];
		FileInputStream inStream = new FileInputStream("testScores.dat");
		ObjectInputStream objectInputFile = new ObjectInputStream(inStream);

		
		TestScores[] testScores = new TestScores[2];
		
		for(int i=0;i<testScores.length;i++) {
			testScores[i] = (TestScores) objectInputFile.readObject();
		}
		
		//close the file
		objectInputFile.close();
		
		//display the objects
		for(int i =0; i< testScores.length; i++) {
				System.out.println( 
					testScores[i]);				
		}
		
	}

}
