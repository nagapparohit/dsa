package chapter3;

public class InsertionSorterWithGenerics<T> {

		/**
		 * @param objects
		 */
		public void sort(Comparable<T>[] objects) {
			
			for(int i=0;i<objects.length;i++) {
				
				Comparable<T> current = objects[i];
				int j = i -1;
				
				while(j >= 0 && objects[j].compareTo((T)current) > 0) {
					
					objects[j+1] = objects[j];
					j--;
				}
				objects[j+1] = current;
				
			}
			
		}
}
