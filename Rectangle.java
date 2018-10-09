/*
 * Create a Rectangle class
 * set default to width 1 and height 1
 * create area method 
 * return area
 * create perimeter method
 * return perimeter
 */
public class Rectangle {
	private double width = 1;
	private double height = 1;
	
	public Rectangle () {
	}
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public Rectangle (double width, double height) {
		this.width = width;
		this.height = height;
	}

	public double getArea() {
		double area = width * height;
		return area;
	}
	
	public double getPerimeter() {
		double perimeter = 2 * (width + height);
		return perimeter;
	}
}