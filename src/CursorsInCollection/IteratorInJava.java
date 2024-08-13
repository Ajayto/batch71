package CursorsInCollection;

import java.util.HashSet;
import java.util.Iterator;

public class IteratorInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hs= new HashSet<String>();
		hs.add("abc");
		hs.add("pqr");
		hs.add("xyz");
		hs.add("asd");
		//hs.remove("xyz");
		//iterator();
		Iterator<String> itr= hs.iterator();
		while(itr.hasNext()) {
			String str=itr.next();
			if(str.equals("xyz")) {
				itr.remove();
			}
		}

	}

}
