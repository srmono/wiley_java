package JavaThreads;

class Demo implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread Name:- " + Thread.currentThread().getName());
	}
	
}

public class ThreadGroupConcept {
	public static void main(String[] args) {
		// Rishav Marriage
		//  	card distribution
		//		reception
		//		marriage
		//		Bufet lunch

		//		HG		
		 ThreadGroup tgParent = new ThreadGroup("Parent Group");
		 ThreadGroup tgChild1 = new ThreadGroup(tgParent, "child group");
		 
		 Thread t1 = new Thread(tgParent, new Demo(), "First");
		 Thread t2 = new Thread(tgParent, new Demo(), "Second");
		 Thread t3 = new Thread(tgChild1, new Demo(), "Third");
		 Thread t4 = new Thread(tgParent, new Demo(), "Forth");
		 
		 t1.start();
		 t2.start();
		 t3.start();
		 t4.start();
		 
		 
		 System.out.println("Active group of threads:- " + tgParent.activeCount());
		 System.out.println("Child group threads:- " + tgChild1.activeCount());
		 
		 tgParent.list();
	}
}



