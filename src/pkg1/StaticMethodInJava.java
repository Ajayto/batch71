package pkg1;

public class StaticMethodInJava {
	int a=20; //instance 
	static int b=30;

	static void m1() {
		System.out.println(b);
		StaticMethodInJava s1= new StaticMethodInJava();
		System.out.println(s1.a);
		s1.m2();
	}
	
	 void m2() {
		 System.out.println(a);
		 m1();
		System.out.println("this is method m2");
	}

}
