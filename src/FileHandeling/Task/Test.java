package FileHandeling.Task;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Test t = new Test();
		// create student from user
		Student student = t.getStudentObjectFromUser();
		try {
			// add student to file
			String msg = t.updateFile(student);
			System.out.println(msg);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private String updateFile(Student student) throws IOException {
		// Please update directory path as per your system path
		String directoryPath = "C:\\Users\\suyas\\Music\\FileHandeling";
		String fileName = "StudentData.txt";
		File file = new File(directoryPath + "\\" + fileName);
		if (file.createNewFile()) {
			System.out.println("File created with name : " + fileName);
		} else {
			System.out.println("File already exists : UPdating existing file");
		}

		FileWriter writer = new FileWriter(file, true);

		writer.write(student.getId() + " : ");
		writer.write(student.getfName() + " : ");
		writer.write(student.getlName() + " : ");
		
		//Note - phoneNumber casted to BigInt as write do not allow long.
		BigInteger phoneNumber = BigInteger.valueOf(student.getPhoneNumber());
		writer.write(phoneNumber + " : ");
		writer.write(student.getCity() + ";" + System.lineSeparator());

		String msg = "Student : " + student.getfName() + " : updated in file : " + fileName;

		writer.close();

		return msg;

	}

	private Student getStudentObjectFromUser() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please provide following details");

		System.out.println("Please enter Id : ");
		int id = sc.nextInt();

		System.out.println("Please enter first name : ");
		String fName = sc.next();

		System.out.println("Please enter last name : ");
		String lastName = sc.next();

		System.out.println("Please enter phone number : ");
		Long phoneNumber = sc.nextLong();

		System.out.println("Please enter city : ");
		String city = sc.next();

		Student student = constructStudentObject(id, fName, lastName, phoneNumber, city);

		sc.close();
		return student;
	}

	private Student constructStudentObject(int id, String fName, String lName, long phoneNumber, String city) {
		Student student = new Student();
		student.setId(id);
		student.setfName(fName);
		student.setlName(lName);
		student.setPhoneNumber(phoneNumber);
		student.setCity(city);
		return student;
	}

}
