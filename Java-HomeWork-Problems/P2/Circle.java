//Service Class: Circle

public class Circle {
	double radius;
	final double PI = 3.14159;
	
	Circle(double radius){
		this.radius = radius;
	}
	
	Circle(){
		this.radius = 0.0;
	}
	
	public void setRadius(double radius){
		this.radius = radius;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public double getArea() {
		return PI * radius * radius;
	}
	
	public double getDiameter() {
		return radius * 2;
	}
	
	public double getCircumference() {
		return 2 * PI * radius;
	}
	
	public void displayInfo() {
		//reports the circles area
		System.out.println("The area of the circle is: " + this.getArea());
		//reports the circles diameter
		System.out.println("The diameter of the circle is: " + this.getDiameter());
		//reports the circles circumference
		System.out.println("The circumference of the circle is: " + this.getCircumference());
		
	}
}