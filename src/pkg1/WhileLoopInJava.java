package pkg1;

public class WhileLoopInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// print number 0 to 10;
		int inputNumber=1234;
		int count=0;
		while(inputNumber>0) {
			count++;  //2
			inputNumber=inputNumber/10;  //123
		}
		System.out.println(count);

		
	}

}
