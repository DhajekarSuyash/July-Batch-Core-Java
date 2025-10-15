package Multithreading;

public class Employee2 extends Thread {

	@Override
	public void run() {

		for (int i = 0; i < 500; i++) {
			System.out.println("Employee method : " 
		+ Thread.currentThread().getName());
		}

	}

}
