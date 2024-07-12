package MultilevelInheritance;

public class DemoMultilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c= new C();
		c.printA();
		c.printB();
		c.printC();

		System.out.println("from main a="+c.a);
		System.out.println("from main b="+c.b);
		System.out.println("from main c="+c.c);
		
		B b= new B();
		b.printA();
		b.printB();
		System.out.println("from main a="+b.a);
		System.out.println("from main b="+b.b);
		
		
		
	}

}
class A{
	int a=10;
	void printA() {
		System.out.println("A="+a);
	}
}

class B extends A{
	int b=20;
	void printB() {
		System.out.println("B="+b);
	}
}

class C extends B{
	int c=30;
	void printC() {
		System.out.println("C="+c);
	}
}
