package chapter3;

public class Circle implements Comparable<Circle>{

	private double radius;
	
	public Circle() {
		this(1);
	}
	public Circle(double radius) {
		// TODO Auto-generated constructor stub
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}	
	public int compareTo(Circle o) {
		// TODO Auto-generated method stub
		if(this.radius > o.radius)
			return 1;
		else if(this.radius < o.radius)
			return -1;
		else
			return 0;
	}
	
	@Override
	public String toString() {
		return "This circle is of radius: " + this.radius;
	}
	
}
