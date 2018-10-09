
/*
 * Write a test program that creates the two points (0, 0) and (10, 30.5) 
 * and displays the distance between them.
 */
public class A10dot4 {

	public static void main(String[] args) {
		
		MyPoint point1 = new MyPoint();
		MyPoint point2 = new MyPoint(10, 30.5);
		
		System.out.println("The distance between (" 
				+ point1.getX() + ", " + point1.getY() + ") and ("
				+ point2.getX() + ", " + point2.getY() + ") is: " + 
				point1.distance(point2));
	}
}
/*
 * Design a class named MyPoint to represent a point with x- and y-coordinates. The class contains: 
 * The data fields x and y that represent the coordinates with getter methods. 
 * A no-arg constructor that creates a point (0, 0). 
 * A constructor that constructs a point with specified coordinates.
 * A method named distance that returns the distance from this point to a specified point of the MyPoint type.
 * A method named distance that returns the distance from this point to another point with specified x- and y-coordinates.
 
***********************************
*            MyPoint              *
*---------------------------------*
* -x: double                      *
* -y: double                      *
* +MyPoint()                      *
* +MyPoint(x: double, y: double)  *
* +getX(): double                 *
* +getY(): double                 *
* +distance(myPoint: MyPoint)     *
* +distance(x: double, y: double) *
***********************************
*/	
	
	class MyPoint {
		double x; 
		double y;
		
		MyPoint() {
		}
		MyPoint(double x, double y) {
			this.x = x;
			this.y = y;
		}

		public double getX() {
			return x;
		}
		public void setX(double x) {
			this.x = x;
		}
		public double getY() {
			return y;
		}
		public void setY(double y) {
			this.y = y;
		}
		
	   public double distance(MyPoint myPoint) {
		   return Math.sqrt(Math.pow(myPoint.getX() - x, 2) + Math.pow(myPoint.getY() - y, 2));
	   }
	   
	 	public double distance(double x, double y) {
	 		return distance(new MyPoint(x, y));
	 	}
	}
	
	
	
