package pkg1;

public class VariableInJava {
	int c=30; //instance object
	static int s=30; //class

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VariableInJava obj =new VariableInJava();
		obj.m(); //m method is called
		System.out.println(s);
		

	}
	
	void m() {
	  int a=20;	
	  System.out.println(a);
	  System.out.println(c);
	  System.out.println(s);
	}
	
	void m2() {
		int b=20;
		System.out.println(c);
		System.out.println(s);
		//System.out.println(a);
	}

}
