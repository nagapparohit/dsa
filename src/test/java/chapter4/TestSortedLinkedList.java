package chapter4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestSortedLinkedList {

	@Test
	public void testSort() {
		
		SortedLinkedList<Integer> sll = new SortedLinkedList<Integer>();
		sll.insert(6);
		sll.insert(4);
		sll.insert(2);
		sll.insert(8);
		sll.insert(3);
		sll.insert(5);
		
	}
}
