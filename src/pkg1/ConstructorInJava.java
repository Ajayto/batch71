package pkg1;

public class ConstructorInJava {
	
	void ConstructorInJava(String s){
		
	}
	
	ConstructorInJava(){
		System.out.println("this is 0 args constructor");
	}
	ConstructorInJava(int a){
		System.out.println("this is 1 args constructor");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main start");
		//ConstructorInJava c= new ConstructorInJava();
		ConstructorInJava c= new ConstructorInJava();
		//c.ConstructorInJava();
		System.out.println("main End");

	}

}
