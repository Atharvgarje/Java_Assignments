package assignment.week3;

import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;

class Runner extends Thread
{
	private static final int Total_steps=10;
	private static String winner=null;
	
	private String name;
	
	public Runner(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=Total_steps;i++)
		{
			if(winner != null)
			{
				return;
			}
			
			System.out.println(name + "running... step "+i);
			
			try {
				Thread.sleep(100);
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
			if(i==Total_steps)
			{
				winner(name);
			}
		}
	}
	
	private static synchronized void winner(String name)
	{
		if(winner==null)
		{
			winner=name;
			System.out.println("\n winner is: "+winner);
		}
	}
}

public class Problem1 {
	
	public static void main(String[] args) {
		
		Runner r1= new Runner("Runner 1");
		
		Runner r2= new Runner("Runner 2");
		
		Runner r3= new Runner("Runner 3");
		
		r1.start();
		r2.start();
		r3.start();
		
	}
}
