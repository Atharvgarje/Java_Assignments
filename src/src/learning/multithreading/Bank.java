package src.learning.multithreading;

import java.time.LocalDateTime;

public class Bank extends Thread {

	static int bal=1000;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++)
		{
			withdraw(150);
			
		}
	}
	
	private static synchronized void withdraw(int amount)
	{
		System.out.println(Thread.currentThread().getName());
		if(bal>200)
		{
			bal-=amount;
			System.out.println(LocalDateTime.now());
			System.out.println("Rem bal: "+bal);
		}else
		{
			System.out.println("Insufficient balance");
		}
	}
}
