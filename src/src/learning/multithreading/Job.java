package src.learning.multithreading;

public class Job implements Runnable {
	
	

	@Override
	public void run() {
		for(int i=0;i<10;i++)
		{
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Mango");
		}
		
	}
}
