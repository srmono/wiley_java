package JavaThreads;

public class DeadLockConcept {
	
	public static Object Lock1 = new Object();
	public static Object Lock2 = new Object();
	
	public static void main(String[] args) {
		LockThread lt1 = new LockThread();
		lt1.start();
	}
	
	private static class LockThread extends Thread {
		@Override
		public void run() {
			synchronized (Lock1) {
				System.out.println("Thread one hold: Lock1");
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			System.out.println("Thread 1 is waiting for lock2");

			synchronized(Lock2) {
				System.out.println("Thread one hold: Lock2");
			}
		}
	}

}
