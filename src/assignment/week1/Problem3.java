package assignment.week1;

import java.util.Scanner;

public class Problem3 {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		
		System.out.println("Enter the length of an array");
		int n=sc.nextInt();
		
		int[] arr=new int[n];
		System.out.println("Enter the integer values in an array");
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
				
			}
		}
		for(int i=0;i<n;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
				
			}
		}
		
		System.out.print("The largest number in an array is: "+max);
		System.out.print("The smallest number in an array is: "+min);
		sc.close();
		
	}

}
