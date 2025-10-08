package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntermediateOperator {
	
	public static void main(String[] args) {
		
		
		List<Integer> l = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		// find number divisible by 3 and print it 
		l.stream()
		.filter(condition -> condition % 3 ==0)
		.forEach(x -> System.out.println(x));
		
		//multiply each number by 10 and store it in list
		List<Integer> la = l.stream()
		.map(value -> value * 10)
		.collect(Collectors.toList());
		
		System.out.println(la.toString());
		
		//count numbers less than 5
		 Long count= l.stream().filter(v -> v <5).count();
		System.out.println(count);
		
	}

}
