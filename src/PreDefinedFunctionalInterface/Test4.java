package PreDefinedFunctionalInterface;

import java.util.function.Supplier;

//Supplier
public class Test4 {

	public static void main(String[] args) {
		Supplier<Integer> s = () -> {
			return 25;
		};
		int b = s.get();
		System.out.println(b);
	}
}
