package WB.java;

import java.util.Scanner;

public class Homework_0519_1_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int dan;
				
		System.out.println("Typing Number");
		dan = scan.nextInt();
		
		for(int times = 1; times < 10; times++) {
		
		if(dan >= times) {
			System.out.println(dan * times);
			}
				
		}  // 구구단을 단보다 곱하는 수가 작거나 같은 경우까지만 출력

	}

}
