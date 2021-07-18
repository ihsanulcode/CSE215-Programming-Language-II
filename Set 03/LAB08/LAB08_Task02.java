
public class LAB08_Task02 {
	public static void main(String[] args) {
		Circle circle = new Circle(); //creating an object of circle class
		circle.setRadius(5.5); //setting the radius of circle 
		circle.setColor("blue"); //setting the color of circle 
		System.out.println(circle.toString()); //invoking the circle classes toString method 
		System.out.printf("Area: %.2f",circle.getArea()); //printing circle area 
		
		System.out.println("\n");
		Cylinder cy = new Cylinder(6.5,5.5,"red"); //creating an object of circle class 
		System.out.println(cy.toString()); //invoking the cylinder classes toString method 
		System.out.printf("Volume: %.2f",cy.getVolume()); //printing volume
	}
}

class Circle{ //super class
	//private data fields 
	private double  radius = 1.0;
	private String color = "red";
	
	public Circle() {
		//no argument constructor
	}
	
	public Circle(double radius) { //argument constructor
		this.radius = radius;
	}
	
	public Circle(double radius,String color) { //argument constructor
		this.radius = radius;
		this.color = color;
	}

	
	//getter setter methods
	public double getRadius() {
		return radius;
	}

	public String getColor() {
		return color;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public String toString() {
		return "Circle:\nradius: "+radius+"\ncolor: "+color;
	}
	
	public double getArea() { //this method will return the area of circle
		return Math.PI*Math.pow(radius,2);
	}
	
}

class Cylinder extends Circle{ //subclass
	//private data fields
	private double height = 1.0;
	
	public Cylinder() {
		//no argument constructor
	}
	
	public Cylinder(double height) { //argument constructor
		this.height = height;
	}
	
	public Cylinder(double height,double radius) {  //argument constructor
		super(radius);
		this.height = height;
	}
	
	public Cylinder(double height,double radius,String color) {  //argument constructor
		super(radius,color);
		this.height = height;
	}

	//getter setter methods
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	@Override
	public String toString() {
		return "Cylinder:\nheight: "+getHeight()+"\nradius: "+getRadius()+"\ncolor: "+getColor();
	}
	
	public double getVolume() { //this method will return the volume
		return Math.PI*Math.pow(getRadius(),2)*height;
	}
}