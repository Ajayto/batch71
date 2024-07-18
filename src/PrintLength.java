import java.util.Iterator;

public class PrintLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		String s="this is main method";
		try {
		for(int i=0;i>-1000;i++) {
			s.charAt(i);
			count++;	
		}
		}
		catch (StringIndexOutOfBoundsException e) {
			// TODO: handle exception
		}
	    System.out.println(count);

	}

}
