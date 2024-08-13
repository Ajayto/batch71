package PriorityQueueInJava;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue pq= new PriorityQueue();
		pq.offer(20);
		pq.offer(30);
		pq.offer(15);
		pq.offer(10);
		System.out.println(pq);
		System.out.println(pq.peek());
		System.out.println(pq.element());
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq.remove());
		System.out.println(pq);
	}

}
