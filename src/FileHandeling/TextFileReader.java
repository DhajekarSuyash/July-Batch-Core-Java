package FileHandeling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TextFileReader {

	public static void main(String[] args) {
		
		//Homework-> Student details file
		// read data from Studentdetails txt and print it as a object
		//convert every line from txt to Student object
		//then print student object using toString or getter

		String filePath = "C:\\Users\\suyas\\Music\\FileHandeling\\StudentData.txt";

		try {
			BufferedReader reader = new BufferedReader(new FileReader(filePath));
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
