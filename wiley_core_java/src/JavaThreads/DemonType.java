package JavaThreads;

class SupportClass extends Thread{
	@Override
	public void run() {
		if (Thread.currentThread().isDaemon()) {
			System.out.println("This is a demon");
		} else {
			System.out.println("This is not a demon thread");
		}
	}
}

public class DemonType {
	public static void main(String[] args) {
	
		SupportClass t1 = new SupportClass();
		SupportClass t2 = new SupportClass();
		SupportClass t3 = new SupportClass();
		
		t1.setDaemon(true);
		t2.setDaemon(true);
		
		t1.start();
		t2.start(); 
		t3.start();
		
	}
}
