package Ch15_2;

import java.util.Scanner;

//import java.util.Scanner;  외부 자료 소스를 가져옴

public class ScannerTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //  class 와 (매개변수)
		
		// java.lang : 기본 패키지
		 String s = new String(); // 기본 패키지에 있는
		
		System.out.println("이름: ");
		String name = scanner.nextLine();
		System.out.println("직업: ");
		String job = scanner.nextLine();
		System.out.println("사번: ");
		int num = scanner.nextInt();
		
		System.out.println(name);
		System.out.println(job);
		System.out.println(num);

	}

}
