import java.util.Scanner;

/*
 * create scanner 
 * create array
 * loop x10
 * create ten account
 * end loop
 * loop forever
 * prompt for ID
 * get ID
 * access the account
 * loop until exit
 * draw the menu 
 * act on customer choices
 * end inner loop
 * end loop
 */
public class A10dot7 {
	static Scanner input;
	
	public static void main(String[] args) {
		input =  new Scanner(System.in);
		Account[] accounts = new Account[10];
		for (int i = 0; i < accounts.length; i++) {
			accounts[i] = new Account(i, 100.00);
		}
		while (true) {
			System.out.println("Please enter your id: ");
			int id = input .nextInt();
			if (id >=0 && id < accounts.length) {
				drawMenu(accounts[id]);
			} else {
				System.out.println("Invalid id");
			}
		}
	}

	private static void drawMenu(Account account) {
		int choice = 0;
		do {
			System.out.println("Main Menu");
			System.out.println("1: Check balance");
			System.out.println("2: Withdraw");
			System.out.println("3: Deposit");
			System.out.println("4: Exit");
			System.out.println("Enter a Choice: ");
			choice = input.nextInt();
			switch (choice ) {
			case 1 : System.out.printf("The balance is %.2f%n", account.getBalance());
				break;
			case 2 : System.out.println("Enter amount to withdraw: ");
				double amount = input.nextDouble();
				account.withdraw(amount);
				break;
			case 3 : System.out.println("Enter amount to deposit: ");
				amount = input.nextDouble();
				account.deposit(amount);
			case 4 : break;
			default : System.out.println("Invalid option");
			}
		} while (choice  != 4);
	}

}
