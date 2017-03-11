/**
* An application to roll a dice 6 million times and display the frequency of each number.
*/

 import java.security.SecureRandom;

 public class rollDice {
 	public static void main(String[] args) {

 		SecureRandom randomNumber = new SecureRandom();

 		int frequency[] = new int[6];

 		// Generation 6 million random rolls
 		for(int counter = 1; counter<6000000; counter++) {

 			int face = 1 + randomNumber.nextInt(6);

 			// Saving randomly generated rolls
 			switch(face)
 			{
 				case 1 :
 					++frequency[0];
 					break;
 				case 2 :
 					++frequency[1];
 					break;
 				case 3 :
 					++frequency[2];
 					break;
 				case 4 :
 					++frequency[3];
 					break;
 				case 5 :
 					++frequency[4];
 					break;
 				case 6 :
 					++frequency[5];
 					break;
 			} // End of Switch 
 		} // End of for

 		for(int i=0; i<6; i++) {
 			System.out.printf("frequency of %d : %d\n",i+1,frequency[i]);
 		}
 	}
 }