//*****************************************
  //   Name: Gino N. LaGuardia-LoBianco
  //   CTP 150 – Section# 003
  //   Lab Assignment # 6, Problem 2
  //***************************************** 
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RainFallDemo {

	public static void main(String[] args) throws IOException{
		
		File inputFile = new File("rainFallData.txt");
		Scanner fileReader = new Scanner(inputFile);
		int readerIndex = 0;
		
		ArrayList <Double>initializedList = new ArrayList<Double>(Arrays.asList(2.1, 1.7, 3.5, 2.6, 4.3, 3.7, 3.9, 2.6, 2.9, 1.6, 2.4, 3.7));
		ArrayList <Double>inputList = new ArrayList<Double>();
		
		
		
		while(fileReader.hasNextLine() && fileReader != null) {
			inputList.add(readerIndex, Double.parseDouble(fileReader.nextLine())); 
			readerIndex++;
		}
		
		RainFall rainfall = new RainFall(inputList);		
		RainFall rainfall2 = new RainFall(initializedList);

		
		//Demonstration of the Service Class with the data read from initialized array list:
		
		System.out.println("1)Test data from the initialized array list...\n");
		
		System.out.println("The yearly total rainfall was: " + rainfall2.getYearlyTotalRainFall());
		
		System.out.printf("The average rainfall for this year is: %.1f\n", rainfall2.getAverageMonthlyRainFall());
		
		System.out.println("The month with the highest rainFall was "+ rainfall2.getMonthName(rainfall2.getMonthWithMostRain()) + " with " + rainfall2.getRainfallOfSpecificMonth(rainfall2.getMonthWithMostRain()) + " inches.");
		
		System.out.println("The month with the lowest rainFall was "+ rainfall2.getMonthName(rainfall2.getMonthWithLeastRain()) + " with " + rainfall2.getRainfallOfSpecificMonth(rainfall2.getMonthWithLeastRain()) + " inches.");
		
		
		rainfall2.getAboveAverageMonths();
		
		
		
		System.out.println("\n2)Test data from the file...\n");
		//Demonstration of the Service Class with the data read from file:
		System.out.println("The yearly total rainfall was: " + rainfall.getYearlyTotalRainFall());
		
		System.out.printf("The average rainfall for this year is: %.1f\n", rainfall.getAverageMonthlyRainFall());
		
		System.out.println("The month with the highest rainFall was "+ rainfall.getMonthName(rainfall.getMonthWithMostRain()) + " with " + rainfall.getRainfallOfSpecificMonth(rainfall.getMonthWithMostRain()) + " inches.");
		
		System.out.println("The month with the lowest rainFall was "+ rainfall.getMonthName(rainfall.getMonthWithLeastRain()) + " with " + rainfall.getRainfallOfSpecificMonth(rainfall.getMonthWithLeastRain()) + " inches.");
		
		
		rainfall.getAboveAverageMonths();
		
		System.out.print("\n3)Search rainfall in any month from the file...\n");
		//performs search method by calling methods such get rainfall in any month and get month name
		searchMethod(rainfall);
		fileReader.close();
	}
		public static void searchMethod(RainFall rainFallObject) {
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Please enter a month number (e.g., 1 for January, 12 for December, and so on) : " );
			int monthNumber = keyboard.nextInt();
			
			System.out.println("The amount of rain in " + rainFallObject.getMonthName(monthNumber) + " was " + rainFallObject.getRainfallOfSpecificMonth(monthNumber) + " inches. ");
			keyboard.close();
	}
	
}
