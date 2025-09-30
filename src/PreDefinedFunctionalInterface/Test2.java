package PreDefinedFunctionalInterface;

import java.util.function.Function;

public class Test2 {
	public static void main(String[] args) {

		Function<Integer, Integer> square = x -> x * x;
		Integer a = square.apply(5);
		System.out.println(a);

		// Count numbder of alphabates in string
		Function<String, Integer> count = x -> x.length();
		int val = count.apply("Monday");
		System.out.println(val);
		
		
		//****
		Function<Integer, Integer> addTwo = x -> x+2;
		Function<Integer, Integer> addThree = x -> x+3;
		
		System.out.println(addTwo.andThen(square).apply(5));
	}

}
