package pkg1;

public class StaticVariableInjava {
	
	int a=10;   // object
	static int b=10; ///class

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVariableInjava s1= new StaticVariableInjava();
		s1.m();
		s1.m();
		s1.m();
		StaticVariableInjava s2= new StaticVariableInjava();
		s2.m(); //a=11 b=14
	}
	
	void m() {
		a++; //11  //11
		b++;  //11  //12
		System.out.println("a="+a+"  b="+b );
	}
	
	

}
