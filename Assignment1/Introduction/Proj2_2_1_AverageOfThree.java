package Assignment1.Introduction;

/*
            • Create a file called Proj2_1_AverageOfThree
            • Prompt the user for three different real numbers
            • Print out their average (mean value) to the console
            • Reminder: the mean is a measure of central tendency in statistics,
             where you sum a collection of numbers and then divide that sum
             by the total count of all the numbers in the collection
             E.g., If you have 100 numbers, sum them up, then divide that
             by 100- easy! O

*/

import java.util.Scanner;

public class Proj2_2_1_AverageOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();
        input.nextLine();       //good habit

        double average = (num1 + num2 + num3) / 3.0;
        System.out.println("Average: "+average);

    }
}
