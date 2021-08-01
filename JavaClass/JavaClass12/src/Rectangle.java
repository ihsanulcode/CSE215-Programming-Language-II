
public class Rectangle extends Shape{
	private int length;
	private int width;
	
	Rectangle(int lenght,int width){
		this.length = lenght;
		this.width = width;
	}
	
	@Override
	public double getArea() {
		return length*width;
	}
	
}
