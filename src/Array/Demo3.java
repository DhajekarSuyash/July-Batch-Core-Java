package Array;

import java.util.Scanner;

public class Demo3 {
	public static void main(String[] args) {
		// primitive and non primitive
		Student s = new Student();
		s.setId(101);
		s.setName("Micahel");
		s.setCity("Pune");

		Student s1 = new Student();
		s1.setId(102);
		s1.setName("David");
		s1.setCity("Delhi");

		Student s2 = new Student();
		s2.setId(103);
		s2.setName("Ram");
		s2.setCity("mumbai");

		Student s4 = new Student();
		s4.setId(104);
		s4.setName("Shubham");
		s4.setCity("Banglore");

		Student[] studentArray = { s, s1, s2, s4 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter city : ");
		String city = sc.next();
		
		
		for (int i = 0; i < studentArray.length; i++) {

			if (studentArray[i].getCity().equals(city)) {

				System.out.println(studentArray[i].getId());
				System.out.println(studentArray[i].getName());
				System.out.println(studentArray[i].getCity());

			}

		}

		// find a Student who is from pune
		
		// Enter age field, then print students who have age more 18 

	}

}
