package pkg1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	   int number=7;
	   boolean flag=true;
	   for (int i = 2; i < number; i++) {
		   if(number%i==0) {
			   flag=false;
			   break;
		   }
		
	}
	   if(flag==true) {
		  System.out.println("number is prime number"); 
	   }
	   else {
		   System.out.println("number is not prime number");
	   }

	}

}
