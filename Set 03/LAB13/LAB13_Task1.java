import java.util.Scanner;

public class LAB13_Task1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] arr = new int[100];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100);
		}

		try {
			System.out.print("Enter an integer number: ");
			int index = input.nextInt();

			if (index < 0 || index >= 100)
				throw new Exception("Invalid index number!");
			else {
				System.out.println("Index " + index + "; Element: " + arr[index]);
				System.out.print("Enter another integer to devide the element: ");
				int n = input.nextInt();

				if (n == 0)
					throw new ArithmeticException("Divisor can't be ZERO");
				else
					System.out.println(arr[index] + "/" + n + " = " + (arr[index] / (double) n));
			}

		} catch (ArithmeticException ex) {
			System.out.println(ex);
		} catch (Exception ex) {
			System.out.println(ex);
		}
		System.out.println("Programs Ends");

	}

}
