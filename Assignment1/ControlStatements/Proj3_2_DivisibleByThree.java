package Assignment1.ControlStatements;

/*
                • Create a file called DivisibleByThree
                • or Proj3_2_DivisibleByThree, or something similar – it doesn't really matter ©
                • Prompt the user for input of an integer, then print out the appropriate
                  statement, which will be one of the following:
                • _______ is divisible by 3
                • _______ is NOT divisible by 3
                • Clearly, you will have to determine if the input is divisible
                  by 3!
                • Use your knowledge of what you've learned about
                  control statements, and your previous knowledge
                  to write the program
                • Hint: Can any of the arithmetic operators help?
*/

import java.util.Scanner;

public class Proj3_2_DivisibleByThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a your integer: ");
        int num = input.nextInt();
        if (num % 3 == 0){
            System.out.println(num+" is divisible by 3");
        }
        else{
            System.out.println(num+" is NOT divisible by 3");
        }

    }
}
