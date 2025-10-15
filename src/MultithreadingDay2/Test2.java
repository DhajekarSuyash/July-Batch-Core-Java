package MultithreadingDay2;

public class Test2 {
	
	public static void main(String[] args) {
		
		System.out.println("main thread");
		//1. Create object of class
		Animal2 animalThread = new Animal2();
		// 2. pass that obj to object of Thread class
		Thread t = new Thread(animalThread);
		//3. from thread class use start method.
		t.start();
		
		
		
	}

}
