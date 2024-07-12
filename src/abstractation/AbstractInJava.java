package abstractation;


 public class AbstractInJava {
	 
	public static void main(String[] arg) {
		//User u= new User();
		User nu= new NewUser();
		nu.addUser();
		nu.editUser();
		nu.viewUser();
		nu.deleteUser();
		
	}
	
	 
}
 
 abstract class User{
	 User(){
		 System.out.println("constructor");
	 }
	 abstract int editUser();
	 abstract void viewUser(); 
	 void addUser() {
		 System.out.println("this addUser method");
	 }
	 void deleteUser() {
		 System.out.println("this deleteUser method");
	 }
 }
 
 class NewUser extends User{
	 int editUser() {
		 System.out.println("this is edit user");
		 return 1;
	 }
	 void viewUser() {
		 System.out.println("this is view user method");
	 }
	 
 }
