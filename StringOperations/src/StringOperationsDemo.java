//*****************************************
  //   Name: Gino Nicholas LaGuardia-LoBianco
  //   CTP 150-Section#003
  //   Lab #8
  //***************************************** 

/**
   This program demonstrates a solution to the
   Miscellaneous String Operations programming 
   challenge.
*/
import java.util.Scanner;

public class StringOperationsDemo
{
   public static void main(String[] args)
   {
   	/*Methods in the service class are static. There is no need to instantiate a class object.
   	Use the class name with the dot to invoke the methods. */
   	
   	//test wordCount()
      System.out.println("\nTest the wordCount() method...");
      String str = "the dog jumped over the fence";
      
      System.out.println("Original string: " + str);
      System.out.println("Number of words in the string is " + StringOperations.wordCount(str));
   	
      
   	//test mostFrequent()
      System.out.println("\nTest the mostFrequent() method...");
      
      System.out.println("Original string: " + str);
      System.out.println("Most frequently occuring character in the string: " +
                         StringOperations.mostFrequent(str));
     
      
     //test replaceSubstring()    					 
      System.out.println("\nTest the replaceSubstring() method...");             
      System.out.println("Original string: " + str);
      System.out.println("After replacing \"the\" with \"that\", the string: " +
         StringOperations.replaceSubstring(str, "the", "that"));
      
      
     //test capSentence() 
      System.out.println("\nTest the capSentence() method..."); 
      String str2 = "hello! my name is Joe. what is your name? nice to meet you!";
      System.out.println("Original string: " + str2);
      System.out.print("Modified string: ");
      System.out.println(StringOperations.capSentence(str2));

      
      
   	//test reverseWords()
      System.out.println("\nTest the reverseWords() method...");
      String s3 ="Here comes the sun";
      System.out.println("Original string: " + s3);
      System.out.println("Reversed string: " + StringOperations.reverseWords(s3));

   	
      
   	//test toPigLatin()
      System.out.println("\nTest the toPigLatin() method..."); 
      String s4 = "I slept most of the night";
      String app = "ay";
      System.out.println("Original string: " + s4);
      System.out.println("Pig Latin: " + StringOperations.toPigLatin(s4, app));

   }
}
