package assignment.week2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Problem1 {

	public static void validate() {
		
		Scanner sc = new Scanner(System.in);
		
		try {

		int num1, num2;

		System.out.println("Enter the two values for division");

		System.out.println("Number 1: ");
		num1 = sc.nextInt();

		System.out.println("Number 2: ");
		num2 = sc.nextInt();
		
		
			
			int result;
			
			result=num1/num2;
			System.out.println("division result is : " + result);
			

		} catch (ArithmeticException e) {

			System.out.println("not defined");
			System.out.println(" ");

		} catch (InputMismatchException e) {

			System.out.println("Enter correct input ");
			System.out.println(" ");

		} finally {

			System.out.println("Program execution completed");
			sc.close();

		}

	}

	public static void main(String[] args) {		
		
		validate();

	}

}
