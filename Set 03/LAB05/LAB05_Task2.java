/*Take input of a 3x3 matrix and display the sum of its main diagonal element.*/
import java.util.Scanner;

public class LAB05_Task2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// declaration of 2D Array 3X3
		int[][] arr = new int[3][3];

		// getting elements form user
		System.out.println("Enter elements for 3X3 matrix: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print("[" + i + "][" + j + "]: ");
				arr[i][j] = input.nextInt();
			}

		}

		// printing my array
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();

		}

		//sum of its main diagonal element
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(i==j) {
					sum+=arr[i][j];
				}
			}
			
		}
		System.out.println("\nsum of its main diagonal element: "+sum);
		input.close();

	}

}
