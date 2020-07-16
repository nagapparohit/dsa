package chapter3;

import org.junit.Test;

public class TestInsertionSortWithGenerics {

	@Test
	public void testSort() {
		Circle[] circles = new Circle[] {new Circle(1),new Circle(10),new Circle(11),new Circle(2)};
		InsertionSorterWithGenerics<Circle> sorter = new InsertionSorterWithGenerics<Circle>();
		
		sorter.sort(circles);
		
		for(int i=0;i< circles.length;i++)
			System.out.println(circles[i]);
		
	}
}
