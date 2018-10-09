import java.util.Scanner;

/*
 * create scanner 
 * read first number and store it in max 
 * set count to 1
 * while not 0'
 * read next number 
 * if number > max 
 * max gets number
 * count gets 1
 * else i f number = max
 * count++
 * end loop
 * display max and count
 */

public class A5dot41 {
// occurrence of max numbers
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter numberes followed by 0: ");
		int number = input.nextInt();
		int max = number;
		int count = 1;
		while (number !=0) {
			number = input.nextInt();
			if (number > max) {
				max = number;
				count = 1;
			} else if (number == max) {
				count++;
			}
		}
		System.out.println("The largest number is " + max);
		System.out.println("THe occurrence of the largest number is " + count);
	}

}
