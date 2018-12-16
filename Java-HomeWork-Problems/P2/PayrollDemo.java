/***************************************************************
 Application class: PayrollDemo
***************************************************************/
   
import java.util.Scanner;
 
public class PayrollDemo 
{
   public static void main(String[] arg)  
   {
      //declare and instantiate 3 Payroll objects
	   
	   Payroll emp1 = new Payroll();  
	   Payroll emp2 = new Payroll("1002"); 
	   Payroll emp3 = new Payroll("1003", 40);
	   
	   double hours;
	   String id;
	   
	   Scanner keyboard = new Scanner(System.in);
	   System.out.println("Please ID and hours for employee 1: "); 

	   //enter information for emp1
	   System.out.print("Please empolyee ID: "); 
	   id = keyboard.next();            
	   System.out.print("Please hours: ");   
	   hours = keyboard.nextDouble();

	   //call methods
	   emp1.setEmpId(id);
	   emp1.setHours(hours);                     
	   emp1.printInfo();  
	   
	   emp2.setHours(50);                     
	   emp2.printInfo();  
	   
	   System.out.println(emp3.getEmpId());                     
	   System.out.println(emp3.getHours()); 
   }  
}  //End Class
