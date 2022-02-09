package Assignment1.ArraysAndArrayLists;

import java.util.ArrayList;
import java.util.Scanner;

/*
              • Create a file called Proj4_3_Parallel
                • You will obtain the names and ages for 5 individuals
                    • Names will go into one array (or ArrayList)
                    • Ages will go into another array (or ArrayLists)
                    • Each index in the two arrays (or ArrayLists) refers to the same person
                • Once you've obtained the data, print out the names and ages
                  in a statement such as:
                    • "Bob is 15 years old"
                • Do this for each of the 5 people
*/
public class Proj4_3_Parallel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        int[] age = new int[5];

        for (int i = 0; i < age.length; i++){
            System.out.print("Enter name: ");
            String name = input.nextLine();
            names.add(name);
            System.out.print("Enter age: ");
            age[i] = input.nextInt();
            input.nextLine();
            System.out.println();
        }

        for (int i = 0; i < age.length; i++){
            System.out.println(names.get(i)+" is "+age[i]+" years old");
        }
    }
}
