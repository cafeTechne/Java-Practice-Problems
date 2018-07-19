package chapter9_problem12;

public class Application {

	public static void main(String[] args) {
		/*
		 * 
		 * 12 Miscellaneous String Operations
		 * 
		 * Write a class with the following static methods:
		 * 
		 * WordCount: This method should accept a reference to a String Object
		 * as an argument and return the number of words contained in the Object
		 * 
		 * arrayToString: This method accepts a char array as an argument and
		 * conveerts it to a String object. The method should return a reference
		 * to the String object.
		 * 
		 * mostFrequent: This method accepts a reference to a STring object as an 
		 * argument and returns the character that occurs the most frequently in the
		 * object
		 * 
		 * replaceSubstring: This method accepts three references to String objects 
		 * as arguments. Let's call them string1, string2, and string3. It searches string1
		 * for all occurrences of string2. When it finds an occurrence of string2,
		 * it replaces it with string3. For example, suppose the three arguments have
		 * the folliwng values:
		 * 
		 * string1: "the dog jumped over the fence"
		 * string2: "the"
		 * string3: "that"
		 * 
		 * .....
		 * 
		 * Demonstrate with a complete program.
	
		 *
		 */
		
		//arrayToString test
		char[] charArray = {'a', ' ', 'b','i','g','g', 'e', 'r'};
		String sentence;
		sentence = StringWrangler.arrayToString(charArray);
		System.out.println(sentence);
		//passed
		
		//wordcount test
		int wordCount = StringWrangler.WordCount(sentence);
		System.out.println(wordCount);
		//passed
		
		char highestChar = ' ';
		
		//highestChar test
		highestChar = StringWrangler.mostFrequent(sentence);
		System.out.println("The most frequent char is " + highestChar);
		//passed
		
		
		//replaceSubstring test
		String string1 = "Substring replacement test";
		String string2 = "test";		
		String string3 = "success";
		
		StringWrangler.replaceSubstring(string1, string2, string3);
		//test passed
		
		//All tests passed!
	}

}
