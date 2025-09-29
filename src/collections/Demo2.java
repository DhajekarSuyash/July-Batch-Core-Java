package collections;

import java.util.ArrayList;
import java.util.List;

public class Demo2 {
	
	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<Integer>();
		
		System.out.println(l.size());
		
		
		l.add(11);
		l.add(21);
		l.add(31);
		l.add(41);
		l.add(51);
		l.add(61);
		
		System.out.println(l.get(2));
		
		
//		
//		System.out.println(l.indexOf(21));
//		
//		
//		
//		for( int a : l ) {
//			System.out.println(a);
//		}
		
	}

}
