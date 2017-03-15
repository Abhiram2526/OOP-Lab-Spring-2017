/** (Guess the Number) An application that plays "guess the number" as follows: This program chooses the number to be guessed 
* by selecting a random integer in the range 1 to 1000. The application displays the prompt Guess a number between 1 and 1000 . 
* The player inputs a first guess. If the player's guess is incorrect, this program displays Too high. Try again. or Too 
* low. Try again. to help the player “zero in” on the correct answer. The program prompts the user for the next guess.
* When the user enters the correct answer, display Congratulations. You guessed the number! , and allow the user to choose
* whether to play again.
*/

 import java.util.Scanner;
 import java.security.SecureRandom;

 public class guessTheNumber {
 	private static final SecureRandom randomNumber = new SecureRandom();
 	private static final Scanner input = new Scanner(System.in);

 	public static void main(String[] args) {

 		while(true) {
 		System.out.println("\n\t\t\t  GUESS THE NUMBER GAME\n");
 		System.out.printf("\n1. PLAY\n2. EXIT\n>>");
 		int choice = input.nextInt();

 		if(choice == 1)
 			guessNumberGame();
 		else
 			break;	
 		}
 		
 	}

 	// guessNumberGame() methord 
 	public static void guessNumberGame() {
 		int generatedGuess = 1 + randomNumber.nextInt(1000);
 		while(true) {

 			System.out.printf("\nEnter Your Guess (Between 1-1000) : ");
 			int userGuess = input.nextInt();

			if((userGuess!=generatedGuess)&&((userGuess - generatedGuess)>50)) {
 				System.out.println("Your guess is TOO HIGH. Try Again.");
 			}
 			if((userGuess!=generatedGuess)&&((userGuess - generatedGuess)<50))
 				System.out.println("Your guess is TOO LOW. Try Again.");
 			if((userGuess - generatedGuess)==0)
 			{
 				System.out.println("\n\t\t\t  CONGRATULATIONS YOU WON!!!\n\n");
 				System.out.printf("PRESS 1 to PLAY AGAIN or 2 to EXIT\n>>");
 				int choice = input.nextInt();
 				if(choice==1)
 					guessNumberGame();
 				else
 					break;

 			}
 		} 
 	}

 }