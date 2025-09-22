package collections;

import java.util.ArrayList;
import java.util.List;

// Store even numbers from 1 to 20 in a list and print list using for each loop
public class TrickyOne {
	
	public static void main(String[] args) {
		//1. numbers 1 - 20 -> Done
		//2. filter even number -> Done
		//3. store even number in list -> Done
		//4. print list
		
		List<Integer> evenNoList = new ArrayList<Integer>();
		//2,4 ....s
		
		for(int i = 1 ; i <= 20 ; i++) {
			if(i % 2 ==0) {
					// every i is even number and need to add it in a list
				evenNoList.add(i);
			}
		}
		
		for(int x : evenNoList) {
			System.out.println(x);
		}
	}

}
