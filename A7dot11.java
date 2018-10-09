import java.util.Scanner;

public class A7dot11 {
	/** Compute the deviation of double values */
	public static double deviation(double[] x) {
		double mean = mean(x);
		double dev = 0;
		for (int i = 0; i < x.length; i++)
	    {
	      dev += Math.pow(x[i] - mean, 2);
	    }
		return Math.sqrt(dev/(x.length - 1));
	}
	/** Compute the mean of an array of double values */
	public static double mean(double[] array) {
		double sum = 0;
		for( double num : array) {
			sum = sum+num;
		}
		return sum/array.length;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double[] numbers = new double[10];
		System.out.println("Enter ten number values: ");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextDouble();
		}
		System.out.println("The mean is: " +  mean(numbers));
		System.out.printf("The standard deviation is: %.5f%n", deviation(numbers));
	}
}
