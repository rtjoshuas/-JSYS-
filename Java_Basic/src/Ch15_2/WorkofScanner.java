package Ch15_2;

import java.util.Scanner;

public class WorkofScanner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수1: ");
		String a1 = scanner.nextLine();
		System.out.println("정수2: ");
		String b1 = scanner.nextLine();
		System.out.println("정수3: ");
		String c1 = scanner.nextLine();
		
		int a = Integer.parseInt(a1);
		int b = Integer.parseInt(b1);
		int c = Integer.parseInt(c1);
		
		int sum = a + b + c;
		System.out.println(sum);
		int avg = sum / 3;
		System.out.println(avg);
		

	}

}
