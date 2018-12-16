/**
* This class contains utility methods that allow for the calculation of the area of
* Rectangles, Triangles, and Circles.
*
*/

public class Geometry {
	
	/**
	 * Calculates the area of a circle.
	 * @param radius A double entered by the user representing the radius of a circle.
	 * @return a double representing the area of a circle
	 */
	
	public static double calcCircleArea(double radius) {
		//circle	
		return (Math.PI * radius * radius);
	}
	
	/**
	 * Calculates the area of a rectangle.
	 * @param length a double representing the length of a rectangle.
	 * @param width a double representing the width of a rectangle.
	 * @return
	 */

	public static double calcRectangleArea(double length, double width) {
		//rectangle		
		return (length * width);
	}
	
	/**
	 * Calculates the area of a triangle.
	 * @param base a double representing the base of a triangle.
	 * @param height a double representing the height of a triangle.
	 * @return a double representing the area of a triangle.
	 */

	public static double calcTriangleArea(double base, double height) {
		//triangle
		return ((0.5)*base*height);
	}

}
