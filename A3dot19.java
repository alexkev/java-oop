import java.util.Scanner;
/*
 * create a scanner 
 * prompt and read three sides 
 * validate the triangle
 * if valid calculate the perimeter
 * else
 * display and error message
 */
public class A3dot19 {

	public static void main(String[] args) {
		// Create a triangle
		Scanner input =  new Scanner(System.in);
		System.out.print("Please enter three sides of the triangles: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();

		if (a + b >c && b+ c > a && c + a > b) {
			double perimeter = a + b + c;
			System.out.print("This perimeter is " + perimeter);
		} else {
			System.out.print("This is not a valid triangle");
		}
		input.close();
	}
}
