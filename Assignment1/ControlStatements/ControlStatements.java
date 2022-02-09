package Assignment1.ControlStatements;

/*
        Control flow - the order in which instructions are executed within a program
        3 Categories of Control statements
        - Sequential (Sequence) - usual code flow
        - Selection (Decision)
        - Repetition (Loops)
*/

public class ControlStatements {
    public static void main(String[] args) {
        int age = 15;

        //selection statements
        if (age >= 16){
            System.out.println("You can drive!");
        }
        else {
            System.out.println("You cannot drive yet!");
        }

        //loops
        for (int i = 1; i <= age; i++){
            System.out.println("Happy birthday "+i);
        }

    }
}
