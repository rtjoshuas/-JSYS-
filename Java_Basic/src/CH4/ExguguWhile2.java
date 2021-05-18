package CH4;

import java.util.Scanner;

public class ExguguWhile2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int dan;
		int i = 1;
		System.out.println("단을 입력하여라.");
		dan = sc.nextInt();
		
		while(i < 10) {
			System.out.println(dan + " * " + i + " = " + dan * i);
			
			i++;
			
		}
		System.out.println("결과 출력 완료");
	}

}
