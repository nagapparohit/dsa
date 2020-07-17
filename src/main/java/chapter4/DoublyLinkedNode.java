package chapter4;

public class DoublyLinkedNode {

	private Integer data;
	private DoublyLinkedNode prevNode;
	private DoublyLinkedNode nextNode;
	
	public DoublyLinkedNode(Integer data) {
		this.data = data;
	}
	
	public Integer getData() {
		return data;
	}
	
	public DoublyLinkedNode getNextNode() {
		return nextNode;
	}
	public DoublyLinkedNode getPrevNode() {
		return prevNode;
	}
	
	public void setNextNode(DoublyLinkedNode nextNode) {
		this.nextNode = nextNode;
	}
	
	public void setPrevNode(DoublyLinkedNode prevNode) {
		this.prevNode = prevNode;
	}
	
	public void setData(Integer data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return this.data.toString();
	}
	
}
