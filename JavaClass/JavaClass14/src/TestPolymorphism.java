class A{
	A(){
		//super();
		System.out.println("Hello from class A");
	}
	
	public void print() {
		System.out.println("A");
	}
}

class B extends A{
	B(){
		//super();
		System.out.println("Hello from class B");
	}
	
	public void print() {
		System.out.println("B");
	}
}

class C extends B{
	C(){
		//super();
		System.out.println("Hello from class C");
	}
	
	
}
public class TestPolymorphism {

	public static void main(String[] args) {
		A obj = new C();
		obj.print();

	}

}
