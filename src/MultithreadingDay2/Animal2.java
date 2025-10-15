package MultithreadingDay2;

//Thread creation by implementing runnable interface
public class Animal2 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {

			System.out.println(i + " : " 
					+ Thread.currentThread().getName());

		}

	}

}
