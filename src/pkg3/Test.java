package pkg3;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b= new B();
		b.get();
      
	}
	

}

class A{
	static void get() {
		System.out.println("A");
				
	}
}
class B extends A{
	
	static void get() {
		System.out.println("B");
	}
	
}
