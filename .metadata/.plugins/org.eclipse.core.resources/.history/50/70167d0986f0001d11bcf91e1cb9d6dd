package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;


public class VectorClass {
	public static void main(String[] args) throws InterruptedException {
		int size = 1000000;
		
		List<Integer>  arrayList = new ArrayList<>();
		long start = System.currentTimeMillis();
		for(int i  = 0; i< size; i++) {
			arrayList.add(i);
		}
		long end = System.currentTimeMillis();
		System.out.println("Time taken to add "+ size +" values: " + (end - start));
		
		List<Integer>  vectorList = new Vector<>();
		start = System.currentTimeMillis();
		for(int i  = 0; i< size; i++) {
			vectorList.add(i);
		}
		end = System.currentTimeMillis();
		System.out.println("Time taken to add "+ size +" values in Vector: " + (end - start));
		
		//Multi threaded approach
		List<Integer>  multiThreadarrayList = Collections.synchronizedList(
																new ArrayList<>()
															);
		start = System.currentTimeMillis();
		
		Thread t1 = new Thread(() -> {
			for(int i  = 0; i< size; i++) {
				multiThreadarrayList.add(i);
			}
		} );
		
		Thread t2 = new Thread(() -> {
			for(int i  = 0; i< size; i++) {
				multiThreadarrayList.add(i);
			}
		} );
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		
		end = System.currentTimeMillis();
		System.out.println(multiThreadarrayList.size());
		System.out.println("Time taken in Multithread to add "+ size +" values : " + (end - start));
		
		List<Integer>  multiThreadVectorList = new Vector<>();
		start = System.currentTimeMillis();
		
		Thread t3 = new Thread(() -> {
			for(int i  = 0; i< size; i++) {
				multiThreadVectorList.add(i);
			}
		} );
		
		Thread t4 = new Thread(() -> {
			for(int i  = 0; i< size; i++) {
				multiThreadVectorList.add(i);
			}
		} );
		
		t3.start();
		t4.start();
		t3.join();
		t4.join();
		
		end = System.currentTimeMillis();
		System.out.println(multiThreadVectorList.size());
		System.out.println("Time taken in Multithread to add "+ size +" values in Vector : " + (end - start));
		
		
	}
}

















