/*
 * Write a program that prompts the user to 
 * read two integers 
 * displays their sum. 
 * prompt the user to read the number again if the input is incorrect.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class A12dot2 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		boolean done = false;
		while (!done ) {
			try {
				System.out.println("Find the sum of two munbers. Enter in two numbers:");
				double n1 =input.nextDouble();
				double n2 =input.nextDouble();
				System.out.println("The sum is " + (n1+n2));
				done = true;
			} catch (InputMismatchException e) {
				System.out.println("Invalid, Please enter numbers \n");
			} finally {
				input.nextLine();
			}
		}
	}
}