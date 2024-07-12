package abstractation;

 class B implements A {
    
	@Override
	public void m() {
		
		System.out.println("this method m");
		
	}

	@Override
	public void m2() {
	  System.out.println("this is method m2");	
	}
	
	public void m3() {
		System.out.println("m3 in chaild class B");
	}

}
