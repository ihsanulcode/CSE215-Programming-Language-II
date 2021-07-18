
//In this task, you will find the transpose of a matrix.
import java.util.Scanner;

public class LAB05_Task4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter Rows: ");
		int row = input.nextInt();
		System.out.println("Enter Columns: ");
		int col = input.nextInt();

		// declaration
		int[][] arr = new int[row][col];

		// getting input
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.printf("[%d][%d]: ", i, j);
				arr[i][j] = input.nextInt();
			}
		}

		// display
		System.out.println("\nOriginal Matrix:");
		printMatrix(arr);

		// transpose
		int[][] transpose = new int[row][col];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				transpose[i][j] = arr[j][i];
			}
		}

		// display
		System.out.println("\nTranspose Matrix:");
		printMatrix(transpose);
		
		input.close();
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
