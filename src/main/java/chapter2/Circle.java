package chapter2;

public class Circle {
	
	private double radius;
	
	public Circle(double radius) {
		// TODO Auto-generated constructor stub
		if(radius < 0 ) 
			throw new RuntimeException("Radius cannot be negative");
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double area() {
		return Math.PI * this.radius * this.radius;
	}
	
	public double perimeter() {
		return Math.PI * 2 * this.radius;
	}
	
	
	
	
}
