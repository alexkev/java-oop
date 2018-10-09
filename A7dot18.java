import java.util.Scanner;

public class A7dot18 {

		public static void main(String[] args) {
				double[] list = getList();
				sortList(list);
				printList(list);	
		}
		
		private static void printList(double[] list) {
			for(double value: list)
				System.out.print(value + " ");
		}
		
		private static void sortList(double[] list) {
			for(int i = 0; i < list.length - 1; i++) {
				for(int j = 0; j < list.length - i - 1; j++) {
					if( list[j] > list[j +1]) {
						double t = list[j];
						list[j] = list[j +1];
						list[j + 1] = t; 
					}
				}
			}
		}
		
		private static double[] getList() {
			double[] list = new double[10];
			Scanner input = new Scanner(System.in);
			System.out.println("Please enter ten doubles:");
			for (int i= 0; i < list.length; i++) {
				list[i] = input.nextDouble();
			}
			return list;
		}
	}
