package chapter9_problem6;

public class WordSearcher {
	
	boolean matchFlag = false;
	int matchingCounter;
	
	public WordSearcher() {
		
			}
	
	public void search(String input, String[] nameList, String[] phoneList) {
		char[] charArray = input.toCharArray();
		int length = charArray.length;
		
		
		for (int i = 0; i < nameList.length; i++) {
			
			for (int m = 0; m < length; m++) {
				
			
				String tempString = nameList[i];
				char character1 = tempString.charAt(m);
				char character2 = charArray[m];
				//sanitize input
				character1 = Character.toLowerCase(character1);
				character2 = Character.toLowerCase(character2);
			
				/*  __Testing__
				System.out.println("Value of i is " + i);
				System.out.println("Value of m is " + m);
				System.out.println(" temp1 is " + character1);
				System.out.println(" temp is " + character2);
				*/
				
				if (character1 == character2) {
					this.matchFlag = true;
					this.matchingCounter = this.matchingCounter + 1;
				}
				else {
					this.matchFlag = false;
				}
				
				if (this.matchFlag == false){
					//System.out.println("failed."); 
					break; 
				}
			}
		
			//i missed a second = in the antecedent of the conditional...
			//spent a lot of time--once I refactored the code to have meaningful
			//variable names, it took less than 10 minutes to find this small error
			//just a testament to sensible naming practices helping write/debug code!
			
			if (this.matchFlag == true ) {
				System.out.println(nameList[i] + "-----" + phoneList[i] );
				this.matchFlag = false;	
		    }
		}
		
		
	}

}
