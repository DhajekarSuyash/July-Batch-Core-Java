package PreDefinedFunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Test3 {

	public static void main(String[] args) {

		Consumer<String> c = (x) -> {
			String s = x.toLowerCase();
			System.out.println(s.length());
		};

		//c.accept("WEDNESDAY");
		
		//================================================
		List<Integer> list = Arrays.asList(23,12,32,43,54,6,4,234,5);
		
		Consumer<List<Integer>> ca = (x) -> {
			for(int a  : x) {
				System.out.println(a);
			}
		};
		ca.accept(list);
		

	}

}
