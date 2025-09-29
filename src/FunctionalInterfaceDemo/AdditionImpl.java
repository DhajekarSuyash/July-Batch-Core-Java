package FunctionalInterfaceDemo;

public class AdditionImpl 
{
	public static void main(String[] args) {
		
		FIAddition f = (a,  b) -> {System.out.println(a+b);};
		
		// () -> {}   ==> Lambda expression
		
		
		f.addition(95, 80);
		
	}

	
//	@Override
//	public void addition(int a , int b) {
//		System.out.println(a+b);
//	}

}
