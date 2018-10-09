import java.util.Scanner;
//compute volume of a cyl
public class A2dot5 {
	public static void main(String[] args) {
		//create scanner for radius input object
		Scanner input = new Scanner(System.in);

		//prompt user for subtotal and gratuity rate
		System.out.print("Enter subtotal and a gratuity rate: ");
		double subtotal = input.nextDouble();
		double rate = input.nextDouble();
		//compute gratuity
		double gratuity = rate / 100 * subtotal;
		//compute total
		double total = gratuity + subtotal;
		//display both
		System.out.println("The gratuity is $" + gratuity +" and the total is $" + total + "." );
	}
}
