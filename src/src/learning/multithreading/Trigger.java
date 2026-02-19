package src.learning.multithreading;

public class Trigger {
	
	public static void main(String[] args) throws InterruptedException {
		for(int i=0;i<10;i++)
		{
			System.out.println("Sagar");
		}
		Job jb=new Job();
		
		Thread t=new Thread(jb);
		t.start();
		
		for(int i=0;i<10;i++)
		{
			Thread.sleep(500);
			System.out.println("Apple");
		}
		
	}

}
