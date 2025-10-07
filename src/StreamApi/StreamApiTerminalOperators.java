package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamApiTerminalOperators {

	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(198, 32, 33, 4, 54, 65, 78, 28, 19, 10);

		// 1. Print using for each
		// l.stream().forEach(x -> System.out.println(x));

		// 2. skipping element and storing in list
		List<Integer> la = l.stream().skip(5).toList();
		System.out.println(la.toString());

		// 3. count
		Long count = l.stream().count();
		System.out.println("Count is : " + count);

		// 4. collect
		Set<Integer> s = l.stream().collect(Collectors.toSet());

		// 5 . Any match
		boolean flag = l.stream().anyMatch(y -> y > 100);
		System.out.println(flag);

		// 6. All match
		boolean flag2 = l.stream().allMatch(z -> z > 10);
		System.out.println(flag2);

		//7. None match
		boolean flag3 = l.stream().noneMatch(w -> w == 32);
		System.out.println(flag3);
	}

}
