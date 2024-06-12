package pkg1;

public class StaticBlockInJava {
	int a;
	static int b;
	
	{
	//code to read file
	
	a=20;
	int c=10; //local variable
	System.out.println("a="+a);
	System.out.println("b="+b);
	System.out.println("c="+c);
	}
	
	static {
		b=20;
		
	    int d=10;
		System.out.println("b="+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("start");
		StaticBlockInJava s= new StaticBlockInJava();
		System.out.println("End");
		
	}
	
	void m() {
		System.out.println("this is my method");
	}

}
