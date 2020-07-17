package chapter4;

import org.junit.Test;

public class TestDoublyLinkedList {

	@Test
	public void demo() {
		
		DoublyLinkedList integers = new DoublyLinkedList();

		integers.insertAtHead(5);
		integers.insertAtHead(10);
		integers.insertAtHead(2);
		integers.insertAtHead(12);
		integers.insertAtHead(19);
		integers.insertAtHead(20);
		//new InsertionSorter().sort(integers);
		System.out.println(integers);
		
	}
}
