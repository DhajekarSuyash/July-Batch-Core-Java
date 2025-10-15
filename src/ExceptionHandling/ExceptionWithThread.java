package ExceptionHandling;

public class ExceptionWithThread {
	
	public static void main(String[] args) {
		System.out.println("START");
		try {
			int a = 10/0;
			System.out.println(a);
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("END");
	}

}
