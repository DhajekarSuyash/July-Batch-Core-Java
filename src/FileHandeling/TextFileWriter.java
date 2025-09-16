package FileHandeling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TextFileWriter {
	
	public static void main(String[] args) {
		
		//Homework
		// Create an entity class-> Student - > id, fName, lName, phoneNumber, city
		//Take input for this values using Scanner
		// Store this data in text file named as -> studentdetails.txt
		// format should be -> id : fName : lName : phoneNumber : city
		// eg -> 1 : abc : xyz : 789456 : Pune
		// Every student should be on new line
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your Name : ");
		String name = sc.next();
		System.out.println("Please enter Year of birth : ");
		int year = sc.nextInt();
		
		String username = name + year;
		System.out.println(username);
		
		// we want to store this username in a text file 
		// we need to specify location of file creation
		// text file creation will be taken care by java
		// writing in text file -> java
		
		//1. directory path
		String directoryPath = "C:\\Users\\suyas\\Music\\FileHandeling";
		//2. specify file name
		String fileName = "username.txt";
		
		//C:\\Users\\suyas\\Music\\FileHandeling\\username.txt
		File file = new File(directoryPath +"\\"+fileName);
		
		// we should create a file if it is not there
		try {
			
			// creation of file
			if(file.createNewFile()) {
				System.out.println("File created");
			}
			else {
				System.out.println("File already exists");
			}
			
			// Write into file -> insert username in file
			
			// true is added for append mode activation
			FileWriter writer = new FileWriter(file, true);
			writer.write(" * " + username + System.lineSeparator());
			writer.close();
			System.out.println("Username written in file : " + username);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			
			sc.close();
		}
		
		
		
		
		
		
		
		
		
	}

}
