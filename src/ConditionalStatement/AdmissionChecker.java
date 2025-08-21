package ConditionalStatement;

public class AdmissionChecker {
	public static void main(String[] args) {
		int maths = 1;
		int science = 2;
		int english = 5;
		int age = 19;
		
		int totalMarkss = maths + science + english;
		//1. age>17
		//2. every subject marks > 50
		//3. Total marks > 160
		if(age>17) {
			if(maths>50 && science > 50 && english >50 ) {
				if(totalMarkss >= 160) {
					System.out.println("Eligible for admission");
				}
				else {
					System.out.println("Not eligible due to total marks <= 160");
				}
			}
			else {
				//Task -> print which subject has marks less than 50
				System.out.println("Not eligible bcoz one of subject has marks less than 50");
				if(maths < 50) {
					System.out.println("maths has less than 50 marks");
				}
				if(science < 50) {
					System.out.println("science has less than 50 marks");
				}
				if(english < 50) {
					System.out.println("english has less than 50 marks");
				}
			}
		}
		else {
			System.out.println("Not eligible for admission for age less than 17");
		}
		
	}

}
