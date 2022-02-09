package Assignment1.Introduction;

/*
         Data types - primitive, reference
         Primitive type - Holds the value of interest directly
         byte, short, int, long, float, double, char, boolean
         Reference type - Holds the memory address of the object of interest
         Strings, Arrays
*/

public class Conversion {
    public static void main(String[] args) {

        double myDouble = 3.14;
        float  myFloat = 3.14f;     //narrowing or lossy conversion
        double yourDouble = myFloat;    //widening or lossless conversion

    }
}
