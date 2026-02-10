package assignment.week2;

import java.util.Scanner;

class InvalidAgeException extends RuntimeException{
	public InvalidAgeException(String m) {
		// TODO Auto-generated constructor stub
		
		super(m);
	}
}

public class Problem2 {
	
	
	public static void validate(int age) throws InvalidAgeException{
		if(age<18) {
			throw new InvalidAgeException("age have to be more than 18");
		}
		System.out.println("Valid age: "+age);
	}
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int age;
		System.out.println("Enter the age: ");
		age=sc.nextInt();
		
		try {
			validate(age);
		}
		catch(InvalidAgeException e)
		{
			System.out.println(e.getMessage());
		}
		finally {
			sc.close();
		}
	}

}
	
