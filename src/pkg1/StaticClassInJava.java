package pkg1;

public class StaticClassInJava {
   // static int a=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj= new A();
		A.InnerClass inner=obj.new InnerClass();
		inner.m();
		
		
		
	

	}

}

 class A{ 
	 class InnerClass{  //non static 
		  void m() {
			 System.out.println("this my inner class method m");
		 }
	 }
	
}
