package pkg1;

public class Student {
	static String studentName;
	static int StudentID;
	
	Student(String name, int id){
		studentName=name;
		StudentID=id;
	}
	
	void printStudentInfo() {
		System.out.println("Name of student is="+studentName);
		System.out.println("Name of studentID is="+StudentID);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student ajay=new Student("ajay",1001);
		ajay.printStudentInfo();
		Student sanjay=new Student("Sanjay",1002);
		sanjay.printStudentInfo();
	}

}
