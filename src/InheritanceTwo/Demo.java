package InheritanceTwo;

public class Demo {
	
	public static void main(String[] args) {
		
		Employee e = new Developer();
		System.out.println(e.name);
		System.out.println(e.empId);
		e.printCity();
		e.printSalary();
	}

}
