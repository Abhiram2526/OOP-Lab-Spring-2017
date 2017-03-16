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

 public class GuessMe {
 	
 	/* Using SecureRandom & Scanner class */
 	private static final SecureRandom randomNumber = new SecureRandom();
 	private static final Scanner input = new Scanner(System.in);

 	/* Using color codes for Text */
 	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";
	
	public static void main(String[] args) {

		while(true) {

			/* Showing the name of the game */
			gameName();
			break;
		}
 	}

 	/** Guess Me v0.1 **/
	public static void gameName() {
	System.out.printf("\n\n");
	System.out.println(ANSI_GREEN + "   _______  _______  _______  _______  _______	_______  _______" + ANSI_RESET );
    System.out.println(ANSI_GREEN + "   |     |  |     |  |     |  |     |  |     |	|     |  |     |" + ANSI_RESET);
    System.out.println(ANSI_GREEN + "   |  " + ANSI_RED + "G" + ANSI_GREEN + "  |  |  " + ANSI_RED + 
    	"U" + ANSI_GREEN + "  |  |  " + ANSI_RED + "E" + ANSI_GREEN + "  |  |  " + ANSI_RED + "S" +
    	 ANSI_GREEN + "  |  |  " + ANSI_RED + "S" + ANSI_GREEN + "  |  |  " + ANSI_RED + "M" +
    	  ANSI_GREEN + "  |  |  " + ANSI_RED + "E" + ANSI_GREEN + "  |" + ANSI_RESET);
    System.out.println(ANSI_GREEN + "   |_____|  |_____|  |_____|  |_____|  |_____|	|_____|  |_____|" + 
    	ANSI_GREEN + " v0.1" + ANSI_RESET);
    System.out.println("\n\t\t\t\t\t" + ANSI_GREEN + "(c) 2017 Batakrishna Sahu" + ANSI_RESET);
    System.out.printf("\n\n");
	} 	

}
