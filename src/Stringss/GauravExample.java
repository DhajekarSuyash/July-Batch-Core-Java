package Stringss;

public class GauravExample {
	public static void main(String[] args) {
		
		
		
		
		String v = "abc";
		String w = "abc";
		String x = "abc";
		String y = "abc";
		
		
		
		
		
		
		
		

		String s = "irise";
		String s1 = "irise";
		// s == s1 -> true
		// s.equals(s1) -> true
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1));

		s = s.toUpperCase();
		s1 = s.toUpperCase();
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1));
		//s.equals(s1)  -> true
		//s == s1 -> 
		
		System.out.println(s == s1);

	}

}
