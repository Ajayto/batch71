package MethodOverriding;

public class DemoOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a= new A();
		a.printData(10, 20);

	}

}
//public
//protected
//default
//private

class A{
protected int printData(int a,int b){
		System.out.println("this is printdata method form parent A");
		return 20;
	}
}

class B extends A{
@Override	
public int printData(int c,int d) {
		System.out.println("this is printdata method from child B");
		return 10;
	}
}

