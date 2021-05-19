package WB.java;

import java.util.Scanner;

public class Homework_0519_2 {
	
	public static void main(String[] args) {
		Scanner scanfn = new Scanner(System.in);
		Scanner scanma = new Scanner(System.in);
		Scanner scansn = new Scanner(System.in);
				
		int FirstNumber;
		String math;
		int SecondNumber;
				
		System.out.println("피연산자 입력 : ");
		FirstNumber = scanfn.nextInt();
//		System.out.println(FirstNumber);
		
		System.out.println("연산자 입력 : ");
		math = scanma.nextLine();
//		System.out.println(math);

		System.out.println("마지막 피연산자 입력 : ");
		SecondNumber = scansn.nextInt();
//		System.out.println(SecondNumber);
		
		switch(math) {
		case "+" :
			System.out.println("결과 : " + (FirstNumber+SecondNumber));
		break;
		case "-" :
			System.out.println("결과 : " + (FirstNumber-SecondNumber));
		break;
		case "*" :
			System.out.println("결과 : " + (FirstNumber*SecondNumber));
		break;
		case "/" :
			System.out.println("결과 : " + (FirstNumber/SecondNumber ));
		break;
		}
		
//		System.out.println("결과 = " + (FirstNumber + math + SecondNumber));
				
		


	}

}
