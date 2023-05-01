package JavaThreads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class WeddingCardWrap extends Thread{
	@Override
	public void run() {
		System.out.println("Thread Name:- " + Thread.currentThread().getName());
	}
}

public class RishavWeddingCard {
	public static void main(String[] args) {
		//Fixed size pool
//		ExecutorService executor = Executors.newFixedThreadPool(1);
		
		//Cached thread pool
		//ExecutorService executor = Executors.newCachedThreadPool();
		
//		for(int i = 1; i<=100; i++) {
//			executor.execute(new WeddingCardWrap());
//		}
		
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(3);
		
		//Submits a one-shot task that becomes enabled after the given delay.
		//executor.schedule(new WeddingCardWrap(), 3, TimeUnit.SECONDS);
		
		
		//executor.scheduleAtFixedRate(new WeddingCardWrap(), 10, 2, TimeUnit.SECONDS);
		
		//each execution is scheduled relative to the actual execution time of the previous execution.
//		if an execution is delayed for any reason(garbage collection, any background activity), 
//		all the subsequent executions also delayed as well
		executor.scheduleWithFixedDelay(new WeddingCardWrap(), 5, 2, TimeUnit.SECONDS);
		
	}
}
