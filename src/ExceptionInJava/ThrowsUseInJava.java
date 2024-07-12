package ExceptionInJava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsUseInJava {

	public static void main(String[] args) throws FileNotFoundException, InterruptedException  {
		// TODO Auto-generated method stub

		ThrowsUseInJava t= new ThrowsUseInJava();
		t.m();
		System.out.println("this is to test throws");

	}

	void m1() { //caller
		//
		try {
		m();
		}
		catch (InterruptedException e) {
			// TODO: handle exception
		}
		catch (FileNotFoundException e) {
			// TODO: handle exception
		}


	}

	void m() throws InterruptedException, FileNotFoundException  {
		Thread.sleep(3000);
		
		FileInputStream file= new FileInputStream("c://data/test.txt");

	}

}
