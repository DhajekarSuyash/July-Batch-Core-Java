package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {
	public static void main(String[] args) {
		
		List<Integer> l = Arrays.asList(198,32,33,4,54,65,78,28,19,10);
		
		//iteration -> foreach -> terminal operator
		l.stream().forEach(x -> System.out.println(x));
		
		l.stream().forEachOrdered(x -> System.out.println(x));
		
		Long count = l.stream().count();
		System.out.println(count);
		
		l.stream().collect(Collectors.toSet());
		
		
	
		
		
		
//		for(int a :list) {
//			if(a % 2 ==0 ) {
//				System.out.println(a);
//			}
//		}
	}
	

}
