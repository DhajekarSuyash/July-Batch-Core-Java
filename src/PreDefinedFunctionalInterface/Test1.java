package PreDefinedFunctionalInterface;

import java.util.function.Predicate;

//Predicate Functional Interface
public class Test1 {
	
	public static void main(String[] args) {
		
	Predicate<Integer> p = x -> x % 2 ==0;
	Boolean result = p.test(25);
	System.out.println(result);
	
	Predicate<String> pb = y -> y.startsWith("A");
	System.out.println(pb.test("Monday"));
	
	//Ends with 
	
	}

}
