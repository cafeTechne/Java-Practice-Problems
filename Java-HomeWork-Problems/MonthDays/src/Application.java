import java.util.*;

public class Application {

	public static void main(String[] args) {
		
		//initialize a MonthDays object
		MonthDays monthDays = new MonthDays();
		
		//initialize Scanner object for input
		Scanner keyboard = new Scanner(System.in);
		
		//query user for month
		System.out.println("Enter a month (1-12): ");
		int month = keyboard.nextInt();
		
		monthDays.setMonth(month);
		
		//query user for year
		System.out.println("Enter a year: ");
		int year = keyboard.nextInt();
		
		monthDays.setYear(year);
		
		//output the results
		monthDays.output();
		
	}

}
