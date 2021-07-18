

class Circle extends Shape{
	//private data fields 
	private static int circleCounter = 0;
	private double radius;
	
	public Circle() {
		//no argument constructor
		circleCounter++;
	}
	
	public Circle(double radius) { //argument constructor
		this.radius = radius; 
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public int getCircleCounter() {
		return circleCounter;
	}

	@Override
	public double getArea() {
		return Math.PI*Math.pow(radius, 2);
	}

	@Override
	public String toString() {
		return "Circle: "+circleCounter+"\nRadius: "+this.radius;
	}
	
	
}