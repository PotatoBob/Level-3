import static org.junit.Assert.*;

import org.junit.Test;

public class moreandmoretestsTest {

	@Test
	  public void MultTest() {

	    assertEquals("10 x 0 = 0", moreandmoretests.multiply(10, 0));
	    assertEquals("10 x 10 = 100", moreandmoretests.multiply(10, 10));
	    assertEquals("8 x 11 = 88", moreandmoretests.multiply(8, 11));
	  }

	@Test
	  public void PrimeTest() {

	    assertTrue(moreandmoretests.isPrime(3));
	    assertTrue(moreandmoretests.isPrime(5));
	    assertTrue(moreandmoretests.isPrime(541));
	    assertFalse(moreandmoretests.isPrime(4));
	    assertFalse(moreandmoretests.isPrime(12));
	    assertFalse(moreandmoretests.isPrime(527));

	  }

	@Test
	  public void SquareTest() {

	    assertTrue(moreandmoretests.isSquare(4));
	    assertTrue(moreandmoretests.isSquare(144));
	    assertTrue(moreandmoretests.isSquare(64));
	    assertTrue(moreandmoretests.isSquare(10201));
	    assertTrue(moreandmoretests.isSquare(1));
	    assertFalse(moreandmoretests.isSquare(3));
	    assertFalse(moreandmoretests.isSquare(22));
	    assertFalse(moreandmoretests.isSquare(143));

	  }

	@Test
	  public void CubeTest() {

	    assertFalse(moreandmoretests.isCube(9));
	    assertTrue(moreandmoretests.isCube(27));
	    assertTrue(moreandmoretests.isCube(216));
	    assertTrue(moreandmoretests.isCube(729));
	    assertTrue(moreandmoretests.isCube(1));
	    assertFalse(moreandmoretests.isCube(3));
	    assertFalse(moreandmoretests.isCube(22));
	    assertFalse(moreandmoretests.isCube(143));

	  }



}
