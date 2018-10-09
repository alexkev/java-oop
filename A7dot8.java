import java.util.Scanner;

public class A7dot8 {
	private static Scanner input;
	public static int average(int[] array) {
		int sum = 0;
		for( int num : array) {
			sum = sum+num;
		}
		int mean = sum/array.length;
		return mean;
	}
	public static double average(double[] array) {
		double sum = 0;
		for( double num : array) {
			sum = sum+num;
		}
		return sum/array.length;
	}
	public static void main(String[] args) {
		input = new Scanner(System.in);
		
		double[] numbers = new double[10];
		System.out.println("Enter ten number values: ");
		for (int i = 0; i < numbers.length; i++)
			numbers[i] = input.nextDouble();
		
		System.out.println("The mean is: " +  average(numbers));
	}
}
