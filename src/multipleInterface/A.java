package multipleInterface;

public interface A {
	void print();
	static void getData() {
		System.out.println("interface A getdata method");
	}
	
	default void m() {
		System.out.println("this is default method M from interface A");
	}

}
