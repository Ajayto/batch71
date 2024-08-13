package hashSetInJava;

import java.util.ArrayList;
import java.util.HashSet;

public class DemoHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al= new ArrayList();
		al.add(100);
		al.add(101);
		al.add(100);
		al.add(101);
		
		

		HashSet hs= new HashSet();
		hs.add(10);
		hs.add(10); /// 10 will not added 
		hs.add("abc");
		hs.add('c');
		hs.add(null);
		hs.add(30.30f);
		boolean value1=hs.add(true);
		boolean value=hs.add(10);
		System.out.println(value1);
		hs.addAll(al);
		//HashSet hs2= new HashSet();
		Object obj=hs.clone();
		System.out.println(obj);
		
		
//		for(Object obj:hs) {
//			System.out.println(obj);
//		}
		
		
		
//		hs.remove("abc");
//		hs.removeAll(al);
//		System.out.println(hs.containsAll(al));
//		System.out.println(hs);
		

	}

}
