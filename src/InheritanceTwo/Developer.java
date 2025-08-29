package InheritanceTwo;

public class Developer extends Employee {

	public Developer() {
		super();
		System.out.println("Const - Develoepr");
		// TODO Auto-generated constructor stub
	}

	int age = 23;

	int empId = 110;
	

	@Override
	public void printCity() {
		super.printCity();
		System.out.println("PUNE");
	}

	public void printProject() {
		System.out.println("Google");
	}

}
