package CH4;

public class SwitchCase {

	public static void main(String[] args) {
		int ranking = 1;
		char medalColor;
		
		switch(ranking) {
		case 1 : medalColor = 'G';
				break;
		case 2 : medalColor = 'S';
				break;
		case 3 : medalColor = 'B';
				break;
		default: medalColor = 'A';
	
		if(ranking == 1) {
			medalColor = 'G';
		}
			else if(ranking == 2) {
				medalColor = 'S';
			}
			else if(ranking == 3) {
				medalColor = 'B';
			}
			else
			{
				
			
			}
		
		
		}
		
		System.out.println(ranking + "등 메달의 색깔은" + medalColor + "입니다.");

	}

}
