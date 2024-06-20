package pkg1;

public class WhileLoopInJava1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//
		int inputNumber=1234777777;
		int count=0;
		while(inputNumber>0) {	
		count++;
		inputNumber=inputNumber/10;
		}
		System.out.println(count);
	}

}
