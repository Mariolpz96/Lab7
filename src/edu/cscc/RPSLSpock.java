package edu.cscc;
import java.util.Random;

/**
 * RPSLSpock class
 * author Mario Lopez Gomez
 * version 1.0
 */

public class RPSLSpock {

    static Random rand = new Random(System.currentTimeMillis());
    /**
     * String Values for ROCK, PAPER, SCISSORS, LIZARD, & SPOCK
     */
    public static final String ROCK = "rock";
    public static final String PAPER = "paper";
    public static final String SCISSORS = "scissors";
    public static final String LIZARD = "lizard";
    public static final String SPOCK = "spock";

    /**
     * Validates for a valid choice
     * @param pick
     * @return if the pick is false
     */
    public static boolean isValidPick(String pick) {
        if (pick == null) {
            return false;
        }
        /**
         * The case for user input is ignored so user can enter varies ways of the same word
         * @return pick
         */
        pick = pick.trim();
        return (ROCK.equalsIgnoreCase(pick) ||
                PAPER.equalsIgnoreCase(pick) ||
                SCISSORS.equalsIgnoreCase(pick) ||
                LIZARD.equalsIgnoreCase(pick) ||
                SPOCK.equalsIgnoreCase(pick));
    }

    /**
     * Switch to have different cases for the computers pick, each being randomized
     * @return pick
     */
    public static String generatePick() {
        String pick = null;
        switch (rand.nextInt(5)) {
            case 0:
                pick = ROCK;
                break;
            case 1:
                pick = PAPER;
                break;
            case 2:
                pick = SCISSORS;
                break;
            case 3:
                pick = LIZARD;
                break;
            case 4:
                pick = SPOCK;
                break;
        }
        return pick;
    }

    /**
     * @param c_pick
     * @param h_pick
     * User pick is changed to lowercase
     * @return pick comparison of c_pick and h_pick
     */
    public static boolean isComputerWin(String c_pick,String h_pick) {
        h_pick = h_pick.toLowerCase();
        return ((ROCK.equals(c_pick) && (SCISSORS.equals(h_pick) || LIZARD.equals(h_pick))) ||
                (PAPER.equals(c_pick) && (ROCK.equals(h_pick) || SPOCK.equals(h_pick))) ||
                (SCISSORS.equals(c_pick) && (PAPER.equals(h_pick) || LIZARD.equals(h_pick))) ||
                (LIZARD.equals(c_pick) && (PAPER.equals(h_pick) || SPOCK.equals(h_pick))) ||
                (SPOCK.equals(c_pick) && (ROCK.equals(h_pick) || SCISSORS.equals(h_pick))));
    }
}