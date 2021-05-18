package CH4;

public class IfStatementExam {

	public static void main(String[] args) {
		int age = 10;
		// 조건1
		
		if(age >= 8) {
			System.out.println("8세 이상");
			
		}
		else { // 조건이  false
			System.out.println("8세 이하");
		}
		
		
		// 복합 조건
		int age2 = 9;
		// 8상 이상이고 10보다 큰
		if((age >= 8) && (age2 > 10)) {
			System.out.println("8세 - 9세");
		}
		else {
			System.out.println("8세 이하");
		}
		
		
	}

	

}
