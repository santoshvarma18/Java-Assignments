package Assignment5.santosh.assignment.main;

import Assignment5.santosh.assignment.data.Assignment5;
import Assignment5.santosh.assignment.data.singleton.Singleton;

public class Main {
    public static void main(String[] args) {
        Assignment5 obj1 = new Assignment5();
        obj1.printGlobalVariables();
        obj1.localVariables();

        Singleton obj2 = Singleton.stringInitializer("Hello");
        System.out.println(obj2);
        obj2.print();
    }
}
