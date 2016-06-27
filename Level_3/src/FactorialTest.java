import static org.junit.Assert.*;

import org.junit.Test;

public class FactorialTest {

	@Test
	public void test() {
		assertEquals(2, factorial(2));
		assertEquals(6, factorial(3));
		assertEquals(24, factorial(4));
		assertEquals(120, factorial(5));
	}
	int factorial(int x) {
		if (x == 1) {
			return x;
		} else {
			x*=factorial(x-1);
		}
		return x;
	}

}
