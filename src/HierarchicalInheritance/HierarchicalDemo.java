package HierarchicalInheritance;

public class HierarchicalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B b= new B();
		b.printA();
		b.printB();
		
		C c= new C();
		c.printA();
		c.printC();
		
		D d= new D();
		d.printA();
		d.printD();
		
		A a= new A();
		a.printA();

	}

}
