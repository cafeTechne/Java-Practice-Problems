/***************************************************************
Service class: Payroll
***************************************************************/
/**
This class calculates a weekly payment for employees.
*/
 import java.text.DecimalFormat;   
class Payroll
{
   //declare data members - variable
   private String empId;  
   private double hours; 
   public final double RATE = 12.5; //constant can be public -------
   
   //define methods:
   
   /* The following three are constructors
   *******************************************************/
   
   /**
	Default constructor: initialize all data members with default value.
	*/ 
   public Payroll() 
   {
	   empId = "";
	   hours = 0.0;
   } 

   /**
	Constructor: initialize emplyee's id with an argument, and
	other data members with default value.
	@param newId emplyee id
	*/ 
   public Payroll(String newId) 
   { 
	   empId = newId;  //newId holds input for empId 
	   hours = 0.0;    //no parameter for hours
   } 

   /**
	Constructor: initialize all data members with arguments' values.
	@param newId The value to intialize empId.
	@param newHours The value to intialize hours. 
	*/ 
   public Payroll(String newId, double newHours) 
   {    

	   empId = newId;   //newId holds input for empId 
	   hours = newHours;//newHours holds input for hours
   }  

   // The following three are mutators - setters --------------
  
  /**
  	The setEmpId method stores a value in the
      empId field.
      @param newId The value to store in empId.
	*/

   public void setEmpId(String newId) 
   {
	   empId = newId;
   } 

/**
  	The setHours method stores a value in the
      hours field.
      @param newHours The value to store in hours.
*/

   public void setHours(double newHours)  
   { 
	   hours = newHours;
   } 
      
   // The following three are accessors - getters  ------------
	
	/**
      The getEmpId method returns a Payroll
      object's empId.
      @return The value in the empId field.
   */
  
   public String getEmpId() 
   {
      return empId;
   } 

  /**
      The getHours method returns a Payroll
      object's hours.
      @return The value in the hours field.
   */
   public double getHours()  
   {
      return hours; 
   } 
 
   // Other methods
   //Method to process data:
	
	/**
      The calPay method returns a Payroll
      object's total payment.
      @return The total payment.
   */

   public double calPay()  
   {
	   return hours * RATE;
   } 
   
   //Method to display information on the screen -- optional
	
	/**
      The printInfo method display information on a Payroll object.
   */

   public void printInfo()  
   {
	   DecimalFormat ft = new DecimalFormat("#0.00"); //for format
	   System.out.println("Employee ID: " + empId);
	   System.out.println("Hours worked: " + ft.format(hours));  
	   System.out.println("Hourly pay rate: " + ft.format(RATE));  
	   System.out.println("Weekly pay: " + ft.format(calPay()));        System.out.println(); //print an empty line
   } 
} //End Class