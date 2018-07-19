package chapter9_problem1;

public class WordReverser {
	
	private String reversedWord;
	
	
	WordReverser(String word){
		
		StringBuilder builder = new StringBuilder();
		
		
		char[] charArr = word.toCharArray();
	
		int length = charArr.length;
		
		
		for(int i=0;i< length; i++)
		{
			builder.append(charArr[length-i-1]);
		}
		
		
		this.reversedWord = builder.toString();
		System.out.println("The reversed word is: " + this.reversedWord);
		
	}
	
	public void getReversedWord(){

		System.out.println("The reversed word is: " + this.reversedWord);
	}
	

}
