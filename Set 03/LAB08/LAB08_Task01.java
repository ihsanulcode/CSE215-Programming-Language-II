
public class LAB08_Task01 {

	public static void main(String[] args) {
		Point2D p1 = new Point2D(1,2); //creating a super class object 
		Point3D p2 = new Point3D(1,2,3); //creating a sub class object
		
		System.out.println(p1.toString()); //invoking toString method
		System.out.println(p2.toString());   //invoking toString method

	}

}

class Point2D { //super class
	//private data fields 
	private int x = 0;
	private int y = 0;

	public Point2D() { //no argument constructor

	}

	public Point2D(int x,int y) { //argument constructor
		this.x = x;
		this.y = x;
	}

	
	//getter setter methods
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public String toString() {
		return "("+x+","+y+")";
	}
}

class Point3D extends Point2D{ //sub class
	private int z = 0; //private data fields
	
	public Point3D() { //no argument constructor
		
	}
	
	public Point3D(int x,int y,int z) { //argument constructor
		super(x,y);
		this.z = z;
	}

	//getter setter method
	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
	//overridden method
	@Override
	public String toString() {
		return "("+getX()+","+getY()+","+getZ()+")";
	}
}