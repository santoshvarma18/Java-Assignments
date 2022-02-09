package Assignment1.ControlStatements;

import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        int myRandomNumber;
        Random random = new Random();

        //random number
        myRandomNumber = random.nextInt();
        System.out.println("number is:\t"+myRandomNumber);
        //random number in range 0-999
        myRandomNumber = random.nextInt(1000);
        System.out.println("0 through 999?\t"+myRandomNumber);
        //shifting
        myRandomNumber = random.nextInt (1000) + 1; //1 - 1000
        System.out.println("1 through 1000?\t" + myRandomNumber);


        /*
                        Challenge: DiceSimulation
                • Create a DiceSimulation file
                • Simulate 10 rolls of a standard 6-sided die
                • What is a die?
                    • Plural: dice
                    • A small cube with dots on each of its 6 faces
                    • Many games use dice to add random events and other features
        */
        Random rand = new Random();
        for (int i = 0; i < 10; i++){
            int diceValue = rand.nextInt(6) + 1; //1-6
            System.out.println(diceValue);
        }

    }
}
