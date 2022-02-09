package Assignment1.ArraysAndArrayLists;

/*
                Wrapper Classes
            • ArrayLists
                • ArrayLists are a type of entity known as a generic
                • Generics (including ArrayLists) can only work with reference types
                • So what do we do about primitives?
            • Wrapper classes
                    Byte, Short, Integer, Long
                    Float, Double
                    Character, Boolean
*/

import java.util.ArrayList;

public class WrapperClass {
    public static void main(String[] args) {
        ArrayList<Integer> numArrayList = new ArrayList<>();

        numArrayList.add(10);
        numArrayList.add(20);

        for (int i = 0; i < numArrayList.size(); i++){
            System.out.println(numArrayList.get(i));
        }


        /*
                    Challenge: String to Double?
                • Use the same WrapperFun file
                • Under the parseInt code we just added
                    • Create a string holding "3.14159" (approximation of PI)
                    • Use the appropriate Wrapper class to convert the string
                      to a double
                    • Print the double out
                    • Hint: you may use your intuition as to what we might
                      need to parse the double
                        • Hint #2: Integer.parseInt().. Double.?
        */

        String strPi = "3.14159";
        double piValue = Double.parseDouble(strPi);     //converts string to double
        System.out.println(piValue);
    }
}
