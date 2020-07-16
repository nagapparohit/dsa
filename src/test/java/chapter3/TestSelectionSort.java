package chapter3;

import org.junit.Test;

public class TestSelectionSort {
	
	@Test
	public void sort() {
	
			Circle[] circles = new Circle[] {new Circle(12), new Circle(4), 
					new Circle(2), new Circle(19), new Circle(6)};
			SelectionSorter<Circle> sorter = new SelectionSorter<Circle>();
			
			sorter.sort(circles);
			for(int i=0;i<circles.length;i++) {
				System.out.println(circles[i]);
			}
			
	}

}
