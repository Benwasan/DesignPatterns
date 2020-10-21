abstract class Shape {
	private String color;
	
	public abstract double calculateArea();

	public String getColor() {
		return color;
	}
}

public class Rectangle extends Shape {
	private double height;
	private double width;
	private Point origin;
	
	public double calculateArea() {
		return height * width;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getWidth() {
		return Width;
	}
}

public class Circle extends Shape {
	private double radius;
	
	public double calculateArea() {
		return 3.14159265357989 *radius * radius;
	}
	
	public double getRadius() {
		return radius;
	}	
}

public class Point {	
}

public class Client {
	private Shape shape;
}