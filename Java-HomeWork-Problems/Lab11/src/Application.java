import java.io.*;
import java.util.*;

public class Application implements Serializable{

	public static void main(String[] args) throws InvalidDepositAmount, InvalidWithdrawalAmount, IOException {
		
		Scanner keyboard = new Scanner(System.in);
		BankAccount bankAccount = null;

	
		boolean invalidDeposit = true;
		boolean invalidWithdrawal = true;
		boolean validOption = true;
		double balance, interestRate, monthlyCharge, withdrawalAmount, depositAmount;
		int optionChoice = 0;

		
	do {
		try {
			// Open the file.
	        FileOutputStream file = new FileOutputStream("savingsAccount.dat");
	        ObjectOutputStream objectOutputFile = new ObjectOutputStream(file);
	        
			//create a menu, each one responds to a selection			
			System.out.println("Please enter the interest rate: \n");
			interestRate = keyboard.nextDouble();
			System.out.println("Please enter the monthly charge: \n");
			monthlyCharge = keyboard.nextDouble();
			System.out.println("Please enter the initial balance: \n");
			balance = keyboard.nextDouble();
			
			//declare an object of the savingsAccount class
			bankAccount = new SavingsAccount(balance, interestRate, monthlyCharge);
			invalidDeposit = true;
			System.out.println(bankAccount);
			
			writeObj((SavingsAccount) bankAccount);
			
		}
		catch(InvalidDepositAmount e){
			System.out.println(e.getMessage());
			invalidDeposit = false; //exception is thrown, loop forced to recover
			System.out.println("The deposit amount must be greater than 0 and less than 10000.\n");
			System.out.println("Please re-enter valid account information!\n");
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
			
		}
		
	}while(!invalidDeposit || !invalidWithdrawal);	//while any one of variables is false, the loop continues.


		do {
			System.out.println("Option Menu:");
			System.out.println("1: Deposit");
			System.out.println("2: Withdraw");
			System.out.println("3: View Balance");
			System.out.println("4: Exit");
			System.out.println("\nPlease enter your option: ");
			optionChoice = keyboard.nextInt();
			
			if(optionChoice == 1) {
				System.out.println("\n\nPlease enter the amount to deposit: ");
				do {
					try {
						bankAccount = readObj();
						depositAmount = keyboard.nextDouble();
						bankAccount.deposit(depositAmount);
						
						writeObj((SavingsAccount) bankAccount);
						invalidDeposit = true;
						validOption = false;
					} 
					catch(InvalidDepositAmount e) {
						System.out.println(e.getMessage());
						invalidDeposit = false;
						System.out.println("The deposit amount must be greater than 0 and less than 10000");
						System.out.println("Please re-enter the deposit amount!");
					}
					catch (Exception e) {
						e.printStackTrace();
					}					
				}while(!invalidDeposit);
				
			}else if(optionChoice == 2) {
				System.out.println("Please enter the amount to withdraw: ");
				do {
					try {
						bankAccount = (SavingsAccount)readObj();
						withdrawalAmount = keyboard.nextDouble();
						bankAccount.withdraw(withdrawalAmount);
						
						writeObj((SavingsAccount) bankAccount);
						validOption = false;
					}
					catch(InvalidWithdrawalAmount e) {
						System.out.println(e.getMessage());
						invalidWithdrawal = true;
						System.out.println("The withdrawal amount must be greater than 0 and less than 10000");
						System.out.println("Please re-enter the withdrawal amount!");

					} catch (Exception e) {
						e.printStackTrace();
					}
				} while(!invalidWithdrawal);
			}else if(optionChoice == 3) {
				System.out.println(bankAccount);
				validOption = false;
			}else if(optionChoice == 4) {
				
				try {
					bankAccount.monthlyProcess();
					writeObj((SavingsAccount)bankAccount);
					bankAccount = readObj();
				} catch (Exception e) {
					e.printStackTrace();
				}
				validOption = true;
				System.out.println("");
				
			}else {
				System.out.println("Invalid option!\n");
				validOption = false;
			}
		}while(!validOption);
	}
	static public void writeObj(SavingsAccount account) throws IOException {
		// Open the file.
        FileOutputStream file = new FileOutputStream("savingsAccount.dat");
        ObjectOutputStream objectOutputFile = new ObjectOutputStream(file);
     
		//write the object to the file
		objectOutputFile.writeObject(account); 
		//close the file
		objectOutputFile.close();
	}
	static public SavingsAccount readObj() throws IOException, Exception {
		FileInputStream file = new FileInputStream("savingsAccount.dat");
	    ObjectInputStream objectInputFile = new ObjectInputStream(file);  
	    SavingsAccount bankAccount = (SavingsAccount) objectInputFile.readObject();
	    
	    System.out.println(bankAccount.toString());
	    return bankAccount;
	}

}
