package Assignment1.ArraysAndArrayLists;

/*
                Create a file called Proj4_2_ArrayLists
                • Create an ArrayList and populate it with non-negative numbers
                    • In other words, real numbers 0 or greater
                • The user will enter the real numbers from the console
                    • Stop asking for numbers when the user enters a negative number
                    • When the user prompting loop is finished, you should
                      print the values in the ArrayList in reverse order
                    • Consider doing a priming read before your loop
                • Hints
                    • Remember that ArrayLists only hold reference types, but Wrapper
                      classes can help
                    • The Scanner has a method to help reading in double data - can you guess
                      it based on how you've read integer data before? (e.g., nextInt()
                    • How might you print the values in order? ArrayList.size() returns the size of the
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Proj4_2_ArrayLists {
    public static void main(String[] args) {
        ArrayList<Double> numsArray = new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);

        while(true){
            System.out.print("Enter a non-negative number: ");
            double num = keyboard.nextDouble();
            if (num < 0){
                break;
            }
            else{
                numsArray.add(num);
            }
        }

        for (int i = numsArray.size() - 1; i >= 0; i--){
            System.out.println(numsArray.get(i));
        }
    }
}
