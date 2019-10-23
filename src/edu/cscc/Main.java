package edu.cscc;
import java.util.*;
/**
 * Main class for RPSLSpock game
 *@author Mario Lopez Gomez
 *@version 1.0
 */

public class Main {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        /**
         * Declaring Variables for:
         * User's Pick and Computer Pick
         * Also user's answer to playing again
         */
        String h_pick;
        String c_pick;
        String answer;
        boolean isValid;

        do {
            /**
             * Prompts user game title
             */
            System.out.println("Let's play rock, paper, scissors, lizard, spock");
            do {
                /**
                 * Prompts user to enter choice of rock, paper,scissors, lizard, or spock
                 * then the choice is validated for a valid choice otherwise it prompts that
                 * its a invalid choice
                 */
                System.out.print("Enter your choice: ");
                h_pick = input.nextLine();
                isValid = RPSLSpock.isValidPick(h_pick);
                if (!isValid) {
                    System.out.println(h_pick + " is not a valid choice");
                }
            } while (!isValid);
            /**
             * While the choice is valid it displays what the computer chose
             */
            c_pick = RPSLSpock.generatePick();
            System.out.print("Computer picked " + c_pick + "  ");
            /**
             * if and else statements to determine whether the user tied, won or lost against the computer by comparing each choice
             */
            if (c_pick.equalsIgnoreCase(h_pick)) {
                System.out.println("Tie!");
            } else if (RPSLSpock.isComputerWin(c_pick, h_pick)) {
                System.out.println("Computer wins!");
            } else {
                System.out.println("You win!");
            }
            /**
             * Prompts user if they want to play again. While they keep saying yes the game continues otherwise the game ends
             */
            System.out.print("Play again ('y' or 'n'): ");
            answer = input.nextLine();
        } while ("Y".equalsIgnoreCase(answer));
        System.out.println("Live long and prosper!");
    }
}