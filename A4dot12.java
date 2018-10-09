import java.util.Scanner;

public class A4dot12 {

	public static void main(String[] args) {
		// Covert Hex to Binary
		// create scanner
		// case statement
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a hex digit: ");
		String  hex = input.next().trim().toUpperCase();

		switch (hex) {
			case "0": System.out.print("The binary value is 0000"); break;
			case "1": System.out.print("The binary value is 0001"); break;
			case "2": System.out.print("The binary value is 0010"); break;
			case "3": System.out.print("The binary value is 0011"); break;
			case "4": System.out.print("The binary value is 0100"); break;
			case "5": System.out.print("The binary value is 0101"); break;
			case "6": System.out.print("The binary value is 0110"); break;
			case "7": System.out.print("The binary value is 0111"); break;
			case "8": System.out.print("The binary value is 1000"); break;
			case "9": System.out.print("The binary value is 1001"); break;
			case "A": System.out.print("The binary value is 1010"); break;
			case "B": System.out.print("The binary value is 1011"); break;
			case "C": System.out.print("The binary value is 1100"); break;
			case "D": System.out.print("The binary value is 1101"); break;
			case "E": System.out.print("The binary value is 1110"); break;
			case "F": System.out.print("The binary value is 1111"); break;
			default: System.out.print("The value entered is INVALID");
				System.exit(1);
		} 
	}
}
