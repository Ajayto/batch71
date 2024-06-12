package pkg1;

public class ArrayInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {10,20,5,1,2,100};
		         //0  1 2 3 4  5
		
		int smallNumber=a[0];
		for(int i=1;i<a.length;i++) {
			if(smallNumber>a[i]) {
				smallNumber=a[i];
			}
			
		}
		System.out.println(smallNumber);
		//smallNumber=5
		
		
		
		
		
		
		
//		String b[]= {"ScriptQA","java","c#"};
//		int c[]=new int[100];
//		c[0]=10;
//		c[1]=20;
//		c[2]=30;
//		c[3]=40;
//		c[4]=50;
//		c[5]=60;
		
		
		//System.out.println(c.length);
		//System.out.println(c[5]);
//		for(int element:c) {
//			System.out.println(element);
//		}
		
		
		
		
		
		
		
//		for(String element:b) {
//			
//			System.out.println(element);
//			
//		}
		
		
		
		
		
		
		         //0  1  2  3  4
//		System.out.println("length="+a.length);
//		
//		for(int element:a) {
//			System.out.println(element);
//		}
		
		
		
		
		// 1
//		for (int i = 0; i <a.length; i++) {
//			System.out.println(a[i]);
//		}
		

	}
	
	
	int[] m1() {
		int a[]= {10,20};
		return a;
	}

}
