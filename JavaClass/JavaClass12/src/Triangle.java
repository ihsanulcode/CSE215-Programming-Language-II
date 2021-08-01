
public class Triangle extends Shape{
	private int base;
	private int height;
	
	Triangle(int base,int height){
		this.base = base;
		this.height = height;
		
	}
	
	@Override
	public double getArea() {
		return 0.5*base*height;
	}

}
