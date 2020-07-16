package chapter3;

import java.util.Arrays;

public class OrderedArray {

	/**
	 * We are using integers so we can do null checks to see if data is present a particular index
	 * or not.this is because java automatically initializes all the elements of the array , so int[] will
	 * get initializes to all 0 values. So it is hard to see if a 0 was really inserted as a part of data 
	 * ,or it is initialized as 0. 
	 */
	private Integer[] data;
	
	
	public OrderedArray() {
		this(100); //default size of the array is 100;
	}
	
	/**
	 * We can create ordered array , which can hold data upto this size
	 * @param size
	 */
	public OrderedArray(int size) {
		this.data = new Integer[size];
	}
	/**
	 * This method implements the binary search algorithm in an iterative way.
	 * @param item
	 * @return
	 */
	public int binarySearch(int item) {
		int maxIndex = size()-1;
		int minIndex = 0;
		int indexToLook = (int) Math.floor(((minIndex+maxIndex)/2));
		
		while((data[indexToLook] != item)&&(maxIndex > minIndex)) {
			
			if(data[indexToLook] > item) {
				maxIndex = indexToLook-1;
			}else {
				minIndex = indexToLook +1;
			}
			indexToLook = (int) Math.floor(((minIndex+maxIndex)/2));
		}
		
		if(data[indexToLook]==item)
			return indexToLook;
		else
			return -1;
	}
	
	public int binarySearch(int item,int minIndex,int maxIndex){
		if(minIndex == maxIndex) {
			if(data[minIndex] == item) {
				return minIndex;
			}else {
				return -1;
			}
		}
		int indexToLook = (int)Math.floor((minIndex+maxIndex)/2);
		if(data[indexToLook]== item) {
			return indexToLook;
		}
		if(data[indexToLook] > item) {
			return binarySearch(item, minIndex,indexToLook-1);
		}
		// if we are here then data[indexToLook] < item
		return binarySearch(item,indexToLook+1,maxIndex);
	}
	
	/**
	 * 
	 * @param item
	 */
	public int insert(int item) {
		int i = 0;
		
		while((i < data.length)&&(data[i] != null)) {
			if(data[i] > item) {
				break;
			}
			i++;
		}
		shiftElementsToRight(i);
		data[i] = item;
		return i;
	}
	/**
	 * This method is used to delete the element from the orderedArray
	 * @param item
	 * @return
	 */
	public int delete(int item) {
		int i = binarySearch(item);
		if(i>=0) {
			shiftElementstoLeft(i+1);
		}
		return i;
	}
	
	
	public void shiftElementstoLeft(int startIndex) {
		int maxIndex = size()-1;
		for(int i = startIndex;i<= maxIndex;i++) {
			data[i-1]=data[i];
		}
		data[maxIndex]=null;
		
	}

	/**
	 * 
	 * @param startIndex
	 */
	public void shiftElementsToRight(int startIndex) {
		for(int i=size()-1; i >= startIndex;i--) {
			data[i+1]= data[i];
		}
	}

	/**
	 * This method will return size upto which elements are present.Becaus array length is fixed , all elements will
	 * be null initially, then as we add elements , the elements will become non null. So this tell how many 
	 * elements are really present in the ordered way.
	 * @return
	 */
	public int size() {
		int i=0;
		while((i<data.length )&& (data[i] != null)) {
			i++;
		}
		return i;
	}
	
	@Override
	public String toString() {
		return Arrays.deepToString(this.data);
	}
	
}
