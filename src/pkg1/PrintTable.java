package pkg1;

import java.util.Iterator;

public class PrintTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     for (int i = 1; i <= 10; i++) { //1 2 
    	 for (int j = 1; j <=10; j++) {
			System.out.printf("%10d ",i*j);  // 1*1 1*2 1*3
		}
    	 System.out.println();
		
	}
	}

}
