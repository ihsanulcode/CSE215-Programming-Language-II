
public class Rectangle extends  Shape{
	//private data fields 
	private static int rectangleCounter = 0;
	private double side1;
	private double side2;
	
	public Rectangle() {
		//no argument constructor
		rectangleCounter++;
	}
	
	public Rectangle(double side1,double side2) { //argument constructor
		this.side1 = side1;
		this.side2 = side2;
	}

	public int getRectangleCounter() {
		return rectangleCounter;
	}

	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}


	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}
	
	@Override
	public double getArea() {
		return side1*side2;
	}
	
	@Override
	public String toString() {
		return "Rectangle "+rectangleCounter+"\nSide1: "+side1+"\nSide2: "+side2;
	}
}
