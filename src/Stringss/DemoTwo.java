package Stringss;

public class DemoTwo {

	public static void main(String[] args) {
		// using literals
		//SCP -> if value is same it wont repeat
		String  s = "suyash";
		String s1 = "suyash";
		String s2 = "Irise";
//		System.out.println(s.equals(s1));
//		System.out.println(s == s1);
//		System.out.println(s2 == s1);
//		
		
		//using new keyword
		//in heap -> values will repeat for every string
		
		String a = new String("irise");
		String a1 = new String("irise");
		System.out.println(a.equals(a1));
		System.out.println(a==a1);
		
		
		
		
		
		
		
		
		
		

		// using new keyword
//		String s2 = new String("suyash");
//
//		boolean flag = s.equals(s2);
//		System.out.println(flag);
//		System.out.println(s==s2);
	}

}
