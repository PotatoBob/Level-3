import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class SwapTest {

	@Test
	public void test() {
		assertEquals("kucd", swap("duck", 0, 3));
	}
	String swap(String s, int x, int y) {
		String ss = "";
		for (int i = 0; i < s.length(); i++) {
			if (i == x) {
				ss+=s.charAt(y);
			} else if (i == y) {
				ss+=s.charAt(x);
			} else {
				ss+=s.charAt(i);
			}
		}
		System.out.println(ss);
		return ss;
	}
}
