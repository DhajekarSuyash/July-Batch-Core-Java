package Stringss;

public class DemoThree {
	public static void main(String[] args) {
		// String is immutable in java
		
		//a
		String s = "irise";
		System.out.println(System.identityHashCode(s)); // point to lower case irise
		//b
		s = s.toUpperCase();
		System.out.println(System.identityHashCode(s));
		//c
		s = s.toLowerCase();
		System.out.println(System.identityHashCode(s));

		System.out.println(s);

//		System.out.println(System.identityHashCode(s));
//		System.out.println(s);
//		System.out.println(System.identityHashCode(a));
//		System.out.println(a);

//		String s = new String("irise");
//		String a = s.toUpperCase();
//		System.out.println(System.identityHashCode(s));
//		System.out.println(s);
//		System.out.println(System.identityHashCode(a));
//		System.out.println(a);

//		String s = "apple"; //scp
//		String s1 = "apple";
//		String s2 = new String("apple");//heap outside scp
//		String s3 = new String("apple");
//		
//		System.out.println(System.identityHashCode(s));
//		System.out.println(System.identityHashCode(s2));
//		
//		System.out.println(s == s2);
//		System.out.println(s.equals(s2));

	}

}
