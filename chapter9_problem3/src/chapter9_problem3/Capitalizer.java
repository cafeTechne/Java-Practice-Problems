package chapter9_problem3;

public class Capitalizer {

	
	
	
	Capitalizer(String word){
		
		StringBuffer sb = new StringBuffer();
		String trimmedWord = word.trim();
		char [] charArray = trimmedWord.toCharArray();
		boolean capitalizeFlag = false;
		boolean skipFlag = false;
		
		for(int i=0 ; i < charArray.length; i++) {
			
			char temp = ' ';
			
			
			if (i == 0 || (capitalizeFlag == true)) {
				temp = Character.toUpperCase(charArray[i]);
				capitalizeFlag = false;
				
				}
			else if (skipFlag == true) {
				temp = Character.toUpperCase(charArray[i]);
				skipFlag = false;
				
			}
			else if (charArray[i] == ' ') {
				temp = charArray [i];
			}
			else if (charArray[i] == '.') {
				capitalizeFlag = true;
				skipFlag = true;
				temp = charArray[i];
			}
			
			else temp = charArray[i];
			
			if (capitalizeFlag == true && skipFlag == false) {
				capitalizeFlag = false;
			}
			
			sb.append(temp);
			
		}
		
		System.out.println(sb);
	
	}
	
}
