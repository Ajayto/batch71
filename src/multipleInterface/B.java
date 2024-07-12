package multipleInterface;

public interface B {
	void print();
	
	static void getData() {
		System.out.println("interface B getdata method");
	}
	
	default void m() {
		System.out.println("this is default method M from interface B");
	}

}
