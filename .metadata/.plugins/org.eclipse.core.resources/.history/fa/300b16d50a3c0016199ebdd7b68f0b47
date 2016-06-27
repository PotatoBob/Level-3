import static org.junit.Assert.*;

import org.junit.Test;

public class FibonacciTest {

	@Test
	public void test() {
		assertEquals(0, getFibonacci(0));
		assertEquals(1, getFibonacci(1));
		assertEquals(1, getFibonacci(2));
		assertEquals(2, getFibonacci(3));
		assertEquals(3, getFibonacci(4));
		assertEquals(5, getFibonacci(5));
		assertEquals(8, getFibonacci(6));
		assertEquals(13, getFibonacci(7));
	}
	int getFibonacci(int x) {
		if (x <= 1) {
			return x;
		} else {
			x=getFibonacci(x-1)+getFibonacci(x-2);
		}
		return x;
	}

}
