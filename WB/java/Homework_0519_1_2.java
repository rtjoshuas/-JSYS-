package WB.java;

import java.util.Scanner;

public class Homework_0519_1_2 {

	public static void main(String[] args) {

		int dan;
				
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a dan");
		dan = scan.nextInt();
		
		for(int times = 1; times < 10; times++) {
			
			if(dan % 2 == 0) {
				System.out.println(dan * times);
			}
			else {
				System.out.println("짝수만 입력");
				break;
			}
		
			
			
		}

	}		// 구구단을 짝수 단만 출력

}
