

public class Driver {

	public static void main(String[] args) {

		// creating an object of circle
		Circle c1 = new Circle();
		c1.setRadius(5.0); // set radius to 5.5
		System.out.println(c1.toString()); // display output
		System.out.printf("Area: %.2f\n",c1.getArea()); //area

		// creating an object of rectangle
		Rectangle r1 = new Rectangle();
		r1.setSide1(3.5);
		r1.setSide2(4.5);
		System.out.println();
		System.out.println(r1.toString()); // display output
		System.out.printf("Area: %.2f\n",r1.getArea()); //area

		// creating an object of circle
		Circle c2 = new Circle();
		c2.setRadius(10.0); // set radius to 10
		System.out.println();
		System.out.println(c2.toString()); // display output
		System.out.printf("Area: %.2f\n",c2.getArea()); //area

		// creating an object of rectangle
		Rectangle r2 = new Rectangle();
		r2.setSide1(12.5);
		r2.setSide2(13.0);
		System.out.println();
		System.out.println(r2.toString()); // display output
		System.out.printf("Area: %.2f\n",r2.getArea()); //area

	}

}
