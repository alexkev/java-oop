import java.util.Scanner;

public class A8dot6 {
	public static void main(String[] args) {
		double[][] a = getMatrix();
		double[][] b = getMatrix();
		double[][] c = multiplyMatrices(a,b);
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
	
	private static double[][] multiplyMatrices(double[][] a, double[][] b) {
		double[][] t = new double[3][3];
		for(int row = 0; row < t.length; row++){
			for( int col= 0; col < t[row].length; col++){
				for( int ptr= 0; ptr < t[row].length; ptr++){
					t[row][col] += a[row][ptr] * b[ptr][col];
				}
			}
		}
		return t;
	}

	private static void printMatrices(double[][] a, double[][] b, double[][] c) {
		for(int row = 0; row < a.length; row++){
			for( int col= 0; col < a[row].length; col++){
				System.out.printf("%5.1f", a[row][col]);
			}
			System.out.print((row == 1) ? "  * " : "    ");
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
