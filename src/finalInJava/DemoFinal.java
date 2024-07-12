package finalInJava;

public class DemoFinal {
	final int a;
	final static int b;
	{
		a=10;
		//b=30;
	}
	
	static {
		b=30;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	void m() {
		a=20;
	}
	
}
 class A{
	final void print(int a) {
		System.out.println("this is print method");
	}
}
class B extends A{
	void m() {
		print(10);//call here 
	}
}
