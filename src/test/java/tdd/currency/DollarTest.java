package tdd.currency;
import static org.junit.Assert.*;

import org.junit.Test;

public class DollarTest {

	@Test
	public void testDollar() throws Exception {
		// TODO
		//throw new RuntimeException("not yet implemented");
	}

	@Test
	public void testTimes() throws Exception {
		Dollar five = Money.dollar(5);
		assertEquals(Money.dollar(10), five.times(2));
		assertEquals(Money.dollar(15), five.times(3));
		
	}

	@Test
	public void testEquals() throws Exception {
		assertTrue(Money.dollar(5).equals(Money.dollar(5)));
		assertFalse(Money.dollar(5).equals(Money.dollar(6)));
	}

}
