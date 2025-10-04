package PreDefinedFunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test7 {

	public static void main(String[] args) {
		
		List<Integer> l = Arrays.asList(12,32,43,54,23,4,323,124,534,23,3);

		
//		List<Integer> evenList = l.stream().filter((x) -> x% 2 ==0 ).collect(Collectors.toList());
//		
//		System.out.println(evenList.toString());
		
		l.stream().forEach(x -> System.out.println(x));
		
		
		
		
		
		
//		List<Integer> evenNoList =  new ArrayList<Integer>();
//		
//		for(int a : l) {
//			if(a % 2 == 0) {
//				evenNoList.add(a);
//			}
//		}
//		
//		System.out.println(evenNoList.toString());
		
		
		
	}
}
