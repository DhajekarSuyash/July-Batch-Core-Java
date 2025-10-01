package PreDefinedFunctionalInterface;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class Test6 {
	public static void main(String[] args) {
		
		BiPredicate<Integer, Integer> b = (x,y) -> {
			int a = (x+y)/2;
			return a %2 ==0;
		};
		
		 Boolean val = b.test(12, 12);
		System.out.println(val);
		//----------------------
		BiConsumer<String, String>  biConsumer = (x,y) -> {
			System.out.println(x);
			System.out.println(y);
			System.out.println(x+y);
		};
		
		biConsumer.accept("Irise", "Institue");
		
		
		
		
		
		
		//-------------------------
		BiFunction<Integer, Integer, Integer> biFunction = (x,y) -> {
			int sum = x+y;
			return sum;
		};
		 int sum = biFunction.apply(23, 50);
		System.out.println(sum);
		
	}
	
	
	

	
	
	

}
