package Assignment1.ArraysAndArrayLists;

import java.util.ArrayList;

/*
            ArrayLists
            - Unlike arrays, which have fixed size, ArrayLists can resize
            - ArrayLists live in the java.util package
*/
public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<String> namesList = new ArrayList<>();
        namesList.add("Santosh");       //adds elements to list
        namesList.add("Tarun");
        namesList.add("Aashish");
        namesList.add("Varun");

        for (int i = 0; i < namesList.size(); i++){
            System.out.println(namesList.get(i));       //pulls data from list
        }


        /*
                    Challenge: ArrayListFun Enhancement
                Use the same ArrayListFun file
                    • Comment out the regular for loop
                    • Try using an enhanced for loop to print out the data instead
        */

        //enhanced for-loop\
        for (String name:namesList){
            System.out.println(name);
        }
    }
}
