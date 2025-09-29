package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo3 {
	
	public static void main(String[] args) {
		//ways to add data in array list
		List<Integer> l = new ArrayList<Integer>();
		l.add(12);
		System.out.println(l.toString());
		
		List<Integer> la = new ArrayList<Integer>(100);
		la.add(12);
		la.add(78);
		la.add(87);
		
		List<Integer> lb = Arrays.asList(1,2,3,4,5,6,6,7,5);
		
		Integer[] array = {1,2,3,4,5,6,8,7,2,6,7};
		List<Integer> lc = Arrays.asList(array);
		lc.add(789);
				
		
		
		
		
	}

}
