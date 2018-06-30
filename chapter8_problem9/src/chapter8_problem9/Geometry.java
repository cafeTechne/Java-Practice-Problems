package chapter8_problem9;

public class Geometry {
	
	
/*
 * 1) A static method that accepts the radius of a circle and returns the area of the circle.
		 * 
		 *    Use the following formulae: 
		 *    
		 *    Area = PI * r^2
		 *    
		 * 2) A static method that accepts the length and width of a rectangle and returns the area
		 *    of the rectangle. Use the following formulae: 
		 *    
		 *    Area = Length * Width
		 *    
		 * 3) A static method that accepts the length of a triangle's base and the triangle's height.
		 *    the method should return the area of the triangle. Use the following formula: 
		 *        Area = Base * Height * 0.5
		 *        
		 *        
		 *  The methods should display an error message if negative values are used for the circle's radius,
		 *  the rectangle's length or width, or the triangle's base or height
 */
	
	
	static private double radius = 0;
	static private double length = 0;
	static private double width = 0;
	static private double base = 0;
	static private double height = 0;
	
	public Geometry() {
		
		Geometry.setRadius(0);
		Geometry.setLength(0);
		Geometry.setWidth(0);
		Geometry.setBase(0);
		Geometry.setHeight(0);
		
	}
	
	
	public static double calcArea(double radius) {
		//circle	
		return (Math.PI * radius * radius);
	}

	public static double calcArea(double length, double width) {
		//rectangle		
		return (length * width);
	}

	public static double calcArea(float base, float height) {
		//triangle
		return ((0.5)*base*height);
	}

	public static double getRadius() {
		return Geometry.radius;
	}

	public static void setRadius(double radius) {
		if(radius < 0) {
			System.out.println("The value entered must be positive!");
			
		}
		else if(radius >= 0) Geometry.radius = radius;
	}

	public static double getLength() {
		return length;
	}

	public static void setLength(double length) {
		
		if(length < 0) {
			System.out.println("The value entered must be positive!");
			
		}
		else if(length >= 0) Geometry.length = length;
	}

	public static double getWidth() {
		return width;
	}

	public static void setWidth(double width) {
		
		if(width < 0) {
			System.out.println("The value entered must be positive!");
			
		}
		else if(width >= 0) Geometry.width = width;
	}

	public static double getBase() {
		return base;
	}

	public static void setBase(float base) {
		if(base < 0) {
			System.out.println("The value entered must be positive!");
			
		}
		else if(base >= 0) Geometry.base = base;
	}

	public static double getHeight() {
		return height;
	}

	public static void setHeight(float height) {
		if(height < 0) {
			System.out.println("The value entered must be positive!");
			
		}
		else if(height >= 0) Geometry.height = height;
	}
	
}
