package hasA;

public class Demo {

	public static void main(String[] args) {
		
		// 1. Student has a degree
		// 2. Employee has A Experience
		
		//3. Student has A Vehical(name, type) and 
		//Vehical has A registeration details(vehicl no, Year of manuf)
		
		

		Student s = new Student();
		s.setId(101);
		s.setCity("PUNE");
		s.setName("Akshay");
		
		PersonalDetails p = new PersonalDetails();
		p.setFatherName("abc");
		p.setMotherName("xyz");
		
		s.setDetails(p);
		
		System.out.println(s.toString());
		
		
		System.out.println(s.getId());
		System.out.println(s.getName());
		System.out.println(s.getCity());
		System.out.println(s.getDetails().getFatherName());
		System.out.println(s.getDetails().getMotherName());
		
		
	}

}
