package FunctionalInterfaceDemo;

public class AdditionImpl 
{
	public static void main(String[] args) {
	
		FIAddition f = (a,b) -> {
			System.out.println(a+b);
		};
	f.addition(15, 30);
	
	}

}
