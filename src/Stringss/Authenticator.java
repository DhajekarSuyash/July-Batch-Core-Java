package Stringss;

import java.util.Scanner;

public class Authenticator {

	public static void main(String[] args) {
		
		// 1. input from scanner -> username and password in string
		//2. validate if password and username are correct
		//3. if yes -> login successful
		//4. if no -> invalid username // invalid password
		//			-> 
		
		 String u = "irise";
		 String p = "abc";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username : ");
		String username=  sc.next();
		System.out.println("Enter Password : ");
		String password = sc.next();
		
		if(u.equals(username) && p.equals(password)) {
			System.out.println("Login successful");
		}
		else {
			System.out.println("Login Failed!!!");
			if(!u.equals(username)) {
				System.out.println("Enter valid Username");
			}
			if(!p.equals(password)) {
				System.out.println("Enter valid Password");
			}
			
			
		}
		
		
		
	}
}
