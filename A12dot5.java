import java.util.InputMismatchException;
import java.util.Scanner;

public class A12dot5 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		boolean done = false;
		while (!done ) {
			try {
				System.out.print("Please enter three sides: ");
				double s1 = input.nextDouble();
				double s2 = input.nextDouble();
				double s3 = input.nextDouble();
				MyTriangle t = new MyTriangle(s1, s2, s3);
				System.out.println(t);
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

class MyTriangle {
	double s1, s2, s3;
	MyTriangle(double s1, double s2, double s3) throws IllegalTriangleException {
		if (s1 + s2 <= s3 || s2 + s3 <= s1 || s3 + s1 <= s2) {
			throw new IllegalTriangleException();
		}
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
	}

	public String toString() {
		return "Triangle with sides " + s1 + " " + s2 + " " + s3;
	}
}

@SuppressWarnings("serial")
class IllegalTriangleException extends Exception {
	public IllegalTriangleException() {
		super("Triangle Error");
	}
}