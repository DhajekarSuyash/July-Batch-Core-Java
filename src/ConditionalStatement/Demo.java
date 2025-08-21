package ConditionalStatement;

public class Demo {
	public static void main(String[] args) {
		// Find if it is even or odd. if it is even then it is dividble by 10 or not

		int a = 40;

		if (a % 2 == 0) {
			if (a % 10 == 0) {
				System.out.println("it is even number");
				System.out.println("Number is divisible by 10");
			} else {
				System.out.println("it is even number");
				System.out.println("It is not divisible by 10");
			}

		} else {
			System.out.println("it is odd number");
		}
	}

}
