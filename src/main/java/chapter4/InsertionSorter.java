package chapter4;

public class InsertionSorter {

	public void sort(DoublyLinkedList data) {
		
		DoublyLinkedNode node = data.getHead();
		
		while(node != null) {
			
			DoublyLinkedNode prevNode = node.getPrevNode();
			while(prevNode != null && (prevNode.getData() > node.getData())) {
				prevNode = prevNode.getPrevNode();
			}
			
			DoublyLinkedNode next = node.getNextNode();
			if(prevNode != null || !data.isHead(node)) {
				
				node.getPrevNode().setNextNode(next);
				if(next != null) {
					next.setPrevNode(node.getPrevNode());
				}
				node.setPrevNode(prevNode);
			}
			
			if(prevNode == null) {
				
				if(!data.isHead(node)) {
					node.setNextNode(data.getHead());
					node.getNextNode().setPrevNode(node);
					data.setHead(node);
				}
			}else {
				
				node.setNextNode(prevNode.getNextNode());
				prevNode.getNextNode().setPrevNode(node);
				prevNode.setNextNode(node);
			}
			
			node = next;
		}
		
		
	}
}
