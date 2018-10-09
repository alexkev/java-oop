/*
 * Multiplying Matrices
 * 
 * call for a through getMatrix
 * call for b through getMatrix
 * call for c through addMatrices
 * print a b & c through printMatrices
 * 
 * getMatrix will prompt the user for to enter nine doubles 
 * then create an array through a loop 
 * for both a and b
 * 
 * addMatrices will add matrices a & b through a loop 
 * 
 * printMatrices will print a b & c through a print statement 
 * and a for loop and printf statement to print them row by row.
 * 
 */

import java.util.Scanner;

public class A8dot5 {
	public static void main(String[] args) {
		double[][] a = getMatrix();
		double[][] b = getMatrix();
		double[][] c = addMatrices(a,b);
		printMatrices(a, b, c);
	}
	
	private static double[][] getMatrix() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter nine doubles: ");
		double[][] t = new double [3][3];
		for(int row = 0; row < t.length; row++){
			for( int col= 0; col < t[row].length; col++){
				t[row][col] = input.nextDouble();			
			}
		}
		return t;
	}
	
	private static double[][] addMatrices(double[][] a, double[][] b) {
		double[][] t = new double[3][3];
		for(int row = 0; row < t.length; row++){
			for( int col= 0; col < t[row].length; col++){
				t[row][col] = a[row][col] + b[row][col];
				}
			}
		return t;
	}

	private static void printMatrices(double[][] a, double[][] b, double[][] c) {
		for(int row = 0; row < a.length; row++){
			for( int col= 0; col < a[row].length; col++){
				System.out.printf("%5.1f", a[row][col]);
			}
			System.out.print((row == 1) ? "  + " : "    ");
			for( int col= 0; col < b[row].length; col++){
				System.out.printf("%5.1f", b[row][col]);
			}
			System.out.print((row == 1) ? "  = " : "    ");
			for( int col= 0; col < c[row].length; col++){
				System.out.printf("%5.1f", c[row][col]);
			}
			System.out.println();
		}
	}	
}
