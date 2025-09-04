package OopsBasicProject;

public class Demo {

	public static void main(String[] args) {

		Employee e;
		
		e = new Developer();
		e.printSalary();
		
		e = new HR();
		e.printSalary();
		
		
//		Employee e = new Developer();
//		e.printSalary();
//		
//		Employee e1 = new HR();
//		e1.printSalary();
		
	}

}
