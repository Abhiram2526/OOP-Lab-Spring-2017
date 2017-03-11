/**
* An application to roll a dice 20 times randomly and display the outcome
*/

 import java.security.SecureRandom;


 public class dice {
 	public static void main(String[] args) {

 		SecureRandom randomNumber = new SecureRandom();

 		for(int counter = 1; counter<=20 ; counter++) {

 			System.out.println(1 + randomNumber.nextInt(6));
 		}

 	}
 }