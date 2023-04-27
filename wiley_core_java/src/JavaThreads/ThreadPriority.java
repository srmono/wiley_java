package JavaThreads;

class TPriority extends Thread {
	@Override
	public void run() {
		for(int i =1; i<=5; i++) {
			System.out.println(
				"Thread Name:- "+ Thread.currentThread().getName() +
				"   -   Thread Prioriy:- " + Thread.currentThread().getPriority() +
				"   -   Thread ID:- " + Thread.currentThread().getId()
			);
		}
	}
}

public class ThreadPriority {
	public static void main(String[] args) throws InterruptedException {
		
//		Thread.currentThread().setPriority(8);
//		System.out.println("Main Thread:- " + Thread.currentThread().getPriority());
//		TPriority t1 = new TPriority();
//		t1.setPriority(10);
//		TPriority t2 = new TPriority();
		
		TPriority t1 = new TPriority();
		TPriority t2 = new TPriority();
		TPriority t3 = new TPriority();
		
		t1.setName("First Thread");
		t2.setName("Second Thread");
		t3.setName("Third Thread");
		
		t1.start();
		t1.join(10);
		System.out.println(t1.getState());
		t2.start();
		t2.join();
		System.out.println(t2.getState());
		t3.start();
	}
}
