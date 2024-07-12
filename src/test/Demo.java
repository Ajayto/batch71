package test;


public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Ajay";
		String s2=new String("Ajay");
		System.out.println(s.equals(s2));
		
		
		
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
