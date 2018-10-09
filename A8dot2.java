import java.util.Scanner;

/**
 * call the getMatrix
 * 
 * the getMAtrix will 
 * ask for user to Enter a 4-by-4 matrix row by row
 * run the input through the loop
 * 
 * then print "Sum of the elements in the major diagonal is: " and call sumMajorDiagonal(matrix)
 * 
 * sumDiagonal will  pass the matrix through a loop that will
 * add the sequential row & column's to get the sum of the major diagonal 
 */

/**
 * @author Alex Matheson
 *
 */

public class A8dot2 {

	public static void main(String[] args) {
		double[][] matrix = getMatrix();
		System.out.print("Sum of the elements in the major diagonal is: " + sumMajorDiagonal(matrix));
	}
	private static double[][] getMatrix() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 4-by-4 matrix row by row: ");
		double[][] t = new double [4][4];
		for(int row = 0; row < t.length; row++){
			for( int col= 0; col < t[row].length; col++){
				t[row][col] = input.nextDouble();			
			}
		}
		return t;
	}
	
	public static double sumMajorDiagonal(double[][] m){
		double total = 0;
		for(int i = 0; i < m.length; i++){
			total += m[i][i];
			}
		return total;
	}
}
