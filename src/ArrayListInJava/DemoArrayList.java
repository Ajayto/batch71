package ArrayListInJava;

import java.util.ArrayList;

public class DemoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 ArrayList<Integer> al1= new ArrayList<Integer>();
		al1.add(102);
		al1.add(101);
		al1.add(100);
		
		for(Integer i:al1) {
			System.out.println(i);
		}
		
		
		
		
		
		ArrayList al= new ArrayList();
		al.add(10);
		al.add("ScriptQA");
		al.add(10.20);
		al.add('c');
		al.add(null);
		al.add("");
		al.add(null);
		al.add(100);
		al.add(101);
		al.add(102);
		
//		for(Object eachElemnt:al) {
//			System.out.println(eachElemnt);
//		}
//		
		
//		for(int i=0;i<al.size();i++) {
//			System.out.println(al.get(i));
//		}
		
		
		
		
//		System.out.println("befor"+al);
//		
//		System.out.println(al.containsAll(al1));
//		//al.set(1, "testing");
//		//System.out.println(al.size());
//		//System.out.println(al.contains("c"));
//		//al.removeFirst();
//		//al.removeLast();
//		System.out.println("after"+al);
//		//al.add(2, 20);	
		//al.add(2, 21);
		
		//al.addAll(al1);
		//al.addAll(6,al1);
		
		//al.remove(3);
		//al.remove(10.2d);
		//al.removeAll(al1);
		
		
		//System.out.println(al.get(2));

	}

}
