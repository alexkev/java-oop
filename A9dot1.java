/*
 * Write a test program 
 * create two Rectangle objects
 * Rectangle1 with width 4 and height 40
 *  Printf the width, height, area, and perimeter of each rectangle, call getArea, call getPerimeter
 * Rectangle2 with width 3.5 and height 35.9. 
 *  Printf the width, height, area, and perimeter of each rectangle, call getArea, call getPerimeter
 */
public class A9dot1 {
	public static void main(String[] args) {
		Rectangle rectangle1 = new Rectangle(4,40);
		System.out.printf("Rectangle1's width %.2f, height %.2f,  area %.2f,  perimeter %.2f%n", 
				rectangle1.getWidth(), rectangle1.getHeight(), 
				rectangle1.getArea(), 
				rectangle1.getPerimeter());

		Rectangle rectangle2 = new Rectangle(3.5, 35.9);
		System.out.printf("Rectangle1's width %.2f, height %.2f,  area %.2f,  perimeter %.2f%n", 
				rectangle2.getWidth(), rectangle2.getHeight(), 
				rectangle2.getArea(), 
				rectangle2.getPerimeter());

	}
}
