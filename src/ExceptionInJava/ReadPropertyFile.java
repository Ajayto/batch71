package ExceptionInJava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// object of property
		
		
		//FileInputStrime
		int a[]= {10,20,30,40};
		try {
		
		Properties property= new Properties();
		FileInputStream file=new FileInputStream("D:\\ScriptQA\\testData.properties");
		try {
		property.load(file);
		}
		catch (Exception e) {
			// TODO: handle exception
		}

	    System.out.println(a[2]);
	    String s="abc";
	    System.out.println(s.charAt(10));
	    System.out.println(10/1);//
	    
	   }
//		catch (ArithmeticException e) {
//			System.out.println(10/2);
//			System.out.println("ArithmeticException");
//		}
		catch (FileNotFoundException e) {
			System.out.println("read file from server");
			System.out.println("FileNotFoundException");
		}
		catch (IOException e) {
			System.out.println("IOException");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(a[a.length-1]);
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		
		catch (Exception e) {
			System.out.println("Exception");
		}

		//System.out.println(property.getProperty("stage"));

	}

}
