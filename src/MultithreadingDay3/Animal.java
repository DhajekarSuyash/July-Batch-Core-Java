package MultithreadingDay3;

public class Animal extends Thread
{

	@Override
	public void run() {
		for(int i =0; i <= 10 ; i ++) {
			
			System.out.println("Thread name is : " + 
			Thread.currentThread().getName());
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Hi");
		}
	}

	
}
