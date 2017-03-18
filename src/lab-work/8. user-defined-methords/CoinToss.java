/**
* (Coin Tossing) Write an application that simulates coin tossing. Let the program toss a coin each time the user chooses the
* “Toss Coin” menu option. Count the number of times each side of the coin appears. Display the results. The program should 
* call a separate method flip that takes no arguments and returns a value from a Coin enum ( HEADS and TAILS ).
*/

 import java.util.Scanner;
 import java.security.SecureRandom;

 public class CoinToss {
 	private static final SecureRandom randomNumber = new SecureRandom();
 	private enum coin {HEADS, TAILS}; 

 	public static void main(String[] args) {

 		Scanner input = new Scanner(System.in);
		coin coinStatus = coin.HEADS;
		int countTails = 0, countHead = 0;

 		while(true) {
 			System.out.printf("1. PRESS 1 to toss a coin\n2. SHOW FREQUENCY\n3. EXIT\n>> ");
 			int choice = input.nextInt();

 			if(choice==1) {

 			coinStatus = flip();						// flipping the coin
  			if(coinStatus==coin.HEADS)					// counting the frequency
 				++countHead;
 			else
 				++countTails; 

 				System.out.printf("\nYou have got %s\n\n", coinStatus);
 			}
 			else if(choice==2) {
 				System.out.printf("\nFrequency of HEADS is %d & TAILS is %d\n\n", countHead, countTails);
 			}
 			else
 				break;
 		}
 	}

 	public static coin flip() {

		if((1 + randomNumber.nextInt(2))==1)
			return coin.HEADS;
		else
			return coin.TAILS;

 	}
 }