package src.learning.multithreading;

class User implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(100);
				System.out.println("User");

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Manager implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(100);
				System.out.println("Manager");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}

public class MultiThread {

	public static void main(String[] args) {
		User u = new User();
		Manager m = new Manager();

		Thread user = new Thread(u);
		Thread manager = new Thread(m);
		user.start();
		manager.start();
	}

}
