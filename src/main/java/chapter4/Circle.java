package chapter4;


public class Circle implements Comparable<Circle>{
	
	public double radius;
	
	public Circle() {
		this(1);
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public int compareTo(Circle o) {
		if(this.radius > o.radius)
			return 1;
		else if(this.radius == o.radius)
			return 0;
		else 
			return -1;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Radius: "+this.radius;
	}
	
}
