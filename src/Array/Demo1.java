package Array;

public class Demo1 {
	
	public static void main(String[] args) {
		int z;
		int a =1;
		int b = 2;
		int c = 3;
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
		
		//non primitive -> Array
		
		int[] aa = {12,23,96,35,45,24};
		// index based storage -> Starting index = 0
		// at index =0 -> 12
		
//		System.out.println(aa[0]);
//		System.out.println(aa[1]);
//		System.out.println(aa[2]);
//		System.out.println(aa[3]);
//		System.out.println(aa[4]);
//		System.out.println(aa[5]);
		//System.out.println(aa[6]); - it will throw exception
		
		String[] arr = {"abc","xyz"};
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
		
		
		//Part 2 -> insertion of elements in array
		// step 1 -> declaration of array (arrayType-int , arrayLength = )
		int[] rollNo = new int[3];
		//step 2-> add elements in array
		rollNo[1]=13;
		rollNo[2]=14;
		rollNo[0] =12;
		//step 3-> print elements
		System.out.println(rollNo[0]);
		System.out.println(rollNo[1]);
		System.out.println(rollNo[2]);
		
		//using part1 and part2
		// create a string,int, boolean and double array 
	}

}
