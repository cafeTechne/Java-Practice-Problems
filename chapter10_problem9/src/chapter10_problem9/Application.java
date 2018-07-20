package chapter10_problem9;

public class Application {

	public static void main(String[] args) {
		
		//Chapter 10, Problem 9... Bank Account
		
		SavingsAccount account = new SavingsAccount(14, .05);
		
		//test the $25 dollar withdrawal limit
		account.withdraw(3);
		account.deposit(50);
		
		//works 
		account.withdraw(3);
		account.withdraw(3);
		account.withdraw(3);
		account.withdraw(3);
		account.withdraw(3);
		account.withdraw(3);
		account.withdraw(3);
		
		
		//monthly processing works
		account.monthlyProcess();
		
	}

}
