package ExceptionInJava;

public class LowAccountBalanceException extends RuntimeException {
	LowAccountBalanceException(String msg){
		super(msg);
	}

}
