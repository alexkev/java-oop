import java.util.Scanner;

public class A4dot24 {

	public static void main(String[] args) {
		// sort three cities
		// create a scanner
		Scanner input = new Scanner(System.in);
		// prompt for three cities
		// read three cities
		System.out.print("Enter the first city: ");
		String c1 = input.nextLine().trim();
		
		System.out.print("Enter the second city: ");
		String c2 = input.nextLine().trim();

		System.out.print("Enter the third city: ");
		String c3 = input.nextLine().trim();
		
		// compare first two cities 
		// if out of order swap them 
		// compare second two cities
		// if out of order swap them
		// compare second two cities
		// if out of order swap them

		if (c1.compareToIgnoreCase(c2) > 0) {
			String t =c1;
			c1 = c2;
			c2 = t;
		}
		
		if (c2.compareToIgnoreCase(c3) > 0) {
			String t =c2;
			c2 = c3;
			c3 = t;
		}
		
		if (c1.compareToIgnoreCase(c2) > 0) {
			String t =c1;
			c1 = c2;
			c2 = t;
		}
		
		// display the cities in sorted order
		
		System.out.print("The three cities in alphebetical order are " + c1 + " " + c2 + " " + c3);
		input.close();
}

}
