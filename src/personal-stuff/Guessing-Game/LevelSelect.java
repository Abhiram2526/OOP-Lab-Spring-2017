/*
 * Guess Me v0.1
 *
 * In this game user have to guess a number in the range
 * of 1-1000. It gives use hint to do so until he/she
 * gets the correct answer.
 *
 * This game is influenced by Java lab assignment
 * (Guess The Number).
 *
 * Copyright (C) 2017 Batakrishna Sahu
 *
 * Author: Batakrishna Sahu <batakrishna.sahu@suiit.ac.in>
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License version 3 as
 * published by the Free Software Foundation.
 */

 import java.util.Scanner;
 import java.security.SecureRandom;

 public class LevelSelect {
 	
 	/* SecureRandom & Scanner class */
 	private static final SecureRandom randomNumber = new SecureRandom();
 	private static final Scanner input = new Scanner(System.in);

 	/* Stores the Player Score */
 	private static int playerScore = 0;

 	/* Color codes for Text */
 	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";
	
	/* Level Select Menu */
	void levelSelectMenu() {
		System.out.println("\n\n\t\t\tSELECT LEVEL");
		System.out.printf("\t\t\t1.EASY\n\t\t\t2.NORMAL\n\t\t\t3.INSANE\n\t\t\t> ");
		int choice = input.nextInt();
		switch(choice) {
			case 1 : 
				System.out.println("\n\t\t\tGet Ready Kid");
				easyLevel();
				break;
			case 2 :
				System.out.println("\n\t\t\tGet Ready to Guess");
				normalLevel();
				break;
			case 3 :
				System.out.println("\n\t\t\tGet Ready to DIE");
				insaneLevel();
				break;
			default :
				System.out.println("\n\t\t\tINVALID INPUT. NORMAL LEVEL SELECTED.");
				normalLevel();
				break;
			}
		}

	/* Easy Level */
	void easyLevel() {
		int generatedGuess = 1 + randomNumber.nextInt(1000);
 		while(true) {

 			System.out.printf("\nEnter Your Guess (Between 1-1000) : ");
 			int userGuess = input.nextInt();

			if((userGuess!=generatedGuess)&&((userGuess - generatedGuess)>20)) {
 				System.out.println("Your guess is TOO HIGH. Try Again.");
 			}
 			if((userGuess!=generatedGuess)&&((userGuess - generatedGuess)<20)) {
 				System.out.println("Your guess is TOO LOW. Try Again.");
 			}
 			if((userGuess - generatedGuess)==0) {
 				win();
 			}
 			playerScore += 10;			// 100-n*10 points for easy level
 		}			
	}

	/* Normal Level */
	void normalLevel() {
		int generatedGuess = 1 + randomNumber.nextInt(1000);
 		while(true) {

 			System.out.printf("\nEnter Your Guess (Between 1-1000) : ");
 			int userGuess = input.nextInt();

			if((userGuess!=generatedGuess)&&((userGuess - generatedGuess)>50)) {
 				System.out.println("Your guess is TOO HIGH. Try Again.");
 			}
 			if((userGuess!=generatedGuess)&&((userGuess - generatedGuess)<50)) {
 				System.out.println("Your guess is TOO LOW. Try Again.");
 			}
 			if((userGuess - generatedGuess)==0) {
 				win();
 			}
 			playerScore += 5;			// 100-n*5 points for easy level
 		}
	}

	/* Insane Level */
	void insaneLevel() {
		int generatedGuess = 1 + randomNumber.nextInt(1000);
 		while(true) {

 			System.out.printf("\nEnter Your Guess (Between 1-1000) : ");
 			int userGuess = input.nextInt();

			if((userGuess!=generatedGuess)&&((userGuess - generatedGuess)>100)) {
 				System.out.println("Your guess is TOO HIGH. Try Again.");
 			}
 			if((userGuess!=generatedGuess)&&((userGuess - generatedGuess)<100)) {
 				System.out.println("Your guess is TOO LOW. Try Again.");
 			}
 			if((userGuess - generatedGuess)==0) {
 				win();
 			}
 			playerScore += 2;			// 100-n*2 points for easy level
 		}
 	}


	/* Win Message */
	void win() {
		System.out.println(ANSI_CYAN + "\n\t\t\tCONGRATULATIONS YOU WON!!!\n\n" + ANSI_RESET);
 		System.out.printf("PRESS 1 to PLAY AGAIN or 2 to EXIT\n>>");
 		int choice = input.nextInt();
 		if(choice==1)
 			levelSelectMenu();
	}

	/* Displays Player Score */
	void playerScore() {
		System.out.println("Your playerScore is " + (100-playerScore));
	}



}
	
