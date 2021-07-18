import java.util.ArrayList;
import java.util.Scanner;

public class LAB11_Task {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//getting user inputs
		System.out.println("Enter clothing item name: ");
		String name1 = input.nextLine();
		System.out.println("Enter price: ");
		double price1 = input.nextDouble();
		input.nextLine();
		System.out.println("Fabric type: ");
		String fab = input.nextLine();
		
		ClothingItem p1 = new ClothingItem(name1,price1,fab);
		p1.changePrice(10);
		
		System.out.println("\nEnter electronic device name:");
		String name2 = input.nextLine();
		System.out.println("Enter model:");
		String model = input.nextLine();
		System.out.println("Enter warranty:");
		String warranty = input.nextLine();
		System.out.println("Enter price: ");
		double price2 = input.nextDouble();
		
		ElectronicDevice p2 = new ElectronicDevice(name2,price2,model,warranty);
		p2.changePrice(10);
		
		//arraylist
		ArrayList<Product> arr = new ArrayList<Product>();
		arr.add(p1);
		arr.add(p2);
		
		//invoking toString method for all element in the list
		System.out.println();
		System.out.println(arr.get(0).toString());
		System.out.println(arr.get(1).toString());
		

	}

}

abstract class Product{
	public String name;
	public double price;
	
	protected Product(String name,double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public abstract void changePrice(double percentage);
	public abstract String toString();
}

class ClothingItem extends Product{
	private String fabricType;
	
	public ClothingItem(String name,double price,String fabricType) {
		super(name,price);
		this.fabricType = fabricType;
	}

	public String getFabricType() {
		return fabricType;
	}

	public void setFabricType(String fabricType) {
		this.fabricType = fabricType;
	}

	@Override
	public void changePrice(double percentage) {
		this.price = price - (price*(percentage/100.0));
		
	}

	@Override
	public String toString() {
		
		return "Name: "+name+"\nPrice: "+price+"\nFabric Type: "+fabricType+"\n";
	}
	
	
}

class ElectronicDevice extends Product{
	private String model;
	private String warranty;
	
	public ElectronicDevice(String name,double price,String model,String warranty) {
		super(name,price);
		this.model = model;
		this.warranty = warranty;
	}

	public String getModel() {
		return model;
	}

	public String getWarranty() {
		return warranty;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setWarranty(String warranty) {
		this.warranty = warranty;
	}
	
	@Override
	public void changePrice(double percentage) {
		this.price = price + (price*(percentage/100.0));
		
	}

	@Override
	public String toString() {
		return "Name: "+name+"\nPrice: "+price+"\nModel: "+model+"\nWarranty: "+warranty;
	}
}