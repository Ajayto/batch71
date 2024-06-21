package pkg2;

public class A {
	
	A(){
		new A(10);// object 
		System.out.println("0 arg constructor");
		System.out.println("local change");
	}
	
	A(int arg){
		//this();
		System.out.println("1 arg constructor");
	}
	
	A(int a,int b){
		this(10,20,30);
		System.out.println("2 arg constructor");
		
	}
	//this()
	A(int a,int b,int c){
		this();
		System.out.println("3 arg constructor");
	}

	A(int a,int b,int c, int d){
		this();
		System.out.println("4 arg constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a= new A();

	}
     // this is new chnage 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a= new A();

	}

}
