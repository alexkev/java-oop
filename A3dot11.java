import java.util.Scanner;

public class A3dot11 {
	// Find the number of days in a month
	public static void main(String[] args) {
		// create scanner
		Scanner input = new Scanner(System.in);

		// prompts the user to enter the month and year
		System.out.print("Enter the month and year: ");
		// create variables
		int month = input.nextInt();
		int year = input.nextInt();

		// create a string
		String monthString = null;
		// create a case statement to identify month
		switch (month) {
		case 1: monthString = "January"; break;
		case 2: monthString = "February"; break;
		case 3: monthString = "Marh"; break;
		case 4: monthString = "April"; break;
		case 5: monthString = "May"; break;
		case 6: monthString = "June"; break;
		case 7: monthString = "July"; break;
		case 8: monthString = "August"; break;
		case 9: monthString = "September"; break;
		case 10: monthString = "October"; break;
		case 11: monthString = "Novemeber"; break;
		case 12: monthString = "Decemeber"; break;
		}
		// create a case statement to identify number days in a month
		int monthDays = 0;

		switch (month) {
		case 1: monthDays = 31; break;
		case 2: monthDays = 28; break;
		case 3: monthDays = 31; break;
		case 4: monthDays = 30; break;
		case 5: monthDays = 31; break;
		case 6: monthDays = 30; break;
		case 7: monthDays = 31; break;
		case 8: monthDays = 31; break;
		case 9: monthDays = 30; break;
		case 10: monthDays = 31; break;
		case 11: monthDays = 30; break;
		case 12: monthDays = 31; break;
		}
		// use boolean to test if it is a leap year

		boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		if (isLeapYear && monthString == "February"){
			monthDays = 29;
		}
	
		// displays the number of days in the month.
		System.out.print(monthString + " " + year + " has " + monthDays + " days.");
	}
}
