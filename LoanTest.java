import static org.junit.Assert.assertEquals;

import org.junit.*;

public class LoanTest {
	private double delta = 0.005;
	public static Loan l1, l2;
	
	@BeforeClass
	public static void setUP() {
		l1 = new Loan(2.5, 30, 100000.00);
		l2 = new Loan(2.5, 15, 100000.00);
		
	}

	@Test 
	public void testMonthlyPayment() {
		assertEquals(395.12, l1.getMonthlyPayment(), delta);
		assertEquals(666.79, l2.getMonthlyPayment(), delta);
	}
	
	@Test 
	public void testTotalPayment() {
		assertEquals(142243.52, l1.getTotalPayment(), delta);
		assertEquals(120022.06, l2.getTotalPayment(), delta);	
	}

	@AfterClass
	public static void tearDown() {
		l1 = null;
		l2 = null;
	}
}


