package pkg1;

public class WhileLoopInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// print number 0 to 10;
		int number=1234567890;
		int count=0;
		while(number>0) {
			count++;
			number=number/10;
		}
		System.out.println(count);

		
	}

}
