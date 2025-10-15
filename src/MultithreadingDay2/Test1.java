package MultithreadingDay2;

public class Test1 {
	
	public static void main(String[] args)  {
		System.out.println("Name of main thread : "
				+Thread.currentThread().getName());
		
		Animal1 animal1 = new Animal1();
		animal1.start();
		
	}

}
