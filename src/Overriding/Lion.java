package Overriding;

public class Lion extends Animal
{
	//constructor chaining
	public Lion() {
		this(23);
	}
	
	public Lion(int a) {
		super();
		System.out.println("a in constructor is : " + a);
		
	}
	
	public int number = 123;
	
	public void printColor() {
		System.out.println("Yello black stripped");
		printCity();
		super.printCity();
		super.printName();
		System.out.println(super.age);
		
	}
	
	public void something() {
		System.out.println("Something method");
		System.out.println(this.number);
		this.printColor();
		this.printName();
		
		
	}
	
	@Override
	public void printName() {
		// TODO Auto-generated method stub
		System.out.println("print name - LION");
	}
	

	

}
