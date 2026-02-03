package assignment.week1;

import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter valid salary");
		float salary=sc.nextFloat();
		
		System.out.println("Select the tax regime");
		
		System.out.println("1. new regime");
		System.out.println("2. old regime");
		
		int choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:
			 
			 System.out.println("your tax is: "+newTaxSlab(salary));
			 break;
		case 2:
			System.out.println("your tax is: "+oldTaxSlab(salary));
			break;
		default:
			System.out.println("invalid input");
			break;
			
		}
		sc.close();
		
		
	}
	
	public static float newTaxSlab(float salary)
	{
		if(salary>=0 && salary<250000)
		{
			return salary*0;
		}
		else if(salary>=250000 && salary<500000)
		{
			return salary*0.05f;
		}
		else if(salary>=500000 && salary<750000)
		{
			return salary*0.1f;
		}
		else if(salary>=750000 && salary>1000000)
		{
			return salary*0.15f;
		}
		else if(salary>=1000000 && salary>1250000)
		{
			return salary*0.2f;
		}
		else if(salary>=1250000 && salary>1500000)
		{
			return salary*0.25f;
		}
		else if(salary>=15000000)
		{
			return salary*0.3f;
		}
		else
		{
			return 0f;
		}
	}
	
	public static float oldTaxSlab(float salary)
	{
		if(salary>=0 && salary<250000)
		{
			return salary*0;
		}
		else if(salary>=250000 && salary<500000)
		{
			return salary*0.05f;
		}
		else if(salary>=500000 && salary<1000000)
		{
			return salary*0.2f;
		}
		
		else if(salary>=10000000)
		{
			return salary*0.3f;
		}
		else
		{
			return 0f;
		}
		
	}
}
