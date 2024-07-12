package MethodOverloading;

public class DemoOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		short b=(short)a;
		
		

		DemoOverloading o= new DemoOverloading();
		o.add(10, 10.20f);
		
			
		
	}

	//method overloading

public	int add(int a,int b) {
		System.out.println("int");
		return a+b;	
	}

	
private	float add(int a,float b) {
		System.out.println("int");
		return (float)a+b;	
	}
	
protected float add(float ajay,int amit) {
		System.out.println("int");
		return (float)a+b;	
	}
	
	    
	
//	int add(byte a,byte b) {
//		System.out.println("byte");
//		return a+b;	
//	}
//	int add(short a,short b) {
//		System.out.println("short");
//		return a+b;	
//	}
//	
//	long add(long a,long b) {
//		System.out.println("long");
//		return a+b;	
//	}
//	
//	double add(float a,float b) {
//		System.out.println("float");
//		return (double)(a+b);	
//	}
//	
//	double add(double a,double b) {
//		System.out.println("double");
//		return a+b;	
//	}
	

	

}
