import java.util.Scanner;

/*
 * (The ComparableCircle class) Define a class named ComparableCircle
that extends Circle and implements Comparable. Draw the UML diagram and
implement the compareTo method to compare the circles on the basis of area.
Write a test class to find the larger of two instances of ComparableCircle objects.
 */


public class A13dot6 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// get user iput
		Scanner input = new Scanner(System.in);
		System.out.print("Enter in the Radius of two circles: ");
		double r1 = input.nextInt();
		double r2 = input.nextInt();
		
		// create objects
		ComparableCircle cir1 = new ComparableCircle(r1);
		ComparableCircle cir2 = new ComparableCircle(r2);
		
		// compare objects
		int max = cir2.compareTo(cir1);
		
		// translate output to useful information and print
		if (max == 1) {
			System.out.println("The second circle is bigger");
		}
		else if (max == -1) {
			System.out.println("The first circle is bigger");
		}
		else {
			System.out.println("They are the same size");
		}
	}
}



