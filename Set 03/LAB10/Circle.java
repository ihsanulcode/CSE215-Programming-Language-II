
public class Circle extends Shape {
	private double radius;

	public Circle() {

	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle(double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public double getPerimeter() {
		return 2.0 * Math.PI * this.getRadius();
	}

	@Override
	public String toString() {
		return "Color: " + this.getColor() + "; Filled: " + this.isFilled() + "; Radius: " + this.getRadius()
				+ "; Area: " + this.getArea() + "; Perimeter: " + this.getPerimeter();
	}
}
