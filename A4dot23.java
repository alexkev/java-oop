import java.util.Locale;
import java.util.Scanner;

//Financial application: payroll
public class A4dot23 {

	public static void main(String[] args) {
		// scanner for user input
		Scanner input = new Scanner(System.in);

		// prompt user to Enter employee's name:
		// create double
		System.out.print("Enter employee's name: ");
		String name = input.next().trim();
		// prompt user to Enter number of hours worked in a week:
		// create double
		System.out.print("Enter number of hours worked in a week: ");
		double hours = input.nextDouble();
		// prompt user to Enter hourly pay rate:
		// create double
		System.out.print("Enter hourly pay rate: ");
		double rate = input.nextDouble();
		// prompt user to Enter federal tax withholding rate:
		// create double
		System.out.print("Enter federal tax withholding rate: ");
		double federalRate = input.nextDouble();
		// prompt user to Enter state tax withholding rate:
		// create double
		System.out.print("Enter state tax withholding rate: ");
		double stateRate = input.nextDouble();

		// print Employee Name:
		System.out.println("Employee Name: " + name);
		// print Hours Worked:
		System.out.println("Hours Worked: " + hours + " hrs");
		// print Pay Rate:
		System.out.printf("Pay Rate: $%.2f%n", rate);
		// calculate pay
		double gross = (rate * hours);
		// print Gross Pay:
		System.out.printf("Gross Pay: $%.2f%n", gross);
		// print Deductions:
		System.out.println("Deductions:");
		// calculate federal withholding
		double federal = (gross * federalRate);
		double federalPer = (federalRate*100);
		// print    Federal Withholding:
		System.out.printf("   Federal Withholding (%.1f %%): $%.2f%n", federalPer, federal);
		// calculate state withholding
		double state = (gross * stateRate);
		double statePer = (stateRate*100);
		// print    State Withholding :
		System.out.printf("   State Withholding (%.1f %%): $%.2f%n", statePer, state);
		// calculate total
		double total = (federal + state);
		// print    Total Deduction:
		System.out.printf("   Total Deduction: $%.2f%n", total);
		// calculate net pay
		// print Net Pay:
		double netPay = (gross - federal - state);
		System.out.printf("Net Pay: $%.2f%n", netPay);
	}
}
