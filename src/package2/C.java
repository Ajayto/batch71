package package2;

import package1.A;

public class C {
	
	void m4() {
		A a= new A();
		System.out.println(a.b);
		System.out.println(a.c);
		System.out.println(a.d);
		a.m3();
		b.m2();
		a.m4();
	}

}
