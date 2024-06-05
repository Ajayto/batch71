package pkg1;

public class SumOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=123456;
		int rev=0;
		//int revNumber;
		for (; number>0; ) {
			
			rev=number%10;
			System.out.print(rev);
			number/=10;
			
		}
		

	}

}
