
public class MakeUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// i/p: this is java program
		//o/p: This Is Java Program
		String input="this is java program";
		MakeUpperCase m= new MakeUpperCase();
		String output= m.firstUpperCase(input);
		System.out.println(output);

	}
	
	String firstUpperCase(String str){
	  String temp="";
	  String[] wordArray=str.split(" ");
	  for(String eachWord:wordArray) {
		  temp+=Character.toUpperCase(eachWord.charAt(0))+eachWord.substring(1)+" ";
		 // System.out.println(temp);
	  }
	 return temp.trim();
		
	}

}
