//*****************************************
  //   Name: Gino Nicholas LaGuardia-LoBianco
  //   CTP 150-Section#003
  //   Lab #8
  //***************************************** 
                  

/**
 * This class contains a series of utility methods to help perform arbitrary operations on Strings.
 * @author Gino N. LaGuardia-LoBianco
 *
 */

public class StringOperations {

	/**
	 *  This method accepts a reference to a String object as an
	 * argument and returns the number of words contained in the object.
	 * 
	 * @param sentence accepts a string with a reference to a string object.
	 * @return returns an integer describing the number of words contained in the string object
	 */

	public static int wordCount(String sentence){
		
		String[] wordArray = sentence.split(" ");
		return wordArray.length;
	}
	
	
	/**This method accepts a reference to a String object as an
	 * argument and returns the character that occurs the most frequently in the
	 * object.
	 * 
	 * @param stringObject sentence accepts a string with a reference to a string object. 
	 * @return returns the character that occurs most frequently in the object passed to the method.
	 */
	
	public static char mostFrequent(String stringObject){
		
		//trim out whitespace and remove spaces
		String noWhiteSpaceString = stringObject.trim().replaceAll("\\s+","");		
		
		//set all characters to lower case
		String trimmedString = noWhiteSpaceString.toLowerCase();
		
		//store it as an array of characters
		char[] charArray = trimmedString.toCharArray();
		
		int integerArray[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		
		// 97 through 122 = a through z

		for(int i=0; i<charArray.length; i++) {
			int unicodeValue = (int)charArray[i];
			if(unicodeValue == 97) {integerArray[0] += 1;}
			if(unicodeValue == 98) {integerArray[1] += 1;}
			if(unicodeValue == 99) {integerArray[2] += 1;}
			if(unicodeValue == 100) {integerArray[3] += 1;}
			if(unicodeValue == 101) {integerArray[4] += 1;}
			if(unicodeValue == 102) {integerArray[5] += 1;}
			if(unicodeValue == 103) {integerArray[6] += 1;}
			if(unicodeValue == 104) {integerArray[7] += 1;}
			if(unicodeValue == 105) {integerArray[8] += 1;}
			if(unicodeValue == 106) {integerArray[9] += 1;}
			if(unicodeValue == 107) {integerArray[10] += 1;}
			if(unicodeValue == 108) {integerArray[11] += 1;}
			if(unicodeValue == 109) {integerArray[12] += 1;}
			if(unicodeValue == 110) {integerArray[13] += 1;}
			if(unicodeValue == 111) {integerArray[14] += 1;}
			if(unicodeValue == 112) {integerArray[15] += 1;}
			if(unicodeValue == 113) {integerArray[16] += 1;}
			if(unicodeValue == 114) {integerArray[17] += 1;}
			if(unicodeValue == 115) {integerArray[18] += 1;}
			if(unicodeValue == 116) {integerArray[19] += 1;}
			if(unicodeValue == 117) {integerArray[20] += 1;}
			if(unicodeValue == 118) {integerArray[21] += 1;}
			if(unicodeValue == 119) {integerArray[22] += 1;}
			if(unicodeValue == 120) {integerArray[23] += 1;}
			if(unicodeValue == 121) {integerArray[24] += 1;}
			if(unicodeValue == 122) {integerArray[25] += 1;}
		}
		
		int mostFrequentCharIndex = integerArray[0];
		
		for(int j=1;j<integerArray.length; j++) {
			if(integerArray[j] > mostFrequentCharIndex) {
				mostFrequentCharIndex = j;
			}
		}
		
		int finalResult = 97+mostFrequentCharIndex;
		char finalCharacterResult = (char) (finalResult);
		return finalCharacterResult;
	}
	
	
	
	/**
	 * This method accepts three string objects, searches for all occurences of the 
	 * second object in the first object--and then replaces them with the third object passed in.
	 * 
	 * @param string1 A string which represents the string object that we are replacing terms in. 
	 * @param string2 A string which represents the string that we are replacing.
	 * @param string3 A string which represents the string that we are replacing string2 with.
	 * @return A string with all occurrences of string2 replaced by string3.
	 */
	
	public static String replaceSubstring(String string1, String string2, String string3) {


		StringBuilder stringBuilderObject1 = new StringBuilder();
	
		//stringBuilderObject
		stringBuilderObject1.append(string1);
	
		//finds where string 2 begins in stringBuilderObject1
		int beginning = stringBuilderObject1.indexOf(string2);
		
		//replaces string 1 with string 2
		stringBuilderObject1.replace(beginning, beginning+string2.length(), string3);
		
		return stringBuilderObject1.toString();
	}
	
	/**
	 * This method capitalizes the first word in every sentence passed into it.
	 * 
	 * @param string A string object which will have every sentence capitalized.
	 * @return A string object with all sentences capitalized.
	 */
	
	public static String capSentence(String string) {

		StringBuilder stringBuilderObject =  new StringBuilder();
		
		stringBuilderObject.append(string.trim());
		

		for(int i = 0; i < stringBuilderObject.length(); i++) {
			
			if(i == 0) {
				char c = stringBuilderObject.charAt(i);
				c = Character.toUpperCase(c);
				
				//replaces the letter with it's capitalized form.
				stringBuilderObject.replace(i, i+1, Character.toString(c));
			}
			
			if((
					(i+1 < stringBuilderObject.length())) &&
					((stringBuilderObject.codePointAt(i) == 46) || 
					(stringBuilderObject.codePointAt(i) == 63)  || 
					(stringBuilderObject.codePointAt(i) == 33))
					
				&&  (stringBuilderObject.codePointAt(i+1) == 32  
			  )){
				
				char c = stringBuilderObject.charAt(i+2);
				c = Character.toUpperCase(c);
				
				
				//replaces the letter with it's capitalized form.
				stringBuilderObject.replace(i+1, i+3, ((String) (" " + Character.toString(c))));
			}
			
		}
		
		return stringBuilderObject.toString();
	}
	
	

	/**
	 * This method reverses the order of the words in the string object passed into it.
	 * @param stringObject A string object which will have its words reversed.
	 * @return A string object with its words reversed.
	 */

	
	public static String reverseWords(String stringObject) {
		
		String stringArray[] = stringObject.split(" ");
		StringBuilder sb = new StringBuilder();
		
		for(int i = stringArray.length-1; i >= 0; i--) {
			
			sb.append(stringArray[i] + " ");
		}
		
		return sb.toString();
	}
	

	/**
	 * This method will take a string object as an argument and convert it into "pig latin".
	 * 
	 * @param stringObject A string object which will be converted into "pig latin".
	 * @param stringAppend A string object which has been converted into "pig latin".
	 * @return A string object which has been converted into "pig latin".
	 */
	
	public static String toPigLatin(String stringObject, String stringAppend) {
		
		String stringArray[] = stringObject.split(" ");
		StringBuilder sb = new StringBuilder();
		
		
		for(int i = 0; i < stringArray.length; i++) {
			
			sb.append(stringArray[i].substring(1) + stringArray[i].charAt(0) + stringAppend +" ");
		}
		
		return sb.toString();
	}
	
}
