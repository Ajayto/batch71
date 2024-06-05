package pkg1;

public class SwitchCaseInjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		float key=20.21f;
		float a=20f;
		float b=30f;
		float result=0;
		switch (key) {
		case 20.20f: {
			result=a+b;
			System.out.println("Addition="+result);	
			break;
		}
		case 20.21f: {
			result=a-b;
			System.out.println("substraction="+result);
			break;
			
		}
		case 20.22f: {
			result=a/b;
			System.out.println("division="+result);
			break;
		}
		case 20.23f: {
			result=a*b;
			System.out.println("multiplication="+result);
			break;
		}
		default:
			System.out.println("Enter valid options between 1 to 4");
		}

	}

}
