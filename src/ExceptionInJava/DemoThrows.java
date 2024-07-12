package ExceptionInJava;

public class DemoThrows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
