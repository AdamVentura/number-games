/*
 * Adam Ventura
 * 02/16/21
 * This is a program in which the computer guesses a number 
 */
package computer_guess_number;

import java.util.Scanner;
import java.util.Random;

public class computer_guess_number {

	public static void main(String[] args) {
		// Create input reader
		Scanner reader = new Scanner(System.in);
		// Create instance of Random class
		Random rand = new Random();
		// Declare variables
		int iGuess, iNumber, iHigh, iLow, iAmount;
		// Initialize iAmount variable
		iAmount = 0;
		// Prompt user for number and store number in iNumber
		System.out.println("What is your number (1-20)? ");
		iNumber = reader.nextInt();
		// Use do while loop to have computer keep guessing numbers until it guesses correctly
		do {
			// Generate a number to guess 1 through 20 and print the guess
			iLow = 1;
			iHigh = 21;
			iGuess = rand.nextInt(iHigh-iLow) + iLow;
			System.out.println("Computer's guess: " + iGuess);
			// Add 1 to iAmount to track amount of guesses
			iAmount += 1;
		} while (iGuess != iNumber);
		
		// Print closing message and amount of guesses
		System.out.println("The computer correctly guessed your number after " + iAmount + " guesses." );

	}

}
