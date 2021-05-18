package ex.java;

import java.util.Scanner;

public class Exam {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a Number");
		String a = scanner.nextLine();
		
		int a1 = Integer.parseInt(a);
		
		
		if(0 < a1) {
			System.out.println(a);
			
			
		}
		
		else if (0 > a1) {
			System.out.println("Bye");
			
			System.out.println("Enter a number");
			
			String b = scanner.nextLine();
			System.out.println(b);
			
		}
		
		
		
		// 다시 물어볼 것
		
	}
	
	
	
	


}
