package chapter8_problem5;


public class Application {

	public static void main(String[] args) {

		//Testing the Month class
		
		//default constructor sets monthNumber to 1
		Month jan = new Month();
		
		//manually set month to 2
		Month  feb = new Month(2);
		
		//compare the two months...
		//is January less than February?
		System.out.println(feb.lessThan(jan));
		//returns true, passed
		
		//is January greater than February? 
		System.out.println(feb.greaterThan(jan));
		
		//note: the structure of these arguments is given in the way the problem is framed...
		//if I were designing this, I would have the calling object used in the comparison switched
		//so it were easier to read for a regular Hoo-man ::Ferengi pronunciation::
		
		
		System.out.println(jan.toString());
		System.out.println(feb.toString());
		//overridden toString() method passes
	}

}
