package chapter8_problem1;

public class Area {
	
	
	final static double PI = Math.PI;
	
	static public double calcArea(double radius){
		//circle 
		return PI * radius * radius;
		
	}

	static public double calcArea(double pi, double radius, double height ){
		//cylinder
		return pi * radius * radius * height;
		
	}

	static public double calcArea(double length, double width){
		//calculating the area of a rectangle
		return length * width;
		
	}


}
