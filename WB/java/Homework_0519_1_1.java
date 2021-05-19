package WB.java;

public class Homework_0519_1_1 {

	public static void main(String[] args) {
	
        int num1 = 10;
		int num2 = 2;
		char operator = '+';
		
		if(operator == '+') {
			System.out.println(num1+num2);
		}
		else if(operator == '-') {
			System.out.println(num1-num2);
		}
		else if(operator == '*') {
			System.out.println(num1*num2);
		}
		else {
			System.out.println(num1/num2);
		} 
		
	}	// operation 값이 + - * / 인 경우에 사칙 연산을 수행하는 프로그램
}
		