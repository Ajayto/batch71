package ExceptionInJava;

public class DemoThrows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b= new B();
		try {
		b.print();
		}
		catch (InterruptedException e) {
			// TODO: handle exception
		}
	}

}

class A{
	void print() throws InterruptedException {
		System.out.println("classA print");
	}
}

class B extends A{
	void print() throws InterruptedException {
		System.out.println("classA print");
		Thread.sleep(3000);
	}
	
}
