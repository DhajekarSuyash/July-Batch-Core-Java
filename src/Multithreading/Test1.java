package Multithreading;

public class Test1 {
	
	public static void main(String[] args) {
		// multi threading -> behaviour of your JAVA code

		//single threaded envoirnment
		System.out.println("Name of thread : " 
		+Thread.currentThread().getName());
		
		
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");

		Animal1 a = new Animal1();
		a.getName();

		System.out.println("5");
		System.out.println("6");
		System.out.println("7");
		System.out.println("8");
		
		System.out.println("Name of thread in end: " 
				+Thread.currentThread().getName());
	}

}
