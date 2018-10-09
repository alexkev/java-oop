
/* 
 * Create a Date object
 * Display the date and time for elapsed time 10000, 
 * 100000, 1000000, 10000000, 100000000, 1000000000, 
 * 10000000000, and 100000000000, respectively
 */

public class A9dot3 {

	public static void main(String[] args) {
				java.util.Date date = new java.util.Date();

				System.out.println("The dates and times for elapsedtimes 10000, "
						+ "100000, 1000000, 10000000,\n100000000, 1000000000, 10000000000," +
					" and 100000000000, respectively");
				for (long i = 10000; i <= 1e11; i *= 10) {
					date.setTime(i);
					System.out.println(date.toString());
				}
			}
		}
