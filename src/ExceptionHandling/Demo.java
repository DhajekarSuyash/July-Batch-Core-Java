package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		// CompileTime Exception
		
		try {
			FileReader reader =  new FileReader("testt.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// Runtime exception
		
		System.out.println("code started");
		int a = 12;
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		
		try {
			int div = 12/value;
			System.out.println(div);
		}
		catch (ArithmeticException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Finally block");
		}

	}
}
