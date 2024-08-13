package TreeSetInJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class DemoTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,30};
		
		ArrayList al= new ArrayList();
		for(int value:a) {
			al.add(value);
		}
		al.add(50);
		al.add(2);
		al.add(70);
		//System.out.println(al);
		
		TreeSet ts= new TreeSet();
		ts.add(10);
		ts.add(5);
		ts.add(30);
		ts.add(15);
		ts.add(40);
		ts.add(50);
		ts.add(3);
		
		
		for(Object obj:ts) {
			System.out.println(obj);
		}
		
		
		
		
		
//		System.out.println(ts);
//		
//	    NavigableSet ns=ts.descendingSet();
//	    System.out.println(ns);
	    
	    
		
		//ts.addAll(al);
		
//		
		// SortedSet s=ts.subSet(10,45);
		 //SortedSet s=ts.subSet(10, false, 55, false);
		 
		 //System.out.println(s);
		
		//Object obj[]= ts.toArray();
		//int a[]= {10,20,30};
		
//		TreeSet ts1= new TreeSet();
//		System.out.println(ts1.pollFirst());
//		System.out.println(ts1.removeFirst());
		
		//System.out.println(ts);
//		System.out.println(ts.ceiling(10));
//		System.out.println(ts.first());
//		System.out.println(ts.floor(10));
//		System.out.println(ts.higher(15));
//		System.out.println(ts.lower(10));
//		System.out.println(ts.pollFirst());
//		System.out.println(ts.pollLast());
//		System.out.println(ts.removeFirst());
	
		

	}

}
