package assignment.week2;

class Pass{
	int a=10;
}
public class Problem5 {
	
	public static void passBy(int a)
	{
		a=100;
	}
	public static void classPassBy(Pass p)
	{
		p.a=50;
	}
	
	public static void main(String[] args) {
		
		int a=5;
		System.out.println("primitive variable before pass by method: "+a);
		passBy(a);
		System.out.println("primitive variable after pass by method: "+a);
		
		System.out.println();
		
		Pass p= new Pass();
		System.out.println("object internal value before pass by method: "+p.a);
		classPassBy(p);
		System.out.println("object internal value after pass by method: "+p.a);
		
		
	}
	

}
