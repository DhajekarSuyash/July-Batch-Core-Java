package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Demo4 {
	
	
	public static void main(String[] args) throws ArithmeticException
	{
		
		int a=50000;
		
		
		 int square = a*a;
		 System.out.println(square);	
		
	}
//		Demo4 d = new Demo4();
//	
//		d.div();
//		System.out.println("END");
//		
//		
//		
//	}
//	
//	public void div() throws ArithmeticException
//	{
//		int a = 12/0;
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	//compileTime using throw
//	public static void main(String[] args) {
//		Demo4 d = new Demo4();
//		try {
//			d.anything();
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	
//	public void anything() throws FileNotFoundException {
//		Demo4 d = new Demo4();
//		d.something();
//	}
//
//	public void something() throws FileNotFoundException  {
//		FileReader reader = new FileReader("abc.txt");
//	}
}
