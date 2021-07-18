
//In this task, you will find the summation of two matrices.
import java.util.Scanner;

public class LAB05_Task3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter Rows: ");
		int row = input.nextInt();
		System.out.println("Enter Columns: ");
		int col = input.nextInt();

		// declaration
		int[][] arr1 = new int[row][col];
		int[][] arr2 = new int[row][col];

		// getting input 1
		System.out.println("\nEnter first matrix elements: ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.printf("[%d][%d]: ", i, j);
				arr1[i][j] = input.nextInt();
			}
		}

		// getting input 2
		System.out.println("\nEnter second matrix elements: ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.printf("[%d][%d]: ", i, j);
				arr2[i][j] = input.nextInt();
			}
		}

		// printing
		System.out.println("\n\nFirst Matrix: ");
		printMatrix(arr1);
		System.out.println("\n\nsecond Matrix: ");
		printMatrix(arr2);
		// adding
		addMatrix(arr1, arr2);

		input.close();

	}

	public static void addMatrix(int[][] arr1, int[][] arr2) {
		int[][] sum = new int[arr1.length][arr1[0].length];

		// sum
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				sum[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		// display
		System.out.println("\nSum:");
		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < sum[i].length; j++) {
				System.out.printf("\t%d ", sum[i][j]);

			}
			System.out.println();
		}
	}

	public static void printMatrix(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();

		}

	}

}
