package collections;

import java.util.ArrayList;
import java.util.List;

public class Demo {
	
	public static void main(String[] args) {
		
		//Collections -> group of entities or elements of datatype
		// Arrays ->  storing elements
		// hierrarchy of collections
		
		//TODO -
		// List , Set and Map [types]-
		// ways to insert and iterate elements
		// Java 8 -> Lambda function [1 session -> 4-5 hours]
		
		
		//Prerequisite
		// Oops -> inheritance and abstraction
		
		//List -> ArrayList and LinkedList - IW
		
	//----------------------------------------------------
	//LIST
		//animal -p and lion -c
		// Parent p = new Child();
		// <> -> diamond braces -> Generics -> determines which type of elements to
		// be added in a collection
		
		
		String a = "xyz";
		String b = "abc";
		String c = "pqr";
		
		//with generic [with diamond braces]
		List<String> l = new ArrayList<String>();
		// add elements to list
		l.add("abc");
		l.add("xyz");
		l.add("pqr");
	//	l.add(1232); -> not allowed
		
		System.out.println(l.toString());
		
		// Convert every element in list 'l' to upper case.
		// to achieve this we need to take out every element one by one
		// for loop ->>>>>> iteration -> take out an element from collection
		
		// for-each loop
		for(String v : l) {
			System.out.println("using for each loop : " +v.toUpperCase());
			
		}
		
		
		
		
		
		
		
		
		
		
		
		// without generics
		List la = new ArrayList();
		la.add("pune");
		la.add(1234);
		la.add(false);
		
		System.out.println(la.toString());
		
		
		
		
		
		
		
		
		
	}

}
