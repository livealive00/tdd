package tdd.currency;
import static org.junit.Assert.*;
import org.junit.Test;

public class MoneyTest {

	@Test
	public void testTimes() {
		Money five = Money.dollar(5);
		assertEquals(Money.dollar(10), five.times(2));
		assertEquals(Money.dollar(15), five.times(3));
	}
	
	@Test
	public void testEquals() throws Exception {
		assertTrue(Money.dollar(5).equals(Money.dollar(5)));
		assertFalse(Money.dollar(5).equals(Money.dollar(6)));
		assertTrue(Money.franc(5).equals(Money.franc(5)));
		assertFalse(Money.franc(5).equals(Money.franc(6)));
		assertFalse(Money.dollar(5).equals(Money.franc(5)));
	}

	@Test
	public void testCurrency() {
		assertTrue("USD".equals(Money.dollar(1).currency()));
		assertTrue("CHF".equals(Money.franc(1).currency()));
	}
}
