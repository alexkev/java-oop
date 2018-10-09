/*
 * create scanner
 * create try ctach 
 * inside the try prompt user for sides
 * read sides inot the object t
 * prompt user for color & fill
 * set fill and color
 * print & call getColor and isFilled
 * print object
 * print & call area and perimeter
 * use catch & finally to give exceptions
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class A11dot1 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		boolean done = false;
		while (!done ) {
			try {
				System.out.print("Please enter three sides: ");
				double side1 = input.nextDouble();
				double side2 = input.nextDouble();
				double side3 = input.nextDouble();
				Triangle t = new Triangle(side1, side2, side3);
				
				System.out.print("What is the color & filled is true or false: ");
				String color = input.next();
				boolean filled = input.nextBoolean();	
				t.setColor(color);
				t.setFilled(filled);
				System.out.println("Color is " + t.getColor() + " fill is " + t.isFilled());
				
				System.out.println(t);
				
				System.out.printf("The area is %.2f & the perimeter is %.2f%n", t.getArea(), t.getPerimeter());
				done = true;
			} catch (InputMismatchException e) {
				System.out.println("Please enter numbers");
			} catch (IllegalTriangleException e) {
				System.out.println("That's not a valid triangle");
			} finally {
				input.nextLine();
			}
		}
	}
}