package pkg1;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Factorial f= new Factorial();
		//int result=factorial(7); //method calling
		//System.out.println("factorial="+result);	
		//TestJava j= new TestJava();
		int result =factorial(4);
		System.out.println("factorial="+result);
	}
	
	//i/p= number
	//o/p= number
	
	static int factorial(int number){
		int facto=1;
		for (int i = 1; i <=number; i++) {
			facto*=i;// facto=facto*i;	
		}
		return facto;
	}
	

}
