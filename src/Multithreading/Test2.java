package Multithreading;

public class Test2 {

	public static void main(String[] args) {
		System.out.println("START");

		Employee2 e = new Employee2();

		e.start();

		for (int i = 0; i < 500; i++) {
			System.out.println("Main method : " + Thread.currentThread().getName());
		}

		System.out.println("END");

	}

}
