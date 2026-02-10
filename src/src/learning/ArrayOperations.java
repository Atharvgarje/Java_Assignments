package src.learning;
import java.util.Scanner;
public class ArrayOperations {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the number of elements:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		int sum=0;
		
		int max;
		System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        max = arr[0];
        
        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Array elements:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nSum of elements: " + sum);
        System.out.println("Largest element: " + max);

        sc.close();
    
	}

}
