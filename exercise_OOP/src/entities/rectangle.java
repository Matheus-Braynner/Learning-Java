package entities;

public class rectangle {
	public double x;
	public double y;
	
	public double area() {
		return x * y;
	}
	
	public double perimeter() {
		return 2 * (x + y);
	}
	
	public double diagonal() {
		return Math.sqrt((x * x) + (y * y));
	}

}
