package PreDefinedFunctionalInterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

//Combined Example
public class Test5 {
	
	public static void main(String[] args) {
		
		Predicate<Integer> predicate = x -> x%2 ==0;
		
		Function<Integer, Integer> function = x -> x*x;
		
		Consumer<Integer> consumer = x  -> System.out.println(x);
		
		Supplier<Integer> supplier = () -> 10;
		
		//if number is even then sqaure it and print it
		
		if(predicate.test(supplier.get())) {
			consumer.accept(function.apply(supplier.get()));
		}
		
		
	}

}
