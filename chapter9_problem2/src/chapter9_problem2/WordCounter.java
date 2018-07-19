package chapter9_problem2;

public class WordCounter {
	
	int countOfWords = 0;
	
	WordCounter(String word){
		
		//trim() removes extraneous spaces at the beginning and end
		//to sanitize the input--I am assuming spaces correspond to 
		//words in this algorithm
		word.trim();
		
		String output;
		
		char[] charArray = word.toCharArray();
		
		
		for (int i = 0; i< charArray.length; i++) {
		
			if (charArray[i] == ' ') countOfWords +=1;
	
		}
		
		output = charArray.toString();
		
		getWordCount();
	}
	
	// returns the number of spaces + 1, which should correspond to # of words
	public int getWordCount() {
		
		return this.countOfWords+1;
		
	}

}
