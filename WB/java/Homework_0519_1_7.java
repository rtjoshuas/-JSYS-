package WB.java;

import java.util.Scanner;

public class Homework_0519_1_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int floor = sc.nextInt();
		
	switch(floor) {
	case 1 :
		System.out.println("1층 약국 입니다.");
		break;
	case 2 :
		System.out.println("2층 정형외과 입니다.");
		break;
	case 3 :
		System.out.println("3층 피부과 입니다.");
		break;
	case 4 :
		System.out.println("4층 치과 입니다.");
		break;
	case 5 :
		System.out.println("5층 헬스장 입니다.");
		break;
		
		default :
			System.out.println("Please try again");
			break;
	}

	}

}

	

