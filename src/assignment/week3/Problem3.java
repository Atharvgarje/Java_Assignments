package assignment.week3;

class Bank extends Thread {
	protected static int Balance = 10000;

	public Bank() {
		// TODO Auto-generated constructor stub
	}

	public synchronized void deposit(int amount) {
		Balance += amount;

		System.out.println("");
		System.out.println("-----------------------------------------");
		System.out.println("amount deposited by " + Thread.currentThread().getName() + ":" + amount);
		System.out.println("Balace remaining:" + Balance);
		System.out.println("-----------------------------------------");
		System.out.println("");
	}

	public synchronized void withdraw(int amount) {
		if (amount < Balance) {
			Balance -= amount;
			System.out.println("");
			System.out.println("-----------------------------------------");
			System.out.println("amount withdraw by " + Thread.currentThread().getName() + ":" + amount);
			System.out.println("Balace remaining:" + Balance);
			System.out.println("-----------------------------------------");
			System.out.println("");

		} else {
			System.out.println("");
			System.out.println("-----------------------------------------");
			System.out.println("Insufficient Balance");
			System.out.println("-----------------------------------------");
			System.out.println("");

		}
	}
}

public class Problem3 {

	public static void main(String[] args) {
		Bank b = new Bank();

		Thread t1 = new Thread(() -> {
			try {
				for (int i = 0; i < 10; i++) {

					Thread.sleep(100);

					b.deposit(1000);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		});

		Thread t2 = new Thread(() -> {
			try {
				for (int i = 0; i < 10; i++) {

					Thread.sleep(100);

					b.withdraw(5000);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		});

		t1.start();
		t2.start();
	}

}
