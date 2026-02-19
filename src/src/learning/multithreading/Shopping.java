package src.learning.multithreading;

public class Shopping {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		
		Bank b1=new Bank();
		
		b1.setName("Zudio");
		b1.start();
		
		Bank b2 = new Bank();
		
		b2.setName("Dmart");
		b2.start();
	}
}
