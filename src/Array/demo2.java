package Array;

public class demo2 {
	
	public static void main(String[] args) {
		//homogeneous array
		
		
		//System.out.println(roleNo[1]);
		//0,1,2,3,4
		//array has fixed length  = 5, 
		//we can nnot increase length of array
		// new roll no = 16
//		roleNo[5] = 16;
//		System.out.println(roleNo[5]);
		
		//Real time example
		
		// hetero array - elements of different datatype
		
		// Parent of all classes is Object class
		// every class is dereived from object class
		// we can store all primitive and non primitive datatypes in Object[class]
		
		Object[] heteroArray = {12,"ss",23.33, false};
	//	System.err.println(heteroArray[3]);
		
		
		int[] roleNo = {11,12,13,14,15};
		//System.out.println(roleNo.length);
		
		for(int i = 0; i < roleNo.length ; i++   ) {
			//roleNo[4]
			//System.out.println(roleNo[i]);
		}
		// i = 0 , rn = 11
		//i = 1 , rn = 12
		
		//rollNo.length = 5
		for(int i = roleNo.length-1 ; i >= 0 ; i --) {
			System.out.println(roleNo[i]);
		}
		
		// find odd numbers from roll no array -> homework
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
