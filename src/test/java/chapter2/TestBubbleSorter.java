package chapter2;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class TestBubbleSorter {

	@Test
	public void testSort(){
		
		assertArrayEquals(new int[] {1,2,3,4}, new BubbleSorter().sort(new int[] {3,4,2,1}));
		
		
	}
}
