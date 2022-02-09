package Assignment6;

/*
Create a class with a constructor that takes a String argument.
During construction, print the argument.
Create an array of object references to this class, but don’t actually create objects to assign into the array. When you run the program,
notice whether the initialization messages from the constructor calls are printed.
 */

public class PrintNames {
    String name;
    PrintNames(String name){
        this.name = name;
        System.out.println("Name: "+this.name);
    }
    public static void main(String[] args) {
        PrintNames name[] = {new PrintNames("Santosh"), new PrintNames("Tarun")};
    }
}
