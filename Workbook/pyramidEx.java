
public class pyramidEx {



public static void main(String[] args) {

	int lineCount = 4;
	int spaceLine = lineCount / 2 + 1;
	int starLine = 1;

	for(int i = 0; i < lineCount; i++) {
		
		for(int j = 0; j < spaceLine; j++) {
			System.out.print(" ");	
		}
		for(int j = 0; j < starLine; j++) {
			System.out.print("*");
		}
		for(int j = 0; j < spaceLine; j++) {
			System.out.print(" ");
		}
		
		System.out.println();

		spaceLine -= 1;
		starLine += 2;	
		

	}

}
}
