package CursorsInCollection;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Map;

public class ListIteratorInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al= new ArrayList();
		al.add(100);
		al.add(101);
		al.add(102);
		al.add(103);
		al.add(104);
		al.add(105);
		//
		
		ListIterator lt= al.listIterator();
		while(lt.hasNext()) {
			Object obj=lt.next();
			if(obj.equals(103)) {
				lt.set(1003);
				lt.add(444);
			}
			System.out.println("index="+lt.nextIndex());
			System.out.println(obj);
		}
		System.out.println("-------------------------");
		while(lt.hasPrevious()) {
			Object obj=lt.previous();
			System.out.println("index="+lt.previousIndex());
			System.out.println(obj);
		}
		
		System.out.println(al);
		
		Map<K, V>
		

	}

}
