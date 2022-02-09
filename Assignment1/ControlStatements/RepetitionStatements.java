package Assignment1.ControlStatements;

/*
                Repetition Control Statements

                • The while loop
                while(condition){
                    //code to be executed
                }

                • The do-while loop
                do{
                    //code to be executed
                }while(condition);

                • The for loop
                for(initialization; condition; increment/decrement){
                    //statement or code to be executed
                }
*/

import java.util.Scanner;

public class RepetitionStatements {
    public static void main(String[] args) {

        //while-loop
        int count = 0;
        while (count < 10) {
            System.out.println(count);
            count++;
        }

        //do-while(post condition check, runs for at least once)
        int count2 = 0;
        do {
            System.out.println(count2);
            count2++;
        } while (count2 < 10);

        //for-loop
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        //exploring while
        Scanner keyboard = new Scanner(System.in);
        int input;
        //priming read
        System.out.println("Enter a non-negative integer");
        System.out.println("Or negative to exit");
        input = keyboard.nextInt();
        while (input >= 0) {
            System.out.println(input);
            System.out.println("Enter a non-negative integer");
            System.out.println("Or negative to exit");
            input = keyboard.nextInt();
        }
        System.out.println("Done");


        /*
                        Challenge: SumFun
                    • Create a SumFun file
                    • Maintain a sum of integers that the user enters
                    • Exit the loop if the user enters a negative integer
                    • Print out the sum after the loop
        */

        int sum = 0;
        System.out.println("Enter a non-negative integer");
        System.out.println("Or negative to exit");
        input = keyboard.nextInt();
        while(input >= 0){
            sum += input;
            System.out.println("Enter a non-negative integer");
            System.out.println("Or negative to exit");
            input = keyboard.nextInt();
        }
        System.out.println("Sum: "+sum);

    }
}
