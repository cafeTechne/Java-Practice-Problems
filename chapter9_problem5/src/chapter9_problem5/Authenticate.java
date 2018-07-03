package chapter9_problem5;

public class Authenticate {
	
	
	public void validateSyntax(String input){
		
		char[] charArray = input.toCharArray();
		boolean atleastOneUpper = false;
		boolean atleastOneLower = false;
		boolean atleastOneDigit = false;
		
		/*
		 *  1) longer than 6 characters.
		 *  2) should contain at least one uppercase and at least one lowercase letter
		 *  3) should have at least 1 digit.
		 */
		
		if (input.length() < 6){
			System.out.println("Not enough characters! (6 is the minimum!)"); 
			}
		
		
		for (int i = 0; i< charArray.length; i++) {
			
			if (Character.isLowerCase(charArray[i])) {
				atleastOneLower = true;
			}
			if (Character.isUpperCase(charArray[i])) {
				atleastOneUpper = true;
			}
			if (Character.isDigit(charArray[i])) {
				atleastOneDigit = true;
			}
		}
		
		if (atleastOneDigit && atleastOneLower && atleastOneUpper) {
			System.out.println("Password is valid!");
		}
		else System.out.println("Password is not valid! Exiting!");
		System.exit(1);		
	}

}
