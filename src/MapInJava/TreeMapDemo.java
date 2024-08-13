package MapInJava;

import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap tm= new TreeMap();
		tm.put(2, "C");
		tm.put(4, 20.30f);
		tm.put(3, 123);
		tm.put(1, "A");

        NavigableMap nm= tm.descendingMap();
          
//        for(Object obj:nm.keySet()) {
//        	System.out.println("Key="+obj+" value="+tm.get(obj));
//        }

        
        for(Object obj:nm.entrySet()) {
        	Map.Entry ent=(Map.Entry)obj;
        	System.out.println(ent.getKey()+" "+ent.getValue());
        }
        
		System.out.println();
		System.out.println(tm);


		

//      NavigableSet ns=tm.descendingKeySet();
//
//      for(Object obj:ns) {
//      	System.out.println("Key="+obj+" value="+tm.get(obj));
//      }
		//System.out.println(tm.lowerKey(1));
		//System.out.println(tm.get(3));
		// System.out.println(tm.floorKey(1.1));
		//System.out.println(tm.ceilingKey(0));

		//System.out.println(tm.containsKey(0));
		//System.out.println(tm.containsValue(123));

		//System.out.println(tm.firstKey());








		//		Entry e=tm.ceilingEntry(2);
		//		
		//		System.out.println(e.getKey()+" "+ e.getValue());





	}

}
