package chapter9_problem11;


import java.io.*;



public class Application {

	public static void main(String[] args) throws IOException {
		/**
		 * 
		 * The file SalesData.txt, in this chapters source code folder, contains the dollar 
		 * amount of sales that a retail store made each day for a number of weeks. Each 
		 * line in the file contains seven numbers, which are the sales numbers for one week. 
		 * The numbers are separated by a comma. 
		 * 
		 * Write a program that opens the file and processes its contents.
		 * 
		 * The program should display the following:
		 * 
		 * The total sales for each week
		 * The average daily sales for each week
		 * The total sales for all of the weeks
		 * the average weekly sales
		 * The week number that had the highest amount of sales
		 * The week number that had the lowest amount of sales
		 * 
		 * 
		 */
		
		
		//this opens the file
		 FileReader file = new FileReader(new File("SalesData.txt"));

	     BufferedReader read = new BufferedReader(file);

	     String line = read.readLine();
	     
	     String[] stringArray;
	     
		double totalSalesPerWeek=0.0; //check
		double totalSales=0.0; //check x
		double averageWeeklySales=0.0; //check x
		double weekWithHighestSales=0.0; // check x
		double weekWithLowerSales=999999.0; //check x
		double dayCounter = 0;
		double weekCounter = 0;
		
	
		while (line != null) {
			
			String string = line.toString();
			System.out.println(string);
			System.out.println(string);
			string = string.trim();
			stringArray = string.split(",");
			
			
			for (int i = 0; i<stringArray.length; i ++) {
				
				String tempString1 = stringArray[i];
				double tempDouble = Double.parseDouble(tempString1);
				dayCounter +=1;
				totalSales = totalSales +tempDouble;
				
				if (dayCounter%7==0) {
					//then calculate the average for the 7 days beforehand
					weekCounter = weekCounter + 1;
					double weeklySum = 0.0;
					
					for(int m = 0;m<7;m++) {
						int tempNum = i-m;
						String tempString2 = stringArray[tempNum];
						double tempNum2 = Double.parseDouble(tempString2);
						weeklySum = weeklySum + tempNum2;
					}
				
					totalSalesPerWeek = weeklySum;
					
					System.out.println("Total Sales for week "+ weekCounter +" is equal to: "+ totalSalesPerWeek);
					System.out.println("Average Daily Sales for week "+ weekCounter +" is equal to: "+ (totalSalesPerWeek/7.0));					
					
					//check and set highest & lowest weeks
					if (weeklySum < weekWithLowerSales) {
						weekWithLowerSales = weeklySum;
					}
					if (weeklySum > weekWithHighestSales) {
						weekWithHighestSales = weeklySum;
					}
				}
						
			}
			line = read.readLine();
		}
		
		//average weekly sales
		averageWeeklySales = totalSales/dayCounter;
				
		System.out.println("Average weekly sales: " + averageWeeklySales);
		System.out.println("Total sales: "+ totalSales);
		System.out.println("Week with the lowest average sales: " + weekWithLowerSales);
		System.out.println("Week with the highest average sales: " + weekWithHighestSales);
		
		
	    read.close();	
	}

	
}
