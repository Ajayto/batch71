package pkg1;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp=0;
		int a[]= {80,40,10,5,20,30,40};
		for(int i=0;i<a.length;i++) {
			for (int j = 0; j < a.length; j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
			}
  
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

}
