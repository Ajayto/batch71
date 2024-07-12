package test;

public interface A {
	
	int m(int a);
	default void m2() {
		System.out.println("A.m");
	}

}
