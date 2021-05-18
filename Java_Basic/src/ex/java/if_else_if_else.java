package ex.java;

import java.util.Scanner;

public class if_else_if_else {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a Number");
		String a = scanner.nextLine();
		
		int a1 = Integer.parseInt(a);
		
		if(0 < a1) {
			System.out.println("양수");
		}
		else if(0 > a1) {
			System.out.println("음수");
		}
		else {
			System.out.println("0 입니다.");
		}

	}

}
