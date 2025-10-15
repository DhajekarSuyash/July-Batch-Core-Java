package MultithreadingDay2;

public class Test3 {
	
	public static void main(String[] args) {
		// AS runnable is a functional interface then we can create a thread 
		// using lambda as well
		// Way 1 
		Runnable r = () -> {
			for(int i = 0 ;  i < 50 ; i++) {
				System.out.println("thread name : " + Thread.currentThread().getName() +" :  "+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		Thread t = new Thread(r);
		t.start();
		
		
		// way 2 - more optimised way - > Analyse this part
		Thread t1 = new Thread(() -> {
			for(int i = 0 ;  i < 50 ; i++) {
				System.out.println("thread name : " + Thread.currentThread().getName() +" :  "+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		);
		t1.start();
		
	}

}
