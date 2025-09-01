package Overloading;

//overloading -> Compile time polymorphism
public class Calculator {

	// constructor overloading
	public Calculator() {

	}

	public Calculator(int a) {

	}
	
	public Calculator(int a,int b) {

	}
	//
	public static void substraction() {
		
	}
	
	public static void substraction(int x, int y) {
		
	}
	
	
	
	

	// example 1 - method overloading
	public void addition(int a, int b) {
		int sum = a + b;
		System.out.println("Sum of two numbers : " + sum);
	}

	// return type, access modifier wont matter in overloading
//	protected void addition(int x, int y) {
//		int sum = x + y;
//		System.out.println("Sum of two numbers : " + sum);
//	}

	public void addition(int a, int b, int c) {
		int sum = a + b + c;
		System.out.println("Sum of three numbers : " + sum);
	}

//example 2 -> method overloading seq of parameters changed
	public void printSomething(String name, int id) {

	}

	public void printSomething(int id, String name) {

	}

}
