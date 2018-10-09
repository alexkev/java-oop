/* 
 * Write a program that prompts the user to read
 * two integers and displays their sum. Your program should prompt the user to
 * read the number again if the input is incorrect.
 */


import java.io.File;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class A12dot15 {

	public static void main(String[] args) {
		try {
			File file = new File("Data.txt");
			writeDate(file);
			int[] myList = readData(file);
			Arrays.sort(myList);
			printData(myList);
		} catch (Exception e) {
			System.out.println("Error with file.");
		}
	}

	private static void printData(int[] myList) {
		for (int i = 0; i < 100; i++) {
			System.out.printf("%4d", myList[i]);
			if ( i % 10 == 9) {
				System.out.println();
			}
		}	
	}

	private static int[] readData(File file) throws Exception {
		try (Scanner input = new Scanner(file)) {
			int[] myList = new int[100];
			for (int i = 0; input.hasNext() && i < myList.length; i++) {
				myList[i] = input.nextInt();
			}
			return myList;
		}
	}

	private static void writeDate(File file) throws Exception {
		try (PrintWriter output = new PrintWriter(file)) {
			for (int i = 0; i < 100; i++) {
				output.print((int)(Math.random()*100) + " ");
			}
		}
	}
}
