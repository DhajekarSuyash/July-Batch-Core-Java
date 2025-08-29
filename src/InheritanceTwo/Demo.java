package InheritanceTwo;

public class Demo {
	
	public static void main(String[] args) {
//		Developer d =  new Developer();
//		d.printVehical();
		Developer.printVehical();
		System.out.println(Developer.abc);
		
		
		Employee e = new Developer();
//		System.out.println(e.name);
//		System.out.println(e.empId);
//		e.printCity();
		e.printSalary();
	}

}
