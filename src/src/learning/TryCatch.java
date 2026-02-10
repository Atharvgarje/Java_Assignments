package src.learning;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryCatch {
	
	public static void main(String[] args) {
		int m=10;
		int n=0;
		
		try {
			int ans=m/n;
			System.out.println("Answer: "+ans);
			File file=new File("input.txt");
			Scanner sc=new Scanner(file);
			
			
			sc.close();
		} catch(ArithmeticException e1)
		{
			System.out.println("Error: Division by 0!");
		} catch(FileNotFoundException e1)
		{
			System.out.println("File not found !");
		}
	}

}
