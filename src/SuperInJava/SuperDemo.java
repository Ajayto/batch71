package SuperInJava;

public class SuperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c=new C();
		

	}

}

class A{
	
	A(int a,int b){
		System.out.println("class A,2 args constructor");
	}
	
}
class B extends A{
	B(){
		super();
		//super(10,30);
		System.out.println("class B,0 args constructor");
	}
	
	B(int a){
		super(10,20);
		System.out.println("class B,1 args constructor");
	}
}
class C extends B{
	C(){
		super(10);
		System.out.println("class C,0 args constructor");
		
		//
	}
}
