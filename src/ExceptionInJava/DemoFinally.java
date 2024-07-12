package ExceptionInJava;

public class DemoFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int a[]= {10,30,40,50};
	    try {
	    System.out.println(a[2]);//
	    System.out.println(10/0);
	    System.exit(0);
	    //open DB 
	    // some action
	  
	    
	    }
	   
	    
	    finally {
			System.out.println("this is finally block");
			//close DB
		}
	    
	    
	    System.out.println("end");

	}

}
