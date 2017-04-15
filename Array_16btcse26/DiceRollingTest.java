import java.security.SecureRandom;

class DiceRolling {	
	private int num1;
	private int num2;
	private int sum;
	private int[] count = new int[11];

	private void calculate() {
		SecureRandom rn =  new SecureRandom();
		
		for(int i=0;i<36000000;++i) {
			do {
				num1 = rn.nextInt(7);	
				num2 = rn.nextInt(7); 
			} while(num1==0 && num2==0);
			sum = num1 + num2;
			switch(sum) {
				case 2:
					++count[0];
					break;
				case 3:
					++count[1];
					break;
				case 4:
					++count[2];
					break;
				case 5:
					++count[3];
					break;
				case 6:
					++count[4];
					break;
				case 7:
					++count[5];
					break;
				case 8:
					++count[6];
					break;
				case 9:
					++count[7];
					break;
				case 10:
					++count[8];
					break;
				case 11:
					++count[9];
					break;
				case 12:
					++count[10];
					break; 
			}	
		} 	
	}
	void displayTable() {
		calculate();

		System.out.println("|| Dice Rolling ||\n");
		System.out.println("Sum		Frequency");
		for(int i=0;i<11;++i) {
			System.out.println( (i+2)+ "		" +count[i] );
		}
	}
}
public class DiceRollingTest {
	public static void main(String[] args) {
		DiceRolling dr =  new DiceRolling();
	
		dr.displayTable();		
	}
}