package assignment.week1;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the length of the side of the square: ");
		int length=sc.nextInt();
		
		System.out.println("The Area of the Square is : "+ (length*length));
		
		sc.close();
	}

}
