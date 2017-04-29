/**
* (Dice Rolling) Write an application to simulate the rolling of two dice. The * application should use an object of class Random once to roll the first die 
* and again to roll the second die. The sum of the two values should then be 
* calculated. Each die can show an integer value from 1 to 6, so the sum of 
* the values will vary from 2 to 12, with 7 being the most frequent sum, and 2 
* and 12 the least frequent. Your application should roll the dice 36,000,000 
* times. Use a one-dimensional array to tally the number of times each 
* possible sum appears. Display the results in tabular format.
*/

import java.security.SecureRandom;

public class DiceRollingTest {
	public static void main(String[] args) {
		SecureRandom random = new SecureRandom();
		int frequency[] = new int[11];
		int diceSum = 0;

		for(int count = 0; count < 36000; count++) {
			int dice1 = 1 + random.nextInt(6); 		// Roll dice 1
			int dice2 = 1 + random.nextInt(6);   	// Roll dice 2
			diceSum = dice1 + dice2;
			switch(diceSum) {
				case 2 : 
					++frequency[0];
					break;
				case 3 :
					++frequency[1];
					break;
				case 4 : 
					++frequency[2];
					break;
				case 5 :
					++frequency[3];
					break;
				case 6 : 
					++frequency[4];
					break;
				case 7 :
					++frequency[5];
					break;
				case 8 : 
					++frequency[6];
					break;
				case 9 :
					++frequency[7];
					break;
				case 10 : 
					++frequency[8];
					break;
				case 11 :
					++frequency[9];
					break;		
				case 12 :
					++frequency[10];
					break;
				default :
					break;		
			}
		}

			for(int count = 0; count < 11; count++) {
				System.out.println("Frequency of " + (count+2) + " = " +
					frequency[count]);
			}
	}
}