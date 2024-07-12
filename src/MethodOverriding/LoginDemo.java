package MethodOverriding;

import java.util.Scanner;

public class LoginDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Login lo;
		Scanner sc= new Scanner(System.in);
		String bankName=sc.next();
		
		if(bankName.contains("hdfc")) {
			lo= new NewLogin();
			lo.getLogin();
		}else {
			lo=new Login();
			lo.getLogin();
		}
		lo.getReSet();
	}

}

class Login{
	void getLogin(){
		System.out.println("Enter user name:");
		System.out.println("Enter password:");
		System.out.println("clear and submit");
	}
	
	void getReSet(){
		System.out.println("to reset password and username");
	}
	
}

class NewLogin extends Login{
	void getLogin(){
		System.out.println("Enter user name:");
		System.out.println("Enter password:");
		System.out.println("Enter phone number");
		System.out.println("clear and submit");
	}
	
}
