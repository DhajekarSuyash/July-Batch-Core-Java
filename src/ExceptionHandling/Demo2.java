package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		// Part -2
		System.out.println("Enter a :");

		try {
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();

			try {
				int div = 12 / a;
				System.out.println(div);
			} catch (ArithmeticException e) {
				System.out.println("Please enter non zero number");
				e.printStackTrace();
			}

		} catch (InputMismatchException e) {
			System.out.println("Enter only integer value");
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("END");
		

		// Part - 1
		// System.out.println("Enter a :");
//		try {
//			Scanner sc = new Scanner(System.in);
//			int a = sc.nextInt();
//			int div = 12 / a;
//			System.out.println(div);
//		}
//		catch (ArithmeticException e) {
//			e.printStackTrace();
//		} 
//		catch (RuntimeException e) {
//			// TODO: handle exception
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println("End");

	}

}
