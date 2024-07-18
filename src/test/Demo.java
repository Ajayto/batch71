package test;


public class Demo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="100s";
		String a=s.valueOf();
		System.out.println(a);
		
		
//		String str="this /is /java program";
//		 String [] abc= str.split("/", 4);
//		 System.out.println(abc.length);
//		 System.out.println(abc[0]);
//		 System.out.println(abc[1]);
//		 System.out.println(abc[2]);
		//String newString= str.replace('a', 'z');
	
		
		
//		Bank b= new Bank();
//		b.withdraw();
		 
		

	}

}

class Bank{
	int balance=100;
	int withdraw=150;
	
	void withdraw() {
		if(balance>=withdraw) {
			balance=balance-withdraw;
			System.out.println("balance="+balance);
		}
		else {
			throw new LowAccountBlance("your account balance is not enough");
		}
	}

}
