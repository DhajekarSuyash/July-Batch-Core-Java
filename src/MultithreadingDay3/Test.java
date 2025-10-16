package MultithreadingDay3;

public class Test {
	public static void main(String[] args) {
		
		Animal a = new Animal();
		a.setName("Thursday thread");
		System.out.println(a.getPriority());
		a.start();
		
		//completable feature 
		System.out.println(a.isAlive());
		
		try {
			a.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("exit");
	
		
	}

}
