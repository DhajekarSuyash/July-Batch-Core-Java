package MultithreadingDay2;

//1. Thread creation using extends Thread class
public class Animal1 extends Thread
{

	@Override
	public void run() {
		for(int i = 0; i < 10 ; i++) {
			
			System.out.println(i + " : " 
		+ Thread.currentThread().getName() );
			
		}
	}

}
