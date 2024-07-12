package ExceptionInJava;

public class UseOfThrowKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b= new Bank();
		b.withdraw(3000);
	}

}

class Bank{
	int balance=2000;
	void withdraw(int amount) {
		if(balance>=amount) {
			balance=balance-amount;
			System.out.println("balance="+balance);
		}
		else {
			System.out.println("you are not allowd");
			System.out.println("balance="+balance);
			// throw exception
			throw new LowAccountBalanceException("your account balance is low");
			System.out.println("this is new exception");
		}
	}
}
