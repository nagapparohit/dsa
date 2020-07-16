package chapter3;

public class SelectionSorter<T> {
	
	public void sort(Comparable<T>[] objects) {
		
		for(int i=0;i<objects.length-1;i++) {
			
			int minIndex = i;
			
			for(int j=i+1;j<objects.length;j++) {
				if(objects[j].compareTo((T)objects[minIndex]) < 0) {
					
					minIndex = j;
					
				}
			}
			Comparable<T> tmp = objects[minIndex];
			objects[minIndex] = objects[i];
			objects[i] = tmp;
		}
	}
		
	
}
