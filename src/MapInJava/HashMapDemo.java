package MapInJava;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hm1= new HashMap();
		hm1.put(1,"123");
		hm1.put(2, "456");
		hm1.put(3, "789");




		HashMap hm= new HashMap();
		hm.put(1001,"Tom");
		hm.put(1002, "Ram");
		hm.put(1003, "sanjay");
		hm.put(null, "abc");
		hm.put("pqr",1234);
		System.out.println(hm);
		hm.putAll(hm1);
		System.out.println(hm);
		//1 st 
		Set s=hm.keySet();
		//	   for(Object obj:s) {
		//		   System.out.println("key="+obj+" value="+hm.get(obj));
		//	   }

		//2nd
//		Iterator itr= s.iterator();
//		while(itr.hasNext()) {
//			Object obj=itr.next();
//			System.out.println("key="+obj+" value="+hm.get(obj));
//		}
		
		//3rd
		
		
		Hashtable<K, V>
		
		
		
		
//		 Set s1=hm.entrySet();
//		 System.out.println("set s1="+s1);
//		 for(Object obj:s1) {
//			 System.out.println("obj:"+obj);
//			 Map.Entry entry=(Map.Entry)obj;
//			 System.out.println(entry.getKey()+" "+entry.getValue());
//		 }

		//key  1001











		//System.out.println(hm.containsKey(1003));
		//System.out.println(hm.containsValue("vshvhv"));


		//updating value 





	}

}
