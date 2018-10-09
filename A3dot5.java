import java.util.Scanner;
//How many days left
public class A3dot5 {
	public static void main(String[] args) {
		//prompt user for current day
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter today's day: ");
		int current = input.nextInt();

		String currentDay;
		//create a case statement
		switch (current) {
			case 0: currentDay = "Sunday"; break;
			case 1: currentDay = "Monday"; break;
			case 2: currentDay = "Tuesday"; break;
			case 3: currentDay = "Wednesday"; break;
			case 4: currentDay = "Thursday"; break;
			case 5: currentDay = "Friday"; break;
			case 6: currentDay = "Saturday"; break;
			default: currentDay = "Error: invalid status";
				System.exit(1);
		}

		System.out.print("Enter the number of days elapsed since today: ");
		int day = input.nextInt();

		int futureDays = (day + current) % 6;
		String days;
		//create a case statement
		switch (futureDays) {
			case 0: days = "Sunday"; break;
			case 1: days = "Monday"; break;
			case 2: days = "Tuesday"; break;
			case 3: days = "Wednesday"; break;
			case 4: days = "Thursday"; break;
			case 5: days = "Friday"; break;
			case 6: days = "Saturday"; break;
			default: days = "Error: invalid status";
				System.exit(1);
		}

		System.out.print("Today is " + currentDay + " and the future day is a " + days);
	}
}

