import java.util.Scanner;
//Convert Celsius to Fahrenheit
public class A2dot1 {
	public static void main(String[] args) {
		//create scanner for celsius input object
		Scanner input = new Scanner(System.in);

		//prompt user to enter celsius
		System.out.print("Enter the temperature in Celsius: ");
		double celsius = input.nextDouble();

		//compute celsius to fahrenheit
		double fahrenheit = (9.0 / 5) * celsius + 32;

		//display conversion
		System.out.println(celsius + " Celsius is " + fahrenheit +" Fahrenheit");
	}
}
