package FunctionalInterfaceDemo;

public class Test {

	public static void main(String[] args) {

		FIReturntype f = (a, b) -> {
			int subs = a - b;
			return subs;
		};

		int val = f.substraction(58, 20);
		System.out.println(val);
	}

}
