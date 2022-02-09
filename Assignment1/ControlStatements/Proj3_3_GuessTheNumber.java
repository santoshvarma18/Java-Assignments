package Assignment1.ControlStatements;

/*
            Project 03-03: Guess the Number
    • Create a file called GuessTheNumber
        • or Proj3_3_GuessTheNumber, or something similar
    • Program interaction:
        • The computer will randomly generate a number between
          1 and 100 (inclusive)
    • The user is then asked to guess the computer's number
    • You keep track of the number of guesses
    • There are four possibilities:
        • Correct number: "Congratulations! You guessed the number in _____
          guesses! Thanks for playing!"
        • If the user guesses too low, or too high, tell them "Your guess was too ______"
        • If the user selects a number out of range, "That was a wasted guess! Pick a number
          between 1 and 100, inclusive!"
*/

import java.util.Random;
import java.util.Scanner;

public class Proj3_3_GuessTheNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int randNumber = random.nextInt(100) + 1;
        int guessCount = 0;
        int userGuess;

//        System.out.println("Enter your guess between 1 and 100 (inclusive): ");
//        userGuess = input.nextInt();

        while(true){
            System.out.println("Enter your guess between 1 and 100 (inclusive): ");
            userGuess = input.nextInt();

            if (userGuess >= 0 && userGuess <= 100){
                if (userGuess == randNumber){
                    guessCount++;
                    System.out.println("Congratulations! You guessed the number in "+guessCount+" guesses! Thanks for playing!");
                    break;
                }
                else if (userGuess < randNumber){
                    System.out.println("Your guess was too low");
                    guessCount++;
                }
                else{
                    System.out.println("Your guess was too high");
                    guessCount++;
                }
            }
            else{
                System.out.println("That was a wasted guess! Pick a number between 1 and 100 inclusive!");
                guessCount++;
            }
        }
    }
}
