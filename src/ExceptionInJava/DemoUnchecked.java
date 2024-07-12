package ExceptionInJava;

import javax.security.auth.callback.CallbackHandler;

public class DemoUnchecked {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		int a=10;
		int array[]= {10,20,30,40};
		System.out.println("Hi this ajay");
		try {
		  System.out.println("in side try block");
		 System.out.println(a/1);// 
		 System.out.println("end try block");
		 System.out.println(array[5]);//
		}
		
		catch (Exception e) {
			System.out.println("Exception");
		}
		
		catch (RuntimeException e) {
			// TODO: handle exception
		}
	
		
		System.out.println("hi this scriptQA");
		
		
		

	}

}
