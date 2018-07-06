package chapter9_problem12;

public class StringWrangler {

	
/*
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
	*/
	
	
	/**
	 * 	 * WordCount: This method should accept a reference to a String Object
	 * as an argument and return the number of words contained in the Object
	 * 
	 * @param word
	 * @return int
	 */
	
	static public int WordCount(String word) {
		
		word.trim();
		String[] strArray = word.split(" ");
		
		return strArray.length;
	}
	
	
	
	/** 
	 * arrayToString: This method accepts a char array as an argument and
	 * converts it to a String object. The method should return a reference
	 * to the String object.
	 * 
	 * @param charArray
	 * @return String
	 */
	
	static public String arrayToString(char[] charArray) {
		
		StringBuilder stringBuilder = new StringBuilder();
		String tempString;
		
		for (int i = 0; i <charArray.length; i++) {	
			tempString = String.valueOf(charArray[i]);
			stringBuilder.append(tempString);
		}
		
		tempString = stringBuilder.toString();
		return tempString;
	}
	 
	
	/** 
	 * mostFrequent: This method accepts a reference to a String object as an 
	 * argument and returns the character that occurs the most frequently in the
	 * object
	 * 
	 * @param word
	 * @return char
	 */
	
	static public char mostFrequent(String word) {
	
		int a = 0, b = 0, c= 0, d= 0, e= 0, f= 0, g= 0, 
				h= 0, i= 0, j= 0, k= 0, l= 0, m= 0, n= 0, 
				o= 0, p= 0, q= 0, r= 0, s= 0, t= 0, u= 0, 
				v= 0, w= 0, x= 0, y= 0, z= 0;
		
		for (int index = 0; index<word.length(); index++) {
			if (word.charAt(index) == 'a' ) {
				a +=1;
			}
			if (word.charAt(index) == 'b' ) {
				b +=1;
			}
			if (word.charAt(index) == 'c' ) {
				c +=1;
			}
			if (word.charAt(index) == 'd' ) {
				d +=1;
			}
			if (word.charAt(index) == 'e' ) {
				e +=1;
			}
			if (word.charAt(index) == 'f' ) {
				f +=1;
			}
			if (word.charAt(index) == 'g' ) {
				g +=1;
			}
			if (word.charAt(index) == 'h' ) {
				h +=1;
			}
			if (word.charAt(index) == 'i' ) {
				i +=1;
			}
			if (word.charAt(index) == 'j' ) {
				j +=1;
			}
			if (word.charAt(index) == 'k' ) {
				k +=1;
			}
			if (word.charAt(index) == 'l' ) {
				l +=1;
			}
			if (word.charAt(index) == 'm' ) {
				m +=1;
			}
			if (word.charAt(index) == 'n' ) {
				n +=1;
			}
			if (word.charAt(index) == 'o' ) {
				o +=1;
			}
			if (word.charAt(index) == 'p' ) {
				p +=1;
			}
			if (word.charAt(index) == 'q' ) {
				q +=1;
			}
			if (word.charAt(index) == 'r' ) {
				r +=1;
			}
			if (word.charAt(index) == 's' ) {
				s +=1;
			}
			if (word.charAt(index) == 't' ) {
				t +=1;
			}
			if (word.charAt(index) == 'u' ) {
				u +=1;
			}
			if (word.charAt(index) == 'v' ) {
				v +=1;
			}
			if (word.charAt(index) == 'w' ) {
				w +=1;
			}
			if (word.charAt(index) == 'x' ) {
				x +=1;
			}
			if (word.charAt(index) == 'y' ) {
				y +=1;
			}
			if (word.charAt(index) == 'z' ) {
				z +=1;
			}
		
		}
		
		/*  For Testing:
		
		System.out.println("** Frequency Chart **");
		System.out.println("a is: " + a);
		System.out.println("b is: " + b);
		System.out.println("c is: " + c);
		System.out.println("d is: " + d);
		System.out.println("e is: " + e);
		System.out.println("f is: " + f);
		System.out.println("g is: " + g);
		System.out.println("h is: " + h);
		System.out.println("i is: " + i);
		System.out.println("j is: " + j);
		System.out.println("k is: " + k);
		System.out.println("l is: " + l);
		System.out.println("m is: " + m);
		System.out.println("n is: " + n);
		System.out.println("o is: " + o);
		System.out.println("p is: " + p);
		System.out.println("q is: " + q);
		System.out.println("r is: " + r);
		System.out.println("s is: " + s);
		System.out.println("t is: " + t);
		System.out.println("u is: " + u);
		System.out.println("v is: " + v);
		System.out.println("w is: " + w);
		System.out.println("x is: " + x);
		System.out.println("y is: " + y);
		System.out.println("z is: " + z);
		*/

		//finds the char with the highest number
		int highest = 0;
		char highestChar = ' ';
		
		if(a>b) {highest = a;}
		else highest = b;
		if(highest < c) {highest = c; highestChar = 'c';}
		if(highest < d) {highest = d; highestChar = 'd';}
		if(highest < e) {highest = e; highestChar = 'e';}
		if(highest < f) {highest = f; highestChar = 'f';}
		if(highest < g) {highest = g; highestChar = 'g';}
		if(highest < h) {highest = h; highestChar = 'h';}
		if(highest < i) {highest = i; highestChar = 'i';}
		if(highest < j) {highest = j; highestChar = 'j';}
		if(highest < k) {highest = k; highestChar = 'k';}
		if(highest < l) {highest = l; highestChar = 'l';}
		if(highest < m) {highest = m; highestChar = 'm';}
		if(highest < n) {highest = n; highestChar = 'n';}
		if(highest < o) {highest = o; highestChar = 'o';}
		if(highest < p) {highest = p; highestChar = 'p';}
		if(highest < q) {highest = q; highestChar = 'q';}
		if(highest < r) {highest = r; highestChar = 'r';}
		if(highest < s) {highest = s; highestChar = 's';}
		if(highest < t) {highest = t; highestChar = 't';}
		if(highest < u) {highest = u; highestChar = 'u';}
		if(highest < v) {highest = v; highestChar = 'v';}
		if(highest < w) {highest = w; highestChar = 'w';}
		if(highest < x) {highest = x; highestChar = 'x';}
		if(highest < y) {highest = y; highestChar = 'y';}
		if(highest < z) {highest = z; highestChar = 'z';}	 	
		
		return highestChar;
	}
	 
	
	/**
	 * 	 * replaceSubstring: 
	 * 
	 * 		This method accepts three references to String objects 
		 * as arguments. Let's call them string1, string2, and string3. It searches string1
		 * for all occurrences of string2. When it finds an occurrence of string2,
		 * it replaces it with string3. For example, suppose the three arguments have
		 * the following values:
		 * 
		 * string1: "the dog jumped over the fence"
		 * string2: "the"
		 * string3: "that"
	 * 
	 * @param string1, string2, string3
	 * @return String
	 */
	
	static public String replaceSubstring(String string1, String string2, String string3) {
		
		// searches string 1 for all occurrences of string2
		//when found, it replaces it with string3
		
		
		StringBuilder srb = new StringBuilder(string1);
		
		for(int i = 0; i<string1.length()-(string2.length()-1); i++) {

			//match string1 to string2
			String tempString1 = string1;
			String tempString2 = tempString1.substring(i, i+string2.length());
			System.out.println("tempstring is equal to " + tempString2);
			System.out.println("string1 is equal to " + string1);
			System.out.println("string2 is equal to " + string2);
			System.out.println("string3 is equal to " + string3);
			System.out.println("string1 length is equal to " + string1.length());
			
			//needed to use .equals method to compare two Strings!
			if (tempString2.equals(string2) ) {
				System.out.println("Match successful: " + tempString2);
				
				srb.replace(i, i+string2.length(), string3);
				System.out.println("Replaced string is  " + srb);
				srb.toString();
			}
		}
		
		String tempStringFinal = srb.toString();
		
		return tempStringFinal;
	}
	
}
