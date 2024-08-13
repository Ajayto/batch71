package test1;
import java.util.ArrayList;
import java.util.NavigableSet;
import java.util.PriorityQueue;
import java.util.RandomAccess;
import java.util.TreeSet;

public class A {
protected int a=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet ts= new TreeSet();
		ts.add(10);
		ts.add(5);
		ts.add(25);
		ts.add(20);
		
		PriorityQueue pq=new PriorityQueue();
		pq.offer(10);
		pq.offer(5);
		pq.offer(30);
		pq.offer(15);
		
		System.out.println(pq);
		
	
		System.out.println();
		//System.out.println(ns);
	}

}
 
 class B{
	 protected class C implements RandomAccess,java.io.Serializable,Cloneable {
		synchronized void getData() {
			 
		 }
	 }
	 
 }
