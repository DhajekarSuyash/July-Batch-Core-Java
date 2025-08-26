package Inheritance;

//child
public class Tiger extends Animal {

	public Tiger() {
		System.out.println("In tiger constructor - child");
	}

	@Override
	public void printName() {
		System.out.println("Tiger");
	}

	public void printColor() {
		System.out.println("yello black stripped");
	}

}
