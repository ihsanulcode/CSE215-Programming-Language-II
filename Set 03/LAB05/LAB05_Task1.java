import java.util.Scanner;

/*Read 10 integers from the user and store them in an array. Take another integer
from the user and check whether it is in the array (print “Found” in that case) or
not (print “Not found”).*/
public class LAB05_Task1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//declaring an 10 sized array
		int[] arr = new int[10];
		//user input
		System.out.println("Enter 10 numbers: ");
		for(int i=0;i<10;i++) {
			arr[i] = input.nextInt();
		}
		
		//get key from user input
		System.out.println("Enter another integer: ");
		int key = input.nextInt();
		
		//searching 
		boolean found = false;
		for(int i=0;i<10;i++) {
			if(key == arr[i]) {
				found = true;
				break;
			}
		}
		
		//output
		if(found)
			System.out.println("Found");
		else
			System.out.println("Not found");
		input.close();

	}

}
