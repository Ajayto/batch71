package single;

public class DemoSingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B b= new B();
		b.printA(); // parent class 
		b.printB();  //child class
		
		System.out.println(" from main A="+b.a);//parent class  variable
		System.out.println(" from main B="+b.b);//child class variable

	}

}

class A{
	int a=10;
	void printA(){
		System.out.println("A="+a);
	}
}

class B extends A{
	int b=10;
	void printB() {
		System.out.println("B="+b);
	}
	
}
