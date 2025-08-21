package Stringss;

public class Demo {

	public static void main(String[] args) {
		
		String s = "IrISE institute";
		
		System.out.println(s.length());
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		char c = s.charAt(1);
		System.out.println(c);
		
		System.out.println(s.concat(" Pune"));
		
		System.out.println(s.endsWith("e"));
		System.out.println(s.startsWith("Iri"));
		int i = s.indexOf('E');
		System.out.println(i);
		
		System.out.println(s.contains("institute"));
		
		System.out.println(s.isEmpty());
		
		
	}
}
