package assignment.week3;

public class Problem9 {

	public static void main(String[] args) throws InterruptedException {
		Runnable r1 = new Runnable() {

			@Override
			public void run() {

				try {

					for (int i = 0; i < 10; i++) {
						System.out.println("Ping");
						Thread.sleep(100);

					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		};

		Runnable r2 = new Runnable() {

			@Override
			public void run() {
				try {

					for (int i = 0; i < 10; i++) {
						System.out.println("Pong");
						Thread.sleep(100);

					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		};
		
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		t1.start();
		
		t2.start();
		
		t1.join();
		t2.join();

	}

}
