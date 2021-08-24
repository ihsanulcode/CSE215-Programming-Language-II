
public class Test {

	public static void main(String[] args) {
		Shape s1 = new Circle(5.0,"RED",true);
		System.out.println("Color: " + s1.getColor());
		System.out.println("Filled: " + s1.isFilled());
		System.out.println("Area: " + s1.getArea());
		System.out.println("Perimeter: " + s1.getPerimeter());
		System.out.println();

		Circle c1 = (Circle) s1;
		System.out.println("Color: " + c1.getColor());
		System.out.println("Filled: " + c1.isFilled());
		System.out.println("Radius: " + c1.getRadius());
		System.out.println("Area: " + c1.getArea());
		System.out.println("Perimeter: " + c1.getPerimeter());
		System.out.println();

		Shape s2 = new Rectangle(4.0, 5.0,"BLUE",false);
		System.out.println("Color: " + s2.getColor());
		System.out.println("Filled: " + s2.isFilled());
		System.out.println("Area: " + s2.getArea());
		System.out.println("Perimeter: " + s2.getPerimeter());
		System.out.println();
		
		Rectangle r1 = (Rectangle) s2;
		System.out.println("Color: " + r1.getColor());
		System.out.println("Filled: " + r1.isFilled());
		System.out.println("Width: " + r1.getWidth());
		System.out.println("Length: " + r1.getLength());
		System.out.println("Area: " + r1.getArea());
		System.out.println("Perimeter: " + r1.getPerimeter());

	}

}
