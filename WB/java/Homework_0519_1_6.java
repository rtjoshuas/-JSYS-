package WB.java;

public class Homework_0519_1_6 {

	public static void main(String[] args) {
		int score;
		char grade;
		
		score = 0;
		
		if((score <= 100) && (score >= 90)) {
			System.out.println("Your grade is A");
		}
		else if((score <= 89) && (score >= 80)) {
			System.out.println("Your grade is B");
		}
		else if((score <= 79) && (score >= 70)) {
			System.out.println("Your grade is C");
		}
		else if((score <= 69) && (score >= 60)) {
			System.out.println("Your grade is D");
		}
		else {
			System.out.println("Your are F(ire)");
		}

	}

}
