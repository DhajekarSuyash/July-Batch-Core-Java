package staticKeyword;

public class Demo {

	public static void main(String[] args) {
		   String fName = "Kajal";
	        String lName = "Jagtap";
	        int YOB = 1998;

	       char a = lName.charAt(0);
	       
	       //1998 -> op 98
	        int b = YOB % 100;
	        
	        //a + fName + b
	         String userName = a + fName + b;

	         System.out.println(userName);

	}
}
