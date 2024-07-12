package ExceptionInJava;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadPropertyFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// object of property
		Properties property= new Properties();
		
		//FileInputStrime
		//try {
		
		FileInputStream file=new FileInputStream("D:\\ScriptQA\\testData.properties");
		
		property.load(file);
		//}
//		catch (Exception e) {
//			// TODO: handle exception
//		}
		
		//System.out.println(property.getProperty("stage"));

	}

}
