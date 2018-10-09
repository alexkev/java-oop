
public class A5dot10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count;
		int space = 0;
		for (count=100; count<1001; count++) {
			if (count % 5 == 0 && count % 6 == 0) { 
				System.out.print(count + " ");
				space++;
				if (space % 10 == 0) {
					System.out.println(" ");
				}
				
			}
		}
	}
}
