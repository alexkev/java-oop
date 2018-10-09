/*
create the scanner
prompt the user investment amount
read investemnt amount
prompt for invest rate
read for invest rate
monthly interest rate = annual interest rate / 1200
prompt for number of years
read for number of years
calculate future investment value investmentAmount * (1 + monthlyInterestRate) ^ (numberOfYears*12)
display future value
*/

import java.util.Scanner;

public class A2dot21 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter investment amount: ");
		double amount = input.nextDouble();

		System.out.print("Please enter interest rate as a percentage: ");
		double annualRate = input.nextDouble();
		double rate = annualRate / 1200.0;

		System.out.print("Please enter # of years: ");
		double years = input.nextDouble();

		double futureValue = amount * Math.pow(1.0 + rate, years * 12.0);

		System.out.println("The value us $" + (int)(futureValue * 100.0) / 100.0);
	}
}
