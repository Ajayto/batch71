package pkg1;

public class SwitchCaseArrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stubkey
		
		int key=1;
		
		switch (key) {
		case 1 ->{System.out.println("Case 1");
		System.out.println("Case 1");
		break;
		
		}
		case 2 ->System.out.println("Case 2");
		case 3 ->System.out.println("Case 3");
		case 4 ->System.out.println("Case 4");
		default ->
		throw new IllegalArgumentException("Unexpected value: " + key);
		}

	}

}
