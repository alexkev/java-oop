/*
 * Write a program that meets the following requirements:
 * Creates an array with 100 randomly chosen integers.
 * Prompts the user to enter the index of the array, then displays the corresponding element value. 
 * If the specified index is out of bounds, display the message Out of Bounds.
 */

import java.util.Random;
import java.util.Scanner;


public class A12dot3 {

	public static void main(String[] args) {
		boolean done = false;
		while (!done ) {
			try {
				int[] ranNum = new int[99];
				Random random1 = new Random();
				
				for (int i = 0; i < ranNum.length; i++) {
					ranNum[i] = random1.nextInt(100);
				}
				
				Scanner input = new Scanner(System.in);
				System.out.println("Enter in index: ");
				int dex = input.nextInt();
				
				System.out.println(ranNum[dex]);
				done = true;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Index Out of Bounds");
			} 	
		}
	}
}
