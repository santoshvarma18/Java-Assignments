package Assignment8;

import java.util.Scanner;

/*
Create three new types of exceptions. Write a class with a method that throws all three.
In main( ), call the method but only use a single catch clause that will catch all three types of exceptions.
Add a finally clause and verify that your finally clause is executed, even if a NullPointerException is thrown.

*/

class OutOfRangeException extends Exception{
    OutOfRangeException(String message){
        super(message);
    }
}

class NegativeIntegerException extends Exception{
    NegativeIntegerException(String message){
        super(message);
    }
}

class ZeroInputException extends Exception{
    ZeroInputException(String message){
        super(message);
    }
}


class ThrowMultipleExceptions{
    public void ThrowExceptions(int number) throws OutOfRangeException, NegativeIntegerException, ZeroInputException {
        if (number < 0)
            throw new NegativeIntegerException("Input cannot be negative");
        else if (number > 10)
            throw new OutOfRangeException("Input cannot exceed 10");
        else if (number == 0 )
            throw new ZeroInputException("Input cannot be zero");
    }
}

public class Assignment8 {

    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 1-10");

        try{
            number = input.nextInt();
            ThrowMultipleExceptions multiple = new ThrowMultipleExceptions();
            multiple.ThrowExceptions(number);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Finally block executed");
        }
    }
}


