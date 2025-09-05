package Interfaces;

public interface Employee {
	
	public void printName();
	
	public void printAge();
	
//	public void something();
	
	public static void xyz() {
		System.out.println("static method");
		
	}
	
	
	default void abc() {
		
	}
	
	private void printsalary() {
		
		
	}

	//1. interface dont have constructors
//	public Employee() {
//		
//	}
	
	
	//2. Interface cant have concrete methods
//	public void getName() {
//		
//	}
//	
//	public int getAge() {
//		return 4;
//	}
	
	
	

}
