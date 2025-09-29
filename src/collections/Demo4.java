package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Demo4 {
	
	public static void main(String[] args) {
		
		// allows duplicate, maintains seq, allows null
		
		
		List<Integer> l = new ArrayList<Integer>();
		l.add(12);
		l.add(15);
		l.add(12);
		l.add(null);
		System.out.println(l.toString());
		
		
		List<Integer> la = new LinkedList<Integer>();
		la.add(12);
		la.add(15);
		la.add(12);
		la.add(null);
		System.out.println(la.toString());
		
		//Hashset -> seq not maintained, duplicate not allowed, 1 null allowed
		Set<Integer> s = new HashSet<Integer>();
		s.add(123);
		s.add(-32432);
		s.add(7889);
		s.add(454532);
		s.add(123);
		s.add(null);
		System.out.println(s.toString());
		
		// LinkedHashSet -> insert seq maintained, duplicacy NA,
		Set<Integer> sa = new LinkedHashSet<Integer>();
		sa.add(123);
		sa.add(null);
		sa.add(-32432);
		sa.add(7889);
		sa.add(454532);
		sa.add(123);
		System.out.println(sa.toString());
		
		//Treeset - sorted order, no null values allowed,
		Set<Integer> sb = new TreeSet<Integer>();
		sb.add(123);
		sb.add(-32432);
		//sb.add(null);
		sb.add(7889);
		sb.add(123);
		sb.add(454532);
		System.out.println(sb.toString());
		
		
	}

}
