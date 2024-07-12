package test;

public interface B {
	void m();
	default void m2() {
		System.out.println("b.m");
	}

}
