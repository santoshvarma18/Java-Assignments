package Assignment1.Introduction;

/*
                      Project 02-02: Mad Libs Clone

                • Create a file called Proj2_2_MadLibsClone
                • Mad Libs is a great game
                • You are asked for multiple words of different types
                  (e.g., nouns, verbs, adjectives, clothing, names)
                  You'll write a single Mad Libs story

    Content:
        There once was a ADJECTIVE girl named GIRLS NAME, who
        was a ADJECTIVE2 OCCUPATION in the Kingdom of PLACE.
        She loved to wear CLOTHING and to HOBBY. She wanted to
        marry the ADJECTIVE3 OCCUPATION2 named NAME but her
        father, King MANS NAME forbid her from seeing him.

*/

import java.util.Scanner;

public class Proj2_2_MadLibsClone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an adjective: ");
        String adjective1 = input.nextLine();
        System.out.print("Enter girl's name: ");
        String girlName = input.nextLine();
        System.out.print("Enter another adjective:  ");
        String adjective2 = input.nextLine();
        System.out.print("Enter an occupation: ");
        String occupation1 = input.nextLine();
        System.out.print("Enter the name of the place: ");
        String placeName = input.nextLine();
        System.out.print("Enter the name of piece of clothing: ");
        String outfit = input.nextLine();
        System.out.print("Enter the name of a hobby: ");
        String hobbyName = input.nextLine();
        System.out.print("Enter another adjective: ");
        String adjective3 = input.nextLine();
        System.out.print("Enter another occupation: ");
        String occupation2 = input.nextLine();
        System.out.print("Enter a boy's name: ");
        String boyName = input.nextLine();
        System.out.print("Enter a man's name: ");
        String manName = input.nextLine();

        System.out.println("There once was a "+adjective1+" girl named "+girlName+", who was a "+adjective2+
                " "+occupation1+" in the kingdom of "+placeName+".\n"+"She loved to wear "+outfit+" and to "+hobbyName+
                ". She wanted to marry the "+adjective3+" "+occupation2+" named "+boyName+" but her father, king "+
                manName+" forbid her from seeing him");

    }
}
