
public class A6dot8 {
	/** Convert from Celsius to Fahrenheit */
	public static double celsiusToFahrenheit(double celsius) {
		double fahrenheit = (9.0 / 5) * (celsius + 32);
		return fahrenheit;
	}
	/** Convert from Fahrenheit to Celsius */
	public static double fahrenheitToCelsius(double fahrenheit) {
		double celsius = (5.0 / 9) * (fahrenheit - 32);
		return celsius;
	}
	
	public static void main(String[] args) {
		double celsius;
		double fahrenheit;
		System.out.println("Celsius      Fahrenheit      |      Fahrenheit       Celsius  ");
		System.out.println("------------------------------------------------------------");
		for (celsius = 40, fahrenheit = 120; celsius > 30 && fahrenheit > 29; celsius--, fahrenheit -= 10) {
			System.out.printf("%3.1f          %4.1f          |      %5.1f             %5.2f\n",
					celsius, celsiusToFahrenheit(celsius), fahrenheit, fahrenheitToCelsius( fahrenheit));
		}
	}
}
