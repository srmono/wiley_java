package collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class QueueClass {
	public static void main(String[] args) {
//		Queue<String> aq = new PriorityQueue<>();
//		aq.add("f");
//		aq.add("c");
//		aq.add("a");
//		aq.add("d");
//		
//		System.out.println(aq);
//		
//		// using linked List
//		Deque<String> dq = new LinkedList<>();
//		
//		dq.add("a");
//		dq.addFirst("aa");
//		dq.add("a");
//		dq.add("a");
//		dq.addLast("xx");
//		
//		dq.add("v");
//		//dq.removeFirst();
//		//dq.removeLast();
//		
//		System.out.println(dq);

		//Blocking Queue interface (Thread safe) 
		BlockingQueue<String> bq = new LinkedBlockingDeque<>();
		bq.add("venkat");
		bq.add("sachin");
		//bq.add(null);
		
		//System.out.println(bq);
		
		BlockingQueue<String> bql = new LinkedBlockingDeque<>();
		bql.add("venkat");
		bql.add("sachin");
		bql.add(null);
		
		System.out.println(bql);
		
		
		
	}
}





















