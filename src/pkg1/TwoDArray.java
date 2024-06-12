package pkg1;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		            //  0             1             2
		           // 0 1  2
		int a[][]= {{10,20,30},{40,50,60,10,30},{70,80,90}};
		System.out.println(a[1].length);

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}
