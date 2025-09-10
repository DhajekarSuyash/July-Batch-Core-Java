package ExceptionHandling;

import java.security.InvalidParameterException;

public class demo3 {

	public static void main(String[] args) {
		// InvalidParameterException

		int age = 12;

		if (age < 18) {
			throw new InvalidParameterException("Only 18 plus allowed");
			// not eligible for voting
		} else {
			System.out.println("Can vote");
		}
	}

}
