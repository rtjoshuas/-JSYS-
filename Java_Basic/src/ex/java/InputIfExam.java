package ex.java;

import java.util.Scanner;

public class InputIfExam {

	public static void main(String[] args) {
		// 실습
		// 숫자가 0, -부호가 아니면 숫자 출력
		// 0, - 부호면 경고 메세지 "양수 입력하세요."
		// 종료
		
		//Scanner, if statement  사용
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자 입력");
		String a = scanner.nextLine();
				
		int a1 = Integer.parseInt(a);
		
		
		if(a1 >= 0){
			System.out.println(a);			
		}
		else {
			System.out.println("양수 입력하세요");
		}

	}

}
