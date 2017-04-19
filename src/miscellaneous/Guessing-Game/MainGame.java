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

 public class MainGame {
 	
 	/* SecureRandom & Scanner class */
 	private static final SecureRandom randomNumber = new SecureRandom();
 	private static final Scanner input = new Scanner(System.in);

 	/* Stores the Player Score */
 	private static int numberOfTries = 0;

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
		boolean wantPlay = true;
		int numberToGuess = 1 + randomNumber.nextInt(1000) ;

		while(wantPlay==true) {
			System.out.print(ANSI_CYAN + "\n\n\t\t\t  ENTER YOUR GUESS (1-1000)\n\n\n\t\t\t  > " + ANSI_RESET);
			int guess = input.nextInt();

			if(guess<numberToGuess) 
				System.out.printf("\n\n\t\t\t  YOUR GUESS IS TOO " + ANSI_RED + "LOW" + ANSI_RESET);
			else if(guess>numberToGuess)
				System.out.printf("\n\n\t\t\t  YOUR GUESS IS TOO " + ANSI_RED + "HIGH" + ANSI_RESET);
			else if(guess == numberToGuess) {
				win();
				System.out.printf(ANSI_GREEN + "\n\n\t\t\t  PRESS 1 TO PLAY AGAIN OR 2 TO EXIT\n\n\n\t\t\t  > " + ANSI_RESET );
				int userChoice = input.nextInt();
				if(userChoice == 1) { 
					levelSelectMenu();
					wantPlay = false;
				}
				else
					wantPlay = false;
			}
		++numberOfTries;	
		}
	}


	/* Win Message */
	void win() {
		System.out.println(ANSI_CYAN + "\n\n\n\n\n\t\t\t  CONGRATULATIONS" + ANSI_PURPLE +
		 " YOU" + ANSI_BLUE + " WON!!!\n\n\n\n\n" + ANSI_RESET);
	}

	/* Displays Player Score */
	void numberOfTries() {
		System.out.printf("\n\n\t\t\tYou have tried %d number of times.", numberOfTries);
	}



}
	
