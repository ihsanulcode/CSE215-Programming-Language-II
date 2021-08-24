
public class Rectangle extends Shape {
	private double width;
	private double length;

	public Rectangle() {

	}

	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}

	public Rectangle(double width, double length, String color, boolean filled) {
		super(color, filled);
		this.width = width;
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public double getLength() {
		return length;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public void setLength(double length) {
		this.length = length;
	}

	@Override
	public double getArea() {
		return this.width * this.length;
	}

	@Override
	public double getPerimeter() {
		return 2.0 * (this.width + this.length);
	}

	@Override
	public String toString() {
		return "Color: " + this.getColor() + "; Filled: " + this.isFilled() + "; Width: " + this.getWidth()
				+ "; Length: " + this.getLength() + "; Area: " + this.getArea() + "; Perimeter: " + this.getPerimeter();
	}

}
