package Assignment1.Introduction;

public class Variables {

    public static void main(String[] args) {
        // Use camel casing for naming conventions ex - myName, myAge
        int age;    //declaration
        age = 21;   //initialization
        final String name = "Santosh";  // final keyword doesn't allow to change the value
        System.out.println(name + " is " + age);    //concatenation

        // challenge - print Hometown
        String homeTown = "Hyderabad";;
        System.out.println(name + " lives in " + homeTown);
    }
}
