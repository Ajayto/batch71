package LinkListInjava;

import java.util.ArrayList;
import java.util.LinkedList;

public class DemoLinkList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(100);
		al.add(101);
		al.add(102);

		LinkedList ll= new LinkedList();
		ll.add(10);
		ll.add("abc");
		ll.add('c');
		ll.add(null);
		ll.add(20.20f);
		ll.add(10);

		ll.add(3,"pqr");
		ll.addAll(2,al);
		ll.addFirst('a');
		ll.addLast('z');
		
		System.out.println(ll);
		
		ll.pop();
		ll.peek();
		ll.poll();
		System.out.println(ll);
		
		
		
//		for(int i=0;i<ll.size();i++) {
//			System.out.println(ll.get(i));
//		}
		
//		for(Object obj:ll) {
//		System.out.println(obj);	
//		}
		
		
		
		
		
		
		
		
//		System.out.println(ll);
//		ll.set(2, "xyz");
//		System.out.println(ll);
//		ll.remove(4);
//		System.out.println(ll);
//		System.out.println(ll.contains("pqr1"));
//		System.out.println(ll.containsAll(al));
//		
//		System.out.println(ll.lastIndexOf(10));
		
		
		
		
		
		
//		Object obj1=ll.remove();
//		System.out.println(obj1);
//		ll.remove("pqr");
//		ll.remove(2);
//		ll.removeAll(al);
//		//ll.removeFirst();
//		ll.removeLastOccurrence(10);
		
//		System.out.println(ll);

	}

}
