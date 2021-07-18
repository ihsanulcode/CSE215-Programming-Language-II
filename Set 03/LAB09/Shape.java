
class Shape{
	//private data fields 
	private double dim1;
	private double dim2;
	
	Shape(){
		//no argument constructor
	}
	
	public Shape(double dim1,double dim2) { //argument constructor
		this.dim1 = dim1;
		this.dim2 = dim2;
	}

	//getter setter methods 
	public double getDim1() {
		return dim1;
	}

	public double getDim2() {
		return dim2;
	}

	public void setDim1(double dim1) {
		this.dim1 = dim1;
	}

	public void setDim2(double dim2) {
		this.dim2 = dim2;
	}
	
	public double getArea() {
		return 0.0;
	}
	
	public String toString() {
		return null;
	}
}