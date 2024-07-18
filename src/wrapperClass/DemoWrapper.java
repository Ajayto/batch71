package wrapperClass;

public class DemoWrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="123abc%%&%";
		StringBuffer number= new StringBuffer();
		StringBuffer latters= new StringBuffer();
		char[] charArray=s.toCharArray();
		for (char eachchar : charArray) {
			if(Character.isDigit(eachchar)) {
				number.append(eachchar);
			}
			else {
				latters.append(eachchar);
			}
		}
		
		String s2=new String(number);
		
		Integer i=Integer.valueOf(s2);
		int num=i;
		System.out.println("number ="+s2);
		System.out.println("latters ="+latters);
		

	}

}
