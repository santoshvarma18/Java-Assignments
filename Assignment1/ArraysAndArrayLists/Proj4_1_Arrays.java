package Assignment1.ArraysAndArrayLists;

import java.util.Scanner;

/*
              • Create a file called Proj4_1_Arrays
                    • Prompt the user to input 5 integers
                    • Store each of the integers in a regular, built-in array
                    • After the storing is completed, in a separate loop, print each
                      of the values in the array multiplied by 2
*/
public class Proj4_1_Arrays {
    public static void main(String[] args) {
        int[] numsArray = new int[5];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < numsArray.length; i++){
            System.out.print("Enter an integer: ");
            numsArray[i] = input.nextInt();
        }

        for (int i = 0; i < numsArray.length; i++){
            System.out.println("Result is " + (numsArray[i]*2));
        }
    }
}
