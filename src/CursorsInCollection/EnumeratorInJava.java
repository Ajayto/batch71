package CursorsInCollection;

import java.util.Enumeration;
import java.util.Vector;

public class EnumeratorInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<Integer> v= new Vector<Integer>();
		v.addElement(10);
		v.add(20);
		v.add(30);
		v.add(40);
		Enumeration<Integer> enm=v.elements();
		while(enm.hasMoreElements()) {
			Integer number=enm.nextElement();
			System.out.println(number);
		}
		

	}

}
