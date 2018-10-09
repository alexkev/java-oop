/*
 * create futureInvestmentValue method
 * scan input investment amount
 * scan input annual invest rate 
 * convert to monthly
 * print table heading
 * for loop 30x
 * print year# and future investment amount reference method
 */

import java.util.Scanner;

public class A6dot7 {
	public static double futureInvestmentValue(
			double investmentAmount, double monthlyInterestRate, double years) {
				double future = (1 + monthlyInterestRate);
				double futureInvestment = investmentAmount*(Math.pow( future, years*12));
				return futureInvestment;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("The amount invested: ");
		double investmentAmount = input.nextDouble();
		
		System.out.print("Annual interest rate: ");
		double percent = input.nextDouble();
		double monthlyInterestRate = percent/100/12;
			
		double years;
		
		System.out.println("Years     Future Value");
		
		for (years = 1; years < 31; years++) {
			System.out.printf("%.0f              %.2f%n", years, 
					futureInvestmentValue(investmentAmount, monthlyInterestRate, years));
		}
	}

}
