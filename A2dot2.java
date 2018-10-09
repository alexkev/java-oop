import java.util.Scanner;
//compute volume of a cylinder
public class A2dot2 {
	public static void main(String[] args) {
		//create scanner for radius input object
		Scanner input = new Scanner(System.in);

		//prompt user to enter radius and length
		System.out.print("Enter the radius and length of a cylinder: ");
		double radius = input.nextDouble();
		double length = input.nextDouble();

		//compute area
		double area = radius * radius * Math.PI;

		//display area
		System.out.println("The area is " + area);

		//compute volume
		double volume = area * length;

		//display volume
		System.out.println("The volume is " + volume);


	}
}
