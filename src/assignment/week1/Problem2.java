package assignment.week1;

import java.util.Scanner;

public class Problem2 {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the 3 numbers to find the average value");
		System.out.println("Enter the 1st number");
		int no1=sc.nextInt();
		System.out.println("Enter the 2nd number");
		int no2=sc.nextInt();
		System.out.println("Enter the 3rd number");
		int no3=sc.nextInt();
		
		int avg=(no1+no2+no3)/3;
		
		System.out.println("the average is"+avg);
		sc.close();
	}

}
