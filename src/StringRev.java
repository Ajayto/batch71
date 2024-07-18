
public class StringRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="this is java program";
		int lengthOfString=str.length();
		String temp="";
		for(int i=str.length()-1;i>=0;i--) {
			temp+=str.charAt(i);
		}

		System.out.println(temp);
		if (str.equalsIgnoreCase(temp)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
	}

}
