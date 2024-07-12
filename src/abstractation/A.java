package abstractation;

public interface A {
	
	
 static int a=10;
 
 void m();
 void m2();	
 default void m3() {
	 System.out.println("This default m3 method");
 }
 static void m4() {
	System.out.println("this is static m4"); 
 }
}
