package Inheritance;

public class Demo {

	public static void main(String[] args) {

		// variables
		Tiger t = new Tiger();
		System.out.println(t.a);
		System.out.println(t.b);

		Animal aa = new Tiger();
		System.out.println(aa.d);
		System.out.println(aa.a);

		// //parent object
//		//Animal a = new Animal();
////		a.printName();
////		a.printAge();
//		
//		//child Object
//		//Tiger t = new Tiger();
////		t.printName();
////		t.printAge();
////		t.printColor();
//
//		//Parent- child Object
//		Animal aa = new Tiger();
//		aa.printName();
//		aa.printAge();

	}
}
