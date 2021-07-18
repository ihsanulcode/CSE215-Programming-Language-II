import java.util.Scanner;

class IllegalTriangleException extends Exception {
	IllegalTriangleException(String ex) {
		super(ex);
	}

}

public class LAB13_Task2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		try {
			System.out.print("Enter side a: ");
			double a = input.nextDouble();
			System.out.print("Enter side b: ");
			double b = input.nextDouble();
			System.out.print("Enter side c: ");
			double c = input.nextDouble();
			isValid(a, b, c);

			System.out.println("Valid!");
		} catch (IllegalTriangleException ex) {
			System.out.println(ex);
		}
		input.close();

	}

	public static void isValid(double a, double b, double c) throws IllegalTriangleException {
		if (!(a + b > c && b + c > a && a + c > b))
			throw new IllegalTriangleException("Invalid!");

	}

}
