package chapter4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestLinkedList {

	
	@Test
	public void demo() {
		LinkedList<Integer> integers = new LinkedList<Integer>();
		integers.addAtStart(5);
		integers.addAtStart(10);
		integers.addAtStart(2);
		integers.addAtStart(12);
		integers.addAtStart(19);
		integers.addAtStart(20);
		assertEquals(6,integers.length());
		assertEquals(null,integers.find(120));
		
	}
}
