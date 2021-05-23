import java.util.Scanner;

public class AbcArraysAlgorithm {

public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	int countLine = sc.nextInt();
	int strLine = countLine;
	int s = 0;
	
	char[] abc = new char[26];
	char ch = 'A';	
	
	for(int i = 0; i < abc.length; i++, ch++) {
		abc[i] = ch;
	}
	
	for(int i = 0; i < countLine; i++){
	
		for(int j = 0; j < strLine; j++, s++) {
		System.out.print(abc[s]);
		
	}

		strLine -= 1;
		System.out.println();
	}
	
	}

}
