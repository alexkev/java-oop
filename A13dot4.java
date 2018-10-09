import java.text.SimpleDateFormat;
import java.util.*;

public class A13dot4 {

	public static void main(String[] args) {
		int month;
		int year;
		GregorianCalendar calendar;
		
		if (args.length == 2) {
			month = Integer.parseInt(args[0]) - 1;
			year = Integer.parseInt(args[1]);
		} else {
			calendar = new GregorianCalendar();
			if (args.length == 1) {
				month = Integer.parseInt(args[0]) - 1;
			} else {
				month = (calendar.get(Calendar.MONTH));
			}
			year = (calendar.get(Calendar.YEAR));
		}
		calendar = new GregorianCalendar(year, month, 1);
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		String monthName = new SimpleDateFormat("MMMM").format(calendar.getTime());
		
		System.out.println("         " + monthName + ", " + year);
		System.out.println("----------------------------");
		System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
		for (int i = 1; i < dayOfWeek; i++) {
			System.out.print("    ");
		}
		for (int i = 1; i <= daysInMonth; i++) {
			System.out.printf("%4d", i);
			if ((dayOfWeek + i - 1) % 7 == 0) {
				System.out.println();
			}
		}
		System.out.println();
	}
	
}
