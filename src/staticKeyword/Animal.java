package staticKeyword;

public class Animal {
	static int age = 12;
	
	static {
		
		System.out.println("Static block");
	}
	public Animal() {
		System.out.println("Constructor");
	}
	
	
	

}
