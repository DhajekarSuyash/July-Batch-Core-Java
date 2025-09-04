package TaskOops;

import java.util.Scanner;

public class demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please select operation : ");
		System.out.println("1. Addition");
		System.out.println("2. Substraction");
		int operationId = sc.nextInt();

		System.out.println("Enter number of varibales less than 4 need to operate");
		int numberOfVariables = sc.nextInt();

		Calculator c;
		// operation id = 1 or = 2 and nov =2
		if (numberOfVariables == 2) {
			if (operationId == 1) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				c = new Addition();
				c.addition(a, b);
			} else if (operationId == 2) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				c = new Substraction();
				c.substraction(a, b);
			}
		}
		else if(numberOfVariables > 2 && numberOfVariables < 4) {
			if(operationId == 1) {
				Addition a = new Addition();
				
			}
			else if(operationId == 2) {
				Substraction s = new Substraction();
				
			}
		}

	}

}
