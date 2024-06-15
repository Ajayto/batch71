package pkg1;

public class Student1 {
	String name;
	int rollNumber;
	                    //Amit       //1001
	public Student1(String name,int rollNumber) {
		name=name+" jr";
		System.out.println("name="+name);
	}
	
	void printStudentData() {
		System.out.println("Name="+name+" rollNumber="+rollNumber);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s= new Student1("Amit", 1001);
		//s.m2();
		
		//s.printStudentData();

	}
	
	
	
	static void m1() {
		System.out.println("this is m1 method");
		this.m2();
	}
	
	static void m2() {
		//this.m1();
	}
	
	
	
	
	

}
