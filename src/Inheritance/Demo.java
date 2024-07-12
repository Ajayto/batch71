package Inheritance;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Animal a= new Animal("any",4);
		//a.printDetails();
		
		Dog d= new Dog();
		d.setName("Rocky");
		d.setAge(5);
		d.printDetails();
		d.makeSound();
		
		

	}

}

class Animal{
	String name; //rokey
	int age;   //5
	
	void setName(String name){
	   this.name=name;
	}
	
	void setAge(int age) {
		this.age=age;
		
	}
	void printDetails(){
		System.out.println("Name="+name);
		System.out.println("age="+age);
	}
}

class Dog extends Animal {
	void printAge(){
		System.out.println(age);
		System.out.println(name);
		printDetails();
	}
	
	
	void makeSound() {
		System.out.println("Bow bow");
	}
}

class Cat extends Animal{
	void makeSound() {
		System.out.println("meow meow");
	}
	
}

