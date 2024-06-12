package pkg1;

import java.util.Scanner;

public class SwitchCaseInjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		
		Scanner sc= new Scanner(System.in);
		int ch=0;
		do {
			System.out.println("Enter options /n1. add/n2.sub/n3.mult/n4.div ");
			 ch=sc.nextInt();
			
		} while (ch>4);
		
		
		
		float a=20f;
		float b=30f;
		float result=0;
		switch (ch) {
		case 1: {
			result=a+b;
			System.out.println("Addition="+result);	
			break;
		}
		case 2: {
			result=a-b;
			System.out.println("substraction="+result);
			break;
			
		}
		case 3: {
			result=a/b;
			System.out.println("division="+result);
			break;
		}
		case 4: {
			result=a*b;
			System.out.println("multiplication="+result);
			break;
		}
		default:
			System.out.println("Enter valid options between 1 to 4");
		}

	}

}
