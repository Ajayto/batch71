package ArrayListInJava;

import java.util.ArrayList;
import java.util.Vector;

public class VectorInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <String> al= new ArrayList<String>();
		al.add("java");
		al.add("C#");
		al.add("C++");
		al.add(1, "c");
		System.out.println(al);
		
		
		Vector v= new Vector(1000); //1000
		v.add(10);
		v.addElement("java");
		v.add('c');
		v.add(null);
		v.add(20.30f);
		v.addElement("java");
		
		v.add(3, "abc");
		v.set(1, "java script");
		v.clear();
		System.out.println(v);
		
		
		
//		for(int i=0;i<v.size();i++) {
//			System.out.println(v.get(i));
//		}
		
		
		
		
		
		
		
//		System.out.println(v);
//		System.out.println(v.contains("Ajay"));
//		System.out.println(v.get(1));
		
		
		
		
//		v.addAll(2,al);
//		v.remove(2);
//		v.removeAll(al);
//		
		
		

	}

}
