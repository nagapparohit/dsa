package chapter1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestGCDFinder {
	
	
	@Test
	public void testGCDFinder() {
		assertEquals(5, new GCDFinder().gcd(25, 10));
		assertEquals(7, new GCDFinder().gcd(49,7));
		assertEquals(1, new GCDFinder().gcd(7,3));
		assertEquals(1, new GCDFinder().gcd(200, 1));
	}

}
