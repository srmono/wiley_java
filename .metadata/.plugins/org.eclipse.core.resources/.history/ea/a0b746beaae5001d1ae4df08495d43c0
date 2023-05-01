package JavaThreads;

class BankAccount {
	int amount = 1000;

	public synchronized void withdrawAmount(int amount) {
		if (this.amount < amount) {
			System.out.println("Amount is less");

			try {
				wait(); //method of object class, non-static , notify(), notifyAll() 
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Amount Withdraw is successful");
	}

	public synchronized void depositAmount(int amount) {
		this.amount += amount;
		System.out.println("Amount deposited");
		notify();
	}
}

public class InterCommunication {
	public static void main(String[] args) {
		BankAccount ba = new BankAccount();

		Thread t1 = new Thread() {
			@Override
			public void run() {
				ba.withdrawAmount(1500);
			}
		};
		Thread t2 = new Thread() {
			@Override
			public void run() {
				ba.depositAmount(1000);
			}
		};

		t1.start();
		t2.start();
	}
}
