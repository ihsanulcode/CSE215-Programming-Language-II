import java.util.Scanner;

public class LAB07_Task {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//user input
		System.out.print("Width: ");
		double w = input.nextDouble();
		System.out.print("Height: ");
		double h = input.nextDouble();
		System.out.print("Depth: ");
		double d = input.nextDouble();
		
		//declaring an object of Box class and pass w,h,d into the argument constructor
		Box box = new Box(w,h,d);
		
		//volume
		System.out.println("\nVolume of the box: "+box.volume());
		
		//equalTo
		Box tempBox = new Box(w,h,d); //creating a temporary object and pass it to the equalTo method for checking
		System.out.println("Equals: "+box.equalTo(tempBox)); //whether these two box are equals or not
		
		//setDim()
		box.setDim(w, h, d);
		
		//toString()
		System.out.println(box.toString());
		
		input.close();

	}

}


class Box {
	// private data fields
	private double width;
	private double height;
	private double depth;

	Box() { // no argument or default constructor
		this.width = 0;
		this.height = 0;
		this.depth = 0;
	}

	Box(double len) { // argument constructor
		this.height = len;
	}

	Box(double width, double height, double dept) { // argument constructor
		this.width = width;
		this.height = height;
		this.depth = dept;
	}

	// getter setter methods
	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	public double getDepth() {
		return depth;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setDepth(double depth) {
		this.depth = depth;
	}

	public void setDim(double width, double height, double dept) { // setting dimension
		this.width = width;
		this.height = height;
		this.depth = dept;
	}

	public boolean equalTo(Box o) { // this method will check whether the given box and this box is equals or not
		if (this.width == o.width && this.height == o.height && this.depth == o.depth)
			return true;
		else
			return false;
	}

	public double volume() { // calculating volume of the box
		return height * width * depth;
	}

	public String toString() { // return informations
		return "Box[width=" + width + ",height=" + height + ",depth=" + depth + "]";
	}

}
