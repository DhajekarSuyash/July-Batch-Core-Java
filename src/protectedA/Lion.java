package protectedA;

public class Lion extends Animal {

	public void printAge() {
		System.out.println("12");
		//printName();
		Animal a = new Animal();
		a.anything();
		a.printName();
	}
}
