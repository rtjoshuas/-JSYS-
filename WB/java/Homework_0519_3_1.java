package WB.java;

import java.util.Scanner;

public class Homework_0519_3_1 {

	public static void main(String[] args) {
		Scanner scanw = new Scanner(System.in);
		Scanner scanh = new Scanner(System.in);
		while(true) {
		int weight = scanw.nextInt();
		int height = 0;
		
		if(weight > 0) {
			height = scanh.nextInt();
		}
		
		int total = (weight+100-height);
		if(total > 0) {
			System.out.println("비만");
		}
		else {
			System.out.println("비만 수치 미만");
		}
		
		}
//		System.out.println(total);
		
		
		
		
		
				
			
		
		
		
		}

	

}
	
	