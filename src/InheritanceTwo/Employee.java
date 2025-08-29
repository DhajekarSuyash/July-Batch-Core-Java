package InheritanceTwo;

public class Employee {

	public Employee() {
		super();
		System.out.println("Const - employee");
		// TODO Auto-generated constructor stub
	}

	static int abc = 1234;
	
	int empId = 102;

	String name = "Vijay";
	
	public static void printVehical() {
		System.out.println("Honda city");
	}

	public void printCity() {
		System.out.println("City name : ");
	}

	public void printSalary() {
		System.out.println("2500");
	}
}
