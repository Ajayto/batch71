package MethodOverloading;

public class DemoMain {

final void print() {
		System.out.println("this is print method from DemoMain ");
	}
}

class DemoChild extends DemoMain{
	
static void print() {
		System.out.println("this is print method from DemoChild ");
	}
	
}


//static 
