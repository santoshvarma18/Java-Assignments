package Assignment1.Introduction;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = keyboard.nextLine();

        System.out.println("What is your age? ");
        int age = keyboard.nextInt();
//        keyboard.nextLine();    //consumes the new line,
        // without this next scanner statement doesn't work
        //Always use nextline() after nextInt(). To know the difference try removing it.

        System.out.println("Your city? ");
        String city = keyboard.nextLine();

        System.out.println("Hello, "+name);
        System.out.println("Age is "+age);
        System.out.println("City is "+city);


        /*
                    challenge:
                    1. Write a code to prompt the user for a real number
                    2. Multiply that number by 2
                    3. Print the resulting value to the console before the name of the city is obtained
                    4. Reminder: Consume the newline character when taking non-string input
        */
//        System.out.println("challenge");
//        System.out.println("Enter real number: ");
//        double number = keyboard.nextDouble();
//        keyboard.nextLine();
//        number *= 2;
//
//        System.out.println("What city do you live in? ");
//        city = keyboard.nextLine();
//
//        System.out.println("Hello, "+name);
//        System.out.println("Age is "+age);
//        System.out.println("City is "+city);
//        System.out.println("Twice the number is "+number);

    }
}
