package assignment.week3;

class Counter {
	private volatile int count=0;
	
	public Counter() {
		// TODO Auto-generated constructor stub
	}

	public int getCount() {
		return count;
	}

	public synchronized void setCount(int count) {
		this.count = count;
	}
	
}

public class Problem2 {
	public static void main(String[] args) {
		Counter c= new Counter();
		
		Thread t1= new Thread() {
			public void run() {
				for(int i=0;i<15;i++)
				{
					
					try {
						Thread.sleep(100);
						c.setCount(i);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			};
		};
		
		Thread t=new Thread() {
			public void run() {
				for(int i=0;i<15;i++) {
					try {
						Thread.sleep(100);
						System.out.println(c.getCount()); 
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
				}
			};
		};
		
		t.start();
		t1.start();
		
		
		
		
	}

}
