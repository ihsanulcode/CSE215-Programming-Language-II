
abstract class A {
	public abstract void print1();

	public abstract void print2();

	public abstract void print3();
}

abstract class B extends A {

	@Override
	public void print1() {
		System.out.println("1");

	}

	@Override
	public void print2() {
		System.out.println("2");

	}

}

class C extends B {
	@Override
	public void print3() {
		System.out.println("3");

	}
}

public class TestAbstraction {

	public static void main(String[] args) {
		C obj = new C();
		obj.print1();
		obj.print2();
		obj.print3();

	}

}
