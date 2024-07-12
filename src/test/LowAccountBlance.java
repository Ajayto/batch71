package test;

public class LowAccountBlance extends RuntimeException {
	LowAccountBlance(String message){
		super(message);
	}

}
