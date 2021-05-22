
public class rhombusEx {

	public static void main(String[] args) {
		int lineCount = 7;
		int spaceCount = lineCount / 2; 
		int starCount = 1;
		
		for(int i = 0; i < lineCount; i++) {
			for(int j = 0; j < spaceCount; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < starCount; j++) {
				System.out.print("*");
			}
			
			if (i < lineCount / 2) {
			spaceCount -= 1;
			starCount += 2;
			System.out.println();
			}
			
			else {
			spaceCount += 1;
			starCount -= 2;
			}
			
	//		for(int j = 0; j < spaceCount; j++) {
	//		System.out.print(" ");
	//	}
			
			
		}
	/*	lineCount = 3;
		spaceCount = 1;
		starCount = 5;
			
			for(int i = 0; i < lineCount; i++) {
			for(int j = 0; j < spaceCount; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < starCount; j++) {
				System.out.print("*");
			}*/
	//		for(int j = 0; j < spaceCount; j++) {
	//			System.out.print(" ");
	//		}
	//		spaceCount += 1;
	//		starCount -= 2;
	//		System.out.println();
	//	}
		
	}

}
