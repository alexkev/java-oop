
/****************************************************************
*                          Triangle            					*
*---------------------------------------------------------------*
* -side1: double										      	*
* -side2: double												*
* -side3: double												*    
* +getSide1: double  											* 
* +setSide1: double  											* 
* +getSide2: double  											* 
* +setSide2: double  											* 
* +getSide3: double  											* 
* +setSide3: double  											*               
* +Triangle: (side1: double, side2: double, side3: double)		*
* +getArea(side1: double, side2: double, side3: double)			*
* +getPerimeter(side1: double, side2: double, side3: double) 	*
* +toString(side1: double, side2: double, side3: double)		*
****************************************************************/

/*
 * 
 * Three double data fields named side1, side2, and side3 with default
 * values 1.0 to denote three sides of the triangle.
 * A no-arg constructor that creates a default triangle.
 * A constructor that creates a triangle with the specified side1, side2, and side3.
 * The accessor methods for all three data fields.
 * A method named getArea() that returns the area of this triangle.
 * A method named getPerimeter() that returns the perimeter of this triangle.
 * A method named toString() that returns a string description for the triangle.
 *
 */

class Triangle extends GeometricObject{
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;

	public Triangle() {
	}

	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}

	Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
		if (side1 + side2 <= side3 || side2 + side3 <= side1 || side3 + side1 <= side2) {
			throw new IllegalTriangleException();
		}
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public double getArea() {
		double s = (side1 + side2 + side3)/2;
		double area = Math.sqrt(s*(s - side1)*(s-side2)*(s-side3));
		return area;
	}

	public double getPerimeter() {
		double perimeter = side1 + side2 + side3;
		return perimeter;
	}

	public String toString() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 +
				" side3 = " + side3;
	}
}