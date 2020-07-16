package chapter3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestOrderedArray {

	OrderedArray oa = new OrderedArray(10);
	
	
	@Test
	public void testSearch() {
		oa.insert(10);
		oa.insert(12);
		oa.insert(19);
		oa.insert(2);
		assertEquals(-1, oa.binarySearch(100));
		assertEquals(1, oa.binarySearch(10));
	}
	
	@Test
	public void demo() {
		OrderedArrayDemo oad = new OrderedArrayDemo();
		oad.orderArraydemo();
	}
}
